package guia10_ejercicioextra02;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Servicios.ServicioEdificioDeOficinas;
import Servicios.ServicioPolideportivo;
import java.util.ArrayList;

public class Guia10_EjercicioExtra02 {

    public static void main(String[] args) {
        ServicioEdificioDeOficinas serOficinas = new ServicioEdificioDeOficinas();
        ServicioPolideportivo serPoli = new ServicioPolideportivo();

        int techados = 0;
        int abiertos = 0;

        ArrayList<Edificio> listaEdificios = new ArrayList<>();
        EdificioDeOficinas n1 = serOficinas.CrearEdificio();
        listaEdificios.add(n1);
        EdificioDeOficinas n2 = serOficinas.CrearEdificio();
        listaEdificios.add(n2);
        Polideportivo n3 = serPoli.CrearEdificio();
        listaEdificios.add(n3);
        Polideportivo n4 = serPoli.CrearEdificio();
        listaEdificios.add(n4);

        for (Edificio edificio : listaEdificios) {
            System.out.println("-------------------------------------------------------------------------------------------");
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoInstalacion().toLowerCase().equals("techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
                System.out.println("Superficie --> " + serPoli.calcularSuperficie(polideportivo));
                System.out.println("Volumen --> " + serPoli.calcularVolumen(polideportivo));
                continue;
            }
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas oficina = (EdificioDeOficinas) edificio;
                System.out.println("Cant personas totales en el edificio --> " + serOficinas.cantPersonasTotales(oficina));
                System.out.println("Superficie --> " + serOficinas.calcularSuperficie(oficina));
                System.out.println("Volumen --> " + serOficinas.calcularVolumen(oficina));
            }
        }

        System.out.println("Cantidad de polideportivos techados --> " + techados);
        System.out.println("Cantidad de polideportivos abiertos --> " + abiertos);

    }

}
