package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del bucle: ");
        int n = input.nextInt();
        input.nextLine();

        int contador = 0;
        int mayor = 0;
        int menor = 0;
        int suma = 0;
        int promedio;

        //Do While
//        do {
//
//            System.out.println("Ingrese un numero: ");
//            int num = input.nextInt();
//            if (contador == 0) {
//                menor = num;
//            } else if (num > mayor && contador >= 1) {
//                mayor = num;
//            } else if (num < menor) {
//                menor = num;
//            }
//            if (num > 0) {
//                suma += num;
//            }
//            contador++;
//        } while (contador != n);
//   
        //While 
        while (n != contador) {
            System.out.println("Ingrese un numero: ");
            int num = input.nextInt();
            if (contador == 0) {
                menor = num;
            } else if (num > mayor && contador >= 1) {
                mayor = num;
            } else if (num < menor) {
                menor = num;
            }
            if (num > 0) {
                suma += num;
            }
            contador++;
        }

        promedio = suma / n;
        System.out.println("El numero mayor fue: " + mayor);
        System.out.println("El numero menor fue: " + menor);
        System.out.println("El promedio de los numeros es: " + promedio);
    }

}
