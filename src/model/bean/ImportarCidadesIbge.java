
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
@Table(name = "ibgecidades")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class ImportarCidadesIbge implements Serializable {

    public ImportarCidadesIbge() {
    }
    
    
    @Id
    @SequenceGenerator(name = "ibgecidades_id_ibgecidades_seq", sequenceName = "seq_ibgecidades_id_ibgecidades", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "ibgecidades_id_ibgecidades_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_ibgecidades", nullable = false)
    private int    id_ibgecidades;
    @Column(name="nomecidade", length = 150, nullable = false)
    private String nomecidade;
    @Column(name="codigocidade", length = 07, nullable = false)
    private String codigocidade;
    @Column(name="uf", length = 100, nullable = false)
    private String uf;
    @Column(name="usuarioalteracao", nullable = false)
    private int    usuarioalteracao;
    @Column(name="dtalteracao", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date   dtalteracao;
    private String arquivo;

    public int getId_ibgecidades() {
        return id_ibgecidades;
    }

    public void setId_ibgecidades(int id_ibgecidades) {
        this.id_ibgecidades = id_ibgecidades;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getCodigocidade() {
        return codigocidade;
    }

    public void setCodigocidade(String codigocidade) {
        this.codigocidade = codigocidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id_ibgecidades;
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
        final ImportarCidadesIbge other = (ImportarCidadesIbge) obj;
        if (this.id_ibgecidades != other.id_ibgecidades) {
            return false;
        }
        return true;
    }
   

    
  
    
}
