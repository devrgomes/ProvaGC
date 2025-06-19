package Questao01;

import java.time.LocalDate;

public class SistemaDeAgenda {

    public void Agendamento() {

        LocalDate base = LocalDate.of(2025, 6, 1); // Data base: 1º de junho de 2025
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());
    }
}
