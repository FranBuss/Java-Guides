package guia9_ejercicio03;

import Servicios.ServicioBaraja;

public class Guia9_Ejercicio03 {

    public static void main(String[] args) {
        
        ServicioBaraja sb = new ServicioBaraja();
        
        System.out.println("-------------------------------------------------");
        System.out.println("CREAR BARAJA");
        sb.crearBaraja();
        System.out.println("-------------------------------------------------");
        System.out.println("BARAJAR");
        sb.barajar();
        System.out.println("-------------------------------------------------");
        System.out.println("SIGUENTE CARTA");
        sb.siguienteCarta();
        System.out.println("-------------------------------------------------");
        System.out.println("DAR CARTAS");
        sb.darCartas();
        System.out.println("-------------------------------------------------");
        System.out.println("CARTAS DISPONIBLES");
        sb.cartasDisponibles();
        System.out.println("-------------------------------------------------");
        System.out.println("MOSTRAR CARTAS ENTREGADAS");
        sb.cartasMonton();
        System.out.println("-------------------------------------------------");
        System.out.println("MOSTRAR BARAJA");
        sb.mostrarBaraja();
        
        
//        baraja.crearBaraja();
        
//        baraja.mostrarBaraja();
        

    }

}
