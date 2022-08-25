package guia7_ejercicio01;

import guia7_ejercicio01.Entidades.Libro;
import guia7_ejercicio01.Servicios.ServicioLibro;
import java.util.Scanner;

public class Libreria {
    
    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServicioLibro libro = new ServicioLibro();
        
        Libro libro1 = libro.CrearLibro();
        
        System.out.println(libro1);
        
    }

}
