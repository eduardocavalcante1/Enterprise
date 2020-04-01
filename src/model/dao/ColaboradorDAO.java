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
import model.bean.Colaborador;
import model.bean.Funcao;
import model.bean.Senha;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;
import util.Util;

public class ColaboradorDAO {

    Connection con;
    public static ColaboradorDAO hibernateDAO = null;
    private SessionFactory factory;
    private Transaction transaction;

    public ColaboradorDAO() {
        con     = ConnectionFactory.getConnection();
        factory = HibernateUtil.getSessionFactory();
    }

    public static ColaboradorDAO getInstance() {
        if (hibernateDAO == null) {
            hibernateDAO = new ColaboradorDAO();
        }
        return hibernateDAO;
    }

    public Colaborador salvar(Colaborador colaborador) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            if (colaborador.getId_colaborador() == 0) {
                sessao.persist(colaborador);
            } else {
                sessao.merge(colaborador);
            }
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return colaborador;
    }
    
    public Colaborador cancelar(Colaborador colaborador, Senha senha) {
        Session sessao = factory.openSession();
        try {
            transaction = sessao.beginTransaction();
            Colaborador c = ( Colaborador ) sessao.get( Colaborador.class, colaborador.getId_colaborador() );
            Senha       s = ( Senha ) sessao.get( Senha.class, senha.getId_senha() );
            //-------------------------------------------------------
            c.setCancelado(colaborador.getCancelado());
            c.setUsuarioalteracao(colaborador.getUsuarioalteracao());
            c.setDtalteracao(colaborador.getDtalteracao());
            //-------------------------------------------------------
            if (s.getId_senha() != 0) {
                s.setCancelado(senha.getCancelado());
                s.setUsuarioalteracao(senha.getUsuarioalteracao());
                s.setDtalteracao(senha.getDtalteracao());
                sessao.merge(s);
            }
            sessao.merge(c);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR (COLABORADOR) " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            sessao.close();
        }
        return colaborador;
    }

    
    public List<Colaborador> read() {
        Connection con = ConnectionFactory.getConnection();
        Funcao funcao = new Funcao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Colaborador> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM colaborador");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setId_colaborador(rs.getInt("id_colaborador"));
                colaborador.setNome(rs.getString("nome"));
                colaborador.setNomereduzido(rs.getString("nomereduzido"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDtnascimento(rs.getDate("dtnascimento"));
                colaborador.setGenero(rs.getString("genero"));
                colaborador.setEstadocivil(rs.getString("estadocivil"));
                colaborador.setNomeconjuge(rs.getString("nomeconjuge"));
                colaborador.setNomemae(rs.getString("nomemae"));
                colaborador.setNomepai(rs.getString("nomepai"));
                colaborador.setEndereco(rs.getString("endereco"));
                colaborador.setBairro(rs.getString("bairro"));
                colaborador.setComplemento(rs.getString("complemento"));
                colaborador.setCidade(rs.getString("cidade"));
                colaborador.setUf(rs.getString("uf"));
                colaborador.setCep(rs.getString("cep"));
                colaborador.setTelefone1(rs.getString("telefone1"));
                colaborador.setTelefone2(rs.getString("telefone2"));
                colaborador.setEmail(rs.getString("email"));
                colaborador.setDtadmissao(rs.getDate("dtadmissao"));
                colaborador.setDtdemissao(rs.getDate("dtdemissao"));
                // colaborador.setFuncao_id(rs.getInt("funcao_id"));
                funcao.setId_funcao(rs.getInt("funcao_id"));
                colaborador.setFuncao(funcao);
                colaborador.setFiscal(rs.getString("fiscal"));
                colaborador.setAtivo(rs.getString("ativo"));
                colaborador.setUsuariocadastro(rs.getInt("usuariocadastro"));
                colaborador.setDtcadastro(rs.getDate("dtcadastro"));
                colaborador.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                colaborador.setDtalteracao(rs.getDate("dtalteracao"));
                colaborador.setCancelado(rs.getString("cancelado"));
                lista.add(colaborador);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }

    public List<Colaborador> readForNome(String nome) {
        Connection con = ConnectionFactory.getConnection();
        Funcao funcao = new Funcao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Colaborador> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM colaborador WHERE nome LIKE ?");
            stmt.setString(1, nome + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setId_colaborador(rs.getInt("id_colaborador"));
                colaborador.setNome(rs.getString("nome"));
                colaborador.setNomereduzido(rs.getString("nomereduzido"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDtnascimento(rs.getDate("dtnascimento"));
                colaborador.setGenero(rs.getString("genero"));
                colaborador.setEstadocivil(rs.getString("estadocivil"));
                colaborador.setNomeconjuge(rs.getString("nomeconjuge"));
                colaborador.setNomemae(rs.getString("nomemae"));
                colaborador.setNomepai(rs.getString("nomepai"));
                colaborador.setEndereco(rs.getString("endereco"));
                colaborador.setBairro(rs.getString("bairro"));
                colaborador.setComplemento(rs.getString("complemento"));
                colaborador.setCidade(rs.getString("cidade"));
                colaborador.setUf(rs.getString("uf"));
                colaborador.setCep(rs.getString("cep"));
                colaborador.setTelefone1(rs.getString("telefone1"));
                colaborador.setTelefone2(rs.getString("telefone2"));
                colaborador.setEmail(rs.getString("email"));
                colaborador.setDtadmissao(rs.getDate("dtadmissao"));
                colaborador.setDtdemissao(rs.getDate("dtdemissao"));
                //colaborador.setFuncao_id(rs.getInt("funcao_id"));
                funcao.setId_funcao(rs.getInt("funcao_id"));
                colaborador.setFuncao(funcao);
                colaborador.setFiscal(rs.getString("fiscal"));
                colaborador.setAtivo(rs.getString("ativo"));
                colaborador.setUsuariocadastro(rs.getInt("usuariocadastro"));
                colaborador.setDtcadastro(rs.getDate("dtcadastro"));
                colaborador.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                colaborador.setDtalteracao(rs.getDate("dtalteracao"));
                colaborador.setCancelado(rs.getString("cancelado"));
                lista.add(colaborador);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }

    public List<Colaborador> readForMatricula(String matricula) {
        Connection con = ConnectionFactory.getConnection();
        Funcao funcao = new Funcao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Colaborador> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM colaborador WHERE id_colaborador = ?");
            stmt.setInt(1, Integer.parseInt(matricula));
            rs = stmt.executeQuery();
            while (rs.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setId_colaborador(rs.getInt("id_colaborador"));
                colaborador.setNome(rs.getString("nome"));
                colaborador.setNomereduzido(rs.getString("nomereduzido"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDtnascimento(rs.getDate("dtnascimento"));
                colaborador.setGenero(rs.getString("genero"));
                colaborador.setEstadocivil(rs.getString("estadocivil"));
                colaborador.setNomeconjuge(rs.getString("nomeconjuge"));
                colaborador.setNomemae(rs.getString("nomemae"));
                colaborador.setNomepai(rs.getString("nomepai"));
                colaborador.setEndereco(rs.getString("endereco"));
                colaborador.setBairro(rs.getString("bairro"));
                colaborador.setComplemento(rs.getString("complemento"));
                colaborador.setCidade(rs.getString("cidade"));
                colaborador.setUf(rs.getString("uf"));
                colaborador.setCep(rs.getString("cep"));
                colaborador.setTelefone1(rs.getString("telefone1"));
                colaborador.setTelefone2(rs.getString("telefone2"));
                colaborador.setEmail(rs.getString("email"));
                colaborador.setDtadmissao(rs.getDate("dtadmissao"));
                colaborador.setDtdemissao(rs.getDate("dtdemissao"));
                //colaborador.setFuncao_id(rs.getInt("funcao_id"));
                funcao.setId_funcao(rs.getInt("funcao_id"));
                colaborador.setFuncao(funcao);
                colaborador.setFiscal(rs.getString("fiscal"));
                colaborador.setAtivo(rs.getString("ativo"));
                colaborador.setUsuariocadastro(rs.getInt("usuariocadastro"));
                colaborador.setDtcadastro(rs.getDate("dtcadastro"));
                colaborador.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                colaborador.setDtalteracao(rs.getDate("dtalteracao"));
                colaborador.setCancelado(rs.getString("cancelado"));
                lista.add(colaborador);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }

      
//     public void create(Colaborador c){
//        Funcao            funcao = new Funcao();
//        Colaborador colaborador = new Colaborador();
//        PreparedStatement stmt = null; 
//        ResultSet         rs   = null;
//        try {
//            stmt = con.prepareStatement("INSERT INTO colaborador (nome, nomereduzido, cpf, rg, dtnascimento, genero, estadocivil,"
//                                + "nomeconjuge, nomemae, nomepai, endereco, bairro, complemento, cidade, uf, cep, telefone1,"
//                                + "telefone2, email, dtadmissao, dtdemissao, funcao_id, fiscal, ativo, usuariocadastro,"
//                                + "dtcadastro, usuarioalteracao, dtalteracao, cancelado) VALUES (?,?,?,?,?,?,?,?,?,?,"
//                                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//            stmt.setString(1, c.getNome());
//            stmt.setString(2, c.getNomereduzido());
//            stmt.setString(3, c.getCpf());
//            stmt.setString(4, c.getRg());
//            stmt.setDate(5, (Date) c.getDtnascimento());
//            stmt.setString(6,c.getGenero());
//            stmt.setString(7,c.getEstadocivil());
//            stmt.setString(8,c.getNomeconjuge());
//            stmt.setString(9,c.getNomemae());
//            stmt.setString(10,c.getNomepai());
//            stmt.setString(11,c.getEndereco());
//            stmt.setString(12,c.getBairro());
//            stmt.setString(13,c.getComplemento());
//            stmt.setString(14,c.getCidade());
//            stmt.setString(15,c.getUf());
//            stmt.setString(16,c.getCep());
//            stmt.setString(17,c.getTelefone1());
//            stmt.setString(18,c.getTelefone2());
//            stmt.setString(19,c.getEmail());
//            stmt.setDate(20,(Date) c.getDtadmissao());
//            stmt.setDate(21,(Date) c.getDtdemissao());
//            stmt.setInt(22,c.getFuncao_id());
//            stmt.setString(23,c.getFiscal());
//            stmt.setString(24, c.getAtivo());
//            stmt.setInt(25,c.getUsuariocadastro());
//            stmt.setDate(26, (Date) c.getDtcadastro());
//            stmt.setInt(27,c.getUsuarioalteracao());
//            stmt.setDate(28, (Date) c.getDtalteracao());
//            stmt.setString(29,c.getCancelado());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "ERRO AO INCLUIR... " + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        }
//        finally {
//                ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
     
  
//    public void update(Colaborador c) {
//        Connection        con  = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//         try {
//            stmt = con.prepareStatement("UPDATE colaborador SET nome = ?, nomereduzido = ?, cpf = ?, rg = ?, dtnascimento = ?, genero = ?,"
//                    + " estadocivil = ?, nomeconjuge = ?, nomemae = ?, nomepai = ?, endereco = ?, bairro = ?, complemento = ?, cidade = ?,"
//                    + "uf = ?, cep = ?, telefone1 = ?, telefone2 = ? , email = ?, dtadmissao = ?, dtdemissao = ?, funcao_id = ?, fiscal = ?, "
//                    + "ativo = ?, usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_colaborador = ? ");
//            stmt.setString(1, c.getNome());
//            stmt.setString(2, c.getNomereduzido());
//            stmt.setString(3, c.getCpf());
//            stmt.setString(4, c.getRg());
//            stmt.setDate(5, (Date) c.getDtnascimento());
//            stmt.setString(6,c.getGenero());
//            stmt.setString(7,c.getEstadocivil());
//            stmt.setString(8,c.getNomeconjuge());
//            stmt.setString(9,c.getNomemae());
//            stmt.setString(10,c.getNomepai());
//            stmt.setString(11,c.getEndereco());
//            stmt.setString(12,c.getBairro());
//            stmt.setString(13,c.getComplemento());
//            stmt.setString(14,c.getCidade());
//            stmt.setString(15,c.getUf());
//            stmt.setString(16,c.getCep());
//            stmt.setString(17,c.getTelefone1());
//            stmt.setString(18,c.getTelefone2());
//            stmt.setString(19,c.getEmail());
//            stmt.setDate(20,(Date) c.getDtadmissao());
//            stmt.setDate(21,(Date) c.getDtdemissao());
//            stmt.setInt(22,c.getFuncao_id());
//            stmt.setString(23,c.getFiscal());
//            stmt.setString(24,c.getAtivo());
//            // stmt.setInt(25,c.getUsuariocadastro());     -- SE ALTERA NÃO HÁ NECESSIDADE DE ATUALIZAR O CAMPO DE CADASTRO
//            // stmt.setDate(26, (Date) c.getDtcadastro()); -- SE ALTERA NÃO HÁ NECESSIDADE DE ATUALIZAR O CAMPO DE CADASTRO
//            stmt.setInt(25,c.getUsuarioalteracao());
//            stmt.setDate(26, (Date) c.getDtalteracao());
//            stmt.setString(27,c.getCancelado());
//            stmt.setInt(28,c.getId_colaborador());
//            stmt.executeUpdate(); 
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO ATUALIZAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    
//    public void cancelar(Colaborador c) {
//        Connection        con  = ConnectionFactory.getConnection();
//        PreparedStatement stmt = null;
//        try {
//            stmt = con.prepareStatement("UPDATE colaborador SET usuarioalteracao = ?, dtalteracao = ?, cancelado = ? WHERE id_colaborador = ? ");
//            stmt.setInt(1, c.getUsuarioalteracao());
//            stmt.setDate(2, (Date) c.getDtalteracao());
//            stmt.setString(3, c.getCancelado());
//            stmt.setInt(4, c.getId_colaborador());
//            stmt.executeUpdate();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "ERRO AO CANCELAR..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
//        } finally {
//            ConnectionFactory.closeConnection(con, stmt);
//        }
//    }
    
    public List<Colaborador> pesquisaNome(String nome) {
        Connection        con  = ConnectionFactory.getConnection();
        Funcao            funcao = new Funcao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Colaborador> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM colaborador WHERE nome = ?");
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setId_colaborador(rs.getInt("id_colaborador"));
                colaborador.setNome(rs.getString("nome"));
                colaborador.setNomereduzido(rs.getString("nomereduzido"));
                colaborador.setCpf(rs.getString("cpf"));
                colaborador.setRg(rs.getString("rg"));
                colaborador.setDtnascimento(rs.getDate("dtnascimento"));
                colaborador.setGenero(rs.getString("genero"));
                colaborador.setEstadocivil(rs.getString("estadocivil"));
                colaborador.setNomeconjuge(rs.getString("nomeconjuge"));
                colaborador.setNomemae(rs.getString("nomemae"));
                colaborador.setNomepai(rs.getString("nomepai"));
                colaborador.setEndereco(rs.getString("endereco"));
                colaborador.setBairro(rs.getString("bairro"));
                colaborador.setComplemento(rs.getString("complemento"));
                colaborador.setCidade(rs.getString("cidade"));
                colaborador.setUf(rs.getString("uf"));
                colaborador.setCep(rs.getString("cep"));
                colaborador.setTelefone1(rs.getString("telefone1"));
                colaborador.setTelefone2(rs.getString("telefone2"));
                colaborador.setEmail(rs.getString("email"));
                colaborador.setDtadmissao(rs.getDate("dtadmissao"));
                colaborador.setDtdemissao(rs.getDate("dtdemissao"));
               
                //colaborador.setFuncao_id(rs.getInt("funcao_id"));
                funcao.setId_funcao(rs.getInt("funcao_id"));
                colaborador.setFuncao(funcao);
                
                colaborador.setFiscal(rs.getString("fiscal"));
                colaborador.setAtivo(rs.getString("ativo"));
                colaborador.setUsuariocadastro(rs.getInt("usuariocadastro"));
                colaborador.setDtcadastro(rs.getDate("dtcadastro"));
                colaborador.setUsuarioalteracao(rs.getInt("usuarioalteracao"));
                colaborador.setDtalteracao(rs.getDate("dtalteracao"));
                colaborador.setCancelado(rs.getString("cancelado"));
                lista.add(colaborador);
                return lista;
            } else {
                JOptionPane.showMessageDialog(null, "COLABORADOR NÃO ENCONTRADO...", "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    public String pesquisaId_Colaborador(String id_colaborador) {  // PESQUISA POR ID_COLABORADOR PARA TRAZER O NOME REDUZIDO
        Connection        con  = ConnectionFactory.getConnection();
        Colaborador colaborador = new Colaborador();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT nomereduzido FROM colaborador WHERE id_colaborador = ?");
            stmt.setInt(1, Integer.parseInt(id_colaborador));
            rs = stmt.executeQuery();
            if (rs.next()) {
                colaborador.setNomereduzido(rs.getString("nomereduzido"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return colaborador.getNomereduzido();
    }
    
    public String pesquisaNomeReduzido(String nomereduzido) {  // PESQUISA NOME REDUZIDO PARA TRAZER O ID_COLABORADOR
        Connection        con  = ConnectionFactory.getConnection();
        Colaborador colaborador = new Colaborador();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("SELECT id_colaborador FROM colaborador WHERE nomereduzido = ?");
            stmt.setString(1, nomereduzido.trim());
            rs = stmt.executeQuery();
            if (rs.next()) {
                colaborador.setId_colaborador(rs.getInt("id_colaborador"));
            } else {
                return null;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PROBLEMAS COM A LEITURA ..." + ex, "ENTERPRISE - ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return  String.valueOf(colaborador.getId_colaborador()); 
    }
        
    
    public boolean pesquisaRegistroCancelado(String id) {
        Connection          con = ConnectionFactory.getConnection();
        Colaborador colaborador = new Colaborador();
        PreparedStatement  stmt = null;
        ResultSet            rs = null;
        try {
            stmt = con.prepareStatement("SELECT cancelado FROM colaborador WHERE id_colaborador = ?");
            stmt.setInt(1, Integer.parseInt(id));
            rs = stmt.executeQuery();
            if (rs.next()) {
                colaborador.setCancelado(rs.getString("cancelado"));
                if(colaborador.getCancelado() == "N"){
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
    
    public void imprimir(){
        Connection        con  = ConnectionFactory.getConnection();
        String        relatorio = "/Enterprise/Relatorios/relcolaborador.jasper";
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
    
   
   