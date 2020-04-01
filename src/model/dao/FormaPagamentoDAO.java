
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
import model.bean.FormaPagamento;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class FormaPagamentoDAO {
    
    Connection con;
    public  static FormaPagamentoDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public FormaPagamentoDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }    

    public static FormaPagamentoDAO getInstance(){
        
        if (hibernateDAO == null){
            hibernateDAO = new FormaPagamentoDAO();
        }
        
        return hibernateDAO;
    }   
    
     public FormaPagamento salvar(FormaPagamento formapagamento) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (formapagamento.getId_formapagamento() == 0) {
                sessao.persist(formapagamento);
            } else {
                FormaPagamento f = ( FormaPagamento ) sessao.get( FormaPagamento.class, formapagamento.getId_formapagamento() );
                f.setDescricao(formapagamento.getDescricao());
                f.setDescontopercentual(formapagamento.getDescontopercentual());
                f.setAcrescimopercentual(formapagamento.getAcrescimopercentual());
                f.setPrazo(formapagamento.getPrazo());
                f.setUsuarioalteracao(formapagamento.getUsuarioalteracao());
                f.setDtalteracao(formapagamento.getDtalteracao());
                sessao.merge(f);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return formapagamento;
    }
    
    public FormaPagamento cancelar(FormaPagamento formapagamento) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            FormaPagamento f = ( FormaPagamento ) sessao.get( FormaPagamento.class, formapagamento.getId_formapagamento() );
            f.setCancelado(formapagamento.getCancelado());
            f.setUsuarioalteracao(formapagamento.getUsuarioalteracao());
            f.setDtalteracao(formapagamento.getDtalteracao());
            sessao.merge(f);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return formapagamento;
    }
    
//    public void create(FormaPagamento fp){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO formapagamento (descricao, descontopercentual, acrescimopercentual, prazo, "
//                    + "usuariocadastro, dtcadastro, usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?,?,?)");
//            stmt.setString(1, fp.getDescricao());
//            stmt.setDouble(2, fp.getDescontopercentual());
//            stmt.setDouble(3, fp.getAcrescimopercentual());
//            stmt.setInt(4, fp.getPrazo());
//            stmt.setInt(5, fp.getUsuariocadastro());
//            stmt.setDate(6, (Date) fp.getDtcadastro());
//            stmt.setInt(7, fp.getUsuarioalteracao());
//            stmt.setDate(8, (Date) fp.getDtalteracao());
//            stmt.setString(9, fp.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//        finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void update(FormaPagamento fp) {
//         PreparedStatement stmt = null;
//         
//         try {
//            stmt = con.prepareStatement("UPDATE formapagamento SET descricao = ? , descontopercentual = ?,acrescimopercentual = ?, "
//                                        + "prazo = ?, usuarioalteracao = ?, dtalteracao = ? WHERE id_formapagamento = ?");
//            stmt.setString(1, fp.getDescricao());
//            stmt.setDouble(2, fp.getDescontopercentual());
//            stmt.setDouble(3, fp.getAcrescimopercentual());
//            stmt.setInt(4, fp.getPrazo());
//            stmt.setInt(5, fp.getUsuarioalteracao());
//            stmt.setDate(6, (Date) fp.getDtalteracao());
//            stmt.setInt(7, fp.getId_formapagamento());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    
//    public void delete(FormaPagamento fp) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM formapagamento WHERE id_formapagamento = ?");
//             stmt.setInt(1, fp.getId_formapagamento());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... "+ ex, "ENTERPRISE - ERRO" , JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
    
    
//     public void cancelar(FormaPagamento fp) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE formapagamento SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_formapagamento = ?");
//            stmt.setInt(1, fp.getUsuarioalteracao());
//            stmt.setDate(2, (Date) fp.getDtalteracao());
//            stmt.setString(3, fp.getCancelado());
//            stmt.setInt(4, fp.getId_formapagamento());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    public List<FormaPagamento> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<FormaPagamento> fps = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM formapagamento");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  FormaPagamento forma = new FormaPagamento();
                  forma.setId_formapagamento(rs.getInt("id_formapagamento"));
                  forma.setDescricao(rs.getString("descricao"));
                  forma.setDescontopercentual(rs.getFloat("descontopercentual"));
                  forma.setAcrescimopercentual(rs.getFloat("acrescimopercentual"));
                  forma.setPrazo(rs.getInt("prazo"));
                  forma.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  forma.setDtcadastro(rs.getDate("dtcadastro"));
                  forma.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  forma.setDtalteracao(rs.getDate("dtalteracao"));
                  forma.setCancelado(rs.getString("cancelado"));
                  fps.add(forma);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fps;
            
    }         
    
    public List<FormaPagamento> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<FormaPagamento> fps = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM formapagamento WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                FormaPagamento forma = new FormaPagamento();
                forma.setId_formapagamento(rs.getInt("id_formapagamento"));
                forma.setDescricao(rs.getString("descricao"));
                forma.setDescontopercentual(rs.getFloat("descontopercentual"));
                forma.setAcrescimopercentual(rs.getFloat("acrescimopercentual"));
                forma.setPrazo(rs.getInt("prazo"));
                forma.setUsuariocadastro(rs.getInt("usuariocadastro"));
                forma.setDtcadastro(rs.getDate("dtcadastro"));
                forma.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                forma.setDtalteracao(rs.getDate("dtalteracao"));
                forma.setCancelado(rs.getString("cancelado"));
                fps.add(forma);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fps;
    }
      
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relformapagamento.jasper";
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


