package Servicios;

import Entidades.Ahorcado;
//import java.util.Arrays;
import java.util.Scanner;

public class ServicioAhorcado {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado CrearAhorcado() {

        //Genero una palabra aleatoria
        String[] posibles = {"ALFAJOR", "FUTBOL", "MATE", "SALCHIPAPA", "JAVASCRIPT", "MESSI", "ESTREPTOCOCO"};
        String posiblePalabra = posibles[(int) (Math.random() * posibles.length)];

        //Declaro la longitud de la nueva palabra
        String[] palabra = new String[posiblePalabra.length()];

        for (int i = 0; i < posiblePalabra.length(); i++) {
            palabra[i] = posiblePalabra.substring(i, i + 1);
        }

        return new Ahorcado(palabra);
    }

    public void longitud(Ahorcado palabra) {
        System.out.println("La longitud de la palabra es: " + palabra.getPalabra().length);
    }

    public void buscarLetra(String letra, Ahorcado palabra) {
        boolean letraBuscada = false;
        for (int i = 0; i < palabra.getPalabra().length; i++) {
            if (palabra.getPalabra()[i].equals(letra)) {
                letraBuscada = true;
                break;
            }
        }
        if (letraBuscada) {
            System.out.println("La letra pertenece a la palabra...");
        } else {
            System.out.println("La letra no pertenece a la palabra...");
        }
    }

    public boolean encontradas(String letra, Ahorcado palabra) {
        boolean seEncontro = false;
        for (int i = 0; i < palabra.getPalabra().length; i++) {
            if (palabra.getPalabra()[i].equals(letra)) {
                seEncontro = true;
            }
        }
        return seEncontro;

    }

    public void intentos(Ahorcado palabra) {
        System.out.println(palabra.getIntentosRestantes());
    }

    public void juego(Ahorcado palabra) {

        do {
            System.out.println("Ingrese una letra...");
            String letra = input.nextLine();
            longitud(palabra);
            buscarLetra(letra, palabra);
            if (encontradas(letra, palabra)) {
                palabra.setLetrasEncontradas(palabra.getLetrasEncontradas() + 1);
            } else {
                palabra.setIntentosRestantes(palabra.getIntentosRestantes() - 1);
            }
            System.out.println("Numero de letras (Encontradas, Faltantes) : (" + palabra.getLetrasEncontradas() + " , " + (palabra.getPalabra().length - palabra.getLetrasEncontradas()) + ") ");
            System.out.println("Numero de Intentos restantes: " + palabra.getIntentosRestantes());

            if (palabra.getLetrasEncontradas() == palabra.getPalabra().length) {
                System.out.println("GENIAL GANASTE");
                break;
            } else if (palabra.getIntentosRestantes() == 0) {
                System.out.println("Perdiste maquinola");
                break;
            }
        } while (true);

    }

}
