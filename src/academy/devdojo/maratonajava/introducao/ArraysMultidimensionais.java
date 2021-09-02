package src.academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("--------------------------");

        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        System.out.println("--------------------------");

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[]{1, 2, 3, 4, 5};

        for (int[] arrBase : arrayInt) {
            System.out.println("\n----------");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }

        System.out.println("--------------------------");

        int newArrayInt[][] = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] newArrBase : newArrayInt) {
            System.out.println("\n-----------");
            for (int newNum : newArrBase) {
                System.out.print(newNum + " ");
            }
        }


    }
}
