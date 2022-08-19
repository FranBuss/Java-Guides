package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aux;
        int contador = 0;

        System.out.println("Ingrese numero 1: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese numero 2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            do {
                aux = num1 - num2;
                System.out.println(num1 + " + " + num2 + " = " + aux);
                num1 = aux;
                contador++;
                System.out.println("se realizaron " + contador + " restas");
                System.out.println("-------------------------------------");
            } while (num2 < aux);

        }

    }

}
