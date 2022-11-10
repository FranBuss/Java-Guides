package Servicios;

import Entidades.Yate;

public class ServicioYate extends ServicioBarco {

    public Yate crearBarco() {
        Yate yate = new Yate();
        super.crearBarco(yate);
        System.out.print("Ingrese la cantidad de CV del yate --> ");
        yate.setPotenciaCv(input.nextInt());
        input.nextLine();
        System.out.print("Ingrese la cantidad de camarotes del yate --> ");
        yate.setCantCamarotes(input.nextInt());
        input.nextLine();
        return yate;
    }

}
