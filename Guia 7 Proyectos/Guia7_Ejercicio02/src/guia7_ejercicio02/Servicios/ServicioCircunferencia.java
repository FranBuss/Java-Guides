package guia7_ejercicio02.Servicios;

import guia7_ejercicio02.Entidades.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese el radio de la circunferencia: ");
        float radio = input.nextFloat();

        return new Circunferencia(radio);
    }

}
