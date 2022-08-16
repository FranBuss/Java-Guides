package guia6_ejerciciosbase;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int moneda;
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double cantidadEuros = input.nextDouble(); 
        input.nextLine();
        
        System.out.println("----------------------");
        System.out.println("--MENU DE CONVERSION--");
        System.out.println("----------------------");
        System.out.println("      1 - Dolares     ");
        System.out.println("      2 - Yenes       ");
        System.out.println("      3 - Libras      ");
        System.out.println("      4 - Salir       ");
        System.out.println("----------------------");
        
        do {
        System.out.println("Ingrese una opcion de conversion: ");
        moneda = input.nextInt();
        input.nextLine();
            switch (moneda) {
                case 1:
                    System.out.println("La cantidad de €" + cantidadEuros + " euros a dolares es: " + conversion(cantidadEuros, moneda));
                    break;
                case 2:
                    System.out.println("La cantidad de €" + cantidadEuros + " euros a yenes es: " + conversion(cantidadEuros, moneda));
                    break;
                case 3:
                    System.out.println("La cantidad de €" + cantidadEuros + " euros a libras es: " + conversion(cantidadEuros, moneda));
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("--ERROR--");
                    break;
            }
         } while(moneda != 4);
        
    }
    
    public static double conversion(double cantidadEuros, int moneda) {
        
        double convert = 0;
        
        switch (moneda) {
            case 1:
                //Dolares
                convert = cantidadEuros * 1.28611;
                break;
            case 2:
                //Yenes
                convert = cantidadEuros * 129.852;
                break;
            case 3:
                //Libras
                convert = cantidadEuros * 0.86;
                break;
        }
        
        return convert;
        
    }
    
}
