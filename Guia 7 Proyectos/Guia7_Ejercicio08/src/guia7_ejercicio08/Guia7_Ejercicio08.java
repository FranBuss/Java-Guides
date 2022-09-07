package guia7_ejercicio08;

import Entidades.Cadena;
import Servicios.ServicioCadena;
import java.util.Scanner;

public class Guia7_Ejercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ServicioCadena sc = new ServicioCadena();

        Cadena frase = sc.CrearCadena();
        System.out.println("-----------------------------------------");
        System.out.println(frase);
        System.out.println("-----------------------------------------");
        sc.mostrarVocales(frase);
        System.out.println("-----------------------------------------");
        sc.invertirFrase(frase);
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese una letra para ver si se repite: ");
        sc.vecesRepetido(frase, input.nextLine());
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese una frase: ");
        sc.compararLongitud(frase, input.nextLine());
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese una frase para concatenarla: ");
        sc.unirFrases(frase, input.nextLine());
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese una letra para cambiarla por las 'a' : ");
        sc.reemplazarA(frase, input.nextLine());
        System.out.println("-----------------------------------------");
        System.out.println("Ingrese una letra para ver si esta contenida");
        System.out.println(sc.contieneLetra(frase, input.nextLine()));
        System.out.println("-----------------------------------------");

    }

}
