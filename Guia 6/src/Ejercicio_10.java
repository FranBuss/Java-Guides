
import java.util.Scanner;


public class Ejercicio_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int cantNumero = 0;
        int num;
        
        while (cantNumero != 4){
        
            System.out.println("Ingrese un numero: ");
            num = input.nextInt();
            
            if (num >= 1 && num <= 20){
                System.out.print(num + " ");
                for (int i = 0; i < num; i++){
                     System.out.print("*");  
                }
                System.out.println("");
            }
            
            cantNumero++;
        }

    }
    
}
