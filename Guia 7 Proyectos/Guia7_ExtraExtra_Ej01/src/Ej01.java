
import Entidades.Fraccion;
import java.util.Scanner;


public class Ej01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Fraccion f1 = new Fraccion();
        System.out.println("Ingrese la primer fraccion: ");
        f1.setDenominador(input.nextInt());
        System.out.print(" / ");
        f1.setNumerador(input.nextInt());
        Fraccion f2 = new Fraccion();
        System.out.println("Ingrese la segunda fraccion: ");
        f2.setDenominador(input.nextInt());
        System.out.print(" / ");
        f2.setNumerador(input.nextInt());
        
        Fraccion c = new Fraccion();
        
        
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
                    c.sumar(f1, f2);
                    System.out.println("La suma de las fracciones -> " + c);
                    break;
                case 2:
                    c.restar(f1, f2);
                    System.out.println("La resta de las fracciones -> " + c);
                    break;
                case 3:
                    c.dividir(f1, f2);
                    System.out.println("La division de las fracciones -> " + c);
                    break;
                case 4:
                    c.multiplicar(f1, f2);
                    System.out.println("La multiplicacion de las fracciones -> " + c);
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
