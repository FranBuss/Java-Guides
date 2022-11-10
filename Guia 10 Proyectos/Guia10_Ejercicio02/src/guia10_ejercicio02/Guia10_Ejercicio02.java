package guia10_ejercicio02;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class Guia10_Ejercicio02 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        Electrodomestico e = new Electrodomestico();
        Lavadora l = new Lavadora();
        Televisor t = new Televisor();

        e.crearElectrodomestico();
        listaElectrodomesticos.add(e);
        System.out.println("****************************");
        l.crearLavadora();
        listaElectrodomesticos.add(l);
        System.out.println("****************************");
        t.crearTelevisor();
        listaElectrodomesticos.add(t);

        int precioElectrodomesticos = 0;

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            precioElectrodomesticos += electrodomestico.getPrecio();
        }

        System.out.println(e);
        System.out.println("****************************");
        System.out.println(l);
        System.out.println("****************************");
        System.out.println(t);

        System.out.println("Precio total --> " + precioElectrodomesticos);

    }

}
