package src.academy.devdojo.maratonajava.javacore.associacao.test;

import src.academy.devdojo.maratonajava.javacore.associacao.domain.Escola;
import src.academy.devdojo.maratonajava.javacore.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("José Carlos");
        Professor professor2 = new Professor("Santo André");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Jardim Escola",professores);

        escola.imprime();
    }
}
