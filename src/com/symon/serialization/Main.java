package com.symon.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // serialization
        // -> this is the process of converting an object into a byte stream

        User user = new User();
        File serFile;

        user.name = "Symon";
        user.password = "12345678";

        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("userInfo.ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

        objectOut.writeObject(user);
        objectOut.close();
        fileOut.close();

        serFile = new File("userInfo.ser");
        if (serFile.exists()){
            System.out.println("Object info saved to file successfully!!");
        } else {
            System.out.println("Object info not save!");
        }
    }
}
