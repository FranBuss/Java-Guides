package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int suma = 0;

        System.out.println("Ingrese el tamaño del vector: ");
        int n = input.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            vector[i] = input.nextInt();
            suma += vector[i];
        }

        System.out.println("---------------------------------------------");
        System.out.println("La suma de los numeros del vector es: " + suma);
        System.out.println("---------------------------------------------");

    }

}
