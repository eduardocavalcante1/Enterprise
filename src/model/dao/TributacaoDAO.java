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
import model.bean.Tributacao;
import model.bean.Tributacao;
import static model.dao.ColaboradorDAO.hibernateDAO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class TributacaoDAO {
    
    Connection con;
    public  static TributacaoDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    
    public TributacaoDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
    public static TributacaoDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new TributacaoDAO();
        }
        return hibernateDAO;
    }
    
    public Tributacao salvar(Tributacao tributacao) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (tributacao.getId_tributacao() == 0) {
                sessao.persist(tributacao);
            } else {
                Tributacao t = ( Tributacao ) sessao.get( Tributacao.class, tributacao.getId_tributacao() );
                t.setDescricao(tributacao.getDescricao());
                t.setUf(tributacao.getUf());
                t.setAliquota(tributacao.getAliquota());
                t.setRedutor(tributacao.getRedutor());
                t.setEntradasaida(tributacao.getEntradasaida());
                t.setUsuarioalteracao(tributacao.getUsuarioalteracao());
                t.setDtalteracao(tributacao.getDtalteracao());
                sessao.merge(t);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return tributacao;
    }
    
    public Tributacao cancelar(Tributacao tributacao) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Tributacao t = ( Tributacao ) sessao.get( Tributacao.class, tributacao.getId_tributacao() );
            t.setCancelado(tributacao.getCancelado());
            t.setUsuarioalteracao(tributacao.getUsuarioalteracao());
            t.setDtalteracao(tributacao.getDtalteracao());
            sessao.merge(t);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return tributacao;
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
    
//    public void create(Tributacao t) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO tributacao (descricao,uf,aliquota,redutor,entradasaida, "
//                    + "usuariocadastro, dtcadastro, usuarioalteracao, dtalteracao, cancelado)"
//                    + " VALUES (?,?,?,?,?,?,?,?,?,?)");
//            stmt.setString(1, t.getDescricao());
//            stmt.setString(2, t.getUf());
//            stmt.setDouble(3, t.getAliquota());
//            stmt.setDouble(4, t.getRedutor());
//            stmt.setString(5, t.getEntradasaida());
//            stmt.setInt(6, t.getUsuariocadastro());
//            stmt.setDate(7, (Date) t.getDtcadastro());
//            stmt.setInt(8, t.getUsuarioalteracao());
//            stmt.setDate(9, (Date) t.getDtalteracao());
//            stmt.setString(10, t.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//   
//    
//    public void update(Tributacao t) {
//         PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE tributacao SET descricao = ? , uf = ?, aliquota = ? , redutor = ?, "
//                                        + "entradasaida = ?, usuarioalteracao = ?, dtalteracao = ? WHERE id_tributacao = ?");
//            stmt.setString(1, t.getDescricao());
//            stmt.setString(2, t.getUf());
//            stmt.setDouble(3, t.getAliquota());
//            stmt.setDouble(4, t.getRedutor());
//            stmt.setString(5, t.getEntradasaida());
//            stmt.setInt(6, t.getUsuarioalteracao());
//            stmt.setDate(7,(Date)t.getDtalteracao());
//            stmt.setInt(8, t.getId_tributacao());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void delete(Tributacao t) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM tributacao WHERE id_tributacao = ?");
//             stmt.setInt(1, t.getId_tributacao());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... "+ ex, "ENTERPRISE - ERRO" , JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//     public void cancelar(Tributacao t) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE tributacao SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_tributacao = ?");
//            stmt.setInt(1, t.getUsuarioalteracao());
//            stmt.setDate(2, (Date) t.getDtalteracao());
//            stmt.setString(3, t.getCancelado());
//            stmt.setInt(4, t.getId_tributacao());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
    
    public List<Tributacao> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Tributacao> lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM tributacao");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Tributacao tributacao = new Tributacao();
                  tributacao.setId_tributacao(rs.getInt("id_tributacao"));
                  tributacao.setDescricao(rs.getString("descricao"));
                  tributacao.setUf(rs.getString("uf"));
                  tributacao.setAliquota(rs.getDouble("aliquota"));
                  tributacao.setRedutor(rs.getDouble("redutor"));
                  tributacao.setEntradasaida(rs.getString("entradasaida"));
                  tributacao.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  tributacao.setDtcadastro(rs.getDate("dtcadastro"));
                  tributacao.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  tributacao.setDtalteracao(rs.getDate("dtalteracao"));
                  tributacao.setCancelado(rs.getString("cancelado"));
                  lista.add(tributacao);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex , "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    public List<Tributacao> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tributacao> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tributacao WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Tributacao tributacao = new Tributacao();
                tributacao.setId_tributacao(rs.getInt("id_tributacao"));
                tributacao.setDescricao(rs.getString("descricao"));
                tributacao.setUf(rs.getString("uf"));
                tributacao.setAliquota(rs.getDouble("aliquota"));
                tributacao.setRedutor(rs.getDouble("redutor"));
                tributacao.setEntradasaida(rs.getString("entradasaida"));
                tributacao.setUsuariocadastro(rs.getInt("usuariocadastro"));
                tributacao.setDtcadastro(rs.getDate("dtcadastro"));
                tributacao.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                tributacao.setDtalteracao(rs.getDate("dtalteracao"));
                tributacao.setCancelado(rs.getString("cancelado"));
                lista.add(tributacao);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
      
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/reltributacao.jasper";
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
    
   
   