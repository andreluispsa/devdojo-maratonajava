package src.academy.devdojo.maratonajava.javacore.associacao.test;

import src.academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{jogador01,jogador02,jogador03};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
