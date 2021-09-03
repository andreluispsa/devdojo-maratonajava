package src.academy.devdojo.maratonajava.javacore.introducaometodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("Nome 01: " + this.nome);
        System.out.println("Idade 01: " + this.idade);
        System.out.println("Sexo 01: " + this.sexo);

        System.out.println("------------------");
    }
}
