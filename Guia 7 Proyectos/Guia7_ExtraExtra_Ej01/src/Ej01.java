
import Entidades.Fraccion;
import java.util.Scanner;


public class Ej01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Fraccion f1 = new Fraccion();
        System.out.println("Ingrese la primer fraccion: ");
        f1.setDenominador1(input.nextInt());
        System.out.print(" / ");
        f1.setNumerador1(input.nextInt());
        System.out.println("Ingrese la segunda fraccion: ");
        f1.setDenominador2(input.nextInt());
        System.out.print(" / ");
        f1.setNumerador2(input.nextInt());
        
        int fraccion1 = (f1.getDenominador1()/f1.getNumerador1());
        int fraccion2 = (f1.getDenominador2()/f1.getNumerador2());
        
        do {
            System.out.println("--------------------");
            System.out.println("--      MENU      --");
            System.out.println("- 1 -> Sumar       -");
            System.out.println("- 2 -> Restar      -");
            System.out.println("- 3 -> Dividir     -");
            System.out.println("- 4 -> Multiplicar -");
            System.out.println("--------------------");
            int opc = input.nextInt();
            switch (opc) {
                case 1:
                    int suma = fraccion1 + fraccion2;
                    System.out.println("La suma de las fracciones -> " + suma);
                    break;
                case 2:
                    int resta = fraccion1 - fraccion2;
                    System.out.println("La resta de las fracciones -> " + resta);
                    break;
                case 3:
                    int division = (fraccion1 / fraccion2);
                    System.out.println("La division de las fracciones -> " + division);
                    break;
                case 4:
                    int multiplicacion = (fraccion1 * fraccion2);
                    System.out.println("La multiplicacion de las fracciones -> " + multiplicacion);
                    break;
                default:
                    System.out.println("Te equivocaste de opcion...");;
            }
            
            System.out.println("Desea continuar (SI/NO) ");
            String continuar = input.next();
            if (continuar.toUpperCase().equals("NO")) {
                break;
            }
            
        } while (true);
        

    }

}
