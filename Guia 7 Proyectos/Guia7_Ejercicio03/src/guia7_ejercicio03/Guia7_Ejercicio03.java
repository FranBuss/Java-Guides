package guia7_ejercicio03;

import Services.ServicioOperacion;
import guia7_ejercicio03.Entidades.Operacion;

public class Guia7_Ejercicio03 {

    public static void main(String[] args) {

        ServicioOperacion operacion = new ServicioOperacion();

        Operacion op1 = operacion.CrearOperacion();
        System.out.println(op1);

        System.out.println("La suma es: " + operacion.Sumar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La resta es: " + operacion.Restar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La Multiplicacion es: " + operacion.Multiplicar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La Division es: " + operacion.Dividir(op1.getNumero1(), op1.getNumero2()));

    }

}
