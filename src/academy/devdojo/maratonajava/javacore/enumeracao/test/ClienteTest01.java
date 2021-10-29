package src.academy.devdojo.maratonajava.javacore.enumeracao.test;

import src.academy.devdojo.maratonajava.javacore.enumeracao.domain.Cliente;
import src.academy.devdojo.maratonajava.javacore.enumeracao.domain.TipoCliente;
import src.academy.devdojo.maratonajava.javacore.enumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Efabrika", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
