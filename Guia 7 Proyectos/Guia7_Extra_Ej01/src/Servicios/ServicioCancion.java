package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

public class ServicioCancion {
    
    private final Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion CrearCancion(){
        
        System.out.println("-----     CREAR CANCION    -----");
        System.out.println("Ingrese el titulo de la cancion: ");
        String titulo = input.nextLine();
        System.out.println("Ingrese el autor de la cancion:  ");
        String autor = input.nextLine();
        
        return new Cancion(titulo, autor);
    }

}
