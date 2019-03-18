/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.genericsstack;

/**
 *
 * @author geronimo
 */

public class Main {

    public static void main(String[] args) {
        GenericsTupla [] otVector = {
            new GenericsTupla ("Santiago BernabÈu", 125000),
            new GenericsTupla ("Camp Nou", 159000),
            new GenericsTupla ("Old Trafford", 95000)
        };
        
        System.out.println (String.format ("Object\n\tEstadio con mayor capacidad: %s", estadioMayorCapacidad (otVector)));
        
        GenericsTupla <Double,Double> point1= new GenericsTupla (12.12,1.12);
        GenericsTupla <Double,Double> point2= new GenericsTupla (12.12,1.12);
        
        boolean isEqual=Utilities.compare(point1, point2);
        
        if(isEqual==true){System.out.println ("son iguales");}
        if(isEqual==false){ System.out.println ("no son iguales");}
    }
        
    public static String estadioMayorCapacidad (GenericsTupla [] estadios) {
        int foo = -1;
        String result = "";
        
        for (int i = 0; i < estadios.length; i++) {
            int bar = (int) estadios [i].getsegundo (); //casting from object to int
            if (bar > foo) {
                result = estadios [i].getprimero ().toString ();
                foo = (int) estadios [i].getsegundo ();
            }
        }
        
        return result;
    }
}