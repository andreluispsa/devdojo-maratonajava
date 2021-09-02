package src.academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // cria uma variável de referência do tipo Estudante
        // inicializando-a com um objeto do tipo Estudante
        Estudante estudante = new Estudante();
        estudante.nome = "José";
        estudante.idade = 17;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Estudante: " + estudante);
    }
}
