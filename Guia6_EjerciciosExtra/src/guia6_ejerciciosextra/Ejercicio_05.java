package guia6_ejerciciosextra;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total;

        System.out.println("Los socios tipo ‘A’ abonan una cuota mayor, pero\n"
                + "tienen un 50% de descuento en\n"
                + "todos los tipos de tratamientos.");
        System.out.println("Los socios tipo ‘B’ abonan una cuota moderada y\n"
                + "tienen un 35% de descuento para\n"
                + "los mismos tratamientos que los socios del tipo A.");
        System.out.println("Los socios que menos aportan, los de tipo ‘C’, no\n"
                + "reciben descuentos sobre dichos tratamientos.");
        System.out.println("Ingrese su tipo de socio: ");
        String tipoSocio = input.nextLine();
        System.out.println("Ingrese el monto del tratamiento: ");
        int monto = input.nextInt();
        input.nextLine();

        switch (tipoSocio) {
            case "A":
                total = (monto * 100) / 50;
                System.out.println("El coste del tratamiento siendo socio\n"
                        + "clase A es de: " + total);
                break;
            case "B":
                total = (monto * 100) / 35;
                System.out.println("El coste del tratamiento siendo socio\n"
                        + "clase B es de: " + total);
                break;
            case "C":
                System.out.println("El coste del tratamiento siendo socio\n"
                        + "clase C es de: " + monto);
                break;
            default:
                System.out.println("Ingresaste un tipo de socio incorrecto");
        }

    }

}
