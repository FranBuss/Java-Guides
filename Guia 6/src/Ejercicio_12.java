
import java.util.Scanner;


public class Ejercicio_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        EsMultiplo(num1, num2);

    }
   
    public static void EsMultiplo (int num1, int num2) {
        
        if (num1 % num2 == 0) {
            System.out.println("El numero " + num1 +" es multiplo de " + num2);
        }else {
            System.out.println("El numero " + num1 +" no es multiplo de " + num2);
        }
            
    }
    
}
