
package model.dao;


import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Filial;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class FilialDAO {
    
    Connection con;
    public  static FilialDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public FilialDAO() {
        con      = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
        
    public static FilialDAO getInstance(){
        
        if (hibernateDAO == null){
            hibernateDAO = new FilialDAO();
        }
        return hibernateDAO;
    }   
    
    public Filial salvar(Filial filial) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (filial.getId_filial() == 0) {
                sessao.persist(filial);
            } else {
                Filial f = ( Filial ) sessao.get( Filial.class, filial.getId_filial() );
                f.setDescricao(filial.getDescricao());
                f.setUsuarioalteracao(filial.getUsuarioalteracao());
                f.setDtalteracao(filial.getDtalteracao());
                sessao.merge(f);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return filial;
    }
    
    public Filial cancelar(Filial filial) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Filial f = ( Filial ) sessao.get( Filial.class, filial.getId_filial() );
            f.setCancelado(filial.getCancelado());
            f.setUsuarioalteracao(filial.getUsuarioalteracao());
            f.setDtalteracao(filial.getDtalteracao());
            sessao.merge(f);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return filial;
    }
    
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
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            sessao.clear();
//        }
//        return retorno;
//    }
    
//    public void create(Filial f) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO filial (descricao, usuariocadastro, dtcadastro, "+
//                    "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?)");
//            stmt.setString(1, f.getDescricao());
//            stmt.setInt(2, f.getUsuariocadastro());
//            stmt.setDate(3, (Date) f.getDtcadastro());
//            stmt.setInt(4, f.getUsuarioalteracao());
//            stmt.setDate(5, (Date) f.getDtalteracao());
//            stmt.setString(6, f.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
  

//    public void update(Filial f) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE filial SET  descricao = ?, usuarioalteracao = ?, "
//                    + "dtalteracao= ?   WHERE id_filial = ?");
//            stmt.setString(1, f.getDescricao());
//            stmt.setInt(2, f.getUsuarioalteracao());
//            stmt.setDate(3, (Date) f.getDtalteracao());
//            stmt.setInt(4, f.getId_filial());
//            stmt.executeUpdate();
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
    
//    public void delete(Filial f) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM filial WHERE id_filial = ?");
//             stmt.setInt(1, f.getId_filial());
//             stmt.executeUpdate();
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//             ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
    
     
//     public void cancelar(Filial f) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE filial SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_filial = ?");
//            stmt.setInt(1, f.getUsuarioalteracao());
//            stmt.setDate(2, (Date) f.getDtalteracao());
//            stmt.setString(3, f.getCancelado());
//            stmt.setInt(4, f.getId_filial());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//
//    }
    
    
     public List<Filial> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Filial> lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM filial");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Filial filial = new Filial();
                  filial.setId_filial(rs.getInt("id_filial"));
                  filial.setDescricao(rs.getString("descricao"));
                  filial.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  filial.setDtcadastro(rs.getDate("dtcadastro"));
                  filial.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  filial.setDtalteracao(rs.getDate("dtalteracao"));
                  filial.setCancelado(rs.getString("cancelado"));
                  lista.add(filial);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
            
    }         
    
    
    public List<Filial> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Filial> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM filial WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filial filial = new Filial();
                filial.setId_filial(rs.getInt("id_filial"));
                filial.setDescricao(rs.getString("descricao"));
                filial.setUsuariocadastro(rs.getInt("usuariocadastro"));
                filial.setDtcadastro(rs.getDate("dtcadastro"));
                filial.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                filial.setDtalteracao(rs.getDate("dtalteracao"));
                filial.setCancelado(rs.getString("cancelado"));
                lista.add(filial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public List<Filial> readForCod(String id_filial) {
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        Filial            filial = new Filial();
        List<Filial>       lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM filial WHERE id_filial = ?");
            stmt.setInt(1,Integer.parseInt(id_filial));            
            rs = stmt.executeQuery();
            while (rs.next()) {
                filial.setId_filial(rs.getInt("id_filial"));
                filial.setDescricao(rs.getString("descricao"));
                filial.setUsuariocadastro(rs.getInt("usuariocadastro"));
                filial.setDtcadastro(rs.getDate("dtcadastro"));
                filial.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                filial.setDtalteracao(rs.getDate("dtalteracao"));
                filial.setCancelado(rs.getString("cancelado"));
                lista.add(filial);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public List<Filial> pesquisaIdFilial(String id) { // METODO QUE PESQUISA O ID_DA FILIAL E TRAZ A DESCRICAO
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Filial filial = new Filial();
        List<Filial> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT id_filial, descricao FROM filial WHERE id_filial = ?");
            stmt.setInt(1, Integer.parseInt(id));
            rs = stmt.executeQuery();
            if (rs.next()) {
                filial.setId_filial(rs.getInt("id_filial"));
                filial.setDescricao(rs.getString("descricao"));
                lista.add(filial);
                return lista;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    
    public String pesquisaCodigoFilial(String id) { // MÉTODO QUE ENTRA O CODIGO DA FILIAL E RETORNA A DESCRIÇÃO DA FILIAL
        Filial f = new Filial();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT descricao FROM filial WHERE id_filial LIKE ?");
            stmt.setString(1, id);                 
            rs = stmt.executeQuery();
            if (rs.next()) {
                f.setDescricao(rs.getString("descricao"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return f.getDescricao();
    }
    
    public String pesquisaDesc(String desc) {   // MÉTODO QUE ENTRA COM A DESCRICAO DA FILIAL E TRAZ O ID
        Connection con = ConnectionFactory.getConnection();
        Filial f = new Filial();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT id_filial FROM filial WHERE descricao LIKE ?");
            stmt.setString(1, desc);
            rs = stmt.executeQuery();
            if (rs.next()) {
                f.setId_filial(rs.getInt("id_filial"));
                return(String.valueOf(f.getId_filial()));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relfilial.jasper";
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
