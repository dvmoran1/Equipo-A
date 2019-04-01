/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linkedlist_y_arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author David VM
 * @param <T>
 */
public class Queue<T> {
    Deque<T> List = new ArrayDeque<>(); 
    
    
    public void set(T item){
        List.addLast(item);
    }
    
    public T get(){
        return List.getFirst();
    }
}
