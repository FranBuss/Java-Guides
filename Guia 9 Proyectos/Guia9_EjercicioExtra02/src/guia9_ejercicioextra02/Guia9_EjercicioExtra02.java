package guia9_ejercicioextra02;

import Entidades.Cine;
import Entidades.Espectador;
import Servicios.ServicioCine;
import java.util.ArrayList;

public class Guia9_EjercicioExtra02 {

    public static void main(String[] args) {

        ServicioCine sc = new ServicioCine();

        System.out.println("Abrimos el cine");
        Cine c = sc.AbrirCine();
        System.out.println(" ");
        System.out.println("Creamos la fila de espectadores");
        ArrayList<Espectador> e = sc.crearFilaEspectadores();
        System.out.println(" ");
        System.out.println("Creamos a los espectadores");
        sc.espectadores(c, e);
        System.out.println(" ");
        System.out.println("Nos fijamos en el estado de la sala");
        sc.estadoSala(c);
        System.out.println(" ");
        System.out.println("Buscamos un asiento en concreto");
        sc.estadoAsiento(c);

    }

}
