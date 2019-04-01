package com.mycompany.interfaz_collection;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David VM
 */
public class Main {
    public static void main (String [] args){
        
        MyCollection<String> myStrCollection = new MyCollection<>();
        myStrCollection.add ("Obiwan");
        myStrCollection.add ("Anakin");
        myStrCollection.add ("Lea");
        myStrCollection.add ("Rey");
        
        MyCollection<Double> myDblCollection = new MyCollection<> ();
        myDblCollection.add (1.0);
        myDblCollection.add (2.0);
        print(myStrCollection);
        print(myDblCollection);
    }
    
    public static <T extends MyCollection> void print(T mycollection){
        System.out.println(mycollection.List);
    }
}
