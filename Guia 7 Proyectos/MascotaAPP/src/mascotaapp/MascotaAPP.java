package mascotaapp;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class MascotaAPP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mascota m1 = new Mascota();

        m1.apodo = "chiquito";
        m1.nombre = "chori";
        m1.tipo = "Gato";
        m1.raza = "Chulo";
        m1.edad = 1;
        m1.cola = true;
        m1.color = "blanco";

        System.out.println("" + m1.nombre + " " + m1.apodo + " " + m1.tipo + " ");

    }

}
