package com.symon.files;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Poem.txt");
            writer.write("Roses are red\nViolets are blue\nAll I wanna do is code and see the sip some tea");
            writer.append("\n\nPoem by Symon");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
