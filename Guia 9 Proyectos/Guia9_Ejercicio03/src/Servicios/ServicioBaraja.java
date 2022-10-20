package Servicios;

import Enumeration.Palo;
import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBaraja {

    private Baraja mazoInicial = new Baraja();
    private Baraja cartasEntregadas = new Baraja();

    ArrayList<Carta> cartasBaraja;
    ArrayList<Carta> cartaMano;
    Scanner input;

    public ServicioBaraja() {
        this.cartasBaraja = new ArrayList<>();
        this.cartaMano = new ArrayList<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public Baraja crearBaraja() {
        cartasEntregadas.setCartasBaraja(cartaMano);
        
        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 || i != 9) {
                    Carta carta = new Carta(i, palo);
                    cartasBaraja.add(carta);
                }
            }
        }
        
        mazoInicial.setCartasBaraja(cartasBaraja);
        return mazoInicial;
    }

    public void barajar() {
        Collections.shuffle(mazoInicial.getCartasBaraja());
    }

    public void siguienteCarta() {
        System.out.println("La siguiente carta es --> " + mazoInicial.getCartasBaraja().get(0));
    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es --> " + mazoInicial.getCartasBaraja().size());
    }

    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas a dar --> ");
        int cantCartas = input.nextInt();

        if (cantCartas <= mazoInicial.getCartasBaraja().size()) {
            for (int i = 0; i < cantCartas; i++) {
                System.out.println("Carta entregada --> " + mazoInicial.getCartasBaraja().get(i).toString());
            }
            for (int i = 0; i < cantCartas; i++) {
                cartasEntregadas.getCartasBaraja().add(mazoInicial.getCartasBaraja().get(0));
                mazoInicial.getCartasBaraja().remove(0);
            }
        } else {
            System.out.println("No tenes las cantidad de cartas necesarias mostro...");
            System.out.println("Estas son las cartas disponibles --> ");
            cartasDisponibles();
        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartasBaraja().isEmpty()) {
            System.out.println("No se entrego ninguna carta hasta el momento...");
        } else {
            System.out.println("-- Cartas retiradas --");
            for (Carta carta : mazoInicial.getCartasBaraja()) {
                System.out.println(carta);
                System.out.println("-----------------------------------------");
            }
        }
    }

    public void mostrarBaraja() {
        if (mazoInicial.getCartasBaraja().isEmpty()) {
            System.out.println("No quedan cartas en el mazo principal...");
        } else {
            System.out.println("-- Cartas en mazo Principal --");
            for (Carta carta : mazoInicial.getCartasBaraja()) {
                System.out.println(carta);
                System.out.println("-----------------------------------------");
            }
        }
    }

}
