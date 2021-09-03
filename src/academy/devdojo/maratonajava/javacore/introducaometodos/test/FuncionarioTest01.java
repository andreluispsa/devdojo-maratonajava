package src.academy.devdojo.maratonajava.javacore.introducaometodos.test;

import src.academy.devdojo.maratonajava.javacore.introducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Carlos";
        funcionario.idade = 45;
        funcionario.salarios = new double[]{2000.00, 1500, 2000};

        funcionario.imprimeDados();

    }
}
