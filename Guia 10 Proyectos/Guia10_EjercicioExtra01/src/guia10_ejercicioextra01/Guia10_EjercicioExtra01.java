package guia10_ejercicioextra01;

import Entidades.Alquiler;
import Servicios.ServicioAlquiler;

public class Guia10_EjercicioExtra01 {

    public static void main(String[] args) {

        ServicioAlquiler servAlquiler = new ServicioAlquiler();
        Alquiler nuevoAlquiler = servAlquiler.crearAlquiler();
        System.out.println(servAlquiler.costoAlquiler(nuevoAlquiler));

    }

}
