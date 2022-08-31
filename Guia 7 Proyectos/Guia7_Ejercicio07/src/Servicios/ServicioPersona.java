package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona CrearPersona() {

        System.out.println("---------CREACION DE PERSONA---------");
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese su Sexo (H = Hombre || M = Mujer): ");
        String sexo = input.nextLine();
        System.out.println("Ingrese su peso: ");
        float peso = input.nextFloat();
        System.out.println("Ingrese su altura: ");
        float altura = input.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int CalcularIMC(Persona Persona) {

        int imc = 0;
        double valorIMC = Persona.getPeso() / (Math.pow(Persona.getAltura(), 2));
        if (valorIMC < 20) {
            System.out.println("La persona esta por debajo de su peso ideal...");
            imc = -1;
        } else if (valorIMC > 20 && valorIMC < 25) {
            System.out.println("La persona esta en su peso ideal...");
            imc = 0;
        } else if (valorIMC > 25) {
            System.out.println("La persona tiene sobrepeso...");
            imc = 1;
        }

        return imc;
    }

    public boolean esMayorDeEdad(Persona Persona) {

        boolean esMayor = false;
        int edad = Persona.getEdad();

        if (edad > 18) {
            esMayor = true;
        }

        return esMayor;
    }

}
