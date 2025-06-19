package Questao03;

public class CadastroComSobrecarga {

    String nome;
    int quantidade;

    public CadastroComSobrecarga(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public CadastroComSobrecarga(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void exibeResposta() {
        CadastroComSobrecarga x = new CadastroComSobrecarga("Caderno");
        CadastroComSobrecarga y = new CadastroComSobrecarga("Caneta", 3);
        System.out.println(x.quantidade + y.quantidade);
    }
}