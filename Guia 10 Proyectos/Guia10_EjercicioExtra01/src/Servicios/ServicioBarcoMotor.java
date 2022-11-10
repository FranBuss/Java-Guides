
package Servicios;

import Entidades.BarcoMotor;

public class ServicioBarcoMotor extends ServicioBarco{
    
    public BarcoMotor crearBarco(){
        BarcoMotor barcoaMotor = new BarcoMotor(); 
        super.crearBarco(barcoaMotor);
        System.out.print("Ingrese la cantidad de CV del barco --> ");
        barcoaMotor.setPotenciaCv(input.nextInt());
        input.nextLine();
        return barcoaMotor;
    }
    
}
