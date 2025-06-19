package Questao11;

import java.time.LocalDate;

public class ManipulacaoDeDatas {

    public void JavaTime() {
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);
    }
}