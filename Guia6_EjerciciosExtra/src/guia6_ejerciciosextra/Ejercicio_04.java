package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Ingrese un numero entre el 1 y el 10...");
        System.out.println("0 para salir...");
        do {
            System.out.print(">");
            n = input.nextInt();
            input.nextLine();
            if (n > 0 || n <= 10) {
                switch (n) {
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                }
            }
        } while (n != 0);

    }

}
