package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int cifras, num;
        
        System.out.println("Ingrese el tamaño del vector: ");
        int n = input.nextInt();
        input.nextLine();
        int [] vector = new int[n];
        
        //Se generan y guardan datos en el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*1000+1);
        }
        
        //Se leen los datos que estan en el vector y se cuentan la cantidad de cifras
        for (int i = 0; i < vector.length; i++) {     
            cifras= 0;   
            while(vector[i]!=0){            
                System.out.println("vector " + i + " : " + vector[i]);
                vector[i] = vector[i]/10;         
                cifras++;        
            }
            System.out.println("cifras: " + cifras);
        }
        
    }
    
}
