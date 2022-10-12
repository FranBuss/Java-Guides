package Servicios;

import java.util.*;

public class ServicioPostal {

    HashMap<Integer, String> listaCiudades;
    Scanner input;

    public ServicioPostal() {
        this.listaCiudades = new HashMap<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void introducirCiudades() {

        System.out.println("Ingrese el nombre de la ciudad --> ");
        String nombreCiudad = input.nextLine();
        System.out.println("Ingrese el codigo postal de " + nombreCiudad + " --> ");
        Integer cpCiudad = input.nextInt();
        listaCiudades.put(cpCiudad, nombreCiudad);

    }

    public void eliminarCiudad() {
        System.out.println("Ingrese ciudad a eliminar --> ");
        String eliminarCiudad = input.nextLine();
        for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
            if (entry.getValue().equals(eliminarCiudad)) {
                listaCiudades.remove(entry.getKey());
            }
        }
    }

    public void buscarCiudad() {
        String ciudadBuscada = input.nextLine();
        for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
            if (entry.getValue().equals(ciudadBuscada)) {
                System.out.println(entry.getKey());
            }
        }

    }

    public void mostrarCiudades() {
        for (Map.Entry<Integer, String> entry : listaCiudades.entrySet()) {
            System.out.println(entry + "\n");
        }
    }

}
