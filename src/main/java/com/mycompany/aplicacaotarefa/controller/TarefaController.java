/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacaotarefa.controller;

import com.mycompany.aplicacaotarefa.model.GestaoTarefa;
import com.mycompany.aplicacaotarefa.model.Tarefa;
import com.mycompany.aplicacaotarefa.model.TarefaPrazo;
import com.mycompany.aplicacaotarefa.model.TarefaSimples;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author luis
 */
public class TarefaController {
    
    public boolean TarefaCadastrar(String descricao, int prioridade, LocalDate dataCriacao, LocalDate dataPrazo){
        if(dataPrazo == null ){
            GestaoTarefa.CadastraTarefa(new TarefaSimples(descricao, prioridade, dataCriacao));
            return true;
        }else{
            GestaoTarefa.CadastraTarefa(new TarefaPrazo(descricao, prioridade, dataCriacao, dataPrazo));
            return true;
        }
    }
    
    public List<Tarefa> Lista(){
        List tarefa = GestaoTarefa.ListaTarefas();
        return tarefa;
    }
}
