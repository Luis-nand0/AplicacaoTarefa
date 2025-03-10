/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacaotarefa.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class GestaoTarefa {
    
    private static List<Tarefa> tf = null;
            
    public GestaoTarefa(){
        if  (tf == null) {
            tf = new ArrayList<Tarefa>();
        }
    }
    
    public static boolean CadastraTarefa(Tarefa tarefa) {
        if (tf == null) {
            tf = new ArrayList<Tarefa>();
        }
        
        if (tf.contains(tarefa)){
            return false;
        }
        
        return tf.add(tarefa);
    }
    
    public boolean DeletaTarefa(Tarefa tarefa){
        if(!tf.contains(tarefa)){
            return false;
        }
            return tf.remove(tarefa);
    }
    
    public static List<Tarefa> ListaTarefas(){
        if(tf != null){
            return tf;
        }
        
        return new ArrayList<Tarefa>();
    }
;}
