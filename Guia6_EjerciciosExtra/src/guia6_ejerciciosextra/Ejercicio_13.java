package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la escalera");
        int n = input.nextInt();
        System.out.println("--------------------------------");
        
        String escalera = "";
        
        for (int i = 1; i <= n; i++) {
            escalera += String.valueOf(i);
            System.out.println(escalera);
        }
        
    }
    
}
