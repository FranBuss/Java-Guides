package Servicios;

import Entidades.Polideportivo;
import Enumations.TipoInstalacion;

public class ServicioPolideportivo extends ServicioEdificio {

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
    public float calcularSuperficie() {
        float superficie = 0;
        return superficie;
    }

    @Override
    public float calcularVolumen() {
        float volumen = 0;
        return volumen;
    }

}
