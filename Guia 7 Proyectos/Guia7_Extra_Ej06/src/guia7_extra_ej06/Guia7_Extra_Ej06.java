package guia7_extra_ej06;

import Entidades.Ahorcado;
import Servicios.ServicioAhorcado;
//import java.util.Scanner;

public class Guia7_Extra_Ej06 {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado nuevaPartida = sa.CrearAhorcado();
        
        System.out.println(nuevaPartida);
        sa.juego(nuevaPartida);


    }

}
