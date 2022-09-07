package guia7_extra_ej01;

import Entidades.Cancion;
import Servicios.ServicioCancion;
import java.util.Scanner;

public class Guia7_Extra_Ej01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ServicioCancion sc = new ServicioCancion();
        Cancion song1 = sc.CrearCancion();
        System.out.println(song1);

    }

}
