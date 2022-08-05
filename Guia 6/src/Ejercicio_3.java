
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese numero 1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        num2 = leer.nextInt();
        
        int resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
    
}
