package guia7_extra_ej05;

import java.util.Scanner;

public class Guia7_Extra_Ej05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String mesIntento;

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
            "junio", "julio", "agosto", "septiembre", "octubre", "noviembre",
            "diciembre"};

        String mesSecreto = meses[(int) (Math.random() * 12 + 1)];

        System.out.println("¡¡¡ ADIVINE EL MES SECRETO !!!");
        do {
            System.out.println("Introduzca el nombre del mes en minúsculas: ");
            mesIntento = input.nextLine();
            if (mesIntento.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            }

        } while (true);

    }

}
