package Services;

import guia7_ejercicio03.Entidades.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Operacion CrearOperacion() {

        System.out.println("Ingrese el primer numero: ");
        int n1 = input.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = input.nextInt();
        return new Operacion(n1, n2);

    }

    public int Sumar(int n1, int n2) {
        int suma;

        suma = n1 + n2;

        return suma;
    }

    public int Restar(int n1, int n2) {
        int resta;

        resta = n1 - n2;

        return resta;
    }

    public float Multiplicar(int n1, int n2) {
        float multiplicacion;

        multiplicacion = n1 * n2;

        return multiplicacion;

    }

    public float Dividir(int n1, int n2) {
        float division;

        division = n1 / n2;

        return division;
    }

}
