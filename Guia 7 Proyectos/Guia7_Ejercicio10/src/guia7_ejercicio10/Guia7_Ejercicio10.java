//Rehacer de nuevo
package guia7_ejercicio10;

import java.util.Arrays;

public class Guia7_Ejercicio10 {

    public static void main(String[] args) {

        //Creo los arreglos
        double[] arr1 = new double[50];
        double[] arr2 = new double[20];
        double aux;

        //Creo los numeros en el arreglo 1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (double) (Math.random() * 50);
        }

        //Ordeno de mayor a menor
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    aux = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = aux;
                }
            }
        }
        
        System.out.println("Este arreglo esta ordenado por clase ARRAYS : ");
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" [" + arr1[i] + "] ");
        }


        for (int i = 0; i < arr2.length / 2; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = arr2.length / 2; i < arr2.length; i++) {
            arr2[i] = 0.5;
        }

        //Mostrar arreglo 1
        System.out.println("");
        mostrarArreglo(arr1);
        System.out.println("");
        mostrarArreglo(arr2);

    }

    public static void mostrarArreglo(double[] a) {
        for (double elem : a) {
            String num = "" + elem;
            System.out.print(num.format("%.2f", elem) + " | ");
        }
    }

}
