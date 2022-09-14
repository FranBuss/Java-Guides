package guia7_ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Guia7_Ejercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("-------------------");

        Date fechaCreada = new Date();
        
        System.out.println("Ingrese dia: ");
        fechaCreada.setDate(input.nextInt());
        System.out.println("Ingrese mes: ");
        fechaCreada.setMonth(input.nextInt() - 1);
        System.out.println("Ingrese año: ");
        fechaCreada.setYear(input.nextInt() - 1900);
        
        Date fechaActual = new Date();
        
        int anios = fechaActual.getYear() - fechaCreada.getYear();

        System.out.println("Fecha creada: " + fechaCreada);
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Los años entre la creada y la actual es: " + anios);

    }

}
