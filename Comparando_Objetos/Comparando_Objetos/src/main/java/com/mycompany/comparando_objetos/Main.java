/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comparando_objetos;

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
        
        System.out.println (shapes [0]); 
        
        Circle circle1 = new Circle (10, 10, 20);
        Circle circle2 = new Circle (15, 15, 21);
        
        int resultCircles = circle1.compareTo (circle2);
        System.out.println (resultCircles == 1 ? "Circulo 1 es mayor" : "Circulo 2 es mayor");
        
        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);
        
        int resultRecs = rec1.compareTo (rec2);
        System.out.println (resultRecs == 1 ? "Rectángulo 1 es mayor" : "Rectángulo 2 es mayor");

    }
    
}
