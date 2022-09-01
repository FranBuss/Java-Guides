package guia7_ejercicio07;

import Entidades.Persona;
import Servicios.ServicioPersona;

public class Guia7_Ejercicio07 {

    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();

        Persona persona1 = sp.CrearPersona();
        Persona persona2 = sp.CrearPersona();
        Persona persona3 = sp.CrearPersona();
        Persona persona4 = sp.CrearPersona();

        boolean personaEdad1 = sp.esMayorDeEdad(persona1);
        boolean personaEdad2 = sp.esMayorDeEdad(persona2);
        boolean personaEdad3 = sp.esMayorDeEdad(persona3);
        boolean personaEdad4 = sp.esMayorDeEdad(persona4);
        int personaPeso1 = sp.CalcularIMC(persona1);
        int personaPeso2 = sp.CalcularIMC(persona2);
        int personaPeso3 = sp.CalcularIMC(persona3);
        int personaPeso4 = sp.CalcularIMC(persona4);

        int cantMayores = 0;
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        
    }

    public int contadorMayores(boolean personaEdad) {
        int sumador = 0;
        if (personaEdad) {
            return sumador++;
        }
        return sumador;
    }
}
