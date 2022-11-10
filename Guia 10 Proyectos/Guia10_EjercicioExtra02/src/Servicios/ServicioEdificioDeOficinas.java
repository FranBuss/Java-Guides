package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;

public class ServicioEdificioDeOficinas extends ServicioEdificio {

    public EdificioDeOficinas CrearEdificio() {
        EdificioDeOficinas edifOficinas = new EdificioDeOficinas();
        System.out.print("Ingrese la cantidad de pisos --> ");
        edifOficinas.setNumPisos(input.nextInt());
        input.nextLine();
        System.out.print("Ingrese la cantidad de oficinas por piso --> ");
        edifOficinas.setCantOficinas(input.nextInt());
        input.nextLine();
        System.out.print("Ingrese la cantidad de personas por oficina --> ");
        edifOficinas.setCantPersonasPorOficinas(input.nextInt());
        input.nextLine();
        super.CrearEdificio(edifOficinas);
        return edifOficinas;
    }

    public int cantPersonasTotales(EdificioDeOficinas edificio) {
        return ((edificio.getCantOficinas() * edificio.getCantPersonasPorOficinas()) * edificio.getNumPisos());
    }

    @Override
    public float calcularVolumen(Edificio edificio) {
        return super.calcularVolumen(edificio);
    }

    @Override
    public float calcularSuperficie(Edificio edificio) {
        return super.calcularSuperficie(edificio);
    }

}
