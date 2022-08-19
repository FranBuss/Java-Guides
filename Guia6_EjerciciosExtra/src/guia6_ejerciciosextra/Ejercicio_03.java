package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        String letra = input.nextLine();
        letra = letra.toUpperCase();
        
        if (letra.equals("A") ||
            letra.equals("E") ||
            letra.equals("I") ||
            letra.equals("O") ||
            letra.equals("U")){
            System.out.println("--Es una vocal--");
        } else {
            System.out.println("--No es una vocal--");
        }
        
    }
    
}
