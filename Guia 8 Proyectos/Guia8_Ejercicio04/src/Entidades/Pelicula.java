package Entidades;

import java.util.Comparator;

public class Pelicula {

    private String nombrePelicula;
    private String autor;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String nombrePelicula, String autor, int duracion) {
        this.nombrePelicula = nombrePelicula;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

//    public static Comparator<Pelicula> compararAutor = (Pelicula t, Pelicula t1) -> t.getAutor().compareTo(t1.getAutor());
//    public static Comparator<Pelicula> compararTitulo = (Pelicula t, Pelicula t1) -> t.getNombrePelicula().compareTo(t1.getNombrePelicula());

    //Esta de mas O_O
    Comparator<Pelicula> compararAutor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getAutor().compareTo(p2.getAutor());
        }
    };
    Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getNombrePelicula().compareTo(p2.getNombrePelicula());
        }
    };

    Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion() - p2.getDuracion();
        }
    };

    @Override
    public String toString() {
        return "Pelicula {" + "Nombre --> " + nombrePelicula + "\n Autor --> " + autor + "\n Duracion --> " + duracion + '}' + "\n";
    }

}
