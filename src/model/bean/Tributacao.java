
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


@Entity                      // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "tributacao")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class Tributacao implements Serializable {

    public Tributacao() {
    }
    

    @Id
    @SequenceGenerator(name = "tributacao_id_tributacao_seq", sequenceName = "seq_tributacao_id_tributacao", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "tributacao_id_tributacao_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_tributacao", nullable = false)
    private int    id_tributacao;
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;
    @Column(name = "uf", length = 02, nullable = false)
    private String uf;
    @Column(name = "aliquota", nullable = false)
    private Double aliquota;
    @Column(name = "redutor", nullable = false)
    private Double redutor;
    @Column(name = "entradasaida", length = 01, nullable = false)
    private String entradasaida;
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

    public int getId_tributacao() {
        return id_tributacao;
    }

    public void setId_tributacao(int id_tributacao) {
        this.id_tributacao = id_tributacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getRedutor() {
        return redutor;
    }

    public void setRedutor(Double redutor) {
        this.redutor = redutor;
    }

    public String getEntradasaida() {
        return entradasaida;
    }

    public void setEntradasaida(String entradasaida) {
        this.entradasaida = entradasaida;
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
        hash = 41 * hash + this.id_tributacao;
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
        final Tributacao other = (Tributacao) obj;
        if (this.id_tributacao != other.id_tributacao) {
            return false;
        }
        return true;
    }
    
    
    
}
