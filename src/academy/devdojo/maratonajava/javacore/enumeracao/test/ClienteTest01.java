package src.academy.devdojo.maratonajava.javacore.enumeracao.test;

import src.academy.devdojo.maratonajava.javacore.enumeracao.domain.Cliente;
import src.academy.devdojo.maratonajava.javacore.enumeracao.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA);
        Cliente cliente02 = new Cliente("Efabrika", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente01);
        System.out.println(cliente02);
    }
}
