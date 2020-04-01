package model.dao;



import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.EstadoCivil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class EstadoCivilDAO {
    
    Connection con;
    public static EstadoCivilDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public EstadoCivilDAO() {
        con = ConnectionFactory.getConnection();
        factory = HibernateUtil.getSessionFactory();
    }        
    
    public static EstadoCivilDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new EstadoCivilDAO();
        }
        return hibernateDAO;
    }
    
     public boolean create(Object obj) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.persist(obj);
            transaction.commit();
            retorno = true;

        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.clear();
        }
        return retorno;
    }

    public boolean update(Object obj) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.merge(obj);
            transaction.commit();
            retorno = true;
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.clear();
        }
        return retorno;
    }
    
//    public void create(EstadoCivil ec){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO estadocivil (descricao) VALUES (?)");
//            stmt.setString(1, ec.getDescricao());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "REGISTRADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//            
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    

//    public void update(EstadoCivil ec) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE estadocivil SET descricao = ? WHERE id_estadocivil = ?");
//            stmt.setString(1, ec.getDescricao());
//            stmt.setInt(2, ec.getId_estadocivil());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO...", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//
//        } finally {
//
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//
//    
//    public void delete(EstadoCivil ec) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM estadocivil WHERE id_estadocivil = ?");
//             stmt.setInt(1, ec.getId_estadocivil());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
        
        
    public List<EstadoCivil> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<EstadoCivil>    lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM estadocivil");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  EstadoCivil ec = new EstadoCivil();
                  ec.setId_estadocivil(rs.getInt("id_estadocivil"));
                  ec.setDescricao(rs.getString("descricao"));
                  lista.add(ec);
              }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    
    public List<EstadoCivil> readForDesc(String desc) {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<EstadoCivil> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM estadocivil WHERE descricao LIKE ?");
            stmt.setString(1, desc+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                EstadoCivil ec = new EstadoCivil();
                ec.setId_estadocivil(rs.getInt("id_estadocivil"));
                ec.setDescricao(rs.getString("descricao"));
                lista.add(ec);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public String pesquisaId(String id_grupo) {
        EstadoCivil ec = new EstadoCivil();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT descricao FROM estadocivil WHERE id_estadocivil = ?");
            stmt.setInt(1, Integer.parseInt(id_grupo));                 //Conversão para INT pois o campo é inteiro 
            rs = stmt.executeQuery();
            if (rs.next()) {
                ec.setDescricao(rs.getString("descricao"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return ec.getDescricao();
    }
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relestadocivil.jasper";
        JasperPrint   jasperPrinter = null;
        try {
           jasperPrinter = JasperFillManager.fillReport(relatorio, null, con);
           JasperViewer view  = new JasperViewer(jasperPrinter,false);
           view.setVisible(true);
            
        } catch (JRException ex) {
          JOptionPane.showMessageDialog(null, "ERRO AO IMPRIMIR !" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
           
        }finally {
            ConnectionFactory.closeConnection(con);
        }
    }
    
}
