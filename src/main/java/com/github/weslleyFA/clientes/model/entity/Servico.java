package com.github.weslleyFA.clientes.model.entity;

import com.sun.istack.Nullable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer servicoID;

    @Column(nullable = false)
    private String descricao;

    @Column
    private BigDecimal valor;

    @ManyToOne
    private Cliente cliente;


    public Integer getServicoID() {
        return servicoID;
    }

    public void setServicoID(Integer servicoID) {
        this.servicoID = servicoID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
