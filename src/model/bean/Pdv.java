
package model.bean;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name = "pdv")      //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class Pdv implements Serializable {

    public Pdv() {
    }
    
    @Id
    @SequenceGenerator(name = "pdv_id_pdv_seq", sequenceName = "seq_pdv_id_pdv", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "pdv_id_pdv_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_pdv", nullable = false)
    private int    id_pdv;
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;
    @Column(name = "codigopdv", length = 04, nullable = false) 
    private String codigopdv;
    @ManyToOne
    @JoinColumn(name = "filial_id", foreignKey = @ForeignKey(name = "FILIAL_ID_FK"))
    private Filial filial;
    @Column(name = "dtultcarga",nullable = false) 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date   dtultcarga;
    @Column(name = "aberto", length = 01, nullable = false) 
    private String aberto;
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

    public int getId_pdv() {
        return id_pdv;
    }

    public void setId_pdv(int id_pdv) {
        this.id_pdv = id_pdv;
    }

    public String getCodigopdv() {
        return codigopdv;
    }

    public void setCodigopdv(String codigopdv) {
        this.codigopdv = codigopdv;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }


    public Date getDtultcarga() {
        return dtultcarga;
    }

    public void setDtultcarga(Date dtultcarga) {
        this.dtultcarga = dtultcarga;
    }

    public String getAberto() {
        return aberto;
    }

    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    public void setDtultcarga(Calendar hoje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        hash = 43 * hash + this.id_pdv;
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
        final Pdv other = (Pdv) obj;
        if (this.id_pdv != other.id_pdv) {
            return false;
        }
        return true;
    }

      
   
}
