
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
import model.bean.NaturezaOpe;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class NaturezaOpeDAO {
    
    Connection con;
    public  static NaturezaOpeDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public NaturezaOpeDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
    public static NaturezaOpeDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new NaturezaOpeDAO();
        }
        return hibernateDAO;
    }
    
    public NaturezaOpe salvar(NaturezaOpe naturezaope) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (naturezaope.getId_naturezaope() == 0) {
                sessao.persist(naturezaope);
            } else {
                NaturezaOpe n = ( NaturezaOpe ) sessao.get( NaturezaOpe.class, naturezaope.getId_naturezaope() );
                n.setDescricao(naturezaope.getDescricao());
                n.setClassificacao(naturezaope.getClassificacao());
                n.setSaidaentrada(naturezaope.getSaidaentrada());
                n.setPlanocontas(naturezaope.getPlanocontas());
                n.setUsuarioalteracao(naturezaope.getUsuarioalteracao());
                n.setDtalteracao(naturezaope.getDtalteracao());
                sessao.merge(n);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return naturezaope;
    }
    
    public NaturezaOpe cancelar(NaturezaOpe naturezaope) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            NaturezaOpe n = ( NaturezaOpe ) sessao.get( NaturezaOpe.class, naturezaope.getId_naturezaope() );
            n.setCancelado(naturezaope.getCancelado());
            n.setUsuarioalteracao(naturezaope.getUsuarioalteracao());
            n.setDtalteracao(naturezaope.getDtalteracao());
            sessao.merge(n);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return naturezaope;
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
//    
    
//    public void create(NaturezaOpe no){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO naturezaope (descricao, classificacao, saidaentrada, planocontas, "+
//                    "usuariocadastro, dtcadastro, usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?,?,?)");
//            stmt.setString(1, no.getDescricao());
//            stmt.setString(2, no.getClassificacao());
//            stmt.setString(3, no.getSaidaentrada());
//            stmt.setString(4, no.getPlanocontas());
//            stmt.setInt(5, no.getUsuariocadastro());
//            stmt.setDate(6, (Date) no.getDtcadastro());
//            stmt.setInt(7, no.getUsuarioalteracao());
//            stmt.setDate(8, (Date) no.getDtalteracao());
//            stmt.setString(9, no.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//       
//    public void update(NaturezaOpe no) {
//        
//         PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE naturezaope SET descricao = ? , classificacao = ?, saidaentrada = ?, "
//                                        + "planocontas = ?, usuarioalteracao = ?, dtalteracao = ?  WHERE id_naturezaope = ?");
//            stmt.setString(1, no.getDescricao());
//            stmt.setString(2, no.getClassificacao());
//            stmt.setString(3, no.getSaidaentrada());
//            stmt.setString(4, no.getPlanocontas());
//            stmt.setInt(5, no.getUsuarioalteracao());
//            stmt.setDate(6, (Date) no.getDtalteracao());
//            stmt.setInt(7, no.getId_naturezaope());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void delete(NaturezaOpe no) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM naturezaope WHERE id_naturezaope = ?");
//             stmt.setInt(1, no.getId_naturezaope());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... "+ ex, "ENTERPRISE - ERRO" , JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//    
//     public void cancelar(NaturezaOpe no) {
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE naturezaope SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_naturezaope = ?");
//            stmt.setInt(1, no.getUsuarioalteracao());
//            stmt.setDate(2, (Date) no.getDtalteracao());
//            stmt.setString(3, no.getCancelado());
//            stmt.setInt(4, no.getId_naturezaope());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//        
//    }
    
    
    public List<NaturezaOpe> read() {
        Connection        con   = ConnectionFactory.getConnection();
        PreparedStatement stmt  = null;
        ResultSet         rs    = null;
        List<NaturezaOpe> lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM naturezaope");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  NaturezaOpe no = new NaturezaOpe();
                  no.setId_naturezaope(rs.getInt("id_naturezaope"));
                  no.setDescricao(rs.getString("descricao"));
                  no.setClassificacao(rs.getString("classificacao"));
                  no.setSaidaentrada(rs.getString("saidaentrada"));
                  no.setPlanocontas(rs.getString("planocontas"));
                  no.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  no.setDtcadastro(rs.getDate("dtcadastro"));
                  no.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  no.setDtalteracao(rs.getDate("dtalteracao"));
                  no.setCancelado(rs.getString("cancelado"));
                  lista.add(no);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
            
    }         
    
    
    public List<NaturezaOpe> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<NaturezaOpe> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM naturezaope WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                NaturezaOpe no = new NaturezaOpe();
                no.setId_naturezaope(rs.getInt("id_naturezaope"));
                no.setDescricao(rs.getString("descricao"));
                no.setClassificacao(rs.getString("classificacao"));
                no.setSaidaentrada(rs.getString("saidaentrada"));
                no.setPlanocontas(rs.getString("planocontas"));
                no.setUsuariocadastro(rs.getInt("usuariocadastro"));
                no.setDtcadastro(rs.getDate("dtcadastro"));
                no.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                no.setDtalteracao(rs.getDate("dtalteracao"));
                no.setCancelado(rs.getString("cancelado"));
                lista.add(no);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relnaturezaope.jasper";
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
