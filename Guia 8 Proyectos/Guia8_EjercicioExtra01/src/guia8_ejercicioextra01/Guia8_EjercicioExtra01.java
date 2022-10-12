package guia8_ejercicioextra01;

import java.util.*;

public class Guia8_EjercicioExtra01 {

    public static void main(String[] args) {

        int num;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        do {

            System.out.println("Ingrese un numero --> ");
            num = input.nextInt();

            if (num != (-99)) {
                listaNumeros.add(num);
            }

        } while (num != (-99));

        //Suma
        int suma = listaNumeros.get(0);
        for (int i = 1; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }

        //Promedio
        int promedio = suma / listaNumeros.size();

        //Resultados y Lista -->
        for (Integer listaNumero : listaNumeros) {
            System.out.print(listaNumero + " - ");
        }
        System.out.println("");
        System.out.println("Suma de numeros --> " + suma + " <-- ");
        System.out.println("Promedio de numeros --> " + promedio + " <-- ");
    }

}
