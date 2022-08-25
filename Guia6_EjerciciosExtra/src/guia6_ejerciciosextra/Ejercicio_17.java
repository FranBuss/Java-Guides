package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para comprobar si es primo: ");
        int n = input.nextInt();
        System.out.println(n + " es primo? " + Primo(n));

    }

    public static boolean Primo(int n) {

        if (n == 0 || n == 1 || n == 4) {
            return false;
        }

        for (int i = 2; i < n / 2; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;

    }

}
