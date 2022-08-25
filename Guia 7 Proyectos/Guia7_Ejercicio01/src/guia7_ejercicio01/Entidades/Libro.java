package guia7_ejercicio01.Entidades;

public class Libro {

    public int ISBN;
    public String autor;
    public String titulo;
    public int numeroPaginas;

    public Libro() {

    }

    public Libro(int ISBN, String autor, String titulo, int numeroPaginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", autor=" + autor + ", titulo=" + titulo + ", numeroPaginas=" + numeroPaginas + '}';
    }

}
