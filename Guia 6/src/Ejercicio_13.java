
import java.util.Scanner;


public class Ejercicio_13 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
   
        System.out.println("Ingrese la cantidad de personas que integran el equipo: ");
        int n = input.nextInt();

        String[] equipo = new String[n];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese un nombre: ");
            equipo[i] = input.next();
        }
            
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Los nombres por orden " + (i+1) + " : " + equipo[i]);
        }
        
    }
    
}
