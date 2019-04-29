/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clienteudp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static String ADDRESS = "localhost";
    public static int PORT = 9888;
    
    public static void main (String [] args) {
        String message = "HI MOM";
        try {
            Socket socket = new Socket (ADDRESS, PORT);
            InetAddress receiverHost = InetAddress.getByName(ADDRESS);
            DatagramPacket datagram = new DatagramPacket(message.getBytes( ), message.length(), receiverHost, PORT);
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(datagram);
            datagramSocket.close( );
            socket.close ();
        } catch (UnknownHostException un) {
            un.printStackTrace ();
        } catch (IOException ex) {
            ex.printStackTrace ();
        }
        
    }
    
}