package src.academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
/*
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Do..While: "+count);
            count++;
        } while (count < 10);
*/
        for (int i = 0; i < 10; i++) {
            System.out.println("For: "+i);
        }
    }
}