package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        //operadores básicos: + - / *
        int number01 = 10;
        int number02 = 20;
        System.out.println("Subtração: " + (number02 - number01));
        System.out.println("Soma: " + (number01 + number02));
        int result = number01 * number02;
        System.out.println("Multiplicação: " + result);
        result = number01 / number02;
        // resultado fica sendo zero, porque inteiro divido por inteiro resulta em inteiro
        System.out.println("Divisão: " + result);
        double number03 = 10;
        double number04 = 20;
        double resultDouble = number03 / number04;
        System.out.println("Divisão de Double: " + resultDouble);

        // Operador RESTO %
        int resto = 20 % 3;
        System.out.println("Resto: " + resto);

        // Operadores Relacionais - sempre retornam um valor booleano
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);

        // Operadores Lógicos - sempre retornam um valor booleano
        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = (idade > 30) && (salario > 4612);
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        boolean isDentroDaLeiMenorQueTrinta = (idade < 30) && (salario > 3381);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlaystationCompravel = (valorTotalContaCorrente > valorPlayStation) ||
                (valorTotalContaPoupanca > valorPlayStation);
        System.out.println("Tenho dinheiro para playstation: " + isPlaystationCompravel);

        double bonus = 1000;
        // somar + 500 ao bonus
        bonus = bonus + 500;
        // outra forma de fazer:
        bonus += 500;
        System.out.println("Bonus "+ bonus);

        int contador = 0;
        // contador = contador + 1 OU contador += 1
        contador++;
        System.out.println("Contador: " + contador);
    }
}
