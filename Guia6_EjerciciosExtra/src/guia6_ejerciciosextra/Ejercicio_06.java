package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int bajitos = 0;
        double sumaBajitos = 0;
        double sumaTotales = 0;
        System.out.println("Ingrese la cantidad de personas: ");
        n = input.nextInt();
        float [] personas = new float [n];
        
        for (int i = 0; i < personas.length; i++) {
            personas[i] = (float) (Math.random()*1+1);
        }
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] < 1.6) {
                bajitos++;
                sumaBajitos += personas[i];
            } 
            sumaTotales += personas[i];
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.printf("persona " + i + " tiene una altura de " + "%.2f", personas[i]);
            System.out.println("");
            System.out.println("----------------------------------------------------");
        }
        
        double promedioBajos = (sumaBajitos / bajitos) * 1;
        double promedioTotal = (sumaTotales / n) * 1;
        System.out.printf("El promedio de la estatura de gente baja es\n"
                + ": " + "%.2f", promedioBajos);
        System.out.println("");
        System.out.printf("El promedio total de altura es: " + "%.2f", promedioTotal);
        System.out.println("");
        
    }
    
}
