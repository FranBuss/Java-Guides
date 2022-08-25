package guia7_ejercicio01.Servicios;

import guia7_ejercicio01.Entidades.Libro;
import java.util.Scanner;

public class ServicioLibro {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Libro CrearLibro(){
    
        System.out.println("Ingrese nombre del autor del libro: ");
        String autor = input.nextLine();
        
        System.out.println("Ingrese titulo del libro: ");
        String titulo = input.nextLine();
        
        System.out.println("Ingrese ISBN del libro: ");
        int isbn = input.nextInt();
        input.nextLine();
        
        System.out.println("Ingrese el numero de paginas del libro: ");
        int numPaginas = input.nextInt();
        input.nextLine();
        
        return new Libro(isbn, autor, titulo, numPaginas);
    }
    
}
