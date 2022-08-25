package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber cuantos digitos tiene: ");
        int num = input.nextInt();

        int contador = 0;
        
        
        do {
            
            num = num / 10;
            contador++;
            
        } while (num!=0);
        
        System.out.println("la cantidad de digitos que tiene es: " + contador);
        
    }

}
