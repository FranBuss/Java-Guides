package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Scanner;

public class ServicioAlquiler {

    Scanner input;
    HashSet<Integer> listaAmarres;

    public ServicioAlquiler() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaAmarres = new HashSet(10);
    }

    public Alquiler crearAlquiler() {
        ServicioCliente servCli = new ServicioCliente();
        Alquiler nuevoAlquiler = new Alquiler();
        System.out.println("Ingrese los datos del cliente...");
        nuevoAlquiler.setCliente(servCli.crearCliente());
        System.out.println("Ingrese la fecha de ingreso...");
        nuevoAlquiler.setFechaAlquier(agregarFecha());
        System.out.println("Ingrese la fecha de egreso...");
        LocalDate fechaEgreso = agregarFecha();
        nuevoAlquiler.setFechaDevolucion(fechaEgreso.isAfter(nuevoAlquiler.getFechaAlquier()) ? fechaEgreso : agregarFecha());
        System.out.print("Ingrese el numero de amarre para el barco (Solo existen 10 posiciones) --> ");
        listaAmarres.add(posicionAmarre());
        nuevoAlquiler.setPosAmarre(listaAmarres);
        nuevoAlquiler.setTipoBarco(tipoBarco());
        return nuevoAlquiler;
    }

    public double costoAlquiler(Alquiler alquiler) {
        Period period = Period.between(alquiler.getFechaAlquier(), alquiler.getFechaDevolucion());
        double costoTotal = period.getDays() * (alquiler.getTipoBarco().getEslora() * 10);
        //CASTEO LOS BARCOS EN SUS PROPIOS TIPOS Y SACO LOS ATRIBUTOS DE AHI...
        if (alquiler.getTipoBarco() instanceof Velero) {
            Velero alquilerBarco = (Velero) alquiler.getTipoBarco();
            costoTotal += alquilerBarco.getCantMastiles();
        } else if (alquiler.getTipoBarco() instanceof BarcoMotor) {
            BarcoMotor alquilerBarco = (BarcoMotor) alquiler.getTipoBarco();
            costoTotal += alquilerBarco.getPotenciaCv();
        } else if (alquiler.getTipoBarco() instanceof Yate) {
            Yate alquilerBarco = (Yate) alquiler.getTipoBarco();
            costoTotal += alquilerBarco.getPotenciaCv() + alquilerBarco.getCantCamarotes();
        }
        return costoTotal;
    }

    public Integer posicionAmarre() {
        Integer posAmarre = input.nextInt();
        input.nextLine();
        if (listaAmarres.contains(posAmarre)) {
            System.out.println("Esa posicion ya se encuentra en uso, ingrese otra...");
        }
        return ((!listaAmarres.contains(posAmarre) ? posAmarre : posicionAmarre()));
    }

    public LocalDate agregarFecha() {
        System.out.print("DIA --> ");
        int day = input.nextInt();
        input.nextLine();
        System.out.print("MES --> ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("AÑO --> ");
        int year = input.nextInt();
        input.nextLine();
        LocalDate fecha = LocalDate.of(year, month, day);
        return fecha;
    }

    public Barco tipoBarco() {
        System.out.println("Tipos de barco...");
        System.out.println("1 --> Velero");
        System.out.println("2 --> Barco a motor");
        System.out.println("3 --> Yate");
        System.out.print("Ingrese el tipo --> ");
        int opcBarco = input.nextInt();
        input.nextLine();
        switch (opcBarco) {
            case 1:
                ServicioVelero serVelero = new ServicioVelero();
                return serVelero.crearBarco();
            case 2:
                ServicioBarcoMotor servBarcoMotor = new ServicioBarcoMotor();
                return servBarcoMotor.crearBarco();
            case 3:
                ServicioYate servYate = new ServicioYate();
                return servYate.crearBarco();
            default:
                System.out.println("Ingresaste mal chinchulin...");
                tipoBarco();
        }
        return null;
    }

}
