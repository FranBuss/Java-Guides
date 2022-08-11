package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("Ingrese una frase o palabra: ");
        palabra = input.nextLine();
        
        if (palabra.substring(0, 1).equals("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
