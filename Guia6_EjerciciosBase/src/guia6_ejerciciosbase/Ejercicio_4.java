package guia6_ejerciciosbase;

import java.util.Scanner;
    
public class Ejercicio_4 {


    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        
        int celcius;
        
        System.out.println("Ingrese los grados celcius: ");
        celcius = input.nextInt();
        
        double fahrenheit = 32 + (9 * celcius / 5);
        
        System.out.println("Los grados celcius a fahrenheit son: " + fahrenheit);
        
    }
    
}
