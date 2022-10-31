package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    Scanner input;
    ArrayList<Perro> listaPerro;

    public ServicioPersona() {
        this.listaPerro = new ArrayList<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre y apellido: ");
        System.out.print("Nombre --> ");
        String nombre = input.nextLine();
        System.out.print("Apellido --> ");
        String apellido = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        System.out.println("Ingrese documento: ");
        int documento = input.nextInt();
        input.nextLine();
        return new Persona(nombre, apellido, edad, documento);
    }

    public void aniadirMascota(Persona persona, Perro perro) {
        listaPerro.add(perro);
        perro.setAdoptado(true);
        persona.setListaPerros(listaPerro);
    }

    public void mostrarPersona(Persona p) {
        System.out.println(p);
    }

}
