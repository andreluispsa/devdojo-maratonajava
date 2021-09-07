package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /*
         não é possível acessar os atributos diretamente pois
         estão declaradas como "private" na classe "Pessoa"
         pessoa.nome = "Carlos";
         pessoa.idade = 44;
        */

        pessoa.setNome("Carlos");
        pessoa.setIdade(27);
        pessoa.imprime();
        int idade = pessoa.getIdade();
        System.out.println(idade);
    }
}
