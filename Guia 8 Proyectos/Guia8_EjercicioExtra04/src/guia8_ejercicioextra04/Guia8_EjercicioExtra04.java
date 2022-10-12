package guia8_ejercicioextra04;

import Servicios.ServicioPostal;

public class Guia8_EjercicioExtra04 {

    public static void main(String[] args) {

        ServicioPostal sp = new ServicioPostal();
        System.out.println("Ingrese 10 ciudades con su respectivo codigo postal ...");
        for (int i = 1; i <= 10; i++) {
            sp.introducirCiudades();
        }
        System.out.println("-------------------------------------------------");
        sp.mostrarCiudades();
        System.out.println("-------------------------------------------------");

        System.out.println("-------------------------------------------------");
        sp.introducirCiudades();
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            sp.eliminarCiudad();
        }
        System.out.println("-------------------------------------------------");
        sp.mostrarCiudades();
    }

}
