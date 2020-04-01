/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import conexao.ConnectionFactory;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Parametros;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ParametrosDAO {
    
    Connection con;
    public  static ParametrosDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;
    
    public ParametrosDAO() {
      
        con = ConnectionFactory.getConnection();
        factory  = HibernateUtil.getSessionFactory();
    }        
    
    public static ParametrosDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new ParametrosDAO();
        }
        return hibernateDAO;
    }

    public boolean create(Parametros obj) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        //int registros = sessao.createNativeQuery("SELECT * FROM parametros LIMIT 1").executeUpdate();
        //JOptionPane.showMessageDialog(null, "REGISTROS-> "+ registros);
        try {
            transaction = sessao.beginTransaction();
            if (obj.getId_parametros() != 1) {
                sessao.persist(obj);
            } else {
                sessao.update(obj);
            }
            transaction.commit();
            retorno = true;
        } catch (HeadlessException ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {            
            sessao.clear();
        }
        return retorno;
    }

    public boolean update(Parametros obj) {
        boolean retorno = false;
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            sessao.update(obj);
            transaction.commit();
            retorno = true;
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR" + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.clear();
        }
        return retorno;
    }
    
//    public void create(Parametros p){
//        Connection        con   = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null; 
//        ResultSet         rs   = null;
//        try {
//            stmt = con.prepareStatement("SELECT COUNT(*) FROM parametros");
//            rs   = stmt.executeQuery();
//            if (rs.next()){                 
//                JOptionPane.showMessageDialog(null, "NÃO É POSSIVEL INCLUIR MAIS UM REGISTRO ALTERE O EXISTENTE.","ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//             }else{
//                    try {
//                        stmt = con.prepareStatement("INSERT INTO parametros (razaosocial,nomefantasia,qtdfiliais,cpf,cnpj,"
//                                + "inscricaoestadual,inscricaomunicipal,socioresponsavel,cpfsocioresponsavel,endereco,bairro,complemento,cidade,uf,cep,"
//                                + "telefone1,telefone2,email,pathbancodedados,pathsistema,pathimagens,qtdpdvs,dtinstalacao,"
//                                + "ativacaopdv,dtativacaopdv,ativacaoenterprise,dtativacaoenterprise,dtusuariocadastro, dtcadastro,"
//                                + "usuarioalteracao, dtalteracao) VALUES (?,?,?,?,?,?,?,?,"
//                                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//                        stmt.setString(1, p.getRazaosocial());
//                        stmt.setString(2, p.getNomefantasia());
//                        stmt.setInt(3, p.getQtdfiliais());
//                        stmt.setString(4, p.getCpf());
//                        stmt.setString(5,p.getCnpj());
//                        stmt.setString(6,p.getInscricaoestadual());
//                        stmt.setString(7,p.getInscricaomunicipal());
//                        stmt.setString(8,p.getSocioresponsavel());
//                        stmt.setString(9,p.getCpfsocioresponsavel());
//                        stmt.setString(10,p.getEndereco());
//                        stmt.setString(11,p.getBairro());
//                        stmt.setString(12,p.getComplemento());
//                        stmt.setString(13,p.getCidade());
//                        stmt.setString(14,p.getUf());
//                        stmt.setString(15,p.getCep());
//                        stmt.setString(16,p.getTelefone1());
//                        stmt.setString(17,p.getTelefone2());
//                        stmt.setString(18,p.getEmail());
//                        stmt.setString(19,p.getPathbancodedados());
//                        stmt.setString(20,p.getPathsistema());
//                        stmt.setString(21,p.getPathimagens());
//                        stmt.setInt(22,p.getQtdpdvs());
//                        stmt.setDate(23, (Date) p.getDtinstalacao());
//                        stmt.setString(24,p.getAtivacaopdv());
//                        stmt.setDate(25, (Date) p.getDtativacaopdv());
//                        stmt.setString(26,p.getAtivacaoenterprise());
//                        stmt.setDate(27, (Date) p.getDtativacaoenterprise());
//                        stmt.setInt(28, p.getUsuariocadastro());
//                        stmt.setDate(29, (Date) p.getDtcadastro());
//                        stmt.setInt(30, p.getUsuarioalteracao());
//                        stmt.setDate(31, (Date) p.getDtalteracao());   
//                        stmt.executeUpdate();
//                        JOptionPane.showMessageDialog(null, "REGISTRADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//
//                    } catch (SQLException ex) {
//
//                        JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//
//                    }
//
//                    finally {
//
//                        ConnectionFactory.closeConnection(con, stmt);
//                    }
//             }
//        } catch (SQLException ex) {
//                
//               JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//               
//        } finally {
//            
//          ConnectionFactory.closeConnection(con, stmt, rs);
//        }
//    }
//    
//    public void update(Parametros p) {
//         PreparedStatement stmt = null;
//         try {
//             stmt = con.prepareStatement("UPDATE parametros SET razaosocial = ?, nomefantasia = ?, qtdfiliais = ?, cpf = ?, cnpj = ?,"
//                    + "inscricaoestadual = ?,inscricaomunicipal = ?,socioresponsavel = ?,cpfsocioresponsavel = ?,endereco = ?,bairro = ?,complemento = ?,cidade = ?,uf = ?,cep = ?,"
//                    + " telefone1 = ?, telefone2 = ?, email = ?, pathbancodedados = ?, pathsistema = ?, pathimagens = ?, qtdpdvs = ?, dtinstalacao = ?,"
//                    + " ativacaopdv = ?, dtativacaopdv = ?, ativacaoenterprise = ?, dtativacaoenterprise = ?,"
//                    + " usuarioalteracao = ?, dtalteracao = ?  WHERE id_parametros = ? ");
//            stmt.setString(1, p.getRazaosocial());
//            stmt.setString(2, p.getNomefantasia());
//            stmt.setInt(3, p.getQtdfiliais());
//            stmt.setString(4, p.getCpf());
//            stmt.setString(5, p.getCnpj());
//            stmt.setString(6,p.getInscricaoestadual());
//            stmt.setString(7,p.getInscricaomunicipal());
//            stmt.setString(8,p.getSocioresponsavel());
//            stmt.setString(9,p.getCpfsocioresponsavel());
//            stmt.setString(10,p.getEndereco());
//            stmt.setString(11,p.getBairro());
//            stmt.setString(12,p.getComplemento());
//            stmt.setString(13,p.getCidade());
//            stmt.setString(14,p.getUf());
//            stmt.setString(15,p.getCep());
//            stmt.setString(16,p.getTelefone1());
//            stmt.setString(17,p.getTelefone2());
//            stmt.setString(18,p.getEmail());
//            stmt.setString(19,p.getPathbancodedados());
//            stmt.setString(20,p.getPathsistema());
//            stmt.setString(21,p.getPathimagens());
//            stmt.setInt(22,p.getQtdpdvs());
//            stmt.setDate(23, (Date) p.getDtinstalacao());
//            stmt.setString(24,p.getAtivacaopdv());
//            stmt.setDate(25, (Date) p.getDtativacaopdv());
//            stmt.setString(26,p.getAtivacaoenterprise());
//            stmt.setDate(27, (Date) p.getDtativacaoenterprise());
//            stmt.setInt(28, p.getUsuarioalteracao());
//            stmt.setDate(29, (Date) p.getDtalteracao());   
//            stmt.setInt(30,p.getId_parametros());
//            stmt.executeUpdate(); 
//            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO...","ENTERPRISE - SUCESSO", JOptionPane.INFORMATION_MESSAGE);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
     public List<Parametros> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Parametros> p = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM parametros LIMIT 1 ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Parametros parameter = new Parametros();
                parameter.setId_parametros(rs.getInt("id_parametros"));
                parameter.setRazaosocial(rs.getString("razaosocial"));
                parameter.setNomefantasia(rs.getString("nomefantasia"));
                parameter.setQtdfiliais(rs.getInt("qtdfiliais"));
                parameter.setCpf(rs.getString("cpf"));
                parameter.setCnpj(rs.getString("cnpj"));
                parameter.setInscricaoestadual(rs.getString("inscricaoestadual"));
                parameter.setInscricaomunicipal(rs.getString("inscricaomunicipal"));
                parameter.setSocioresponsavel(rs.getString("socioresponsavel"));
                parameter.setCpfsocioresponsavel(rs.getString("cpfsocioresponsavel"));
                parameter.setEndereco(rs.getString("endereco"));
                parameter.setBairro(rs.getString("bairro"));
                parameter.setComplemento(rs.getString("complemento"));
                parameter.setCidade(rs.getString("cidade"));
                parameter.setUf(rs.getString("uf"));
                parameter.setCep(rs.getString("cep"));
                parameter.setTelefone1(rs.getString("telefone1"));
                parameter.setTelefone2(rs.getString("telefone2"));
                parameter.setEmail(rs.getString("email"));
                parameter.setPathbancodedados(rs.getString("pathbancodedados"));
                parameter.setPathsistema(rs.getString("pathsistema"));
                parameter.setPathimagens(rs.getString("pathimagens"));
                parameter.setQtdpdvs(rs.getInt("qtdpdvs"));
                parameter.setDtinstalacao(rs.getDate("dtinstalacao"));
                parameter.setAtivacaopdv(rs.getString("ativacaopdv"));
                parameter.setDtativacaopdv(rs.getDate("dtativacaopdv"));
                parameter.setAtivacaoenterprise(rs.getString("ativacaoenterprise"));
                parameter.setDtativacaoenterprise(rs.getDate("dtativacaoenterprise"));
                parameter.setUsuariocadastro(rs.getInt("usuariocadastro"));
                parameter.setDtcadastro(rs.getDate("dtcadastro"));
                parameter.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                parameter.setDtalteracao(rs.getDate("dtalteracao"));
                p.add(parameter);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return p;
    }
    
}
    
   
   