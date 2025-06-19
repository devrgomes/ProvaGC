package Questao13;

import java.time.LocalTime;

public class VerificacaoDeHorario {

    public void LocalTime() {

        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário");
        } else {
            System.out.println("Tarefa enviada com sucesso");
        }
    }
}