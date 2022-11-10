package Servicios;

import Entidades.Cliente;
import java.util.Scanner;

public class ServicioCliente {

    Scanner input;

    public ServicioCliente() {
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.print("Ingrese nombre del cliente --> ");
        cliente.setNombre(input.nextLine());
        System.out.println("Ingrese DNI --> ");
        cliente.setDni(input.nextInt());
        input.nextLine();
        return cliente;
    }

}
