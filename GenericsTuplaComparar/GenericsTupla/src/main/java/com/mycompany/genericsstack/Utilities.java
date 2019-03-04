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
public class Utilities {
    public static<T,U> boolean compare(GenericsTupla<T,U> point1,GenericsTupla<T,U> point2){
        return point1.getprimero().equals(point2.getprimero()) && point1.getsegundo().equals(point2.getsegundo());
    }
}
