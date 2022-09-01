package guia7_ejercicio08;

import Entidades.Cadena;
import Servicios.ServicioCadena;

public class Guia7_Ejercicio08 {

    public static void main(String[] args) {

        ServicioCadena sc = new ServicioCadena();

        Cadena frase = sc.CrearCadena();

        System.out.println(frase);
        sc.mostrarVocales(frase);
        sc.invertirFrase(frase);

    }

}
