package Entidades;

import java.util.HashSet;

public class Juego {

    private HashSet<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(HashSet<Jugador> jugadores, Revolver r) {
        setJugadores(jugadores);
        setRevolver(r);
    }

    public void ronda() {
        boolean seMojaron = false;
        while (true) {
            for (Jugador jugadore : jugadores) {
                if (jugadore.disparo(revolver)) {
                    seMojaron = true;
                    System.out.println("El jugador que perdio fue --> " + jugadore);
                    System.out.println("Se mojo y el juego termina...");
                    break;
                }
            }
            if (seMojaron) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores = " + jugadores + ", revolver = " + revolver + '}';
    }

}
