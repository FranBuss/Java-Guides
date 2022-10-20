package guia9_ejercicio003;

import Entidades.*;
import java.util.ArrayList;

public class Guia9_Ejercicio003 {

    public static void main(String[] args) {

        Jugador j1 = new Jugador();
        j1.setNombre("Lionel");
        j1.setApellido("Messi");
        j1.setNumero(10);
        j1.setPosicion("Delantero");
        Jugador j2 = new Jugador();
        j2.setNombre("Emiliano");
        j2.setApellido("Martinez");
        j2.setNumero(1);
        j2.setPosicion("Arquero");
        Jugador j3 = new Jugador();
        j3.setNombre("Lisandro");
        j3.setApellido("Martinez");
        j3.setNumero(7);
        j3.setPosicion("Defensor");
        Jugador j4 = new Jugador();
        j4.setNombre("Fideo");
        j4.setApellido("Di Maria");
        j4.setNumero(13);
        j4.setPosicion("Medio campista");
        Jugador j5 = new Jugador();
        j5.setNombre("Rodrigo");
        j5.setApellido("DePaul");
        j5.setNumero(12);
        j5.setPosicion("Medio Campista");

        ArrayList<Jugador> listaJugadores = new ArrayList();
        listaJugadores.add(j1);
        listaJugadores.add(j2);
        listaJugadores.add(j3);
        listaJugadores.add(j4);
        listaJugadores.add(j5);
        Equipo eq = new Equipo();
        eq.setJugadores(listaJugadores);
        System.out.println(eq);

    }

}
