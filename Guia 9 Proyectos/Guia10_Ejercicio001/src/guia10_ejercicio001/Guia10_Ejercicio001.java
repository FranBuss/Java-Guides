package guia10_ejercicio001;

import Entidades.*;
import java.util.ArrayList;

public class Guia10_Ejercicio001 {

    public static void main(String[] args) {

        ArrayList<Animal> listaAnimales = new ArrayList<>();

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);

        for (Animal animalito : listaAnimales) {
            animalito.hacerRuido();
        }
        
    }

}
