package Servicios;

import Entidades.Edificio;
import Interfaces.CalculoEdificio;
import java.util.Scanner;

public abstract class ServicioEdificio implements CalculoEdificio {

    Scanner input;

    public ServicioEdificio() {
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearEdificio(Edificio edificio) {
        System.out.print("Ingrese la altura --> ");
        edificio.setAlto(input.nextFloat());
        input.nextLine();
        System.out.print("Ingrese el largo --> ");
        edificio.setLargo(input.nextFloat());
        input.nextLine();
        System.out.print("Ingrese el ancho --> ");
        edificio.setAncho(input.nextFloat());
        input.nextLine();
    }

    @Override
    public float calcularSuperficie(Edificio edificio) {
        return (edificio.getAncho() * edificio.getLargo());
    }

    @Override
    public float calcularVolumen(Edificio edificio) {
        return (edificio.getAncho() * edificio.getLargo() * edificio.getAlto());
    }

}
