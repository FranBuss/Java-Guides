package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int n = input.nextInt();
        input.nextLine();
        int [] vector = new int [n];
        
        System.out.println("Ingrese un numero a buscar dentro del vector: ");
        int x = input.nextInt();
        input.nextLine();
        
        //Rellenamos el vector de numeros aleatorios
        //Aleatorio de 1 a 50
        for (int i = 0; i < vector.length - 1 ; i++) {
            vector[i] = (int) (Math.random()*10+1);
        }
        
        //Buscamos el vector y vemos si se repite
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] == x && contador == 0) {
                System.out.println("Se encontro el numero dentro del vector [" + i + "] ");
                contador++;
            } else if (contador >= 1 && vector[i] == x) {
                System.out.println("Se encontro el numero dentro del vector [" + i + "] ");
            }
        } 
        
        System.out.println("El numero se encontro " + contador + " veces...");
        
        for (int i = 0; i < vector.length - 1; i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
    }
    
}
