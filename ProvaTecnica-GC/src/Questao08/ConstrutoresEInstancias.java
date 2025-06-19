package Questao08;

public class ConstrutoresEInstancias {
    String nome;
    int idade;

    // Construtor
    public ConstrutoresEInstancias(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}