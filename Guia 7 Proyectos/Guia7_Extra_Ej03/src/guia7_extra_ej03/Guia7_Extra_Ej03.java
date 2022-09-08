package guia7_extra_ej03;

import Entidades.Raices;
import java.util.Scanner;

public class Guia7_Extra_Ej03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los datos para buscar raices: ");
        System.out.println("a = ");
        int a = input.nextInt();
        System.out.println("b = ");
        int b = input.nextInt();
        System.out.println("c = ");
        int c = input.nextInt();
        Raices r1 = new Raices(a, b, c);
        r1.calcular();

    }

}
