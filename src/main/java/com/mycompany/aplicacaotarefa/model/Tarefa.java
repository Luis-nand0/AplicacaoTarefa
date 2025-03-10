/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacaotarefa.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author luis
 */
public abstract class Tarefa {
    private String descricao;
    private int prioridade;
    private LocalDate dataCriacao;
    
    public Tarefa(){}

    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "descricao=" + descricao + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao + '}';
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.descricao);
        hash = 61 * hash + this.prioridade;
        hash = 61 * hash + Objects.hashCode(this.dataCriacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarefa other = (Tarefa) obj;
        if (this.prioridade != other.prioridade) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.dataCriacao, other.dataCriacao);
    }
    
    
}
