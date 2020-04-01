
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
@Table(name = "unidade") 
public class Unidade  implements Serializable {
    
    @Id
    @SequenceGenerator(name = "unidade_id_unidade_seq", sequenceName = "seq_unidade_id_unidade", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "unidade_id_unidade_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_unidade", nullable = false)
    private int    id_unidade;
    @Column(name = "sigla", length = 02, nullable = false)
    private String sigla;
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;
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
    @Column(name = "cancelado", length = 1, nullable = false)
    private String cancelado;

    public Unidade() {
    }
    
        
    public int getId_unidade() {
        return id_unidade;
    }

    public void setId_unidade(int id_unidade) {
        this.id_unidade = id_unidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        int hash = 7;
        hash = 79 * hash + this.id_unidade;
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
        final Unidade other = (Unidade) obj;
        if (this.id_unidade != other.id_unidade) {
            return false;
        }
        return true;
    }

     
}
