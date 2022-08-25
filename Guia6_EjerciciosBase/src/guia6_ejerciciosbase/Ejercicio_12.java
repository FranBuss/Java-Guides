package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String cadena;
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;

        do {

            System.out.println("Ingrese una cadena: ");
            cadena = input.nextLine();
            if (cadena.substring(0, 1).equals("X") && cadena.substring(cadena.length() - 1, cadena.length()).equals("O") && cadena.length() <= 5) {
                contadorCorrectas++;
            } else if (cadena.equals("&&&&&")) {
                System.out.println("Gracias por usar el programa...");
            } else {
                contadorIncorrectas++;
            }

        } while (!cadena.equals("&&&&&"));

        System.out.println("La cantidad de veces correctas fue: " + contadorCorrectas);
        System.out.println("La cantidad de veces incorrectas fue: " + contadorIncorrectas);

    }

}
