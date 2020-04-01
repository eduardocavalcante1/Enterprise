
package model.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity                        // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "cliente")       //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class Cliente implements Serializable {

    public Cliente() {
    }
    
    
    @Id
    @SequenceGenerator(name = "cliente_id_cliente_seq", sequenceName = "seq_cliente_id_cliente", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "cliente_id_cliente_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_cliente", nullable = false)
    private int    id_cliente;
    @Column(name = "nome", length = 60, nullable = false)
    private String nome;
    @Column(name = "razaosocial", length = 60)
    private String razaosocial;
    @Column(name = "cpf", length = 11, nullable = false) 
    private String cpf;
    @Column(name = "cnpj", length = 14, nullable = false)
    private String cnpj;
    @Column(name = "inscricaoestadual", length = 15, nullable = false) 
    private String inscricaoestadual;
    @Column(name = "inscricaomunicipal", length = 15) 
    private String inscricaomunicipal;
    @Column(name = "dtnascimentofundacao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtnascimentofundacao;
    @Column(name = "genero", length = 01)   
    private String genero;
    @Column(name = "estadocivil", length = 50)
    private String estadocivil;
    @Column(name = "nomeconjuge", length = 60)
    private String nomeconjuge;
    @Column(name = "nomepai", length = 60)
    private String nomepai;
    @Column(name = "nomemae", length = 60)
    private String nomemae;
    @Column(name = "endereco", length = 60, nullable = false)
    private String endereco;
    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;
    @Column(name = "complemento", length = 45)
    private String complemento;
    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;
    @Column(name = "uf", length = 02, nullable = false)
    private String uf;
    @Column(name = "cep", length = 8, nullable = false)
    private String cep;
    @Column(name = "telefone1", length = 11, nullable = false)
    private String telefone1;
    @Column(name = "telefone2", length = 11)
    private String telefone2;
    @Column(name = "telefone3", length = 11)
    private String telefone3;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @Column(name = "atividadeprofissional", length = 45)
    private String   atividadeprofissional;
    @Column(name = "limitecredito", nullable = false)
    private Double limitecredito;
    @Column(name = "saldo", nullable = false)
    private Double  saldo;
    @Column(name = "ativo", length = 01, nullable = false)
    private String  ativo;
    @Column(name = "codigomigracao")
    private int codigomigracao;
    @Column(name = "usuariocadastro", nullable = false)
    private int    usuariocadastro;
    @Column(name = "dtcadastro", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date   dtcadastro;
    @Column(name = "usuarioalteracao", nullable = false)
    private int    usuarioalteracao;
    @Column(name = "dtalteracao", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date   dtalteracao;
    @Column(name="cancelado", length = 01, nullable = false)
    private String cancelado;

    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    public String getInscricaomunicipal() {
        return inscricaomunicipal;
    }

    public void setInscricaomunicipal(String inscricaomunicipal) {
        this.inscricaomunicipal = inscricaomunicipal;
    }

    public Date getDtnascimentofundacao() {
        return dtnascimentofundacao;
    }

    public void setDtnascimentofundacao(Date dtnascimentofundacao) {
        this.dtnascimentofundacao = dtnascimentofundacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getNomeconjuge() {
        return nomeconjuge;
    }

    public void setNomeconjuge(String nomeconjuge) {
        this.nomeconjuge = nomeconjuge;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(String telefone3) {
        this.telefone3 = telefone3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAtividadeprofissional() {
        return atividadeprofissional;
    }

    public void setAtividadeprofissional(String atividadeprofissional) {
        this.atividadeprofissional = atividadeprofissional;
    }

    public Double getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(Double limitecredito) {
        this.limitecredito = limitecredito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    
    public int getCodigomigracao() {
        return codigomigracao;
    }

    public void setCodigomigracao(int codigomigracao) {
        this.codigomigracao = codigomigracao;
    }

    public int getUsuariocadastro() {
        return usuariocadastro;
    }

    public void setUsuariocadastro(int usuariocadastro) {
        this.usuariocadastro = usuariocadastro;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public int getUsuarioalteracao() {
        return usuarioalteracao;
    }

    public void setUsuarioalteracao(int usuarioalteracao) {
        this.usuarioalteracao = usuarioalteracao;
    }

    public Date getDtalteracao() {
        return dtalteracao;
    }

    public void setDtalteracao(Date dtalteracao) {
        this.dtalteracao = dtalteracao;
    }

    public String getCancelado() {
        return cancelado;
    }

    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id_cliente;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id_cliente != other.id_cliente) {
            return false;
        }
        return true;
    }
   
     
   
}
