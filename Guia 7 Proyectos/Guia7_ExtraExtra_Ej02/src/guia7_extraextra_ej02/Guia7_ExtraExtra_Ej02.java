package guia7_extraextra_ej02;

import Entidades.Tiempo;
import java.util.Scanner;

public class Guia7_ExtraExtra_Ej02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        Tiempo hora = new Tiempo();

        System.out.println("Ingrese la hora: ");
        hora.setHora(input.nextInt());
        System.out.println("Ingrese los minutos: ");
        hora.setMinuto(input.nextInt());
        System.out.println("Ingrese los segundos: ");
        hora.setSegundo(input.nextInt());

        System.out.println("La hora es...");
        hora.imprimirHoraCompleta();

    }

}
