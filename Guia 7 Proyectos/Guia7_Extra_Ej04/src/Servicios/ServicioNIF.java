package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class ServicioNIF {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public NIF CrearNif() {

        char[] vectorLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Generador de NIF...");
        System.out.println("Ingrese su DNI:");
        long dni = input.nextLong();
        int calculoLetra = (int) (dni % 23);
        char letraNif = vectorLetra[calculoLetra];
        return new NIF(dni, letraNif);

    }

    public void mostrar(NIF nif) {
        System.out.println("NIF = " + nif.getDni() + " - " + nif.getLetra());
    }

}
