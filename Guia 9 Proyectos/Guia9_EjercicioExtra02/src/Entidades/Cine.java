package Entidades;

import java.util.ArrayList;

public class Cine {

    private Asiento sala[][];
    private Pelicula pelicula;
    private ArrayList<String> asientosLibres;
    private Integer precio;

    public Cine() {
    }

    public Cine(Asiento[][] sala, Pelicula pelicula, ArrayList<String> asientosLibres, Integer precio) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.asientosLibres = asientosLibres;
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<String> getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(ArrayList<String> asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", pelicula=" + pelicula + ", asientosLibres=" + asientosLibres + ", precio=" + precio + '}';
    }

}
