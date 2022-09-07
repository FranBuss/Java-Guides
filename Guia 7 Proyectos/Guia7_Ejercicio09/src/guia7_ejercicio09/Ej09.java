package guia7_ejercicio09;

import Entidades.Matematica;

public class Ej09 {

    public static void main(String[] args) {

        Matematica m = new Matematica();

        float mayor;
        float menor;

        System.out.println("Ingrese numero 1: ");
        m.setNumero1((float) Math.random() * 10 + 1);
        System.out.println("Ingrese numero 2: ");
        m.setNumero2((float) Math.random() * 10 + 1);

        if (m.getNumero1() > m.getNumero2()) {
            mayor = m.getNumero1();
            menor = m.getNumero2();
        } else {
            mayor = m.getNumero2();
            menor = m.getNumero1();
        }

        System.out.println("La potencia del mayor con el menor es: " + m.getPotencia(mayor, menor));
        System.out.println("La raiz del menor es: " + m.getRaiz(menor));

    }

}
