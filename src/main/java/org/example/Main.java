package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0]= new Student("Ana ", 18.5);
        students[1]= new Student("Luis ", 16.0);
        students[2]= new Student("Maria ", 19.2);
        students[3]= new Student("Pedro ", 15.17);
        students[4]= new Student("Sofia ", 18.5);

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getGrade() < students[j + 1].getGrade()) {

                    Student aux = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = aux;

                }
            }
        }
        System.out.println("Estudiantes ordenados por notas:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    students[i].getName() + " - " + students[i].getGrade()
            );
        }
    }
}