package guia8_ejercicio03;

import Servicios.ServicioAlumno;
import java.util.Scanner;

public class Guia8_Ejercicio03 {

    public static void main(String[] args) {
        
        ServicioAlumno sa = new ServicioAlumno();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("--SISTEMA ESCOLAR--");
        System.out.println("Ingrese alumnos: ");
        sa.cargarAlumno();
        System.out.println("Ingrese un alumno para averiguar su nota final: ");
        String alumnoRequerido = input.nextLine();
        sa.notaFinal(alumnoRequerido);

    }

}
