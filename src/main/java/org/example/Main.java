package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Alumno alumno = new Alumno("Andrew","Andrew",5,"Andrew");

        Maestro maestro = new Maestro();
        maestro.setAsignatura("Matemáticas");
        maestro.setNombre("Juan");
        maestro.setApellido("Perez");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println(maestro.getNombre() + " " + maestro.getApellido());


    }
}