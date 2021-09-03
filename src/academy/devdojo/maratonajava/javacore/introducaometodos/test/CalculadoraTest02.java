package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double num1 = 10;
        double num2 = 0;
        double resultadoDivisao = calculadora.divideDoisNumeros(num1, num2);
        System.out.println(num1 + " / " + num2 + ": " + resultadoDivisao);
    }
}
