
import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese un tipo de motor (Entre 1 y 4): ");
        tipoMotor = input.nextInt();
        
        switch (tipoMotor) {
        case 1:
            System.out.println("Bomba de agua");
            break;
        case 2:
            System.out.println("Bomba de gasolina");
            break;
        case 3:
            System.out.println("Bomba de hormigon");
            break;
        case 4:
            System.out.println("Bomba de pasta alimenticia");
            break;
        default:
            System.out.println("No existe un valor válido para tipo de bomba");
            break;
        }
        
    }
    
}
