
package model.dao;


import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Tamanho;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class TamanhoDAO {
    
    Connection con;
    public  static TamanhoDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public TamanhoDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
     public static TamanhoDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new TamanhoDAO();
        }
        return hibernateDAO;
    }
      
    public Tamanho salvar(Tamanho tamanho) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (tamanho.getId_tamanho() == 0) {
                sessao.persist(tamanho);
            } else {
                Tamanho t = ( Tamanho ) sessao.get( Tamanho.class, tamanho.getId_tamanho() );
                t.setDescricao(tamanho.getDescricao());
                t.setCodigo(tamanho.getCodigo());
                t.setUsuarioalteracao(tamanho.getUsuarioalteracao());
                t.setDtalteracao(tamanho.getDtalteracao());
                sessao.merge(t);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return tamanho;
    }
    
    public Tamanho cancelar(Tamanho tamanho) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Tamanho t = ( Tamanho ) sessao.get( Tamanho.class, tamanho.getId_tamanho() );
            t.setCancelado(tamanho.getCancelado());
            t.setUsuarioalteracao(tamanho.getUsuarioalteracao());
            t.setDtalteracao(tamanho.getDtalteracao());
            sessao.merge(t);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return tamanho;
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
    
    
    
//    public void create(Tamanho tm) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO tamanho (codigo,descricao,usuariocadastro,dtcadastro,"+
//                    "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?)");
//            stmt.setString(1, tm.getCodigo());
//            stmt.setString(2, tm.getDescricao());
//            stmt.setInt(3, tm.getUsuariocadastro());
//            stmt.setDate(4, (Date) tm.getDtcadastro());
//            stmt.setInt(5, tm.getUsuarioalteracao());
//            stmt.setDate(6, (Date) tm.getDtalteracao());
//            stmt.setString(7, tm.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void update(Tamanho tm) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE tamanho SET codigo = ?, descricao = ?, usuarioalteracao = ?,"
//                    + " dtalteracao = ?  WHERE id_tamanho = ?");
//            stmt.setString(1, tm.getCodigo());
//            stmt.setString(2, tm.getDescricao());
//            stmt.setInt(3, tm.getId_tamanho());
//            stmt.setInt(4, tm.getUsuarioalteracao());
//            stmt.setDate(5, (Date) tm.getDtalteracao());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    
//    public void delete(Tamanho tm) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM tamanho WHERE id_tamanho = ?");
//             stmt.setInt(1, tm.getId_tamanho());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//      public void cancelar(Tamanho tm) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE tamanho SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_tamanho = ?");
//            stmt.setInt(1, tm.getUsuarioalteracao());
//            stmt.setDate(2, (Date) tm.getDtalteracao());
//            stmt.setString(3, tm.getCancelado());
//            stmt.setInt(4, tm.getId_tamanho());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
     public List<Tamanho> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Tamanho>    lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM tamanho");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Tamanho tm = new Tamanho();
                  tm.setId_tamanho(rs.getInt("id_tamanho"));
                  tm.setCodigo(rs.getString("codigo"));
                  tm.setDescricao(rs.getString("descricao"));
                  tm.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  tm.setDtcadastro(rs.getDate("dtcadastro"));
                  tm.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  tm.setDtalteracao(rs.getDate("dtalteracao"));
                  tm.setCancelado(rs.getString("cancelado"));
                  lista.add(tm);
             }
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    
    public List<Tamanho> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Tamanho> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tamanho WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Tamanho tm = new Tamanho();
                tm.setId_tamanho(rs.getInt("id_tamanho"));
                tm.setCodigo(rs.getString("codigo"));
                tm.setDescricao(rs.getString("descricao"));
                tm.setUsuariocadastro(rs.getInt("usuariocadastro"));
                tm.setDtcadastro(rs.getDate("dtcadastro"));
                tm.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                tm.setDtalteracao(rs.getDate("dtalteracao"));
                tm.setCancelado(rs.getString("cancelado"));
                lista.add(tm);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public String pesquisacodigo(String codigo) {  //PESQUISA POR CÓDIGO DO TAMANHO PARA NÃO INCLUIR CODIGO EXISTENTE
        Tamanho tm = new Tamanho();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT codigo FROM tamanho WHERE codigo = ?");
            stmt.setString(1, codigo);
            rs = stmt.executeQuery();
            if (rs.next()) {
                tm.setCodigo(rs.getString("codigo"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return tm.getCodigo();
    }

    
    public String pesquisaDesc(String desc) { //PESQUISA POR DESCRICAO RETORNANDO A SIGLA AINDA NÃO TESTADA. SE ESTIVER OK APAGAR O COMENTARIO
        Tamanho tm = new Tamanho();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT codigo FROM tamanho WHERE descricao LIKE ?");
            stmt.setString(1, desc);
            rs = stmt.executeQuery();
            if (rs.next()) {
                tm.setCodigo(rs.getString("codigo"));
            } else {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A PESQUISA DA UNIDADE...", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return tm.getCodigo();
    }
    
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/reltamanho.jasper";
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
