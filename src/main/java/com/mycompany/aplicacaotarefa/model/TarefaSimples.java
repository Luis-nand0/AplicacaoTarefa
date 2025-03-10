/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacaotarefa.model;

import java.time.LocalDate;

/**
 *
 * @author luis
 */
public class TarefaSimples extends Tarefa{
    public TarefaSimples(){}
    
    public TarefaSimples(String descricao, int prioridade, LocalDate dataCriacao){
        super(descricao, prioridade, dataCriacao);
    }
    
}
