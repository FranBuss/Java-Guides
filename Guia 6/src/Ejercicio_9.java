
import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int contador = 1;
        int num;
        int suma = 0;
        boolean exit = false;
   
        
        do {
        
            System.out.println("Ingrese un numero: ");
            num = input.nextInt();
            if (num != 0 && contador < 20) {
                suma += num;
            } else if (num < 0) {
                System.out.println("El numero es negativo, no se suma...");
            } else if (contador == 20 || num == 0){
                break;
            }
            contador++;
            
        } while (contador != 20 || num == 0);
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
        
    }
    
}
