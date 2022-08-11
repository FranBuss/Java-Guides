package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limite;
        int suma = 0;
        int n;
        
        System.out.println("Ingrese un limite: ");
        limite = input.nextInt();
        do {
            System.out.println("Ingrese numero: ");
            n = input.nextInt();
            suma += n;
        } while (suma < limite);
        
        System.out.println("El limite es " + limite + " y la suma de los numeros " + suma);
    }
    
}
