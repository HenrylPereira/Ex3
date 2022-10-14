package org.example;

import org.example.entidade.Tarefa;
import org.example.persistencia.CriarTabelas;
import org.example.servico.CriarTarefa;
import org.example.servico.ListarTarefas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CriarTabelas.criarTabelas();

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("tarefa 1");
        tarefa.setPrioridade("alta");

        Tarefa tarefa2 = new Tarefa();
        tarefa2.setDescricao("tarefa 2");
        tarefa2.setPrioridade("baixa");


        CriarTarefa criarTarefa = new CriarTarefa();

        try {
            criarTarefa.criar(tarefa);
            criarTarefa.criar(tarefa2);
        }catch (Exception e){
            e.printStackTrace();
        }

        ListarTarefas listarTarefas = new ListarTarefas();
        String prioridade = "";

        System.out.println("Lista minhas tarefas por prioridade alta");
        prioridade = "alta";
        for(Tarefa t : listarTarefas.obterByPrioridade(prioridade)){
            System.out.println(t);
        }

        System.out.println("Lista minhas tarefas por prioridade baixa");
        prioridade = "baixa";
        for(Tarefa t : listarTarefas.obterByPrioridade(prioridade)){
            System.out.println(t);
        }



    }

}
