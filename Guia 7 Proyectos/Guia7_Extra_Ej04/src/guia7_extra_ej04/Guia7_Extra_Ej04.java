package guia7_extra_ej04;

import Entidades.NIF;
import Servicios.ServicioNIF;

public class Guia7_Extra_Ej04 {

    public static void main(String[] args) {
        
        ServicioNIF sn = new ServicioNIF();
        NIF nif1 = sn.CrearNif();
        
        sn.mostrar(nif1);

    }

}
