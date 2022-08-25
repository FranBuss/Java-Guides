package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("----------------------------");
        System.out.println("---  1 - suma            ---");
        System.out.println("---  2 - resta           ---");
        System.out.println("---  3 - multiplicacion  ---");
        System.out.println("---  4 - division        ---");
        System.out.println("----------------------------");
        System.out.println("Ingrese una opcion :");
        int opc = input.nextInt();
        System.out.println("----------------------------");
        switch (opc) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + Suma(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + Resta(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + Multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + Division(num1, num2));
                break;
            default:
                System.out.println("-- Opcion incorrecta --");
                ;
        }

    }

    public static int Suma(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }

    public static int Resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }

    public static int Multiplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static float Division(int num1, int num2) {
        float division = num1 / num2;
        return division;
    }

}
