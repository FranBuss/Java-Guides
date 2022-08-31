package guia7_ejercicio06;

import Entidades.Cafetera;
import Servicios.ServicioCafetera;
import java.util.Scanner;

public class Guia7_Ejercicio06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ServicioCafetera sc = new ServicioCafetera();

        Cafetera cafe1 = sc.LlenarCafetera();

        int opc;

        System.out.println("--------------------------");
        System.out.println("--> 1 - llenar cafetera --");
        System.out.println("--> 2 - Servir taza     --");
        System.out.println("--> 3 - Vaciar cafetera --");
        System.out.println("--> 4 - Agregar cafe    --");
        System.out.println("--> 0 - Salir           --");
        System.out.println("--------------------------");

        do {

            System.out.println("Ingrese una opcion: ");
            opc = input.nextInt();
            input.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Volvera llenar la cafetera hasta el limite...");
                    cafe1 = sc.LlenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza que va a usar");
                    System.out.println("Grande || Mediano || Chico");
                    System.out.print("-->");
                    int taza = sc.servirTaza(input.nextLine(), cafe1.getCapacidadActual());
                    cafe1.setCapacidadActual(cafe1.getCapacidadActual() - taza);
                    break;
                case 3:
                    cafe1.setCapacidadActual(sc.vaciarCafetera());
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe a agregar...");
                    cafe1.setCapacidadActual(sc.agregarCafe(input.nextInt(), cafe1.getCapacidadMaxima()));
                    break;
                case 0:
                    System.out.println("Gracias por usar la cafetera Nespresso ;)");
                    break;

                default:
                    System.out.println("...Te equivocaste de opcion mi rey...");
            }

        } while (opc != 0);
        
        System.out.println(cafe1);

    }

}
