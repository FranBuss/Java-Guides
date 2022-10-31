package Servicios;

import Entidades.Perro;
import java.util.Scanner;

public class ServicioPerro {

    Scanner input;

    public ServicioPerro() {
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public Perro crearPerro() {

        System.out.println("Ingrese nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese raza: ");
        String raza = input.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = input.nextInt();
        System.out.println("Ingrese el tamaño: ");
        float tamanio = input.nextFloat();
        input.nextLine();

        return new Perro(nombre, raza, edad, tamanio);
    }

    public void mostrarPerro(Perro p) {
        System.out.println(p);
    }

}
