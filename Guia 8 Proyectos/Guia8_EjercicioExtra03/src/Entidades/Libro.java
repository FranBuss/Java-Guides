package Entidades;

public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = 10;
        this.ejemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "\ntitulo = " + titulo + "\nautor = " + autor + "\nejemplares = " + ejemplares + "\nejemplaresPrestados = " + ejemplaresPrestados + '}';
    }

}
