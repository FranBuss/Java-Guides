/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class ServicioCadena {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cadena CrearCadena() {

        System.out.println("Ingrese la frase: ");
        String frase = input.nextLine();

        return new Cadena(frase);

    }

    //Contador de vocales
    public void mostrarVocales(Cadena frase) {
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).toLowerCase().equals("a")
                    || frase.getFrase().substring(i, i + 1).toLowerCase().equals("e")
                    || frase.getFrase().substring(i, i + 1).toLowerCase().equals("i")
                    || frase.getFrase().substring(i, i + 1).toLowerCase().equals("o")
                    || frase.getFrase().substring(i, i + 1).toLowerCase().equals("u")) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales que hay son: " + contador);
    }

    //Invierte frase, la guarda dentro de una Cadena vacia, con el indice del caracter
    public void invertirFrase(Cadena frase) {
        String nuevaFrase = "";
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            nuevaFrase += frase.getFrase().charAt(i);
        }
        System.out.println(nuevaFrase);
    }

    //Cantidad de veces que se repite una letra
    public void vecesRepetido(Cadena frase, String letra) {
        int contadorRepetidos = 0;

        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equals(letra)) {
                contadorRepetidos++;
            }
        }
        System.out.println("La cantidad de veces que se encontro la letra " + letra + " fueron " + contadorRepetidos + " veces.");

    }

    //Compara la longitud y devuelve un print
    public void compararLongitud(Cadena frase, String nuevaFrase) {
        if (frase.getLongitud() == nuevaFrase.length()) {
            System.out.println("La nueva frase es de igual longitud...");
        } else if (frase.getLongitud() > nuevaFrase.length()) {
            System.out.println("La nueva frase es de menor longitud...");
        } else {
            System.out.println("La nueva frase es de mayor longitud...");
        }

    }

    //Concatena la frase del objeto con una nueva
    public void unirFrases(Cadena frase, String nuevaFrase) {
        String fraseConcatenada;
        fraseConcatenada = frase.getFrase().concat(nuevaFrase);
        System.out.println("La frase concatenada quedaria: " + fraseConcatenada);
    }

    public void reemplazarA(Cadena frase, String letra) {

        String nuevaFrase = "";
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equals("a")) {
                nuevaFrase = nuevaFrase.concat(letra);
            } else {
                nuevaFrase = nuevaFrase.concat(frase.getFrase().substring(i, i + 1));
            }
        }
        System.out.println(nuevaFrase);

    }

    public boolean contieneLetra(Cadena frase, String letra) {
        boolean bandera = false;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equals(letra)) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

}
