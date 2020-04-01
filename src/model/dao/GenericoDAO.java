package model.dao;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;



public class GenericoDAO {
    
    
    public  static GenericoDAO genericoDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public GenericoDAO() {
        
        factory  = HibernateUtil.getSessionFactory();
    }
        
    public static GenericoDAO getInstance(){
        
        if (genericoDAO == null){
            genericoDAO = new GenericoDAO();
        }
        return genericoDAO;
    }
    
    public boolean checkConexao() {
        boolean retorno = false;
        Session sessao  = null;
        try {
            sessao = factory.openSession();
            retorno = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO CHECKAR CONEXÃO." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
            retorno = false;
        }finally{
            sessao.close();
        }
        return retorno;
    }
    
    public boolean inserir(Object obj){
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.save(obj);
            transaction.commit();
            retorno = true;
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            sessao.clear();
        }
        return retorno;
    }
    
}
