package guia6_ejerciciosbase;

import java.util.Scanner;


public class Ejercicio_3 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase para pasarlo a mayusculas y minusculas: ");
        frase = input.nextLine();
        System.out.println("En mayusculas: " + frase.toUpperCase());
        System.out.println("En minusculas: " + frase.toLowerCase());
        
    }
    
}
