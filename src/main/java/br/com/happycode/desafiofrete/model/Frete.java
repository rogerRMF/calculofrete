package br.com.happycode.desafiofrete.model;

public class Frete {
    private Produto produto;
    private UF uf;
    private double valor;

    // Construtor, getters e setters

    public Frete(Produto produto, UF uf, double valor) {
        this.produto = produto;
        this.uf = uf;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
