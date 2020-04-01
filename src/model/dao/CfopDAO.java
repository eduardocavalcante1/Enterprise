
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
import model.bean.Cfop;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class CfopDAO {
    
    Connection con;
    public  static CfopDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public CfopDAO() {
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
        
    }  
    
     public static CfopDAO getInstance(){
        
        if (hibernateDAO == null){
            hibernateDAO = new CfopDAO();
        }
        return hibernateDAO;
    }   
    
     
     public Cfop salvar(Cfop cfop) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (cfop.getId_cfop() == 0) {
                sessao.persist(cfop);
            } else {
                Cfop c = ( Cfop ) sessao.get( Cfop.class, cfop.getId_cfop() );
                c.setCodigocfop(cfop.getCodigocfop());
                c.setDescricao(cfop.getDescricao());
                c.setUsuarioalteracao(cfop.getUsuarioalteracao());
                c.setDtalteracao(cfop.getDtalteracao());
                sessao.merge(c);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return cfop;
    }
    
    public Cfop cancelar(Cfop cfop) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Cfop c = ( Cfop ) sessao.get( Cfop.class, cfop.getId_cfop() );
            c.setCancelado(cfop.getCancelado());
            c.setUsuarioalteracao(cfop.getUsuarioalteracao());
            c.setDtalteracao(cfop.getDtalteracao());
            sessao.merge(c);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return cfop;
    }
     
    
     public List<Cfop> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Cfop> lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM cfop");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Cfop cfop = new Cfop();
                  cfop.setId_cfop(rs.getInt("id_cfop"));
                  cfop.setCodigocfop(rs.getString("codigocfop"));
                  cfop.setDescricao(rs.getString("descricao"));
                  cfop.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  cfop.setDtcadastro(rs.getDate("dtcadastro"));
                  cfop.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  cfop.setDtalteracao(rs.getDate("dtalteracao"));
                  cfop.setCancelado(rs.getString("cancelado"));
                  lista.add(cfop);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
            
    }         
    
    
    public List<Cfop> readForDesc(String desc) {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Cfop> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cfop WHERE descricao LIKE ?");
            stmt.setString(1, desc+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cfop cfop = new Cfop();
                cfop.setId_cfop(rs.getInt("id_cfop"));
                cfop.setCodigocfop(rs.getString("codigocfop"));
                cfop.setDescricao(rs.getString("descricao"));
                cfop.setUsuariocadastro(rs.getInt("usuariocadastro"));
                cfop.setDtcadastro(rs.getDate("dtcadastro"));
                cfop.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                cfop.setDtalteracao(rs.getDate("dtalteracao"));
                cfop.setCancelado(rs.getString("cancelado"));
                lista.add(cfop);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public List<Cfop> readForCod(String codigocfop) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cfop> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cfop WHERE codigocfop LIKE ?");
            stmt.setString(1, codigocfop + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cfop cfop = new Cfop();
                cfop.setId_cfop(rs.getInt("id_cfop"));
                cfop.setCodigocfop(rs.getString("codigocfop"));
                cfop.setDescricao(rs.getString("descricao"));
                cfop.setUsuariocadastro(rs.getInt("usuariocadastro"));
                cfop.setDtcadastro(rs.getDate("dtcadastro"));
                cfop.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                cfop.setDtalteracao(rs.getDate("dtalteracao"));
                cfop.setCancelado(rs.getString("cancelado"));
                lista.add(cfop);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }
    
    public String pesquisaCodCfop(String codigo) {
        Connection           con = ConnectionFactory.getConnection();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        try {
            stmt = con.prepareStatement("SELECT codigocfop FROM cfop WHERE codigocfop = ?");
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
    
    
    public void imprimir() {
        String relatorio = "/Enterprise/Relatorios/relcfop.jasper";
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
