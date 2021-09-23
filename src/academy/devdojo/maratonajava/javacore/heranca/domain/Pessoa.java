package src.academy.devdojo.maratonajava.javacore.heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome) {
        nome = this.nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        cpf = this.cpf;
    }

    public void imprime() {
        System.out.println("Nome: "+ this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Endereço: "+ endereco.getRua() + " CEP: " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
