
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        
        System.out.println("Hola " + nombre + " de " + edad + " años. :)");
        
    }
    
}
