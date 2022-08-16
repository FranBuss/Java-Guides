package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1) {
                    System.out.print("x");
                } else if (j == 0 || j == n-1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
