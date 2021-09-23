package src.academy.devdojo.maratonajava.javacore.heranca.test;

import src.academy.devdojo.maratonajava.javacore.heranca.domain.Endereco;
import src.academy.devdojo.maratonajava.javacore.heranca.domain.Funcionario;
import src.academy.devdojo.maratonajava.javacore.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Laura Telles");
        endereco.setCep("22730-305");

        Pessoa pessoa = new Pessoa("Carlos");
        pessoa.setCpf("234923403");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------");
        Funcionario funcionario = new Funcionario("José");
        funcionario.setCpf("324823944");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();

    }
}
