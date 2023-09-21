package com.symon.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public static class Deserializer {
        public static void main(String[] args) throws IOException, ClassNotFoundException {

            com.symon.deserialization.User user = null;

            try {
                FileInputStream fileInputStream = new FileInputStream("userInfo2.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                user = (com.symon.deserialization.User) objectInputStream.readObject();

                objectInputStream.close();
                fileInputStream.close();

            } finally {
                assert user != null;
                System.out.println(user.name);
                System.out.println(user.password);
                user.sayHello();
            }

        }
    }
}
