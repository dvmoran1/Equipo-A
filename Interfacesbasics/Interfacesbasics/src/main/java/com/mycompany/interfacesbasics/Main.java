/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacesbasics;

/**
 *
 * @author geronimo
 */
public class Main {

    public static void main (String [] args) {
        Drawable [] shapes = {
            new Circle (),
            new Rectangle ()
        };
        Circle original = new Circle (10, 20, 1);
        Circle copia = original.clone ();
        Rectangle original1 = new Rectangle (10, 20, 10,20);
        Rectangle copia1 = original1.clone ();
        
        
        System.out.println (shapes [0]); 


    }
    
}