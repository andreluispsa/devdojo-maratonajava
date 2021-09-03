package src.academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros(int a, int b) {
        System.out.println(a + " + " + b + ": " + (a + b));
    }

    public void subtraiDoisNumeros(int a, int b) {
        System.out.println(a + " - " + b + ": " + (a - b));
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a + " * " + b + ": " + (a * b));
    }

    public double divideDoisNumeros(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return (a/b);
    }

}
