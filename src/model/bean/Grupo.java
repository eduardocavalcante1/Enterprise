

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
@Table(name = "grupo") 
public class Grupo implements Serializable {
    
    @Id
    @SequenceGenerator(name = "grupo_id_grupo_seq", sequenceName = "seq_grupo_id_grupo", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "grupo_id_grupo_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_grupo", nullable = false)
    private int    id_grupo;
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

    public Grupo() {
    }
    
    
    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
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
        int hash = 5;
        hash = 89 * hash + this.id_grupo;
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
        final Grupo other = (Grupo) obj;
        if (this.id_grupo != other.id_grupo) {
            return false;
        }
        return true;
    }
    
        
    
}
