package com.fatec.backofficeapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity(name = "TipoProduto")
@Table(name = "tipoProduto")
public class TipoProduto {

    @Id
    @NotNull
    @Column(name = "codigo")
    private long codigo;

    @NotNull
    @Column(name = "descricao")
    private String descricao;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoProduto() {

    }

}
