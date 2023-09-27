package com.symon.sockets;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client started");

        try {
            Socket socket = new Socket("localhost", 9806);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
