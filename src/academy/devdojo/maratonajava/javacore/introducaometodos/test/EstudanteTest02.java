package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "José";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante.imprime();

    }
}
