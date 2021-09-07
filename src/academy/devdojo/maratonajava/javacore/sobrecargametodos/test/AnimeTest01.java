package src.academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import src.academy.devdojo.maratonajava.javacore.sobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.imprime();

        Anime anime2 = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
