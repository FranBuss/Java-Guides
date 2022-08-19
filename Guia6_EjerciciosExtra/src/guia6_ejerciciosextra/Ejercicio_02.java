package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int auxA, auxB, auxC, auxD;

        System.out.println("Ingrese un numero para la variable A: ");
        int A = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese un numero para la variable B: ");
        int B = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese un numero para la variable C: ");
        int C = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese un numero para la variable D: ");
        int D = input.nextInt();
        input.nextLine();

        
        auxA = A;
        auxB = B;
        auxC = C;
        auxD = D;
       
        B = auxC;
        C = auxA;
        A = auxD;
        D = auxB;

        System.out.println("B toma el valor de C: " + B);
        System.out.println("C toma el valor de D: " + C);
        System.out.println("A toma el valor de D: " + A);
        System.out.println("D toma el valor de B: " + D);

    }

}
