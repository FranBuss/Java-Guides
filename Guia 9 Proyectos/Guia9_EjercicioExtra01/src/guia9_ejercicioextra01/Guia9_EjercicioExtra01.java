package guia9_ejercicioextra01;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.ServicioPerro;
import Servicios.ServicioPersona;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia9_EjercicioExtra01 {

    public static void main(String[] args) {

        ServicioPersona serPerso = new ServicioPersona();
        ServicioPerro serPerro = new ServicioPerro();

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        ArrayList<Perro> listaPerritos = new ArrayList<>();

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Creamos las mascotas");
        for (int i = 0; i < 2; i++) {
            listaPerritos.add(serPerro.crearPerro());
        }

        System.out.println("Creamos las personas");
        for (int i = 0; i < 2; i++) {
            listaPersonas.add(serPerso.crearPersona());
            System.out.println("Esta es la lista de perros en adopcion: ");
            for (Perro perrito : listaPerritos) {
                serPerro.mostrarPerro(perrito);
            }
            System.out.println("Desea adoptar a un perro? (S/N)");
            String opc = input.nextLine();
            if (!opc.toUpperCase().equals("N") && opc.toUpperCase().equals("S")) {
                System.out.println("Ingrese el nombre del perro a adoptar: ");
                String perroAdoptar = input.nextLine();
                for (Perro perrito : listaPerritos) {
                    if (!perrito.isAdoptado() && perroAdoptar.equals(perrito.getNombre())) {
                        serPerso.aniadirMascota(listaPersonas.get(i), perrito);
                    } else if (perrito.isAdoptado()) {
                        System.out.println("Ya esta en adopcion mostro...");
                    }
                }

            }
        }

        System.out.println("-------------------------------------------------");
        for (Persona personita : listaPersonas) {
            serPerso.mostrarPersona(personita);
        }
        System.out.println("-------------------------------------------------");

    }

}
