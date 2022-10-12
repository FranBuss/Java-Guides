package guia8_ejercicioextra02;

import Entidades.CantanteFamoso;
import java.util.*;

public class Guia8_EjercicioExtra02 {

    public static void main(String[] args) {

        ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        //Añadidos cantantes / Bandas -->
        listaCantantes.add(new CantanteFamoso("Chester Bennington", "Meteora"));
        listaCantantes.add(new CantanteFamoso("Chris Cornell", "Carry on"));
        listaCantantes.add(new CantanteFamoso("Corey Taylor", "On the dark side"));
        listaCantantes.add(new CantanteFamoso("Gustavo Cerati", "Fuerza natural"));
        listaCantantes.add(new CantanteFamoso("Korn", "Follow the leader"));
        listaCantantes.add(new CantanteFamoso("Blink 184", "Enema of the state"));

        //For each -->
        listaCantantes.forEach((listaCantante) -> {
            System.out.println(listaCantante);
        });

        //Menu con  bucle -->
        int opc;
        do {
            System.out.println("1 --> Añadir Cantante / Banda y Disco mas vendido...");
            System.out.println("2 --> Eliminar Cantante / Banda...");
            System.out.println("3 --> Mostrar Cantantes / Bandas...");
            System.out.println("4 --> Salir... ");
            System.out.println("Ingrese una opcion --> ");
            opc = input.nextInt();
            input.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del Cantante / Banda --> ");
                    String nombre = input.nextLine();
                    System.out.println("Ingrese nombre del disco mas vendido --> ");
                    String nombreDisco = input.nextLine();
                    listaCantantes.add(new CantanteFamoso(nombre, nombreDisco));
                    break;
                case 2:
                    Iterator<CantanteFamoso> it = listaCantantes.iterator();
                    String buscar = input.nextLine();
                    while (it.hasNext()) {
                        CantanteFamoso next = it.next();
                        if (next.getNombre().equals(buscar)) {
                            it.remove();
                        }
                    }
                    break;
                case 3:
                    listaCantantes.forEach((listaCantante) -> {
                        System.out.println(listaCantante);
                    });
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa...");
                    break;
                default:
                    System.out.println("Le pifiaste de tecla mostro...");
                    ;
            }
        } while (opc != 4);

        listaCantantes.forEach((listaCantante) -> {
            System.out.println(listaCantante);
        });

    }

}
