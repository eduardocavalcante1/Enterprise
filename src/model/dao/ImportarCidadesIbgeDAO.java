
package model.dao;



import conexao.ConnectionFactory;
import java.io.File;
import model.bean.ImportarCidadesIbge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class ImportarCidadesIbgeDAO {
    
    Connection con;
    public  static ImportarCidadesIbgeDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
   
    
    public ImportarCidadesIbgeDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
    public static ImportarCidadesIbgeDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new ImportarCidadesIbgeDAO();
        }
        return hibernateDAO;
    }
    
    
    public List<ImportarCidadesIbge> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<ImportarCidadesIbge> lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM ibgecidades LIMIT 1");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  ImportarCidadesIbge  ibge = new ImportarCidadesIbge();
                  ibge.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  ibge.setDtalteracao(rs.getDate("dtalteracao"));
                  lista.add(ibge);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    
    public void importar(ImportarCidadesIbge ibge) throws IOException, SQLException {
        
        delete();
        Connection con = ConnectionFactory.getConnection();    
        PreparedStatement       stmt = null;
        FileInputStream filePlanilha = null;
  
        try {
            File file                    = new File(ibge.getArquivo());
            filePlanilha                 = new FileInputStream(file);

            //cria um workbook = planilha toda com todas as abas
            XSSFWorkbook workbook = new XSSFWorkbook(filePlanilha);
  
            //recuperamos apenas a primeira aba ou primeira planilha
            XSSFSheet sheet = workbook.getSheetAt(0);
            
             //retorna todas as linhas da planilha 0 (aba 1)
            Iterator<Row> rowIterator = sheet.iterator();

            //varre todas as linhas da planilha 0
            
            rowIterator.next();
            while (rowIterator.hasNext()) {
                
                //recebe cada linha da planilha
                Row row = rowIterator.next();

                //pegamos todas as celulas desta linha
                Iterator<Cell> cellIterator = row.iterator();

                //varremos todas as celulas da linha atual
                while (cellIterator.hasNext()) {
                     
                    //criamos uma celula
                    Cell cell = cellIterator.next();
                    
                }
                
                Cell celluf = row.getCell(1);
                Cell cellcodigocidade = row.getCell(7);
                Cell cellnomecidade = row.getCell(8);
                
                // PARA O HIBERNATE TEREMOS QUE SETAR TODOS OS ELEMENTOS DO OBJETO ibge 
                ibge.setUf(celluf.getStringCellValue());
                ibge.setCodigocidade(cellcodigocidade.getStringCellValue());
                ibge.setNomecidade(cellnomecidade.getStringCellValue());
                ibge.setUsuarioalteracao(ibge.getUsuarioalteracao());
                ibge.setDtalteracao((Date) ibge.getDtalteracao());

                Session sessao = factory.openSession();
                try {
                    transaction = sessao.beginTransaction();
                    sessao.persist(ibge);
                    transaction.commit();
                } catch (Exception ex) {
                   transaction.rollback();
                   JOptionPane.showMessageDialog(null, "ERRO AO IMPORTAR - INSERIR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                } finally {
                   sessao.clear();
                }
                
                // FIM DA ALTERAÇÃO PARA O HIBERNATE
                
                
                     
//                   System.out.println(cellcodigocidade.getStringCellValue());
//
//                   stmt = con.prepareStatement("INSERT INTO ibgecidades(uf, codigocidade, nomecidade, "
//                           + "usuarioalteracao, dtalteracao) VALUES (?,?,?,?,?)");
//                   stmt.setString(1, celluf.getStringCellValue());
//                   stmt.setString(2, cellcodigocidade.getStringCellValue());
//                   stmt.setString(3, cellnomecidade.getStringCellValue());
//                   stmt.setInt(4, ibge.getUsuarioalteracao());
//                   stmt.setDate(5, (java.sql.Date) (Date) ibge.getDtalteracao());
//                   stmt.executeUpdate();

            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO IMPORTAR - LEITURA (1) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO IMPORTAR - LEITURA (2) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ConnectionFactory.closeConnection(con, stmt);
                filePlanilha.close();
                
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "ERRO AO IMPORTAR - LEITURA (3) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    
    public void delete() {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.createNativeQuery("DELETE FROM ibgecidade").executeUpdate();
            sessao.createNativeQuery("ALTER SEQUENCE ibgecidades_id_ibgecidades_seq RESTART WITH 1").executeUpdate();
            // sessao.delete(obj);  // FOI SUBSTITUIDO PELO createNativeQuery POIS NÃO TEREMOS OBJETOS 
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO APAGAR REGISTROS PARA A IMPORTAÇÃO.  " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.clear();
        }
    }
    
//    public void delete(){
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("DELETE FROM ibgecidade ");
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "REGISTROS ANTIGOS REMOVIDOS COM SUCESSO IREMOS PARA A IMPORTAÇÃO...", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }

}

        
        
        
        
        
        
        
  