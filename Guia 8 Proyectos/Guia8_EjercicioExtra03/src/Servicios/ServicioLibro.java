package Servicios;

import Entidades.Libro;
import java.util.*;

public class ServicioLibro {

    HashSet<Libro> listaLibros;
    Scanner input;

    public ServicioLibro() {
        this.listaLibros = new HashSet<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearLibro() {
        System.out.println("Ingrese Titulo del libro --> ");
        String titulo = input.nextLine();
        System.out.println("Ingrese nombre del autor --> ");
        String autor = input.nextLine();
        listaLibros.add(new Libro(titulo, autor));
    }

    public boolean prestamo() {
        Iterator<Libro> it = listaLibros.iterator();
        boolean prestamoConfirmado = false;
        System.out.println("Ingrese el nombre del libro a retirar --> ");
        String titulo = input.nextLine();
        while (it.hasNext()) {
            Libro next = it.next();
            if (next.getTitulo().equals(titulo) && next.getEjemplares() > 0) {
                next.setEjemplaresPrestados(next.getEjemplaresPrestados() + 1);
                next.setEjemplares(next.getEjemplares() - 1);
                prestamoConfirmado = true;
                break;
            }
        }
        return prestamoConfirmado;
    }

    public boolean devolucion() {
        Iterator<Libro> it = listaLibros.iterator();
        boolean devolucionConfirmada = false;
        System.out.println("Ingrese el nombre del libro a devolver --> ");
        String titulo = input.nextLine();
        while (it.hasNext()) {
            Libro next = it.next();
            if (next.getTitulo().equals(titulo) && next.getEjemplaresPrestados() > 0) {
                next.setEjemplares(next.getEjemplares() + 1);
                next.setEjemplaresPrestados(next.getEjemplaresPrestados() - 1);
                devolucionConfirmada = true;
                break;
            }
        }
        return devolucionConfirmada;
    }

    public void imprimirLibros() {
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro + "\n");
        }
    }

    public void menuLibreria() {

        int opc;
        do {
            System.out.println("1 --> Ingresar un libro");
            System.out.println("2 --> Pedir un ejemplar de libro");
            System.out.println("3 --> Devolver un ejemplar de libro");
            System.out.println("4 --> Mostrar libros");
            System.out.println("5 --> Salir");
            System.out.println("Ingrese una opcion...");
            opc = input.nextInt();
            input.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("AÑADIR LIBRO --> ");
                    CrearLibro();
                    break;
                case 2:
                    System.out.println("PEDIR LIBRO --> ");
                    prestamo();
                    break;
                case 3:
                    System.out.println("DEVOLVER LIBRO -->");
                    devolucion();
                    break;
                case 4:
                    System.out.println("MOSTRAR LIBROS --> ");
                    imprimirLibros();
                    break;
                case 5:
                    System.out.println("Gracias por usar la Libreria virtual...");
                    break;
                default:
                    System.out.println("Le pifiaste de tecla mostro...");
                    ;
            }
        } while (opc != 5);

    }

}
