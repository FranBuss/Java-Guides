package Entidades;

public class Curso {

    private int anio;
    private char division;
    private Profesor profesor;

    public Curso() {
    }
    

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return " " + profesor;
    }
    
    
    
}
