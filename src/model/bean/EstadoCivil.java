
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


@Entity                       // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "estadocivil")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class EstadoCivil implements Serializable {

    public EstadoCivil() {
    }
    
    
    @Id
    @SequenceGenerator(name = "estadocivil_id_estadocivil_seq", sequenceName = "seq_estadocivil_id_estadocivil", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "estadocivil_id_estadocivil_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_estadocivil", nullable = false)
    private int    id_estadocivil;
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;
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
    
    public int getId_estadocivil() {
        return id_estadocivil;
    }

    public void setId_estadocivil(int id_estadocivil) {
        this.id_estadocivil = id_estadocivil;
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
        hash = 71 * hash + this.id_estadocivil;
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
        final EstadoCivil other = (EstadoCivil) obj;
        if (this.id_estadocivil != other.id_estadocivil) {
            return false;
        }
        return true;
    }

   

    
}