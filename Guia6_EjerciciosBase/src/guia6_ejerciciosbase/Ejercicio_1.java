package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        input.nextLine();
        
        System.out.println("La suma de los numeros es: " + (num1 + num2));
        
    }
    
}
