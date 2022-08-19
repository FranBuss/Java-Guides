package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int resp;
        int multi = num1 * num2;
        int contador = 0;

        System.out.println("-----------------------");
        System.out.println("-- ADIVINE EL NUMERO --");
        System.out.println("-----------------------");
        do {
            if (contador >= 5) {
                System.out.println("Pruebe con multiplicar " + num1 + " * " + num2 + " : ");
            }
            System.out.println("Ingrese el resultado: ");
            resp = input.nextInt();
            contador++;

        } while (resp != multi);

        if (resp == multi) {
            System.out.println("Genial adivinaste el numero!!");
        }
    }
}
