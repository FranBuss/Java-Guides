package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.*;

public class ServicioPelicula {

    ArrayList<Pelicula> listaPeliculas;
    Scanner input;

    public ServicioPelicula() {
        this.listaPeliculas = new ArrayList<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearPelicula() {
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Ingrese Nombre de pelicula: ");
            String nombrePelicula = input.nextLine();
            System.out.println("Ingrese nombre de autor: ");
            String autor = input.nextLine();
            System.out.println("Ingrese la duracion de la pelicula: ");
            int duracionPelicula = input.nextInt();
            input.nextLine();
            System.out.println("---------------------------------------");

            listaPeliculas.add(new Pelicula(nombrePelicula, autor, duracionPelicula));

            System.out.println("---------------------------------------");
            System.out.println("Desea seguir agregando peliculas? (S/N)");
            String opc = input.nextLine();
            if (opc.toLowerCase().equals("n")) {
                break;
            }
            System.out.println("---------------------------------------");
        }
    }

    public void ordernarAutores() {
        //ASI NO -->
//        Comparator<Pelicula> compararAutor = (Pelicula p, Pelicula p1) -> p.getAutor().compareTo(p1.getAutor());
        //ASI SI -->
        Collections.sort(listaPeliculas, Comparadores.compararAutor);
        System.out.println("Peliculas en orden de autores: ");
        System.out.println(listaPeliculas);
        System.out.println("---------------------------------------");
    }

    public void ordernarTitulos() {
//        Comparator<Pelicula> compararTitulo = (Pelicula p, Pelicula p1) -> p.getAutor().compareTo(p1.getAutor());
        Collections.sort(listaPeliculas, Comparadores.compararTitulo);
        System.out.println("Peliculas en orden de Titulos: ");
        System.out.println(listaPeliculas);
        System.out.println("---------------------------------------");
    }

    public void ordernarDuracionAscendente() {
//        Comparator<Pelicula> compararDuracion = (Pelicula p, Pelicula p1) -> p.getDuracion() - p1.getDuracion();
        Collections.sort(listaPeliculas, Comparadores.compararDuracion);
        System.out.println("Peliculas en orden de duracion Ascendente: ");
        System.out.println(listaPeliculas);
        System.out.println("---------------------------------------");
    }

    public void ordernarDuracionDescendente() {
//        Comparator<Pelicula> compararDuracion = (Pelicula p, Pelicula p1) -> p1.getDuracion() - p.getDuracion();
        Collections.sort(listaPeliculas, Comparadores.compararDuracion.reversed());
        System.out.println("Peliculas en orden de duracion Descendente: ");
        System.out.println(listaPeliculas);
        System.out.println("---------------------------------------");
    }

    public void imprimirPeliculas() {
        System.out.println("Todas las peliculas: ");
        System.out.println(listaPeliculas);
        System.out.println("---------------------------------------");
    }

    public void imprimirPeliculasMayorHoras() {
        ArrayList<Pelicula> listaPeliculasMayor = new ArrayList<>();

        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                listaPeliculasMayor.add(pelicula);
            }
        }
        System.out.println("Peliculas con duracion mayor a 1 hora:");
        System.out.println(listaPeliculasMayor);
        System.out.println("---------------------------------------");
    }

}
