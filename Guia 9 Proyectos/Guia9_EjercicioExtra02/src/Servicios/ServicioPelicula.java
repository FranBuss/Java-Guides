package Servicios;

import Entidades.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {

    Scanner input;

    public ServicioPelicula() {
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public Pelicula CrearPelicula() {

        System.out.println("Ingrese los siguientes datos...");
        System.out.print("Titulo --> ");
        String titulo = input.nextLine();
        System.out.print("Duracion (en minutos) --> ");
        int duracion = input.nextInt();
        System.out.print("Edad minima requerida --> ");
        int edadMinima = input.nextInt();
        input.nextLine();
        System.out.print("Director de la pelicula --> ");
        String director = input.nextLine();

        return new Pelicula(titulo, duracion, edadMinima, director);
    }

}
