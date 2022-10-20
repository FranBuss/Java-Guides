package Entidades;

public class Dni {
    
    private char serie;
    private int numero;

    public Dni() {
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{ " + "serie = " + serie + "\n numero = " + numero + '}';
    }
    
    

}
