
package model.dao;



import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Unidade;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class UnidadeDAO {
    
    Connection con;
    public  static UnidadeDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public UnidadeDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
    public static UnidadeDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new UnidadeDAO();
        }
        return hibernateDAO;
    }
    
 
 public Unidade salvar(Unidade unidade) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (unidade.getId_unidade() == 0) {
                sessao.persist(unidade);
            } else {
                Unidade u = ( Unidade ) sessao.get( Unidade.class, unidade.getId_unidade() );
                u.setSigla(unidade.getSigla());
                u.setDescricao(unidade.getDescricao());
                u.setUsuarioalteracao(unidade.getUsuarioalteracao());
                u.setDtalteracao(unidade.getDtalteracao());
                sessao.merge(u);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return unidade;
    }
    
    public Unidade cancelar(Unidade unidade) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Unidade u = ( Unidade ) sessao.get( Unidade.class, unidade.getId_unidade() );
            u.setCancelado(unidade.getCancelado());
            u.setUsuarioalteracao(unidade.getUsuarioalteracao());
            u.setDtalteracao(unidade.getDtalteracao());
            sessao.merge(u);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return unidade;
    }   
    
//    public boolean create(Object obj) {
//        boolean retorno = false;
//        Session sessao = factory.openSession();
//        try {
//            transaction = sessao.beginTransaction();
//            sessao.persist(obj);
//            transaction.commit();
//            retorno = true;
//
//        } catch (Exception ex) {
//            transaction.rollback();
//            JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            sessao.clear();
//        }
//        return retorno;
//    }
//
//    public boolean update(Object obj) {
//        boolean retorno = false;
//        Session sessao = factory.openSession();
//        try {
//            transaction = sessao.beginTransaction();
//            sessao.merge(obj);
//            transaction.commit();
//            retorno = true;
//        } catch (Exception ex) {
//            transaction.rollback();
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            sessao.clear();
//        }
//        return retorno;
//    }
//    
    
//    public void create(Unidade und){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO unidade (sigla,descricao,usuariocadastro,dtcadastro,"
//                    + "usuarioalteracao,dtalteracao,cancelado) VALUES (?,?,?,?,?,?,?)");
//            stmt.setString(1,und.getSigla());
//            stmt.setString(2, und.getDescricao());
//            stmt.setInt(3, und.getUsuariocadastro());
//            stmt.setDate(4, (Date) und.getDtcadastro());
//            stmt.setInt(5, und.getUsuarioalteracao());
//            stmt.setDate(6, (Date) und.getDtalteracao());
//            stmt.setString(7, und.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void update(Unidade und) {
//         PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE unidade SET sigla = ?, descricao = ?, "
//                    + "usuarioalteracao = ?, dtalteracao = ?  WHERE id_unidade = ?");
//            stmt.setString(1, und.getSigla());
//            stmt.setString(2, und.getDescricao());
//            stmt.setInt(3, und.getUsuarioalteracao());
//            stmt.setDate(4, (Date) und.getDtalteracao());
//            stmt.setInt(5, und.getId_unidade());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//            
//        } finally {
//             
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//    
//    public void delete(Unidade und) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM unidade WHERE id_unidade = ?");
//             stmt.setInt(1, und.getId_unidade());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//    
//    
//    public void cancelar(Unidade und) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE unidade SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_unidade = ?");
//            stmt.setInt(1, und.getUsuarioalteracao());
//            stmt.setDate(2, (Date) und.getDtalteracao());
//            stmt.setString(3, und.getCancelado());
//            stmt.setInt(4, und.getId_unidade());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
     public List<Unidade> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Unidade>    lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM unidade");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Unidade und = new Unidade();
                  und.setId_unidade(rs.getInt("id_unidade"));
                  und.setSigla(rs.getString("sigla"));
                  und.setDescricao(rs.getString("descricao"));
                  und.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  und.setDtcadastro(rs.getDate("dtcadastro"));
                  und.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  und.setDtalteracao(rs.getDate("dtalteracao"));
                  und.setCancelado(rs.getString("cancelado"));
                  lista.add(und);
                  
             }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    public List<Unidade> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Unidade> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM unidade WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Unidade und = new Unidade();
                und.setId_unidade(rs.getInt("id_unidade"));
                und.setSigla(rs.getString("sigla"));
                und.setDescricao(rs.getString("descricao"));
                und.setUsuariocadastro(rs.getInt("usuariocadastro"));
                und.setDtcadastro(rs.getDate("dtcadastro"));
                und.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                und.setDtalteracao(rs.getDate("dtalteracao"));
                und.setCancelado(rs.getString("cancelado"));
                lista.add(und);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public String pesquisasigla(String sigla) {  //PESQUISA POR SIGLA AINDA NÃO TESTADA. SE ESTIVER OK APAGAR O COMENTARIO
        Unidade und = new Unidade();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT sigla FROM unidade WHERE sigla = ?");
            stmt.setString(1, sigla);  
            rs = stmt.executeQuery();
            if (rs.next()) {
                und.setSigla(rs.getString("sigla"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return und.getSigla();
    }

    
    public String pesquisaDesc(String desc) { //PESQUISA POR DESCRICAO RETORNANDO A SIGLA AINDA NÃO TESTADA. SE ESTIVER OK APAGAR O COMENTARIO
     
        Unidade und              = new Unidade();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT sigla FROM unidade WHERE descricao LIKE ?");
            stmt.setString(1, desc);                 
            rs = stmt.executeQuery();
            if (rs.next()) {
                und.setSigla(rs.getString("sigla"));
            }else{
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A PESQUISA DA UNIDADE...","ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return  und.getSigla();
    }  
    
    public void imprimir(){
          String        relatorio = "/Enterprise/Relatorios/relunidade.jasper";
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
