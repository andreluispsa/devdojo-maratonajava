package src.academy.devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Mick";
        nomes[1] = "Ronny";
        nomes[2] = "John";
        // Imprimir os 3 nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }
        // outra forma de inicializar um array
        int[] idades = {1, 2, 3, 4, 5};

        // outra forma de inicializar um array
        int[] idades2 = new int[]{1, 2, 3, 4, 5};

        // modo simplificado de fazer um for com array
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int num : numeros3) {
            System.out.println(num);
        }

    }
}
