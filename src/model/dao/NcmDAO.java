
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
import model.bean.Ncm;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class NcmDAO {
    
    Connection con;
    public  static NcmDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public NcmDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }  
     public static NcmDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new NcmDAO();
        }
        return hibernateDAO;
    }
    public Ncm salvar(Ncm ncm) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (ncm.getId_ncm() == 0) {
                sessao.persist(ncm);
            } else {
                Ncm n = ( Ncm ) sessao.get( Ncm.class, ncm.getId_ncm() );
                n.setNcm(ncm.getNcm());
                n.setDescricao(ncm.getDescricao());
                n.setUsuarioalteracao(ncm.getUsuarioalteracao());
                n.setDtalteracao(ncm.getDtalteracao());
                sessao.merge(n);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return ncm;
    }
    
    public Ncm cancelar(Ncm ncm) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Ncm n = ( Ncm ) sessao.get( Ncm.class, ncm.getId_ncm() );
            n.setCancelado(ncm.getCancelado());
            n.setUsuarioalteracao(ncm.getUsuarioalteracao());
            n.setDtalteracao(ncm.getDtalteracao());
            sessao.merge(n);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return ncm;
    } 
     
     
     
    
//      public boolean create(Object obj) {
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
//     public boolean update(Object obj) {
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
    
//    public void create(Ncm nc){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO ncm (ncm, descricao, usuariocadastro, dtcadastro, "+
//                    "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?)");
//            stmt.setString(1,nc.getNcm());
//            stmt.setString(2, nc.getDescricao());
//            stmt.setInt(3, nc.getUsuariocadastro());
//            stmt.setDate(4, (Date) nc.getDtcadastro());
//            stmt.setInt(5, nc.getUsuarioalteracao());
//            stmt.setDate(6, (Date) nc.getDtalteracao());
//            stmt.setString(7, nc.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//            
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//   
//    public void update(Ncm nc) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE ncm SET ncm = ?, descricao = ?, usuarioalteracao = ?, "
//                    + "dtalteracao = ?  WHERE id_ncm = ?");
//            stmt.setString(1, nc.getNcm());
//            stmt.setString(2, nc.getDescricao());
//            stmt.setInt(3, nc.getUsuarioalteracao());
//            stmt.setDate(4, (Date) nc.getDtalteracao());
//            stmt.setInt(5, nc.getId_ncm());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//
//        } finally {
//
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    
//    public void delete(Ncm nc) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM ncm WHERE id_ncm = ?");
//             stmt.setInt(1, nc.getId_ncm());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//     public void cancelar(Ncm nc) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE ncm SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_ncm = ?");
//            stmt.setInt(1, nc.getUsuarioalteracao());
//            stmt.setDate(2, (Date) nc.getDtalteracao());
//            stmt.setString(3, nc.getCancelado());
//            stmt.setInt(4, nc.getId_ncm());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
    
     public List<Ncm> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Ncm>    lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM ncm");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Ncm nc = new Ncm();
                  nc.setId_ncm(rs.getInt("id_ncm"));
                  nc.setNcm(rs.getString("ncm"));
                  nc.setDescricao(rs.getString("descricao"));
                  nc.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  nc.setDtcadastro(rs.getDate("dtcadastro"));
                  nc.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  nc.setDtalteracao(rs.getDate("dtalteracao"));
                  nc.setCancelado(rs.getString("cancelado"));
                  lista.add(nc);
              }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    public List<Ncm> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Ncm> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM ncm WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Ncm nc = new Ncm();
                nc.setId_ncm(rs.getInt("id_ncm"));
                nc.setNcm(rs.getString("ncm"));
                nc.setDescricao(rs.getString("descricao"));
                nc.setUsuariocadastro(rs.getInt("usuariocadastro"));
                nc.setDtcadastro(rs.getDate("dtcadastro"));
                nc.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                nc.setDtalteracao(rs.getDate("dtalteracao"));
                nc.setCancelado(rs.getString("cancelado"));
                lista.add(nc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public String pesquisancm(String ncm) {  //PESQUISA POR SIGLA AINDA NÃO TESTADA. SE ESTIVER OK APAGAR O COMENTARIO
        Ncm nc = new Ncm();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT ncm FROM ncm WHERE ncm = ?");
            stmt.setString(1, ncm);  
            rs = stmt.executeQuery();
            if (rs.next()) {
                nc.setNcm(rs.getString("ncm"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return nc.getNcm();
    }

    
    public String pesquisaDesc(String desc) { //PESQUISA POR DESCRICAO RETORNANDO A SIGLA AINDA NÃO TESTADA. SE ESTIVER OK APAGAR O COMENTARIO
        Ncm nc              = new Ncm();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT ncm FROM ncm WHERE descricao LIKE ?");
            stmt.setString(1, desc);                 
            rs = stmt.executeQuery();
            if (rs.next()) {
                nc.setNcm(rs.getString("ncm"));
            }else{
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A PESQUISA DA UNIDADE...","ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return  nc.getNcm();
    }  
    
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relncm.jasper";
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
