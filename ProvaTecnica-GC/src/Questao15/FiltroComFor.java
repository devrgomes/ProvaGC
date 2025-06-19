package Questao15;

import java.util.ArrayList;

public class FiltroComFor {

    public void Tarefas() {

        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer Exercicios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas) {
            if (tarefa.contains("Java")) {
                System.out.print("Farefa de Programação: " + tarefa);
            }
        }
    }
}