
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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;



@Entity                   // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "senha")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class Senha implements Serializable {

    public Senha() {
    }
    
    
    @Id
    @SequenceGenerator(name = "senha_id_senha_seq", sequenceName = "seq_senha_id_senha", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "senha_id_senha_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_senha", nullable = false)
    private int    id_senha;
    @OneToOne
    @JoinColumn(name = "colaborador_id", foreignKey = @ForeignKey(name = "COLABORADOR_ID_FK"))
    private Colaborador colaborador;
    @Column(name = "senha", length = 256, nullable = false)
    private String senha;
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
    

    public int getId_senha() {
        return id_senha;
    }

    public void setId_senha(int id_senha) {
        this.id_senha = id_senha;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        hash = 23 * hash + this.id_senha;
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
        final Senha other = (Senha) obj;
        if (this.id_senha != other.id_senha) {
            return false;
        }
        return true;
    }

   
   
}
