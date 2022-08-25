package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas: ");
        int nPersonas = input.nextInt();

        for (int i = 0; i < nPersonas; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i+1) + ": ");
        }

    }
    
    

}
