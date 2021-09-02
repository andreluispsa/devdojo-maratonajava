package src.academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        // ao criar o objeto acima, e não inicializar os atributos
        // eles são criados com os valores padrões
        // Neste exemplo, Nome é nulo, Idade é 0, e Sexo um char vazio
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
