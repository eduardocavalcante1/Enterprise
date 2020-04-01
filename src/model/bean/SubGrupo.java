
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

@Entity                    // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "subgrupo")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;

public class SubGrupo implements Serializable {
    
    @Id
    @SequenceGenerator(name = "subgrupo_id_subgrupo_seq", sequenceName = "seq_subgrupo_id_subgrupo", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "subgrupo_id_subgrupo_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_subgrupo", nullable = false)
    private int    id_subgrupo;
    @ManyToOne
    @JoinColumn(name = "grupo_id", foreignKey = @ForeignKey(name = "GRUPO_ID_FK"))
    private Grupo  grupo;
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
    @Column(name = "cancelado", length = 01, nullable = false)
    private String cancelado;

    public SubGrupo() {
    }
    
    public int getId_subgrupo() {
        return id_subgrupo;
    }

    public void setId_subgrupo(int id_subgrupo) {
        this.id_subgrupo = id_subgrupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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
        hash = 59 * hash + this.id_subgrupo;
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
        final SubGrupo other = (SubGrupo) obj;
        if (this.id_subgrupo != other.id_subgrupo) {
            return false;
        }
        return true;
    }
   
    
    
}
