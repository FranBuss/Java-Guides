package guia9_ejercicio001;

import Entidades.Curso;
import Entidades.Profesor;

public class Guia9_Ejercicio001 {

    public static void main(String[] args) {
        
        Profesor profe = new Profesor();
        profe.setNombre("Franco");
        profe.setApellido("Bussano");
        Curso curso = new Curso();
        curso.setProfesor(profe);
        System.out.println(curso);

    }

}
