package Servicios;

import Entidades.Velero;

public class ServicioVelero extends ServicioBarco {

    public Velero crearBarco() {
        Velero velero = new Velero();
        super.crearBarco(velero);
        System.out.print("Ingrese cantidad de mastiles --> ");
        velero.setCantMastiles(input.nextInt());
        input.nextLine();
        return velero;
    }

}
