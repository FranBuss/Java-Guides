package Servicios;

import Entidades.Barco;
import java.util.Scanner;

public abstract class ServicioBarco {

    Scanner input;

    public ServicioBarco() {
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearBarco(Barco barco) {
        System.out.print("Ingrese matricula --> ");
        barco.setMatricula(input.nextLine());
        System.out.print("Ingrese su eslora en metros --> ");
        barco.setEslora(input.nextInt());
        input.nextLine();
        System.out.print("Ingrese el año de fabricacion del barco --> ");
        barco.setAnioFabricacion(input.nextInt());
        input.nextLine();
    }

}
