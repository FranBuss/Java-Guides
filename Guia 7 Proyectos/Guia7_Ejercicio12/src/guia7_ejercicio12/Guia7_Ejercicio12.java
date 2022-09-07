package guia7_ejercicio12;

import Entidades.Persona;
import Servicios.ServicioPersona;
import java.util.Date;
import java.util.Scanner;

public class Guia7_Ejercicio12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.CrearPersona();
        
        System.out.println(p1);
        sp.calcularEdad(p1);
        
        System.out.println("Ingrese los datos de una Segunda persona para ver si es menor: ");
        Date persona2 = new Date();
        System.out.println("Ingrese dia: ");
        persona2.setDate(input.nextInt());
        System.out.println("Ingrese mes: ");
        persona2.setMonth(input.nextInt() - 1);
        System.out.println("Ingrese año");
        persona2.setYear(input.nextInt());
        
        System.out.println(sp.menorQue(p1, persona2));
        
        sp.mostrarPersona(p1);
        
    }
    
}
