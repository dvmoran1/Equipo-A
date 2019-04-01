/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkedlist_y_arraydeque;

import java.util.LinkedList;

/**
 *
 * @author David VM
 * @param <T>
 */
public class Stack<T>{
    LinkedList<T> List= new LinkedList<>();
    
    public void push (T item) { 
        List.addFirst(item);
    }
    
    public T pop () {
        return List.getFirst();
    }
    
    
}
