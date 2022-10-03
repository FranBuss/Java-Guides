package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Libro CrearLibro(){
        
        System.out.println("CREAR LIBRO: ");
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = input.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        String autor = input.nextLine();
        
        return new Libro(titulo, autor);
    }
    
}
