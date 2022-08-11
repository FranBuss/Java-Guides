package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String palabra;
        
        System.out.println("Ingrese una palabra o frase de longitud 8: ");
        palabra = input.nextLine();
        
        if (palabra.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
