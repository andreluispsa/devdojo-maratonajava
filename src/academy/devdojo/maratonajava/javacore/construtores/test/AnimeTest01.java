package src.academy.devdojo.maratonajava.javacore.construtores.test;


import src.academy.devdojo.maratonajava.javacore.construtores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação");
        anime.imprime();

        Anime anime2 = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG");
        anime2.imprime();
    }
}
