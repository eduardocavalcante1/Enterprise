
package model.dao;



import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Frete;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class FreteDAO {

    Connection con;
    public  static FreteDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public FreteDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        

    public static FreteDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new FreteDAO();
        }
        return hibernateDAO;
    }
    
    public Frete salvar(Frete frete) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (frete.getId_frete() == 0) {
                sessao.persist(frete);
            } else {
                Frete f = ( Frete ) sessao.get( Frete.class, frete.getId_frete() );
                f.setDescricao(frete.getDescricao());
                f.setUsuarioalteracao(frete.getUsuarioalteracao());
                f.setDtalteracao(frete.getDtalteracao());
                sessao.merge(f);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return frete;
    }
    
    public Frete cancelar(Frete frete) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Frete f = ( Frete ) sessao.get( Frete.class, frete.getId_frete() );
            f.setCancelado(frete.getCancelado());
            f.setUsuarioalteracao(frete.getUsuarioalteracao());
            f.setDtalteracao(frete.getDtalteracao());
            sessao.merge(f);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return frete;
    }
    
//     public boolean create(Object obj) {
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
//            JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
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
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            sessao.clear();
//        }
//        return retorno;
//    }
    

//    public void create(Frete ft) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO frete (descricao, usuariocadastro, dtcadastro, "+
//                     "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?)");
//            stmt.setString(1, ft.getDescricao());
//            stmt.setInt(2, ft.getUsuariocadastro());
//            stmt.setDate(3, (Date) ft.getDtcadastro());
//            stmt.setInt(4, ft.getUsuarioalteracao());
//            stmt.setDate(5, (Date) ft.getDtalteracao());
//            stmt.setString(6, ft.getCancelado());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "REGISTRADO COM SUCESSO...", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void update(Frete ft) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE frete SET descricao = ?, usuarioalteracao = ?, "+
//                    " dtalteracao = ? WHERE id_frete = ?");
//            stmt.setString(1, ft.getDescricao());
//            stmt.setInt(2, ft.getUsuarioalteracao());
//            stmt.setDate(3, (Date) ft.getDtalteracao());
//            stmt.setInt(4, ft.getId_frete());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO...", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    
//    public void delete(Frete ft) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("DELETE FROM frete WHERE id_frete = ?");
//            stmt.setInt(1, ft.getId_frete());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...", "ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//     
//    public void cancelar(Frete ft) {
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE frete SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_frete = ?");
//            stmt.setInt(1, ft.getUsuarioalteracao());
//            stmt.setDate(2, (Date) ft.getDtalteracao());
//            stmt.setString(3, ft.getCancelado());
//             stmt.setInt(4, ft.getId_frete());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//        
//    }
    
    public List<Frete> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Frete>    lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM frete");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Frete ft = new Frete();
                  ft.setId_frete(rs.getInt("id_frete"));
                  ft.setDescricao(rs.getString("descricao"));
                  ft.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  ft.setDtcadastro(rs.getDate("dtcadastro"));
                  ft.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  ft.setDtalteracao(rs.getDate("dtalteracao"));
                  ft.setCancelado(rs.getString("cancelado"));
                  lista.add(ft);
             }
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
              ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    public List<Frete> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Frete> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM frete WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Frete ft = new Frete();
                ft.setId_frete(rs.getInt("id_frete"));
                ft.setDescricao(rs.getString("descricao"));
                ft.setUsuariocadastro(rs.getInt("usuariocadastro"));
                ft.setDtcadastro(rs.getDate("dtcadastro"));
                ft.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                ft.setDtalteracao(rs.getDate("dtalteracao"));
                ft.setCancelado(rs.getString("cancelado"));
                lista.add(ft);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }

    public void imprimir() {
        String relatorio = "/Enterprise/Relatorios/relfrete.jasper";
        JasperPrint jasperPrinter = null;
        try {
            jasperPrinter = JasperFillManager.fillReport(relatorio, null, con);
            JasperViewer view = new JasperViewer(jasperPrinter, false);
            view.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO IMPRIMIR !" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con);
        }
    }
}
