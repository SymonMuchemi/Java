package com.symon.deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user;

        FileInputStream fileInputStream = new FileInputStream("userInfo.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        user = (User) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
