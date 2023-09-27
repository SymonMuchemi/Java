package com.symon.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        BufferedReader buffReadIn;
        String receivedStr;
        PrintWriter out;

        try {
            System.out.println("Server socket: waiting for a client...");

            //noinspection resource
            serverSocket = new ServerSocket(9806);
            socket = serverSocket.accept();
            System.out.println("Connection established!");

            // get input string from the socket
            buffReadIn = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream()
                    )
            );

            receivedStr = buffReadIn.readLine();
            receivedStr += " (I've read it!)";
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Server says: " + receivedStr);
        } catch (Exception e){
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}
