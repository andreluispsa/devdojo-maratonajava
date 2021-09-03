package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(10, 20);
        calculadora.subtraiDoisNumeros(20, 10);
        calculadora.multiplicaDoisNumeros(10, 20);
    }
}
