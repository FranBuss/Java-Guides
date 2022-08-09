
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       
        double flotante;
        
        System.out.println("Ingrese un char: ");
        char caracter = input.next().charAt(0);
        System.out.println("char:" + caracter);
        System.out.println("");
        System.out.println("Ingrese un numero flotante: ");
        flotante = input.nextFloat();
        System.out.println("El flotante es: " + flotante);
        boolean logico = input.nextBoolean();
        System.out.println("El valor logico: " + logico);
        
    }
    
}
