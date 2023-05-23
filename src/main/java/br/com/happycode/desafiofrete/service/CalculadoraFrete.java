package br.com.happycode.desafiofrete.service;

import br.com.happycode.desafiofrete.model.Cliente;
import br.com.happycode.desafiofrete.model.Frete;
import br.com.happycode.desafiofrete.model.Produto;
import br.com.happycode.desafiofrete.model.UF;

public class CalculadoraFrete {
    public static Frete calcularFretePorUF(Produto produto, Cliente cliente) {
        double valorFrete;
        if (cliente.getUf() == UF.SP || cliente.getUf() == UF.MG || cliente.getUf() == UF.RJ) {
            valorFrete = produto.getValor() * 0.3;
        } else {
            valorFrete = produto.getValor() * 0.15;
        }
        return new Frete(produto, cliente.getUf(), valorFrete);
    }

    public static Frete calcularFretePorValor(Produto produto) {
        double valorFrete;
        if (produto.getValor() < 20.00) {
            valorFrete = 2.00;
        } else if (produto.getValor() >= 20.00 && produto.getValor() <= 100.00) {
            valorFrete = 8.00;
        } else {
            valorFrete = 0.00;
        }
        return new Frete(produto, null, valorFrete);
    }
}
