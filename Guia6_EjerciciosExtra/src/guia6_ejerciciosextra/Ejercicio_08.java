package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        do {

            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if (num % 5 == 0) {
                break;
            }
            
            if (num % 2 == 0 && num > 0) {
                pares++;
            } else if (num % 2 != 0 && num > 0) {
                impares++;
            }

        } while (true);

        System.out.println("La cantidad de pares fue de: " + pares);
        System.out.println("La cantidad de impares fue de: " + impares);

    }

}
