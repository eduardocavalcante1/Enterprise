
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


@Entity                   // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "naturezaope")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class NaturezaOpe implements Serializable {

    public NaturezaOpe() {
    }
    

    @Id
    @SequenceGenerator(name = "naturezaope_id_naturezaope_seq", sequenceName = "seq_naturezaope_id_naturezaope", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "naturezaope_id_naturezaope_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_naturezaope", nullable = false)
    private int    id_naturezaope;
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;
    @Column(name = "classificacao", length = 04, nullable = false)
    private String classificacao;
    @Column(name = "saidaentrada", length = 01, nullable = false) 
    private String saidaentrada;
    @Column(name = "planocontas", length = 15, nullable = false)
    private String planocontas;
    @Column(name="usuariocadastro", nullable = false)
    private int    usuariocadastro;
    @Column(name="dtcadastro", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date   dtcadastro;
    @Column(name="usuarioalteracao", nullable = false)
    private int    usuarioalteracao;
    @Column(name="dtalteracao", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date   dtalteracao;
    @Column(name="cancelado", length = 01, nullable = false)
    private String cancelado;

    public int getId_naturezaope() {
        return id_naturezaope;
    }

    public void setId_naturezaope(int id_naturezaope) {
        this.id_naturezaope = id_naturezaope;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getSaidaentrada() {
        return saidaentrada;
    }

    public void setSaidaentrada(String saidaentrada) {
        this.saidaentrada = saidaentrada;
    }

    public String getPlanocontas() {
        return planocontas;
    }

    public void setPlanocontas(String planocontas) {
        this.planocontas = planocontas;
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
        int hash = 3;
        hash = 17 * hash + this.id_naturezaope;
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
        final NaturezaOpe other = (NaturezaOpe) obj;
        if (this.id_naturezaope != other.id_naturezaope) {
            return false;
        }
        return true;
    }

    
    
}
