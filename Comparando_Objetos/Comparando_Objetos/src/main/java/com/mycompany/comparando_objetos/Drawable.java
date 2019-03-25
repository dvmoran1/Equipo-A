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
public interface Drawable extends ShapeArea {
    int RED     = 1;
    int GREEN   = 2;
    int BLUE    = 3;
    int BLACK   = 4;
    int WHITE   = 5;
    
    void draw (int color);
  
    void fill (int color); 
   
}
