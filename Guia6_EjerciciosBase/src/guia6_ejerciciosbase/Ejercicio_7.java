package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = input.nextLine();
        if (frase.equals("Eureka")) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No coincide");
        }
        
    }
    
}
