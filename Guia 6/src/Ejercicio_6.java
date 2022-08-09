
import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.print("Ingrese el numero 1: ");
        num1 = input.nextInt();
        System.out.print("Ingrese el numero 2: ");
        num2 = input.nextInt();
        
        if (num1 > 25 || num2 > 25){
            System.out.println("Ambos o uno de ellos es mayor a 25");
        } else {
            System.out.println("Son menores a 25");
        }
             
    }
    
}
