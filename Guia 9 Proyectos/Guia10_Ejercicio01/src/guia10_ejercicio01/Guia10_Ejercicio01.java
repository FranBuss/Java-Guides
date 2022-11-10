package guia10_ejercicio01;

import Entidades.Perro;
import Entidades.Gato;
import Entidades.Caballo;


public class Guia10_Ejercicio01 {

    public static void main(String[] args) {
        
        Perro perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        
        Gato gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato.Alimentarse();
        
        Caballo caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();

    }

}
