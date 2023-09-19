package com.symon.streams.parallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}
public class Demo1 {
    public static void main(String[] args) {
        /*
            Goal: create a bunch of student objects, filter according to
            their scores limit the number and retrieve the result
        */
        List<Student> studentList;

        studentList = Arrays.asList(
                new Student("James", 55),
                new Student("Bob", 90),
                new Student("Job", 80),
                new Student("John", 65),
                new Student("Erick", 82),
                new Student("Susan", 88),
                new Student("Scott", 90)
        );
        // filter the students with scores greater than 80
        // method 1

        studentList.stream()
                    .filter(student -> student.score >= 80)
                    .limit(3)
                    .forEach(student -> System.out.printf("student = %s score -> %d\n", student.getName(), student.getScore()));

        //using parallel streams
        System.out.println("Using parallel streams");
        studentList.parallelStream()
                .filter(student -> student.getScore() >= 80)
                .limit(3)
                .forEach(student -> System.out.printf("student = %s score -> %d\n", student.getName(), student.getScore()));

        // converting stream to parallel stream
        System.out.println("\nConverted stream to parallel stream");
        studentList.stream()
                .parallel()
                .filter(student -> student.getScore() >= 80)
                .limit(3)
                .forEach(student ->  System.out.printf("student = %s score -> %d\n", student.getName(), student.getScore()));
    }
}
