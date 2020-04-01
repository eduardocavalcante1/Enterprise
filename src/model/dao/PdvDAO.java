
package model.dao;



import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Filial;
import model.bean.Pdv;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class PdvDAO {
    
    Connection con;
    public static PdvDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public PdvDAO() {
        con = ConnectionFactory.getConnection();
        factory = HibernateUtil.getSessionFactory();
    }        
    
    public static PdvDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new PdvDAO();
        }
        return hibernateDAO;
    }
    public Pdv salvar(Pdv pdv) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (pdv.getId_pdv() == 0) {
                sessao.persist(pdv);
            } else {
                Pdv p = ( Pdv ) sessao.get( Pdv.class, pdv.getId_pdv() );
                p.setDescricao(pdv.getDescricao());
                p.setCodigopdv(pdv.getCodigopdv());
                p.setFilial(pdv.getFilial());
                p.setUsuarioalteracao(pdv.getUsuarioalteracao());
                p.setDtalteracao(pdv.getDtalteracao());
                sessao.merge(p);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return pdv;
    }
    
    public Pdv cancelar(Pdv pdv) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Pdv p = ( Pdv ) sessao.get( Pdv.class, pdv.getId_pdv() );
            p.setCancelado(pdv.getCancelado());
            p.setUsuarioalteracao(pdv.getUsuarioalteracao());
            p.setDtalteracao(pdv.getDtalteracao());
            sessao.merge(p);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return pdv;
    }
    
    
//    public void create(Pdv p){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO pdv (descricao, codigopdv, filial_id, dtultcarga, aberto, usuariocadastro, "+
//                    " dtcadastro, usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?,?,?,?)");
//            stmt.setString(1, p.getDescricao());
//            stmt.setString(2, p.getCodigopdv());
//            stmt.setInt(3,p.getFilial_id());
//            stmt.setDate(4,(java.sql.Date) p.getDtultcarga());
//            stmt.setString(5, p.getAberto());
//            stmt.setInt(6, p.getUsuariocadastro());
//            stmt.setDate(7, (java.sql.Date) p.getDtcadastro());
//            stmt.setInt(8, p.getUsuarioalteracao());
//            stmt.setDate(9, (java.sql.Date) p.getDtalteracao());
//            stmt.setString(10, p.getCancelado());
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
//    public void update(Pdv p) {
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE pdv SET descricao = ?, codigopdv = ?, filial_id = ?, usuarioalteracao = ?, "
//                    + "dtalteracao = ? WHERE id_pdv = ?");
//            stmt.setString(1, p.getDescricao());
//            stmt.setString(2, p.getCodigopdv());
//            stmt.setInt(3, p.getFilial_id());
//            stmt.setInt(4, p.getUsuarioalteracao());
//            stmt.setDate(5, (java.sql.Date) p.getDtalteracao());
//            stmt.setInt(6, p.getId_pdv());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    
//    public void delete(Pdv p) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("DELETE FROM pdv WHERE codigopdv = ?");
//             stmt.setString(1, p.getCodigopdv());
//             stmt.executeUpdate();
//             JOptionPane.showMessageDialog(null, "ITEM EXCLUIDO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//             ConnectionFactory.closeConnection(con, stmt);
//        }
//     }
//    
//    
//    public void cancelar(Pdv p) {
//        Connection con = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE pdv SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_pdv = ?");
//            stmt.setInt(1, p.getUsuarioalteracao());
//            stmt.setDate(2, (java.sql.Date) p.getDtalteracao());
//            stmt.setString(3, p.getCancelado());
//            stmt.setInt(4, p.getId_pdv());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    public List<Pdv> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pdv> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pdv");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filial filial = new Filial();
                Pdv pdv       = new Pdv();
                pdv.setId_pdv(rs.getInt("id_pdv"));
                pdv.setCodigopdv(rs.getString("codigopdv"));
                pdv.setDescricao(rs.getString("descricao"));
                filial.setId_filial(rs.getInt("filial_id"));
                pdv.setFilial(filial);
                //pdv.setFilial(rs.getInt("filial_id"));
                pdv.setDtultcarga(rs.getDate("dtultcarga"));
                pdv.setAberto(rs.getString("aberto"));
                pdv.setUsuariocadastro(rs.getInt("usuariocadastro"));
                pdv.setDtcadastro(rs.getDate("dtcadastro"));
                pdv.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                pdv.setDtalteracao(rs.getDate("dtalteracao"));
                pdv.setCancelado(rs.getString("cancelado"));
                lista.add(pdv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;

    }
    
    
    public List<Pdv> readForDesc(String desc) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Pdv> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pdv WHERE descricao LIKE ?");
            stmt.setString(1, desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filial  filial = new Filial();
                Pdv pdv = new Pdv();
                pdv.setId_pdv(rs.getInt("id_pdv"));
                pdv.setDescricao(rs.getString("descricao"));
                pdv.setCodigopdv(rs.getString("codigopdv"));
                filial.setId_filial(rs.getInt("filial_id"));
                pdv.setFilial(filial);
                //pdv.setFilial_id(rs.getInt("filial_id"));
                pdv.setDtultcarga(rs.getDate("dtultcarga"));
                pdv.setAberto(rs.getString("aberto"));
                pdv.setUsuariocadastro(rs.getInt("usuariocadastro"));
                pdv.setDtcadastro(rs.getDate("dtcadastro"));
                pdv.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                pdv.setDtalteracao(rs.getDate("dtalteracao"));
                pdv.setCancelado(rs.getString("cancelado"));
                lista.add(pdv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public List<Pdv> readForId(String id) {
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        List<Pdv>          lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pdv WHERE id_pdv = ?");
            stmt.setInt(1,Integer.parseInt(id));            
            rs = stmt.executeQuery();
            while (rs.next()) {
                Filial            filial = new Filial();
                Pdv pdv = new Pdv();
                pdv.setId_pdv(rs.getInt("id_pdv"));
                pdv.setDescricao(rs.getString("descricao"));
                pdv.setCodigopdv(rs.getString("codigopdv"));
                filial.setId_filial(rs.getInt("filial_id"));
                pdv.setFilial(filial);
               // pdv.setFilial_id(rs.getInt("filial_id"));
                pdv.setDtultcarga(rs.getDate("dtultcarga"));
                pdv.setAberto(rs.getString("aberto"));
                pdv.setUsuariocadastro(rs.getInt("usuariocadastro"));
                pdv.setDtcadastro(rs.getDate("dtcadastro"));
                pdv.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                pdv.setDtalteracao(rs.getDate("dtalteracao"));
                pdv.setCancelado(rs.getString("cancelado"));
                lista.add(pdv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public String pesquisaIdPdv(String codigo) {
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT codigopdv FROM pdv WHERE codigopdv = ?");
            stmt.setString(1, codigo);            
            rs = stmt.executeQuery();
            if  (rs.next()) {
                return codigo;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    
    public void imprimir(){
        String        relatorio = "/Enterprise/Relatorios/relpdv.jasper";
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
