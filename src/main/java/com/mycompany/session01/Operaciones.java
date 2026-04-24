/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author F20LAB207E21
 */

package com.mycompany.session01;

public class Operaciones {
    private int operador1;
    private int operador2;
    
    public Operaciones(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    public void setOperador1 (int operador1){
        this.operador1 = operador1;
    }
    public void setOperador2 (int operador2){
        this.operador2 = operador2;
    }
    
    public int sumar(){
        return operador1 + operador2;
    }
    public int restar(){
        return operador1 - operador2;
    }
    public int multiplicar(){
        return operador1 * operador2;
    }
}
