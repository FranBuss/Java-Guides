package Entidades;

import java.util.*;

public class Baraja {

    private ArrayList<Carta> cartasBaraja;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> cartasBaraja) {
        this.cartasBaraja = cartasBaraja;
    }

    public ArrayList<Carta> getCartasBaraja() {
        return cartasBaraja;
    }

    public void setCartasBaraja(ArrayList<Carta> cartasBaraja) {
        this.cartasBaraja = cartasBaraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartasBaraja=" + cartasBaraja + '}';
    }
    
    

}
