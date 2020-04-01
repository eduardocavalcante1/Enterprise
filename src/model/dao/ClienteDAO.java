package model.dao;


import conexao.ConnectionFactory;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ClienteDAO {

    Connection con;
    public static ClienteDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public ClienteDAO() {
        con     = ConnectionFactory.getConnection();
        factory = HibernateUtil.getSessionFactory();
    }

    public static ClienteDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new ClienteDAO();
        }
        return hibernateDAO;
    }

    public Cliente salvar(Cliente cliente) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (cliente.getId_cliente() == 0) {
                sessao.persist(cliente);
            } else {
                sessao.merge(cliente);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR (CLIENTE) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return cliente;
    }
    
    public Cliente cancelar(Cliente cliente) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Cliente c = ( Cliente ) sessao.get( Cliente.class, cliente.getId_cliente() );
            c.setCancelado(cliente.getCancelado());
            c.setUsuarioalteracao(cliente.getUsuarioalteracao());
            c.setDtalteracao(cliente.getDtalteracao());
            sessao.merge(c);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR (CLIENTE) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return cliente;
    }

    public List<Cliente> read() {
        Session sessao = factory.openSession();
        List<Cliente> clientes = null;
        try {
            clientes = sessao.createQuery("from Cliente").getResultList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA  (CLIENTE) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return clientes;
    }
          
    public List<Cliente> readForNome(String nome) {
        Session sessao = factory.openSession();
        List<Cliente> clientes = null;
        try {
            //String hql = ("FROM Cliente c WHERE c.nome = :nome");
            String hql = ("FROM Cliente c WHERE c.nome LIKE :nome ORDER BY c.nome");
            clientes = sessao.createQuery(hql).setParameter("nome", nome+"%").getResultList();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA POR NOME (CLIENTE) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return clientes;
    }
    
     public Cliente readForId(int Id) {
        Session sessao = factory.openSession();
        Cliente cliente = null;
        try {
           cliente = sessao.find(Cliente.class, Id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO DE LEITURA POR NOME (CLIENTE) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return cliente;
     } 

    public void imprimir(){
        Connection        con  = ConnectionFactory.getConnection();
        String        relatorio = "/Enterprise/Relatorios/relcliente.jasper";
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
    
   
   