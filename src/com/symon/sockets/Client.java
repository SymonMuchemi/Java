package com.symon.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket;
        String string;
        BufferedReader userInput;
        BufferedReader socketInput;
        PrintWriter out;

        try {
            System.out.println("Client started");
            //noinspection resource
             socket = new Socket("localhost", 9806);

            //read data from the keyboard
            userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            string = userInput.readLine();

            if (string != null){
                out  = new PrintWriter(socket.getOutputStream(), true);
                out.println(string);
                socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(socketInput.readLine());
            } else {
                System.out.println("Cannot send an empty string!!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
