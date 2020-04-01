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
import model.bean.SubGrupo;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class SubGrupoDAO {
    
      Connection con;
      public static SubGrupoDAO hibernateDAO = null;
      private SessionFactory factory;
      private Transaction transaction;
    
    public SubGrupoDAO() {
      
        con     = ConnectionFactory.getConnection();
        factory = HibernateUtil.getSessionFactory();
    }        
    
    public static SubGrupoDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new SubGrupoDAO();
        }
        return hibernateDAO;
    }
    
      public SubGrupo salvar(SubGrupo subgrupo) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (subgrupo.getId_subgrupo() == 0) {
                sessao.persist(subgrupo);
            } else {
                SubGrupo s = ( SubGrupo ) sessao.get( SubGrupo.class, subgrupo.getId_subgrupo() );
                s.setDescricao(subgrupo.getDescricao());
                s.setGrupo(subgrupo.getGrupo());
                s.setUsuarioalteracao(subgrupo.getUsuarioalteracao());
                s.setDtalteracao(subgrupo.getDtalteracao());
                sessao.merge(s);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return subgrupo;
    }
    
    public SubGrupo cancelar(SubGrupo subgrupo) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            SubGrupo s = ( SubGrupo ) sessao.get( SubGrupo.class, subgrupo.getId_subgrupo() );
            s.setCancelado(subgrupo.getCancelado());
            s.setUsuarioalteracao(subgrupo.getUsuarioalteracao());
            s.setDtalteracao(subgrupo.getDtalteracao());
            sessao.merge(s);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return subgrupo;
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
//    
    
//    public void create(SubGrupo sg){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO subgrupo (descricao, grupo_id, usuariocadastro, dtcadastro,"
//                    + " usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?)");
//            stmt.setString(1, sg.getDescricao());
//            stmt.setInt(2, sg.getGrupo_id());
//            stmt.setInt(3, sg.getUsuariocadastro());
//            stmt.setDate(4, (Date) sg.getDtcadastro());
//            stmt.setInt(5, sg.getUsuarioalteracao());
//            stmt.setDate(6, (Date) sg.getDtalteracao());
//            stmt.setString(7, sg.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//        
//    public void update(SubGrupo sgp) {
//         PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE subgrupo SET descricao = ?, grupo_id = ?, usuarioalteracao = ?,"
//                    + "  dtalteracao = ?   WHERE id_subgrupo = ?");
//            stmt.setString(1, sgp.getDescricao());
//            stmt.setInt(2,sgp.getGrupo_id());
//            stmt.setInt(3, sgp.getUsuarioalteracao());
//            stmt.setDate(4, (Date) sgp.getDtalteracao());
//            stmt.setInt(5, sgp.getId_subgrupo());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//    public void delete(SubGrupo sgp) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM subgrupo WHERE id_subgrupo = ?");
//             stmt.setInt(1, sgp.getId_subgrupo());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//    public void cancelar(SubGrupo sgp) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE subgrupo SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_subgrupo = ?");
//            stmt.setInt(1, sgp.getUsuarioalteracao());
//            stmt.setDate(2, (Date) sgp.getDtalteracao());
//            stmt.setString(3, sgp.getCancelado());
//            stmt.setInt(4, sgp.getId_subgrupo());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
    
    public List<SubGrupo> read() {
        Connection         con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<SubGrupo> sgplista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM subgrupo");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  SubGrupo sgp = new SubGrupo();
                  Grupo  grupo = new Grupo();
                  sgp.setId_subgrupo(rs.getInt("id_subgrupo"));
                  sgp.setDescricao(rs.getString("descricao"));
                  grupo.setId_grupo(rs.getInt("grupo_id"));
                  sgp.setGrupo(grupo);
                 // sgp.setGrupo_id(rs.getInt("grupo_id")); 
                  sgp.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  sgp.setDtcadastro(rs.getDate("dtcadastro"));
                  sgp.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  sgp.setDtalteracao(rs.getDate("dtalteracao"));
                  sgp.setCancelado(rs.getString("cancelado"));
                  sgplista.add(sgp);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return sgplista;
    }         
    
    
    public List<SubGrupo> readForDesc(String desc) {
        Connection         con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet           rs = null;
        List<SubGrupo> sgplista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM subgrupo WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                SubGrupo sgp = new SubGrupo();
                Grupo  grupo = new Grupo();
                sgp.setId_subgrupo(rs.getInt("id_subgrupo"));
                sgp.setDescricao(rs.getString("descricao"));
                grupo.setId_grupo(rs.getInt("grupo_id"));
                sgp.setGrupo(grupo);
                //sgp.setGrupo_id(rs.getInt("grupo_id"));
                sgp.setUsuariocadastro(rs.getInt("usuariocadastro"));
                sgp.setDtcadastro(rs.getDate("dtcadastro"));
                sgp.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                sgp.setDtalteracao(rs.getDate("dtalteracao"));
                sgp.setCancelado(rs.getString("cancelado"));
                sgplista.add(sgp);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return sgplista;
    }
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relsubgrupo.jasper";
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
