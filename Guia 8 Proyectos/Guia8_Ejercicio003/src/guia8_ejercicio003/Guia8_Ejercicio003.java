package guia8_ejercicio003;

import Entidades.Libro;
import Servicios.ServicioLibro;
import java.util.*;

public class Guia8_Ejercicio003 {

    public static void main(String[] args) {
        
        ServicioLibro sl = new ServicioLibro();
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<Libro> libros = new ArrayList();
        
        System.out.println("Ingrese la cantidad de libros a guardar: ");
        int cantLibros = input.nextInt();
        
        for (int i = 0; i < cantLibros; i++) {
            System.out.println("-------------------------------------");
            System.out.println("Libro Nro° : " + i);
            Libro nuevoLibro = sl.CrearLibro();
            libros.add(nuevoLibro);
            System.out.println("-------------------------------------");
        }
        
        for (Libro ejemplar : libros) {
            System.out.println(ejemplar);
        }
        
    }

}
