
package model.dao;



import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Grupo;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class GrupoDAO {
    
    Connection con;
    public  static GrupoDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public GrupoDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        

    public static GrupoDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new GrupoDAO();
        }
        return hibernateDAO;
    }
    
    public Grupo salvar(Grupo grupo) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (grupo.getId_grupo() == 0) {
                sessao.persist(grupo);
            } else {
                Grupo g = ( Grupo ) sessao.get( Grupo.class, grupo.getId_grupo() );
                g.setDescricao(grupo.getDescricao());
                g.setUsuarioalteracao(grupo.getUsuarioalteracao());
                g.setDtalteracao(grupo.getDtalteracao());
                sessao.merge(g);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return grupo;
    }
    
    public Grupo cancelar(Grupo grupo) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Grupo g = ( Grupo ) sessao.get( Grupo.class, grupo.getId_grupo() );
            g.setCancelado(grupo.getCancelado());
            g.setUsuarioalteracao(grupo.getUsuarioalteracao());
            g.setDtalteracao(grupo.getDtalteracao());
            sessao.merge(g);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return grupo;
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
//    
    
//    public void create(Grupo g) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO grupo (descricao, usuariocadastro, dtcadastro, "
//                    + "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?)");
//            stmt.setString(1, g.getDescricao());
//            stmt.setInt(2, g.getUsuariocadastro());
//            stmt.setDate(3, (Date) g.getDtcadastro());
//            stmt.setInt(4, g.getUsuarioalteracao());
//            stmt.setDate(5, (Date) g.getDtalteracao());
//            stmt.setString(6, g.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//      
//    public void update(Grupo gp) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE grupo SET descricao = ?, usuarioalteracao = ?, dtalteracao = ? "+
//                     " WHERE id_grupo = ?");
//            stmt.setString(1, gp.getDescricao());
//            stmt.setInt(2, gp.getUsuarioalteracao());
//            stmt.setDate(3, (Date) gp.getDtalteracao());
//            stmt.setInt(4, gp.getId_grupo());
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
//    public void delete(Grupo gp) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM grupo WHERE id_grupo = ?");
//             stmt.setInt(1, gp.getId_grupo());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//             ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//     public void cancelar(Grupo gp) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE grupo SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_grupo = ?");
//            stmt.setInt(1, gp.getUsuarioalteracao());
//            stmt.setDate(2, (Date) gp.getDtalteracao());
//            stmt.setString(3, gp.getCancelado());
//            stmt.setInt(4, gp.getId_grupo());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//
//    }

     public List<Grupo> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Grupo> gplista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM grupo");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Grupo gp = new Grupo();
                  gp.setId_grupo(rs.getInt("id_grupo"));
                  gp.setDescricao(rs.getString("descricao"));
                  gp.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  gp.setDtcadastro(rs.getDate("dtcadastro"));
                  gp.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  gp.setDtalteracao(rs.getDate("dtalteracao"));
                  gp.setCancelado(rs.getString("cancelado"));
                  gplista.add(gp);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gplista;
            
    }         
    
    public List<Grupo> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Grupo> gplista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM grupo WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Grupo gp = new Grupo();
                gp.setId_grupo(rs.getInt("id_grupo"));
                gp.setDescricao(rs.getString("descricao"));
                gp.setUsuariocadastro(rs.getInt("usuariocadastro"));
                gp.setDtcadastro(rs.getDate("dtcadastro"));
                gp.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                gp.setDtalteracao(rs.getDate("dtalteracao"));
                gp.setCancelado(rs.getString("cancelado"));
                gplista.add(gp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gplista;
    }
    
    public String pesquisaId(String id_grupo) {
        Grupo gp = new Grupo();
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT descricao FROM grupo WHERE id_grupo = ?");
            stmt.setInt(1, Integer.parseInt(id_grupo));                 //Conversão para INT pois o campo é inteiro 
            rs = stmt.executeQuery();
            if (rs.next()) {
                gp.setDescricao(rs.getString("descricao"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gp.getDescricao();
    }

    
    public int pesquisaDesc(String desc) {
        Grupo gp = new Grupo();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT id_grupo FROM grupo WHERE descricao LIKE ?");
            stmt.setString(1, desc);
            rs = stmt.executeQuery();
            if (rs.next()) {
                gp.setId_grupo(rs.getInt("id_grupo"));
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return gp.getId_grupo();
    }

    public void imprimir() {
        String relatorio = "/Enterprise/Relatorios/relgrupo.jasper";
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
