package Servicios;

import Entidades.Alumno;
import java.util.*;

public class ServicioAlumno {

    private ArrayList<Alumno> alumnos;
    private Scanner input;

    public ServicioAlumno() {
        this.alumnos = new ArrayList<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarAlumno() {
        int n = 1;
        while (true) {
            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Alumno nro° " + n + " : ");
            System.out.println("NOMBRE: ");
            String nombre = input.next();

            System.out.println("Ingrese las 3 notas: ");
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota nro° " + (i + 1) + " : ");
                notas.add(input.nextInt());
            }

            alumnos.add(new Alumno(nombre, notas));

            System.out.println("Desea seguir cargando alumnos? (S/N) ");
            String opc = input.next();
            if (opc.toLowerCase().equals("n")) {
                break;
            }
        }
    }

    public void imprimirAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void notaFinal(String alumnoRequerido) {

        for (Alumno alumno : alumnos) {
            int sumaFinal = 0;
            if (alumno.getNombre().equals(alumnoRequerido)) {
                for (int i = 0; i < 3 ; i++) {
                    sumaFinal += alumno.getNotas().get(i);
                }
                System.out.println(sumaFinal /= 3);
            }
        }

    }

}
