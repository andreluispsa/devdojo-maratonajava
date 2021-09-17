package src.academy.devdojo.maratonajava.javacore.associacao.test;

import src.academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
import src.academy.devdojo.maratonajava.javacore.associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("José");
        Jogador jogador2 = new Jogador("Carlos");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador 1 ---");
        jogador1.imprime();
        System.out.println("--- Jogador 2 ---");
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
