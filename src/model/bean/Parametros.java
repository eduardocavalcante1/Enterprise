package model.bean;

/**
 *
 * @author Eduardo
 */

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

@Entity                   // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "parametros") 
public class Parametros implements Serializable {
    
    @Id
    @SequenceGenerator(name = "parametros_id_parametros_seq", sequenceName = "seq_parametros_id_parametros", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "parametros_id_parametros_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_parametros", nullable = false)
    private int    id_parametros;
    @Column(name = "razaosocial", length = 60, nullable = false)
    private String razaosocial;
    @Column(name = "nomefantasia", length = 45, nullable = false)
    private String nomefantasia;
    @Column(name = "qtdfiliais", nullable = false)
    private int    qtdfiliais;
    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;
    @Column(name = "cnpj", length = 14, nullable = false)
    private String cnpj;
    @Column(name = "inscricaoestadual", length = 15, nullable = false)
    private String inscricaoestadual;
    @Column(name = "inscricaomunicipal", length = 15)
    private String inscricaomunicipal;
    @Column(name = "socioresponsavel", length = 60, nullable = false)
    private String socioresponsavel;
    @Column(name = "cpfsocioresponsavel", length = 11, nullable = false)
    private String cpfsocioresponsavel;
    @Column(name = "endereco", length = 60, nullable = false)
    private String endereco;
    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;
    @Column(name = "complemento", length = 45)
    private String complemento;
    @Column(name = "cidade", length = 45, nullable = false)
    private String cidade;
    @Column(name = "uf", length = 02, nullable = false)
    private String uf;
    @Column(name = "cep", length = 8, nullable = false)
    private String cep;
    @Column(name = "telefone1", length = 11, nullable = false)
    private String telefone1;
    @Column(name = "telefone2", length = 11)
    private String telefone2;
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @Column(name = "pathbancodedados", length = 60, nullable = false)
    private String pathbancodedados;
    @Column(name = "pathsistema", length = 60, nullable = false)
    private String pathsistema;
    @Column(name = "pathimagens", length = 60, nullable = false)
    private String pathimagens;
    @Column(name = "qtdpdvs", nullable = false)
    private int    qtdpdvs;
    @Column(name = "dtinstalacao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtinstalacao;
    @Column(name = "ativacaopdv", length = 256, nullable = false)
    private String ativacaopdv;
    @Column(name = "dtativacaopdv", nullable = false) 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtativacaopdv;
    @Column(name = "ativacaoenterprise", length = 256, nullable = false)
    private String ativacaoenterprise;
    @Column(name = "dtativacaoenterprise", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtativacaoenterprise;
    @Column(name = "usuariocadastro", nullable = false)
    private int    usuariocadastro;
    @Column(name = "dtcadastro", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtcadastro;
    @Column(name = "usuarioalteracao", nullable = false)
    private int    usuarioalteracao;
    @Column(name = "dtalteracao", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtalteracao;

    public Parametros() {
    }
    
    
    
    public int getId_parametros() {
        return id_parametros;
    }
    
    public void setId_parametros(int id_parametros) {
        this.id_parametros = id_parametros;
    }
    
    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

     public int getQtdfiliais() {
        return qtdfiliais;
    }

    public void setQtdfiliais(int qtdfiliais) {
        this.qtdfiliais = qtdfiliais;
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

    public String getSocioresponsavel() {
        return socioresponsavel;
    }

    public void setSocioresponsavel(String socioresponsavel) {
        this.socioresponsavel = socioresponsavel;
    }

    public String getCpfsocioresponsavel() {
        return cpfsocioresponsavel;
    }

    public void setCpfsocioresponsavel(String cpfsocioresponsavel) {
        this.cpfsocioresponsavel = cpfsocioresponsavel;
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

    public String getPathbancodedados() {
        return pathbancodedados;
    }

    public void setPathbancodedados(String pathbancodedados) {
        this.pathbancodedados = pathbancodedados;
    }

    public String getPathsistema() {
        return pathsistema;
    }

    public void setPathsistema(String pathsistema) {
        this.pathsistema = pathsistema;
    }

    public String getPathimagens() {
        return pathimagens;
    }

    public void setPathimagens(String pathimagens) {
        this.pathimagens = pathimagens;
    }

    public int getQtdpdvs() {
        return qtdpdvs;
    }

    public void setQtdpdvs(int qtdpdvs) {
        this.qtdpdvs = qtdpdvs;
    }

    public Date getDtinstalacao() {
        return dtinstalacao;
    }

    public void setDtinstalacao(Date dtinstalacao) {
        this.dtinstalacao = dtinstalacao;
    }

    public String getAtivacaopdv() {
        return ativacaopdv;
    }

    public void setAtivacaopdv(String ativacaopdv) {
        this.ativacaopdv = ativacaopdv;
    }

    public Date getDtativacaopdv() {
        return dtativacaopdv;
    }

    public void setDtativacaopdv(Date dtativacaopdv) {
        this.dtativacaopdv = dtativacaopdv;
    }

    public String getAtivacaoenterprise() {
        return ativacaoenterprise;
    }

    public void setAtivacaoenterprise(String ativacaoenterprise) {
        this.ativacaoenterprise = ativacaoenterprise;
    }

    public Date getDtativacaoenterprise() {
        return dtativacaoenterprise;
    }

    public void setDtativacaoenterprise(Date dtativacaoenterprise) {
        this.dtativacaoenterprise = dtativacaoenterprise;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id_parametros;
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
        final Parametros other = (Parametros) obj;
        if (this.id_parametros != other.id_parametros) {
            return false;
        }
        return true;
    }
    
    
}
