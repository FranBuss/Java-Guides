package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cuenta CrearCuenta() {

        System.out.println("-----------------------------");
        System.out.println("------->    BANCO    <-------");
        System.out.println("-----------------------------");
        System.out.println("Ingrese su numero de cuenta: ");
        int numCuenta = input.nextInt();
        System.out.println("Ingrese su DNI: ");
        int dni = input.nextInt();
        System.out.println("Ingrese su saldo: ");
        int saldo = input.nextInt();

        return new Cuenta(numCuenta, dni, saldo);

    }

    public int Ingresar(int saldo, int deposito) {
        saldo += deposito;
        return saldo;
    }

    public int Retirar(int saldo, int cantRetirar) {
        if (cantRetirar > saldo) {
            saldo = 0;
        } else {
            saldo -= cantRetirar;
        }
        return saldo;
    }

    public int ExtraccionRapida(int saldo, int cantRetirar) {
        if (cantRetirar < ((saldo / 20)) * 100) {
            saldo -= cantRetirar;
        } else {
            System.out.println("Lo que queres retirar es mayor al 20%");
        }
        return saldo;
    }

    public void ConsultarSaldo(int saldo) {
        System.out.println("El saldo de su cuenta es --> " + saldo);
    }

    public void ConsultarDatos(int numCuenta, int dni) {
        System.out.println("Los datos de su cuenta son: ");
        System.out.println("Numero cuenta   ------> " + numCuenta);
        System.out.println("DNI del propietario --> " + dni);
    }

}
