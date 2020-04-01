package model.dao;


import conexao.ConnectionFactory;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Transportadora;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class TransportadoraDAO {

    Connection con;
    public static TransportadoraDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public TransportadoraDAO() {
        con     = ConnectionFactory.getConnection();
        factory = HibernateUtil.getSessionFactory();
    }

    public static TransportadoraDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new TransportadoraDAO();
        }
        return hibernateDAO;
    }

    public Transportadora salvar(Transportadora transportadora) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (transportadora.getId_transportadora() == 0) {
                sessao.persist(transportadora);
            } else {
                sessao.merge(transportadora);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR (TRANSPORTADORA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return transportadora;
    }
    
    public Transportadora cancelar(Transportadora transportadora) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Transportadora t = ( Transportadora ) sessao.get( Transportadora.class, transportadora.getId_transportadora() );
            t.setCancelado(transportadora.getCancelado());
            t.setUsuarioalteracao(transportadora.getUsuarioalteracao());
            t.setDtalteracao(transportadora.getDtalteracao());
            sessao.merge(t);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR (TRANSPORTADORA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return transportadora;
    }

    public List<Transportadora> read() {
        Session sessao = factory.openSession();
        List<Transportadora> transportadoras = null;
        try {
            transportadoras = sessao.createQuery("from Transportadora").getResultList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA  (TRANSPORTADORA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return transportadoras;
    }
          
    public List<Transportadora> readForNome(String nome) {
        Session sessao = factory.openSession();
        List<Transportadora> transportadoras = null;
        try {
            String hql = ("FROM Transportadora t WHERE t.nomefantasia LIKE :nome ORDER BY t.nomefantasia ");
            transportadoras = sessao.createQuery(hql).setParameter("nome", nome+"%").getResultList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA POR NOME (TRANSPORTADORA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return transportadoras;
    }
    
     public Transportadora readForId(int Id) {
        Session sessao = factory.openSession();
        Transportadora transportadora = null;
        try {
           transportadora = sessao.find(Transportadora.class, Id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA POR NOME (TRANSPORTADORA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return transportadora;
     } 

    public void imprimir(){
        Connection        con  = ConnectionFactory.getConnection();
        String        relatorio = "/Enterprise/Relatorios/reltransportadora.jasper";
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
    
   
   