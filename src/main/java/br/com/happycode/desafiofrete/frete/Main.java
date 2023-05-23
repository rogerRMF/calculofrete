package br.com.happycode.desafiofrete.frete;

import br.com.happycode.desafiofrete.model.Cliente;
import br.com.happycode.desafiofrete.model.Frete;
import br.com.happycode.desafiofrete.model.Produto;
import br.com.happycode.desafiofrete.model.UF;
import br.com.happycode.desafiofrete.service.CalculadoraFrete;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setDataAniversario(LocalDate.of(1990, 5, 10));
        cliente.setCep("02123040");
        cliente.setLogradouro("Rua A");
        cliente.setBairro("Centro");
        cliente.setCidade("São Paulo");
        cliente.setUf(UF.SP);

        // Criando um produto
        Produto produto = new Produto();
        produto.setDescricao("Geladeira");
        produto.setValor(500.00);

        // Calculando o frete por UF
        Frete fretePorUF = CalculadoraFrete.calcularFretePorUF(produto, cliente);
        System.out.println("Produto: " + fretePorUF.getProduto().getDescricao());
        System.out.println("UF: " + fretePorUF.getUf());
        System.out.println("Valor do Frete: " + fretePorUF.getValor());

        // Calculando o frete por valor do produto
        Frete fretePorValor = CalculadoraFrete.calcularFretePorValor(produto);
        System.out.println("Produto: " + fretePorValor.getProduto().getDescricao());
        System.out.println("Valor do Frete: " + fretePorValor.getValor());
    }
}
