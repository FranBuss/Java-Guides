
import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = input.nextInt();
        
        while (num <= 0 || num >= 10) {
        
            System.out.println("El numero no se encuentra entre el rango 1 y 10");
            System.out.println("Ingrese otro numero...");
            num = input.nextInt();
            
        }
        
    }
    
}
