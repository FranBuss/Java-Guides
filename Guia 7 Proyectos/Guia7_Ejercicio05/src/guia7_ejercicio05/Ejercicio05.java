package guia7_ejercicio05;

import Entidades.Cuenta;
import Servicios.ServicioCuenta;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        ServicioCuenta cuenta = new ServicioCuenta();
        int opc;

        Cuenta cuenta1 = cuenta.CrearCuenta();

        System.out.println("<----------------------------->");
        System.out.println("--> 1 - Consultar datos   <----");
        System.out.println("--> 2 - Consultar saldo   <----");
        System.out.println("--> 3 - Ingresar saldo    <----");
        System.out.println("--> 4 - Retirar dinero    <----");
        System.out.println("--> 5 - Extraccion rapida <----");
        System.out.println("--> 6 - Salir             <----");
        System.out.println("<----------------------------->");

        do {
            System.out.println("Ingrese una opcion --> ");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    cuenta.ConsultarDatos(cuenta1.getNumeroCuenta(), cuenta1.getDniCliente());
                    break;
                case 2:
                    cuenta.ConsultarSaldo(cuenta1.getSaldoActual());
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero a depositar --> ");
                    cuenta1.setSaldoActual(cuenta.Ingresar(cuenta1.getSaldoActual(), input.nextInt()));
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de dinero a retirar --> ");
                    cuenta1.setSaldoActual(cuenta.Retirar(cuenta1.getSaldoActual(), input.nextInt()));
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de dinero a retirar, no puede sacar mas del 20% --> ");
                    cuenta1.setSaldoActual(cuenta.ExtraccionRapida(cuenta1.getSaldoActual(), input.nextInt()));
                    break;
                case 6:
                    System.out.println("Gracias por usar el cajero :) --");
                    break;
                default:
                    System.out.println("<--ERROR-->");
            }
        } while (opc != 6);

    }

}
