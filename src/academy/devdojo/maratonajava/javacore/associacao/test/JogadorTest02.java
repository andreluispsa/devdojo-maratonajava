package src.academy.devdojo.maratonajava.javacore.associacao.test;

import src.academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
import src.academy.devdojo.maratonajava.javacore.associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
