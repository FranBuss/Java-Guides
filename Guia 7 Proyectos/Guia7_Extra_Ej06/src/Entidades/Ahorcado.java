package Entidades;

import java.util.Arrays;

public class Ahorcado {
    
    private String[] palabra;
    private int letrasEncontradas;
    private int intentosRestantes;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra) {
        this.palabra = palabra;
        this.letrasEncontradas = 0;
        this.intentosRestantes = 7;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", letrasEncontradas=" + letrasEncontradas + ", intentosRestantes=" + intentosRestantes + '}';
    }
    
    

}
