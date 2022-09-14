/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Franco
 */
public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
    }

    public Tiempo(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        }
        if (minuto >= 0 && minuto <= 60) {
            this.minuto = minuto;
        }
        if (segundo >= 0 && segundo <= 60) {
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 60) {
            this.segundo = segundo;
        }
    }

    public void imprimirHoraCompleta() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

}
