/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servidorudp;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static int PORT = 9888;
    public static int MAX_LEN = 10;
            
    public static void main (String [] args) {
        
        try {
            ServerSocket server = new ServerSocket (PORT);
            Socket socket = server.accept (); 

            DatagramSocket  datagramSocket = new DatagramSocket(PORT);
            byte[ ] buffer = new byte[MAX_LEN];
            DatagramPacket datagram = new DatagramPacket(buffer, MAX_LEN);
            datagramSocket.receive(datagram);
            String message = new String(buffer);
            System.out.println(message);
            datagramSocket.close( );
            server.close ();
        } catch (IOException ioex) {
            ioex.printStackTrace ();
        }
    }
    
}