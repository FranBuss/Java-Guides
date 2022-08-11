package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero para determinar si es par o no: ");
        n = input.nextInt();
        if (n % 2 == 0){
            System.out.println("--Es par--");
        } else {
            System.out.println("--Es impar--");
        }
        
    }
    
}
