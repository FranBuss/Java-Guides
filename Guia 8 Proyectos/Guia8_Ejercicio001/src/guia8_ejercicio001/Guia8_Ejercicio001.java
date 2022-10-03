package guia8_ejercicio001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Guia8_Ejercicio001 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        //Listas:
        ArrayList<Integer> NumerosA = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            int n = input.nextInt();
            NumerosA.add(n);
        }

        //Conjuntos:
        HashSet<Integer> NumerosB = new HashSet();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero: ");
            int n = input.nextInt();
            NumerosB.add(n);
        }

        //Mapas:
        HashMap<Integer, String> Alumnos = new HashMap();
        input.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno Nro° " + i);
            String alu = input.nextLine();
            Alumnos.put(i, alu);
        }

        for (Integer numeros : NumerosA) {
            System.out.println("NumerosA : " + numeros);
        }
        for (Integer numeros : NumerosB) {
            System.out.println("NumerosB : " + numeros);
        }
        for (Map.Entry<Integer, String> entry : Alumnos.entrySet()) {
            System.out.println("Numero: " + entry.getKey() + ", Alumno: " + entry.getValue());
        }

    }

}
