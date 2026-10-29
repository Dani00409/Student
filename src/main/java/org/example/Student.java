package org.example;

public class Student {
    String nombre;
    double nota;

    public Student(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarNotas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + nota);
    }

    public String getName() {
        return nombre;
    }

    public double getGrade() {
        return nota;
    }
}
