package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.println("Ingrese un numero: ");
        n = input.nextInt();
        System.out.println("El doble del numero es: " + (n*2));
        System.out.println("El triple del numero es: " + (n*3));
        System.out.println("La raiz del numero es: " + Math.sqrt(n));
        
        
    }
    
}
