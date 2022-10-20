package guia9_ejercicio02;

import Entidades.*;
import java.util.*;

public class Guia9_Ejercicio02 {

    public static void main(String[] args) {
        
        Juego juego1 = new Juego();
        Revolver revo = new Revolver();
        HashSet<Jugador> jugadores = new HashSet();
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        //Lleno el revolver
        revo.llenarRevolver();
        
        //Ingreso los jugadores
        System.out.println("Ingrese la cantidad de jugadores --> ");
        int cantJugadores = input.nextInt();

        for (int i = 1; i <= cantJugadores; i++) {
            if (i >= 1 && i <= 6) {
                Jugador j = new Jugador();
                j.setId(i);
                j.setNombre("Jugador");
                //Ingreso los jugadores al conjunto
                jugadores.add(j);
            }
        }

        //Imprimo la lista de jugadores
        System.out.println(jugadores);
        System.out.println("-------------------------------------------------------------------------------------");
        //Seteo los datos de juego
        juego1.llenarJuego(jugadores, revo);
        //Arranco el juego
        juego1.ronda();
        System.out.println("-------------------------------------------------------------------------------------");

    }

}
