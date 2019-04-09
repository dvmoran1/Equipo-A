/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author Equipo-A
 */
//import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
//import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.JTextArea;
//import javax.swing.JPanel;

public class SimpleSwingFrame extends JFrame {
    String dato1,signo,dato2;
    public SimpleSwingFrame () {
        
        setLayout (null);
        setTitle ("Calculadora");
        setSize (338, 520);
        
        JTextField resul=new JTextField ();
        resul.setBounds(20,20,300,70);
        
        add(resul);
        
        JButton botonc=new JButton("C");
        botonc.setBounds(20,100,75,75);
        botonc.addActionListener ((ev) -> {
            resul.setText("");
                
        });
        add(botonc);
        JButton botonn=new JButton("");
        botonn.setBounds(95,100,75,75);
        add(botonn);
        JButton botonnn=new JButton("");
        botonnn.setBounds(170,100,75,75);
        add(botonnn);
        JButton botond=new JButton("/");
        botond.setBounds(245,100,75,75);
        botond.addActionListener ((ev) -> {
            if(!resul.getText().equals("")){
                dato1=resul.getText();
                signo="/";
                resul.setText("");
            }
        });
        add(botond);
        
        JButton boton7=new JButton("7");
        boton7.setBounds(20,175,75,75);
        boton7.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"7");
        });
        add(boton7);
        JButton boton8=new JButton("8");
        boton8.setBounds(95,175,75,75);
        boton8.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"8");
        });
        add(boton8);
        JButton boton9=new JButton("9");
        boton9.setBounds(170,175,75,75);
        boton9.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"9");
        });
        add(boton9);
        JButton botonx=new JButton("X");
        botonx.setBounds(245,175,75,75);
        botonx.addActionListener ((ev) -> {
            if(!resul.getText().equals("")){
                dato1=resul.getText();
                signo="*";
                resul.setText("");
            }
        });
        add(botonx);
        
        JButton boton4=new JButton("4");
        boton4.setBounds(20,250,75,75);
        boton4.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"4");
        });
        add(boton4);
        JButton boton5=new JButton("5");
        boton5.setBounds(95,250,75,75);
        boton5.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"5");
        });
        add(boton5);
        JButton boton6=new JButton("6");
        boton6.setBounds(170,250,75,75);
        boton6.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"6");
        });
        add(boton6);
        JButton botonm=new JButton("-");
        botonm.setBounds(245,250,75,75);
        botonm.addActionListener ((ev) -> {
            if(!resul.getText().equals("")){
                dato1=resul.getText();
                signo="-";
                resul.setText("");
            }
        });
        add(botonm);
        
        JButton boton1=new JButton("1");
        boton1.setBounds(20,325,75,75);
        boton1.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"1");
        });
        add(boton1);
        JButton boton2=new JButton("2");
        boton2.setBounds(95,325,75,75);
        boton2.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"2");
        });
        add(boton2);
        JButton boton3=new JButton("3");
        boton3.setBounds(170,325,75,75);
        boton3.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"3");
        });
        add(boton3);
        JButton botonmas=new JButton("+");
        botonmas.setBounds(245,325,75,75);
        botonmas.addActionListener ((ev) -> {
            if(!resul.getText().equals("")){
                dato1=resul.getText();
                signo="+";
                resul.setText("");
            }
        });
        add(botonmas);
        
        JButton botona=new JButton("");
        botona.setBounds(20,400,75,75);
        add(botona);
        JButton boton0=new JButton("0");
        boton0.setBounds(95,400,75,75);
        boton0.addActionListener ((ev) -> {
            resul.setText(resul.getText()+"0");
        });
        add(boton0);
        JButton botonpunto=new JButton(".");
        botonpunto.setBounds(170,400,75,75);
        botonpunto.addActionListener ((ev) -> {
            String texto;
            texto=resul.getText();
            if(texto.length()<=0){
                resul.setText("0.");
            }else{
                if(!punto(resul.getText())){
                    resul.setText(resul.getText()+".");
                }
            }
        });
        add(botonpunto);
        JButton botonigual=new JButton("=");
        botonigual.setBounds(245,400,75,75);
        botonigual.addActionListener ((ev) -> {
            String resultado;
            dato2=resul.getText();
            if(!dato2.equals("")){
                resultado=calcular(dato1,dato2,signo);
                resul.setText(resultado);
            }
        });
        add(botonigual);     
        
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible (true);
        
    }
    
    public static String calcular(String dato1,String dato2,String signo){
        Double respuesta=0.0;
        switch(signo){
            case "+":
                respuesta=Double.parseDouble(dato1)+Double.parseDouble(dato2);
            break;
            case "-":
                respuesta=Double.parseDouble(dato1)-Double.parseDouble(dato2);
            break;
            case "*":
                respuesta=Double.parseDouble(dato1)*Double.parseDouble(dato2);
            break;
            case "/":
                respuesta=Double.parseDouble(dato1)/Double.parseDouble(dato2);
            break;
        }
        return respuesta.toString();
    }
    
    
    public static boolean punto(String texto){
        boolean res;
        res=false;
        
        for(int i=0;i<texto.length();i++){
            if(texto.substring(i,i+1).equals(".")){
                res=true;
                break;
            }
        }
        return res;
    }
}  
