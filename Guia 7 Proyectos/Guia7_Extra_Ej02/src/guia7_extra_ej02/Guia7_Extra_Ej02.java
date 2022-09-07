package guia7_extra_ej02;

import Entidades.Puntos;
import Servicios.ServicioPuntos;

public class Guia7_Extra_Ej02 {

    public static void main(String[] args) {
        
        ServicioPuntos sp = new ServicioPuntos();
        
        Puntos puntitos = sp.CrearPunto();
        
        System.out.println("La distancia entre los puntos es: " + puntitos.distanciaPuntos(puntitos));

    }

}
