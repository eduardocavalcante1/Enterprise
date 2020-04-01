
package model.dao;



import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.TipoVenda;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class TipoVendaDAO {

    Connection con;
    public  static TipoVendaDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public TipoVendaDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }  
    
    public static TipoVendaDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new TipoVendaDAO();
        }
        return hibernateDAO;
    }
    
     public TipoVenda salvar(TipoVenda tipovenda) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (tipovenda.getId_tipovenda() == 0) {
                sessao.persist(tipovenda);
            } else {
                TipoVenda t = ( TipoVenda ) sessao.get( TipoVenda.class, tipovenda.getId_tipovenda() );
                t.setDescricao(tipovenda.getDescricao());
                t.setUsuarioalteracao(tipovenda.getUsuarioalteracao());
                t.setDtalteracao(tipovenda.getDtalteracao());
                sessao.merge(t);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return tipovenda;
    }
    
    public TipoVenda cancelar(TipoVenda tipovenda) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            TipoVenda t = ( TipoVenda ) sessao.get( TipoVenda.class, tipovenda.getId_tipovenda() );
            t.setCancelado(tipovenda.getCancelado());
            t.setUsuarioalteracao(tipovenda.getUsuarioalteracao());
            t.setDtalteracao(tipovenda.getDtalteracao());
            sessao.merge(t);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return tipovenda;
    }
    
//  public boolean create(Object obj) {
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

//    public void create(TipoVenda tv){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO tipovenda (descricao) VALUES (?)");
//            stmt.setString(1, tv.getDescricao());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "REGISTRADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void update(TipoVenda und) {
//         PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE tipovenda SET descricao = ? WHERE id_tipovenda = ?");
//            stmt.setString(1, und.getDescricao());
//            stmt.setInt(2, und.getId_tipovenda());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    
//    public void delete(TipoVenda tv) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM tipovenda WHERE id_tipovenda = ?");
//             stmt.setInt(1, tv.getId_tipovenda());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    public List<TipoVenda> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<TipoVenda>    lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM tipovenda");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  TipoVenda tv = new TipoVenda();
                  tv.setId_tipovenda(rs.getInt("id_tipovenda"));
                  tv.setDescricao(rs.getString("descricao"));
                  tv.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  tv.setDtcadastro(rs.getDate("dtcadastro"));
                  tv.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  tv.setDtalteracao(rs.getDate("dtalteracao"));
                  tv.setCancelado(rs.getString("cancelado"));
                  lista.add(tv);
             }
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
              ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    
    public List<TipoVenda> readForDesc(String desc) {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<TipoVenda> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tipovenda WHERE descricao LIKE ?");
            stmt.setString(1, desc+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                TipoVenda tv = new TipoVenda();
                tv.setId_tipovenda(rs.getInt("id_tipovenda"));
                tv.setDescricao(rs.getString("descricao"));
                tv.setUsuariocadastro(rs.getInt("usuariocadastro"));
                tv.setDtcadastro(rs.getDate("dtcadastro"));
                tv.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                tv.setDtalteracao(rs.getDate("dtalteracao"));
                tv.setCancelado(rs.getString("cancelado"));
                lista.add(tv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
        
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/reltipovenda.jasper";
        JasperPrint   jasperPrinter = null;
        try {
            jasperPrinter = JasperFillManager.fillReport(relatorio, null, con);
            JasperViewer view  = new JasperViewer(jasperPrinter,false);
            view.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO IMPRIMIR !" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con);
        }
    }
}
