package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la longitud del vector: ");
        int n = input.nextInt();

        int[] vector = new int[n];
        RellenarVector(vector);
        MostrarVector(vector);

    }

    public static int[] RellenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50 + 1);
        }

        return vector;

    }
    
    public static void MostrarVector(int[] vector){
    
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
        
    }

}
