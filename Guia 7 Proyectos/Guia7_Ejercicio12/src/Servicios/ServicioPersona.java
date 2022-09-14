/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class ServicioPersona {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    private final Date fecha = new Date();

    public Persona CrearPersona() {

        Date fechaNacimiento = new Date();
        System.out.println("Ingrese el Nombre de la persona: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        System.out.println("Ingrese dia: ");
        fechaNacimiento.setDate(input.nextInt());
        System.out.println("Ingrese mes: ");
        fechaNacimiento.setMonth(input.nextInt() - 1);
        System.out.println("Ingrese año: ");
        fechaNacimiento.setYear(input.nextInt() - 1900);
        return new Persona(nombre, fechaNacimiento);
        
    }

    public void calcularEdad(Persona p) {
        int edad = fecha.getYear() - p.getFechaNacimiento().getYear();
        System.out.println("La edad de la persona es: " + edad);
    }

    public boolean menorQue(Persona p, Date edad) {
        boolean esMenor = false;
        if (edad.after(p.getFechaNacimiento())) {
            esMenor = true;
        }
        return esMenor;
    }

    public void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre() + "\n"
                + "Fecha nacimiento: " + p.getFechaNacimiento().getDay()
                + " del " + (p.getFechaNacimiento().getMonth() + 1) + " del "
                + p.getFechaNacimiento().getYear());

    }

}
