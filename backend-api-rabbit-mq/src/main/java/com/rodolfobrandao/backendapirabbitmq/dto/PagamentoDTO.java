package com.rodolfobrandao.backendapirabbitmq.dto;

import java.math.BigDecimal;

public class PagamentoDTO {
    private String numeroPedido;
    private BigDecimal valor;

    private String produto;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
