package org.example;

public class Alumno extends Persona {
    private String nombreColegio;
    private int notaMatematica;
    private int notaLengua;
    private int notaHistoria;

    public Alumno() {
        System.out.println("Alumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre,  String apellido, int edad){
        super(nombre,apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String nombreColegio) {
        super(nombre, apellido, edad);
        this.nombreColegio = nombreColegio;
    }

    public Alumno(String nombre, String apellido, int edad, String nombreColegio, int notaMatematica, int notaLengua, int notaHistoria) {
        this(nombre, apellido, edad, nombreColegio);
        this.notaMatematica = notaMatematica;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public int getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(int notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public int getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(int notaLengua) {
        this.notaLengua = notaLengua;
    }

    public int getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(int notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
