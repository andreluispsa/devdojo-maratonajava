package src.academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        System.out.println("Salário: ");
        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println("Mês " + (i+1) + ": " + this.salarios[i]);
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (this.salarios == null) {
            return;
        }
        double media = 0;
        double soma = 0;
        for (int i = 0; i < this.salarios.length; i++) {
            soma = soma + this.salarios[i];
        }
        media = soma / this.salarios.length;

        System.out.println("Média dos últimos 3 salários:" + media);
    }
}
