package guia9_ejercicio002;

import Entidades.*;

public class Guia9_Ejercicio002 {

    public static void main(String[] args) {
        
        Dni dni = new Dni();
        dni.setSerie('A');
        dni.setNumero(44999666);
        Persona p = new Persona();
        p.setDni(dni);
        p.setNombre("Franco");
        p.setApellido("Bussano");
        System.out.println(p);
        

    }

}
