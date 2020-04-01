
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


@Entity                // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "cfop")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class Cfop implements Serializable{    

    
    @Id
    @SequenceGenerator(name = "cfop_id_cfop_seq", sequenceName = "seg_cfop_id_cfop", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "cfop_id_cfop_seq", strategy = GenerationType.SEQUENCE )
    @Column(name="id_cfop", nullable = false)
    private int    id_cfop;
    @Column(name="codigocfop", length = 05, unique = true, nullable = false) // Apenas é necessário @Column quando o nome da coluna for diferente do atributo;
    private String codigocfop;
    @Column(name="descricao", length = 256, nullable = false)
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

    public Cfop() {   // No exemplo seguido foi realizado a inserção do código construtor
        
    }

    public int getId_cfop() {
        return id_cfop;
    }

    public void setId_cfop(int id_cfop) {
        this.id_cfop = id_cfop;
    }

    public String getCodigocfop() {
        return codigocfop;
    }

    public void setCodigocfop(String codigocfop) {
        this.codigocfop = codigocfop;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        int hash = 5;
        hash = 71 * hash + this.id_cfop;
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
        final Cfop other = (Cfop) obj;
        if (this.id_cfop != other.id_cfop) {
            return false;
        }
        return true;
    }

    
   
}
