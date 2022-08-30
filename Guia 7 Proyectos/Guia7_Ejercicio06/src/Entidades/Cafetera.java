
package Entidades;

public class Cafetera {
    
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadActual) {
        this.capacidadMaxima = 1000;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
        
}
