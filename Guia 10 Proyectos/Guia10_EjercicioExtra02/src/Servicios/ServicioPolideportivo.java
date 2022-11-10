package Servicios;

import Entidades.Edificio;
import Entidades.Polideportivo;
import Enumations.TipoInstalacion;
import Interfaces.CalculoEdificio;

public class ServicioPolideportivo extends ServicioEdificio implements CalculoEdificio {

    public Polideportivo CrearEdificio() {
        Polideportivo polideportivo = new Polideportivo();
        System.out.print("Ingrese el nombre del polideportivo --> ");
        polideportivo.setNombreEstablecimiento(input.nextLine());
        super.CrearEdificio(polideportivo);
        polideportivo.setTipoInstalacion(tipoInstalacion());
        return polideportivo;
    }

    public String tipoInstalacion() {
        System.out.println("Ingrese el tipo de instalacion (Techado / abierto)");
        String tipo = input.nextLine();
        for (TipoInstalacion nombreTipoInstalacion : TipoInstalacion.values()) {
            if (nombreTipoInstalacion.name().toLowerCase().equals(tipo.toLowerCase())) {
                return tipo;
            }
        }
        return null;
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
