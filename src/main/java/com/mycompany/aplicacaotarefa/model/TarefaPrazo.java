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
public class TarefaPrazo extends Tarefa {
    
    private LocalDate dataPrazo;

    public TarefaPrazo(String descricao, int prioridade, LocalDate dataCriacao, LocalDate dataPrazo) {
    }

    public TarefaPrazo(String descricao, int prioridade, LocalDate dataCriacao) {
        super(descricao, prioridade, dataCriacao);
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }
    
    
}
