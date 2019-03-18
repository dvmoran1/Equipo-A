/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenamiento_generico;

/**
 *
 * @author geronimo
 */
public class Main {
    public static void main (String [] args) {
        Integer [] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };
        Integer [] result = Utils.ordena(intVector);
        
        for(Object item:result){
            System.out.println(item);
        }
        
        Double [] floatVector = { 19.1, 456.6, 23.45, 12.34, 11.11, 354.55, 78.45, 28.33, 45.99, 108.88 };
        Double [] result2 = Utils.ordena (floatVector);
        
        for(Object item:result2){
            System.out.println(item);
        }
        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
         String [] result3 = Utils.ordena(strVector);
    }
}
