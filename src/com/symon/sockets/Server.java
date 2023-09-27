package com.symon.sockets;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server socket: waiting for a client");

        try {
            ServerSocket serverSocket = new ServerSocket(9806);
            Socket socket = serverSocket.accept();
            System.out.println("Connection established!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
