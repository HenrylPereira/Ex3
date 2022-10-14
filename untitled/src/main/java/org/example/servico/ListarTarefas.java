package org.example.servico;

import org.example.entidade.Tarefa;
import org.example.persistencia.TarefaDAO;

import java.util.List;

public class ListarTarefas {

    private TarefaDAO dao;

    public ListarTarefas(){
        dao = new TarefaDAO();
    }

    public List<Tarefa> obterTodos(){
        return dao.obterTodos();
    }

    public List<Tarefa> obterByPrioridade(String prioridade){
        return dao.obterByPrioridade(prioridade);
    }

}
