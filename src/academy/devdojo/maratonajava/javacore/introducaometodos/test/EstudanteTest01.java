package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante;
import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.ImpressoraEstudante;


public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "José";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 13;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
