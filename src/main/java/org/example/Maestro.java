package org.example;

public class Maestro extends Persona{
    private String asignatura;

    public Maestro() {
        System.out.println("Maestro");
    }

    public Maestro(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Maestro(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
