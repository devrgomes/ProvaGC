package Questao05;

public class Notificacoes {

    int notificacoes = 0;

    public void Notificacoes() {

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }
        System.out.println(notificacoes);
    }
}