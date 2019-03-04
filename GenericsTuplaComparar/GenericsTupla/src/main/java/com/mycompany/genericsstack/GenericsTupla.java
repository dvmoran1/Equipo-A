/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.genericsstack;

/**
 *
 * @author geronimo
 * @param <T>
 * @param <N>
 */
public class GenericsTupla<T,N> {
    private final T primero;
    private final N segundo;
    
    public GenericsTupla(T primero,N segundo){
        this.primero=primero;
        this.segundo=segundo;
    }
    public T getprimero(){
        return primero;
    }
    public N getsegundo(){
        return segundo;
    }
    @Override
    public String toString(){
        return String.format("(%s,%s)", primero.toString(),segundo.toString());
    }
}
