package guia8_ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.List;
import java.util.Scanner;

public class Guia8_Ejercicio01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> perros = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese una raza de perro: ");
            String raza = input.nextLine();
            perros.add(raza);
            System.out.println("Desea continuar agregando razas? (S/N)");
            String opc = input.nextLine();
            if (opc.toUpperCase().equals("N")) {
                break;
            }
        }

        //El iterator se tiene que generar despues de que se creo el arreglo
        Iterator<String> it = perros.iterator();

        System.out.println("Que raza estas buscando para eliminar? ");
        String eliminarRaza = input.nextLine();
        while (it.hasNext()) {
            String perro = it.next();
            if (perro.equals(eliminarRaza)) {
                System.out.println("La raza se encontro y se elimino...");
                it.remove();
            }
        }

        //Otra forma de borrar elementos de un ArrayList --> Funciona mejor para el mismo
        //Programacion funcional uwu
//        perros.removeIf(perro -> (perro.equals(eliminarRaza)));

        //Se ordena y se muestra
        Collections.sort(perros);
        System.out.println(perros);

    }

}
