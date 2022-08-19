package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int n1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = input.nextInt();
        menuOpciones(n1, n2);

    }

    public static void menuOpciones(int n1, int n2) {

        Scanner input = new Scanner(System.in);

        String opt;
        int opc;
        boolean exit = false;
        System.out.println("--MENU--");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        do {
            System.out.println("Ingrese una opcion: ");
            opc = input.nextInt();
            if (opc == 5) {
                System.out.println("Desea salir del programa? (S/N)");
                input.nextLine();
                opt = input.nextLine();
                if (opt.equals("S") || opt.equals("s")) {
                    exit = true;
                } else {
                    System.out.println("Se sigue en el programa...");
                    System.out.println("--------------------------");
                }
            } else if (opc > 0 && opc < 5) {
                opcionesMenu(n1, n2, opc);
            }

        } while (!exit);

    }

    public static void opcionesMenu(int n1, int n2, int opc) {

        switch (opc) {
            case 1:
                System.out.println("La suma es: " + (n1 + n2));
                break;
            case 2:
                System.out.println("La resta es: " + (n1 - n2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + (n1 * n2));
                break;
            case 4:
                System.out.println("La division es: " + (n1 / n2));
                break;
        }

    }

}
