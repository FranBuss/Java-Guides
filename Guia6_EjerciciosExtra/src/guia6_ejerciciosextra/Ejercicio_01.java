package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        
        int horas = 0;
        int dias = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos: ");
        
        int minutos = input.nextInt();
        input.nextLine();
        
        horas = minutos / 60;
        dias = minutos / 1440;
        if (horas > 24 && dias >= 1) {
            horas = horas - (24*dias);
        }
   
        System.out.println("Son " + dias + " y " + horas + "!");

    }
    
}
