package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cafetera LlenarCafetera() {

        System.out.println("La cafetera se esta llenando, aguarde...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Cafetera llena...");
        return new Cafetera(1000);

    }

    public int servirTaza(String taza, int cantActual) {
        int cantServido = 0;
        switch (taza) {
            case "Grande":
                if (cantActual >= 200) {
                    cantServido += 200;
                } else {
                    System.out.println("No alcanza el cafe");
                }
                break;
            case "Mediano":
                if (cantActual >= 100) {
                    cantServido += 100;
                } else {
                    System.out.println("No alcanza el cafe");
                }
                break;
            case "Chico":
                if (cantActual >= 50) {
                    cantServido += 50;
                } else {
                    System.out.println("No alcanza el cafe");
                }
                break;
            default:
                System.out.println("No corresponde a ninguna medida");
        }
        return cantServido;

    }

    public int vaciarCafetera() {
        int vaciar = 0;
        return vaciar;
    }

    public int agregarCafe(int cantAgregar, int capMaxima) {
        int agregado = 0;

        if (cantAgregar <= capMaxima || cantAgregar >= 0) {
            agregado = cantAgregar;
        } else {
            System.out.println("Te pasaste del limite mi rey");
        }

        return agregado;

    }

}
