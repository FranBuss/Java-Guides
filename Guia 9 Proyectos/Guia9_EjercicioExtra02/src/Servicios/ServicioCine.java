package Servicios;

import Entidades.*;
import Enum.Columna;
import java.util.*;

public class ServicioCine {

    Scanner input;
    ServicioPelicula servPeli;
    ArrayList<String> asientosLibres;

    public ServicioCine() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.servPeli = new ServicioPelicula();
        this.asientosLibres = new ArrayList<>();
    }

    public Cine AbrirCine() {

        //Creo la sala del cine con los respectivos asientos...
        Asiento sala[][] = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer numInt = 8 - i;
                String numString = numInt.toString();
                switch (j) {
                    case 0:
                        numString = numString.concat("A");
                        break;
                    case 1:
                        numString = numString.concat("B");
                        break;
                    case 2:
                        numString = numString.concat("C");
                        break;
                    case 3:
                        numString = numString.concat("D");
                        break;
                    case 4:
                        numString = numString.concat("E");
                        break;
                    case 5:
                        numString = numString.concat("F");
                        break;
                    default:
                        throw new AssertionError();
                }
                sala[i][j] = new Asiento(numString, null);
            }
        }

        //Se crea la pelicula que este en cartelera...
        Pelicula pelicula = servPeli.CrearPelicula();

        for (int i = 0; i < 8; i++) {
            for (Columna columna : Columna.values()) {
                String asiento = (8 - i) + columna.toString();
                asientosLibres.add(asiento);
            }
        }

        //Se le da precio a la pelicula
        System.out.println("Ingrese el precio de la pelicula en cartelera: ");
        System.out.print("Precio --> ");
        Integer precio = input.nextInt();
        input.nextLine();

        return new Cine(sala, pelicula, asientosLibres, precio);
    }

    public ArrayList<Espectador> crearFilaEspectadores() {

        ArrayList<Espectador> filaEspectadores = new ArrayList<>();
        int cantidadPosible = 25 + ((int) (Math.random() * 60));
        for (int i = 0; i < cantidadPosible; i++) {
            Espectador espectador = new Espectador("Espectador " + i, ((int) (Math.random() * 50 + 1)), ((int) (Math.random() * 2000 + 100)));
            filaEspectadores.add(espectador);
        }

        System.out.println("La cantidad personas en la fila para la pelicula es --> " + filaEspectadores.size());

        return filaEspectadores;
    }

    public Cine espectadores(Cine c, ArrayList<Espectador> filaEspectadores) {

        int rechazados = 0;
        int aceptados = 0;

        //Recorremos por cada posible espectador de la fila...
        for (Espectador espectador : filaEspectadores) {

            if (espectador.getEdad() >= c.getPelicula().getEdadMinima() && espectador.getDinero() >= c.getPrecio() && c.getAsientosLibres().size() > 0) {

                //Le sacamos el dinero y se lo damos al gobierno
                espectador.setDinero(espectador.getDinero() - c.getPrecio());

                //Le damos un asiento al señor
                int asientoRandom = (int) (Math.random() * c.getAsientosLibres().size());
                String ubicacion = c.getAsientosLibres().get(asientoRandom);
                c.getAsientosLibres().remove(asientoRandom);

                Asiento asientoVisual[][] = c.getSala();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (asientoVisual[i][j].getAsiento().equalsIgnoreCase(ubicacion)) {
                            asientoVisual[i][j].setEspectador(espectador);
                        }
                    }
                }
                aceptados++;
            } else {
                rechazados++;
            }
        }

        System.out.println("Espectadores de la pelicula --> " + aceptados);
        System.out.println("Fondos recaudados --> " + aceptados * c.getPrecio());
        System.out.println("Cantidad de gente que no pudo ver la pelicula --> " + rechazados);
        return c;
    }

    //Estado de la sala
    public void estadoSala(Cine c) {
        System.out.println("Pelicula --> " + c.getPelicula().getTitulo());
        System.out.println("Duracion --> " + c.getPelicula().getDuracion());
        Asiento asientoSala[][] = c.getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(asientoSala[i][j].toString());
            }
            System.out.println(" ");
        }
    }

    //Estado del asiento y mostrar los datos de la persona en caso que tenga una...
    public void estadoAsiento(Cine c) {

        Asiento asiento[][] = c.getSala();
        int controlAsiento = 0;
        System.out.println("Seleccione un asiento para ver el estado: ");
        String asientoBuscado = input.nextLine();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (asiento[i][j].getAsiento().equalsIgnoreCase(asientoBuscado)) {
                    controlAsiento++;
                    System.out.println("Informacion del espectador -- > " + asiento[i][j].getAsiento());
                    System.out.println(asiento[i][j].getEspectador().toString());
                    break;
                }
            }
        }

        if (controlAsiento == 0) {
            System.out.println("El asiento esta vacio ...");
            estadoAsiento(c);
        }

        System.out.println("Desea ver otro asiento? (S/N)");
        String opc = input.nextLine();
        if (opc.toUpperCase().equals("S") && !opc.toUpperCase().equals("N")) {
            estadoAsiento(c);
        }
    }

}
