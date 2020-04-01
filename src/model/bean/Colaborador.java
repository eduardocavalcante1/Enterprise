
package model.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity                        // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "colaborador")   //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class Colaborador implements Serializable {

    public Colaborador() {
    }
    
    
    @Id
    @SequenceGenerator(name = "colaborador_id_colaborador_seq", sequenceName = "seq_colaborador_id_colaborador", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "colaborador_id_colaborador_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_colaborador", nullable = false)
    private int    id_colaborador;
    @Column(name = "nome", length = 60, nullable = false)
    private String nome;
    @Column(name = "nomereduzido", length = 20, nullable = false)
    private String nomereduzido;
    @Column(name = "cpf", length = 11, nullable = false) 
    private String cpf;
    @Column(name = "rg", length = 20) 
    private String rg;
    @Column(name = "dtnascimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtnascimento;
    @Column(name = "genero", length = 01, nullable = false)   
    private String genero;
    @Column(name = "estadocivil", length = 50, nullable = false)
    private String estadocivil;
    @Column(name = "nomeconjuge", length = 60)
    private String nomeconjuge;
    @Column(name = "nomepai", length = 60)
    private String nomepai;
    @Column(name = "nomemae", length = 60, nullable = false)
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
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "dtadmissao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtadmissao;
    @Column(name = "dtdemissao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtdemissao;
    @ManyToOne
    @JoinColumn(name = "funcao_id", foreignKey = @ForeignKey(name = "FUNCAO_ID_FK"))
    private Funcao  funcao;
    @Column(name = "fiscal", length = 01, nullable = false)
    private String fiscal;
    @Column(name = "ativo", length = 01, nullable = false)
    private String ativo;
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

    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomereduzido() {
        return nomereduzido;
    }

    public void setNomereduzido(String nomereduzido) {
        this.nomereduzido = nomereduzido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtadmissao() {
        return dtadmissao;
    }

    public void setDtadmissao(Date dtadmissao) {
        this.dtadmissao = dtadmissao;
    }

    public Date getDtdemissao() {
        return dtdemissao;
    }

    public void setDtdemissao(Date dtdemissao) {
        this.dtdemissao = dtdemissao;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }


    public String getFiscal() {
        return fiscal;
    }

    public void setFiscal(String fiscal) {
        this.fiscal = fiscal;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public int getUsuariocadastro() {
        return usuariocadastro;
    }

    public void setUsuariocadastro(int usuariocadastro) {
        this.usuariocadastro = usuariocadastro;
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
        int hash = 7;
        hash = 47 * hash + this.id_colaborador;
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
        final Colaborador other = (Colaborador) obj;
        if (this.id_colaborador != other.id_colaborador) {
            return false;
        }
        return true;
    }

    
   
}
