package Questao07;

public class ConstrucaoDeClassesEMetodos {

    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponível";
        }
        return "Disponivel";
    }

    public void testaLivro() {
        ConstrucaoDeClassesEMetodos livro = new ConstrucaoDeClassesEMetodos();
        livro.titulo = "Java para Iniciantes";
        System.out.print(livro.status());
        livro.emprestar();
        System.out.print(" | ");
        System.out.print(livro.status());
    }
}