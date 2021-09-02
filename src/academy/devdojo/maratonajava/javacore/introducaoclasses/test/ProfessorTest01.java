package src.academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import src.academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Carlos";
        professor.idade = 34;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Sexo: " + professor.sexo);
    }
}
