package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vector1 = new int[10];
        int[] vector2 = new int[10];

        for (int i = 0; i < vector1.length; i++) {
//            System.out.println("Vector 1, posicion " + i + " :" );
//            vector1[i] = input.nextInt();
            vector1[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < vector2.length; i++) {
//            System.out.println("Vector 2, posicion " + i + " :" );
//            vector2[i] = input.nextInt();
            vector2[i] = (int) (Math.random() * 50);
        }

        for (int i = 0; i < vector1.length; i++) {
            System.out.print(" [" + vector1[i] + "] ");
        }
        System.out.println("");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(" [" + vector2[i] + "] ");
        }
        
        for (int i = 0; i < 10; i++) {
            if (vector1[i] != vector2[i]) {
                break;
                
            }
        }

    }

}
