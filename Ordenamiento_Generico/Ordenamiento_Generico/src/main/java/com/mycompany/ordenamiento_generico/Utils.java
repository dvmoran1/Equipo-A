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
public class Utils {
    public static<T extends Number> T[] ordena(T []vector){
        
        Quicksort(vector,0,vector.length-1);
        
        return vector;
    }
    public static <T extends Number>void Quicksort(T []arreglo, int limite_izq, int limite_derecho) 
    { 
	int i = limite_izq;
	int j = limite_derecho; 
	T temp; 
	T pivote = arreglo[(limite_derecho + limite_izq)/2]; //valor de enmedio
	
	do{
		if(arreglo[i] instanceof Integer){
                    
                    Integer x=(Integer)arreglo[i];
                    Integer pivote1=(Integer)pivote;
                    while(x > pivote1 && i < limite_derecho){i++; x=(Integer)arreglo[i];}
                    Integer x1=(Integer)arreglo[j];
                    while(x1 < pivote1 && j > limite_izq){ j--; x1=(Integer)arreglo[j];}
                }else{
                    
                    if(arreglo[i] instanceof Double){
                     
                        Double y=(Double)arreglo[i];
                        Double pivote2=(Double)pivote;
                        while(y > pivote2 && i < limite_derecho){ i++; y=(Double)arreglo[i];}
                        Double y1=(Double)arreglo[j];
                        while(y1 < pivote2 && j > limite_izq){ j--; y1=(Double)arreglo[j];}
                    }
                }
		if(i <= j){
			temp = arreglo[i];
			arreglo[i] = arreglo[j];
			arreglo[j] = temp;
			i++;
			j--;
		}
	}while(i <= j);
        
	if(limite_izq < j){  Quicksort(arreglo, limite_izq, j); } //ordenamos parte izquierda. Condicion de paro, si j es menor al limite izq, es decir j<0.
	if(limite_derecho > i){ Quicksort(arreglo, i, limite_derecho); }//ordenar parte derecha.  Condicion de paro, si i pasa el limite derecho (tamaño del array)
    } 
    
}