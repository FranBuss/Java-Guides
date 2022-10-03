package guia8_ejercicio04;

import Servicios.ServicioPelicula;

public class Guia8_Ejercicio04 {

    public static void main(String[] args) {

        ServicioPelicula sp = new ServicioPelicula();
        
        sp.CrearPelicula();
        sp.imprimirPeliculas();
        sp.imprimirPeliculasMayorHoras();
        sp.ordernarDuracionDescendente();
        sp.ordernarDuracionAscendente();
        sp.ordernarTitulos();
        sp.ordernarAutores();
        
    }

}
