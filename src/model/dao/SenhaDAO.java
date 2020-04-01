
package model.dao;



import conexao.ConnectionFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Colaborador;
import model.bean.Senha;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class SenhaDAO {
    
    Connection con;
    public  static SenhaDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    
    public SenhaDAO() {
        con      = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        

     public static SenhaDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new SenhaDAO();
        }
        return hibernateDAO;
    }
     
    public Senha salvar(Senha senha) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            //  ****** CRIPTOGRAFIA DA SENHA ***** 
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(senha.getSenha().getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));
            }
            String SenhaHex = sb.toString();
            senha.setSenha(SenhaHex);
            //*******************************************
            if (senha.getId_senha() == 0) {
                sessao.persist(senha);
            } else {
                sessao.merge(senha);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return senha;
    }
    
    public Senha cancelar(Senha senha, Colaborador colaborador) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Senha s = ( Senha ) sessao.get( Senha.class, senha.getId_senha() );
            Colaborador c = ( Colaborador ) sessao.get( Colaborador.class, colaborador.getId_colaborador() );
           //------------------------------------------------------------ 
            s.setCancelado(senha.getCancelado());
            s.setUsuarioalteracao(senha.getUsuarioalteracao());
            s.setDtalteracao(senha.getDtalteracao());
            //-----------------------------------------------------------
            c.setCancelado(colaborador.getCancelado());
            c.setUsuarioalteracao(colaborador.getUsuarioalteracao());
            c.setDtalteracao(colaborador.getDtalteracao()); 
           //------------------------------------------------------------
            sessao.merge(s);
            sessao.merge(c);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR (SENHA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return senha;
    }
     
     public Senha cancelarsenha(Senha senha) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Senha s = ( Senha ) sessao.get( Senha.class, senha.getId_senha() );
           //------------------------------------------------------------ 
            s.setCancelado(senha.getCancelado());
            s.setUsuarioalteracao(senha.getUsuarioalteracao());
            s.setDtalteracao(senha.getDtalteracao());
            sessao.merge(s);
            //-----------------------------------------------------------
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR (SENHA) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return senha;
    }
     
     
//    public boolean create(Senha s) throws UnsupportedEncodingException {
//        boolean retorno = false;
//        Session sessao = factory.openSession();
//        try {
//            transaction = sessao.beginTransaction();
//
//            //    ****** CRIPTOGRAFIA DA SENHA ***** 
//            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            byte messageDigest[] = md.digest(s.getSenha().getBytes("UTF-8"));
//            StringBuilder sb = new StringBuilder();
//            for (byte b : messageDigest) {
//                sb.append(String.format("%02X", 0xFF & b));
//            }
//            String SenhaHex = sb.toString();
//            s.setSenha(SenhaHex);
//            //*******************************************
//
//            sessao.persist(s);
//            transaction.commit();
//            retorno = true;
//
//        } catch (NoSuchAlgorithmException ex) {
//            transaction.rollback();
//            JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            sessao.clear();
//        }
//        return retorno;
//    }
//
//    public boolean update(Senha s) throws UnsupportedEncodingException {
//        boolean retorno = false;
//        Session sessao = factory.openSession();
//        try {
//            transaction = sessao.beginTransaction();
//            //    ****** CRIPTOGRAFIA DA SENHA ***** 
//            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            byte messageDigest[] = md.digest(s.getSenha().getBytes("UTF-8"));
//            StringBuilder sb = new StringBuilder();
//            for (byte b : messageDigest) {
//                sb.append(String.format("%02X", 0xFF & b));
//            }
//            String SenhaHex = sb.toString();
//            s.setSenha(SenhaHex);
//
//            //*******************************************
//            sessao.merge(s);
//            transaction.commit();
//            retorno = true;
//        } catch (NoSuchAlgorithmException ex) {
//            transaction.rollback();
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            sessao.clear();
//        }
//        return retorno;
//    }
//     
    
//    public void create(Senha s) throws NoSuchAlgorithmException, UnsupportedEncodingException{
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        try {
//            stmt = con.prepareStatement("INSERT INTO senha (colaborador_id, senha, usuariocadastro, dtcadastro,"+
//                                        "usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?)");
//            
//            // ****** CRIPTOGRAFIA DA SENHA ***** 
//            MessageDigest md     = MessageDigest.getInstance("SHA-256");
//            byte messageDigest[] = md.digest(s.getSenha().getBytes("UTF-8"));
//            StringBuilder     sb = new StringBuilder(); 
//            for(byte b: messageDigest){
//                sb.append(String.format("%02X", 0xFF & b ));
//            }
//            String SenhaHex = sb.toString();
//            //*******************************************
//            
//            stmt.setInt(1, s.getColaborador_id());
//            stmt.setString(2, SenhaHex);
//            stmt.setInt(3,s.getUsuariocadastro());
//            stmt.setDate(4, (Date) s.getDtcadastro());
//            stmt.setInt(5,s.getUsuarioalteracao());
//            stmt.setDate(6, (Date) s.getDtalteracao());
//            stmt.setString(7,s.getCancelado());
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
//    public void update(Senha s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//        Connection        con  = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE senha SET senha = ?, usuarioalteracao = ?, dtalteracao = ?  WHERE colaborador_id = ?");
//            
//            // ****** CRIPTOGRAFIA DA SENHA ***** 
//           
//            MessageDigest md     = MessageDigest.getInstance("SHA-256");
//            byte messageDigest[] = md.digest(s.getSenha().getBytes("UTF-8"));
//            StringBuilder     sb = new StringBuilder(); 
//            for(byte b: messageDigest){
//                sb.append(String.format("%02X", 0xFF & b ));
//            }
//            String SenhaHex = sb.toString();
//            
//           //*******************************************
//
//            stmt.setString(1, SenhaHex);
//            stmt.setInt(2, s.getUsuarioalteracao());
//            stmt.setDate(3, (Date) s.getDtalteracao());
//            stmt.setInt(4, s.getColaborador_id());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
//    
//    public void cancelar(Senha s) {
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE senha SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE colaborador_id = ?");
//            stmt.setInt(1, s.getUsuarioalteracao());
//            stmt.setDate(2, (Date) s.getDtalteracao());
//            stmt.setString(3, s.getCancelado());
//            stmt.setInt(4, s.getColaborador_id());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
     public List<Senha> read() {
        Connection        con  = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet         rs   = null;
        List<Senha> lista = new ArrayList<>();
        try {
             stmt = con.prepareStatement("SELECT * FROM senha");
             rs   = stmt.executeQuery();
             while (rs.next()) {
                  Senha senha = new Senha();
                  Colaborador colaborador = new Colaborador();
                  senha.setId_senha(rs.getInt("id_senha"));
                  colaborador.setId_colaborador(rs.getInt("colaborador_id"));
                  senha.setColaborador(colaborador);
                  senha.setSenha(rs.getString("senha"));
                  senha.setUsuariocadastro(rs.getInt("usuariocadastro"));
                  senha.setDtcadastro(rs.getDate("dtcadastro"));
                  senha.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                  senha.setDtalteracao(rs.getDate("dtalteracao"));
                  senha.setCancelado(rs.getString("cancelado"));
                  lista.add(senha);
             }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }         
    
    public List<Senha> readForColaborador_id(String colaborador_id) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Senha> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM senha WHERE colaborador_id = ?");
            stmt.setString(1, colaborador_id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Senha senha = new Senha();
                Colaborador colaborador = new Colaborador();
                senha.setId_senha(rs.getInt("id_senha"));
                colaborador.setId_colaborador(rs.getInt("colaborador_id"));
                senha.setColaborador(colaborador);
                senha.setSenha(rs.getString("senha"));
                senha.setUsuariocadastro(rs.getInt("usuariocadastro"));
                senha.setDtcadastro(rs.getDate("dtcadastro"));
                senha.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                senha.setDtalteracao(rs.getDate("dtalteracao"));
                senha.setCancelado(rs.getString("cancelado"));
                lista.add(senha);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;

    }
     
     
    public String pesquisaColaborador_Id(String id_colaborador) {  // PESQUISA O ID_COLABORADOR PARA RETORNAR A SENHA
        Connection           con = ConnectionFactory.getConnection();
        Senha              senha = new Senha();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        //   List<Senha>        lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT colaborador_id, senha FROM senha WHERE colaborador_id = ?");
            stmt.setInt(1,Integer.parseInt(id_colaborador));            
            rs = stmt.executeQuery();
            if  (rs.next()) {
                senha.setSenha(rs.getString("senha"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return senha.getSenha();
    }
    
    
    public int pesquisaId_Senha(String colaborador_id) {  // PESQUISA O ID_COLABORADOR PARA RETORNAR O ID_SENHA DA SENHA
        Connection           con = ConnectionFactory.getConnection();
        Senha              senha = new Senha();
        PreparedStatement   stmt = null;
        ResultSet             rs = null;
        //   List<Senha>        lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT id_senha FROM senha WHERE colaborador_id = ?");
            stmt.setInt(1,Integer.parseInt(colaborador_id));            
            rs = stmt.executeQuery();
            if  (rs.next()) {
                senha.setId_senha(rs.getInt("id_senha"));
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return senha.getId_senha();
    }
    
    
     public boolean pesquisaRegistroCancelado(String id) {
        Connection          con = ConnectionFactory.getConnection();
        Senha             senha = new Senha();
        PreparedStatement  stmt = null;
        ResultSet            rs = null;
        try {
            stmt = con.prepareStatement("SELECT cancelado FROM senha WHERE colaborador_id = ?");
            stmt.setInt(1, Integer.parseInt(id));
            rs = stmt.executeQuery();
            if (rs.next()) {
                senha.setCancelado(rs.getString("cancelado"));
                if(senha.getCancelado().equals("N")){
                  return true;
                }
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return false;
    }

     public String criptografiaSenha(String s) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        
         // ****** CRIPTOGRAFIA DA SENHA ***** 
            MessageDigest md     = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(s.getBytes("UTF-8"));
            StringBuilder     sb = new StringBuilder(); 
            for(byte b: messageDigest){
                sb.append(String.format("%02X", 0xFF & b ));
            }
            String SenhaHex = sb.toString();
            //*******************************************
            return SenhaHex;
    }
    
    
   
}
