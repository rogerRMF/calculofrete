package br.com.happycode.desafiofrete.service;

import br.com.happycode.desafiofrete.model.Cliente;
import br.com.happycode.desafiofrete.model.Frete;
import br.com.happycode.desafiofrete.model.Produto;
import br.com.happycode.desafiofrete.model.UF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {
    @Test
    void calcularFretePorUFSPTest() {
        Cliente cliente = new Cliente();
        cliente.setUf(UF.SP);

        Produto produto = new Produto();
        produto.setValor(100.00);

        Frete frete = CalculadoraFrete.calcularFretePorUF(produto, cliente);

        Assertions.assertEquals(30.00, frete.getValor());
    }

    @Test
    void calcularFretePorUFMGLessThan20Test() {
        Cliente cliente = new Cliente();
        cliente.setUf(UF.MG);

        Produto produto = new Produto();
        produto.setValor(15.00);

        Frete frete = CalculadoraFrete.calcularFretePorUF(produto, cliente);

        Assertions.assertEquals(2.25, frete.getValor());
    }

    @Test
    void calcularFretePorValorLessThan20Test() {
        Produto produto = new Produto();
        produto.setValor(15.00);

        Frete frete = CalculadoraFrete.calcularFretePorValor(produto);

        Assertions.assertEquals(2.00, frete.getValor());
    }

}
