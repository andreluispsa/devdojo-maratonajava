package src.academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // Estrutura condicional IF...ELSE
        int idade = 17;
        if (idade >= 18) {
            System.out.println("Vocè pode comprar bebida alcoólica");
        } else {
            System.out.println("Você não pode comprar bebida alcoólica");
        }
        System.out.println("Print fora do if");

        // OPERADOR TERNÁRIO
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500,00";
        String mensagemNaoDoar = "Eu ainda não tenho condiçóes de doar";
  /*
    Sem o uso do operador ternário
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
   */
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println("Resultado: " + resultado);

        byte dia = 5;
        // char, int, byte, short, enum, String;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

    }
}
