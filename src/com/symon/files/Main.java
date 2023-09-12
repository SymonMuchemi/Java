package com.symon.files;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/symon/Pictures/Cars/BMW-rear-headlight.jpg");
        File file2 = new File("/home/symon/IdeaProjects/Java/src/com/symon/files/testFile.txt");

        if (file.exists()){
            System.out.println("That file exists");
            //get the path to the file - relative path
            System.out.println(file.getPath());
            // absolute path
            System.out.println(file.getAbsoluteFile());
            // check if a file is a file
            System.out.println(file.isFile());

            // deleting a file
            file2.delete();

        }
        else {
            System.out.println("The file doesn't exist!");
        }
    }
}
