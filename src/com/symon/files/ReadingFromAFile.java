package com.symon.files;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFromAFile {
    public static void main(String[] args) {
        FileReader fileReader;

        {
            try {
                fileReader = new FileReader("Poem.txt");
                int data = fileReader.read();
                while(data != -1){
                    System.out.print((char)data);
                    data = fileReader.read();
                }
                fileReader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
