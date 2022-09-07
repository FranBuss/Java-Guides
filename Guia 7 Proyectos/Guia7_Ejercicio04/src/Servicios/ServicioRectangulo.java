package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo CrearRectangulo() {

        System.out.println("Ingrese la base del rectangulo: ");
        int base = input.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = input.nextInt();
        return new Rectangulo(base, altura);
        
    }

    public float Superficie(int base, int altura) {
        float superficie = base * altura;
        return superficie;
    }

    public float Perimetro(int base, int altura) {
        float perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void DibujarRectangulo(int base, int altura) {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
