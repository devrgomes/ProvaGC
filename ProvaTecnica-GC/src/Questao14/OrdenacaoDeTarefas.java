package Questao14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeTarefas implements Comparable<OrdenacaoDeTarefas> {
    String titulo;

    public OrdenacaoDeTarefas(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(OrdenacaoDeTarefas outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }

    public static void Comportable() {
        List<OrdenacaoDeTarefas> tarefas = new ArrayList<>();
        tarefas.add(new OrdenacaoDeTarefas("Estudar"));
        tarefas.add(new OrdenacaoDeTarefas("Almoçar"));
        tarefas.add(new OrdenacaoDeTarefas("Dormir"));

        Collections.sort(tarefas);

        System.out.println(tarefas);
    }
}