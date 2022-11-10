package Entidades;

import java.time.LocalDate;
import java.util.HashSet;

public class Alquiler {

    private Cliente cliente;
    private LocalDate fechaAlquier;
    private LocalDate fechaDevolucion;
    private HashSet<Integer> posAmarre;
    private Barco tipoBarco;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, LocalDate fechaAlquier, LocalDate fechaDevolucion, HashSet<Integer> posAmarre, Barco tipoBarco) {
        this.cliente = cliente;
        this.fechaAlquier = fechaAlquier;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.tipoBarco = tipoBarco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquier() {
        return fechaAlquier;
    }

    public void setFechaAlquier(LocalDate fechaAlquier) {
        this.fechaAlquier = fechaAlquier;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public HashSet<Integer> getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(HashSet<Integer> posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(Barco tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

}
