
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
import model.bean.Funcao;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class FuncaoDAO {
    
    Connection con;
    public  static FuncaoDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public FuncaoDAO() {
        con      = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
     public static FuncaoDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new FuncaoDAO();
        }
        return hibernateDAO;
    }
    
     public Funcao salvar(Funcao funcao) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (funcao.getId_funcao() == 0) {
                sessao.persist(funcao);
            } else {
                Funcao f = ( Funcao ) sessao.get( Funcao.class, funcao.getId_funcao() );
                f.setDescricao(funcao.getDescricao());
                f.setComissaoperc(funcao.getComissaoperc());
                f.setUsuarioalteracao(funcao.getUsuarioalteracao());
                f.setDtalteracao(funcao.getDtalteracao());
                sessao.merge(f);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return funcao;
    }
    
    public Funcao cancelar(Funcao funcao) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Funcao f = ( Funcao ) sessao.get( Funcao.class, funcao.getId_funcao() );
            f.setCancelado(funcao.getCancelado());
            f.setUsuarioalteracao(funcao.getUsuarioalteracao());
            f.setDtalteracao(funcao.getDtalteracao());
            sessao.merge(f);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return funcao;
    }
    
    
    
//    public void create(Funcao f){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO funcao (descricao, comissaoperc, usuariocadastro, dtcadastro, "+
//                    "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?)");
//            stmt.setString(1,f.getDescricao());
//            stmt.setDouble(2,f.getComissaoperc());
//            stmt.setInt(3, f.getUsuariocadastro());
//            stmt.setDate(4, (Date) f.getDtcadastro());
//            stmt.setInt(5, f.getUsuarioalteracao());
//            stmt.setDate(6, (Date) f.getDtalteracao());
//            stmt.setString(7, f.getCancelado());
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
//    
//    public void update(Funcao f) {
//         PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE funcao SET descricao = ?, comissaoperc = ?, usuarioalteracao = ?, "+
//                    "dtalteracao = ?  WHERE id_funcao = ?");
//            stmt.setString(1, f.getDescricao());
//            stmt.setDouble(2, f.getComissaoperc());
//            stmt.setInt(3, f.getUsuarioalteracao());
//            stmt.setDate(4, (Date) f.getDtalteracao());
//            stmt.setInt(5, f.getId_funcao());
//            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
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
//    public void delete(Funcao f) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM funcao WHERE id_funcao = ?");
//             stmt.setInt(1, f.getId_funcao());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//     public void cancelar(Funcao f) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE funcao SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_funcao = ?");
//            stmt.setInt(1, f.getUsuarioalteracao());
//            stmt.setDate(2, (Date) f.getDtalteracao());
//            stmt.setString(3, f.getCancelado());
//            stmt.setInt(4, f.getId_funcao());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
    
    
     public List<Funcao> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet           rs = null;
        List<Funcao>     lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM funcao");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Funcao f = new Funcao();
                  f.setId_funcao(rs.getInt("id_funcao"));
                  f.setDescricao(rs.getString("descricao"));
                  f.setComissaoperc(rs.getDouble("comissaoperc"));
                  f.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  f.setDtcadastro(rs.getDate("dtcadastro"));
                  f.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  f.setDtalteracao(rs.getDate("dtalteracao"));
                  f.setCancelado(rs.getString("cancelado"));
                  lista.add(f);
              }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    
    public List<Funcao> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcao> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM funcao WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcao f = new Funcao();
                f.setId_funcao(rs.getInt("id_funcao"));
                f.setDescricao(rs.getString("descricao"));
                f.setComissaoperc(rs.getDouble("comissaoperc"));
                f.setUsuariocadastro(rs.getInt("usuariocadastro"));
                f.setDtcadastro(rs.getDate("dtcadastro"));
                f.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                f.setDtalteracao(rs.getDate("dtalteracao"));
                f.setCancelado(rs.getString("cancelado"));
                lista.add(f);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    
    public String pesquisaId(String id_funcao) {
        Funcao funcao = new Funcao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT descricao FROM funcao WHERE id_funcao = ?");
            stmt.setInt(1, Integer.parseInt(id_funcao));                 //Conversão para INT pois o campo é inteiro 
            rs = stmt.executeQuery();
            if (rs.next()) {
                funcao.setDescricao(rs.getString("descricao"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return funcao.getDescricao();
    }
        
    public int pesquisaDesc(String desc) {
        Funcao funcao = new Funcao();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT id_funcao FROM funcao WHERE descricao = ?");
            stmt.setString(1, desc);
            rs = stmt.executeQuery();
            if (rs.next()) {
                funcao.setId_funcao(rs.getInt("id_funcao"));
            } else {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A PESQUISA DA FUNÇÃO...", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return funcao.getId_funcao();
    }
       
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relfuncao.jasper";
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
