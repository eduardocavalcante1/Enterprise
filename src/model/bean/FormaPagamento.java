
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

@Entity                           // @Entity Define que essa classe é uma entidade a ser mapeada pela JPA;
@Table(name = "formapagamento")  //  @Table Permite definir o nome da tabela à qual essa entidade estará relacionada no banco de dados. Contudo, essa anotação é necessária apenas se houver diferença entre o nome da tabela e o nome da classe, como ocorre nesse caso;
public class FormaPagamento implements Serializable {

    public FormaPagamento() {
    }
    
    @Id
    @SequenceGenerator(name = "formapagamento_id_formapagamento_seq", sequenceName = "seq_formapagamento_id_formapagamento", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "formapagamento_id_formapagamento_seq", strategy = GenerationType.SEQUENCE)
    @Column(name="id_formapagamento", nullable = false)
    private int  id_formapagamento;
    // private int  id_pagamento;
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;
    @Column(name = "descontopercentual")
    private double descontopercentual;
    @Column(name = "acrescimopercentual")
    private double acrescimopercentual;
    @Column(name = "prazo")
    private int    prazo;
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

    public int getId_formapagamento() {
        return id_formapagamento;
    }

    public void setId_formapagamento(int id_formapagamento) {
        this.id_formapagamento = id_formapagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDescontopercentual() {
        return descontopercentual;
    }

    public void setDescontopercentual(double descontopercentual) {
        this.descontopercentual = descontopercentual;
    }

    public double getAcrescimopercentual() {
        return acrescimopercentual;
    }

    public void setAcrescimopercentual(double acrescimopercentual) {
        this.acrescimopercentual = acrescimopercentual;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
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
        hash = 29 * hash + this.id_formapagamento;
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
        final FormaPagamento other = (FormaPagamento) obj;
        if (this.id_formapagamento != other.id_formapagamento) {
            return false;
        }
        return true;
    }
    
       
    
}
