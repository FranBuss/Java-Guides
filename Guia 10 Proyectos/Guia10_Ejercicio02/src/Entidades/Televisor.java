package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    protected double resolucion;
    protected boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTdt, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public int precioFinal(int peso, char consumoEnergetico, double resolucion, boolean sintonizadorTdt) {
        int precioTotal = super.precioFinal(peso, consumoEnergetico);
        if (sintonizadorTdt) {
            precioTotal += 500;
        }
        if (resolucion > 40) {
            precioTotal += (int) ((precioTotal * 0.3));
        }
        return precioTotal;
    }

    public void crearTelevisor() {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("Ingrese la resolucion del televisor --> ");
        double resTele = input.nextDouble();
        input.nextLine();
        System.out.println("El televisor tiene Sintonizador TDT? (S/N)");
        String sintonizadorOpc = input.nextLine();
        if (sintonizadorOpc.toLowerCase().equals("s")) {
            setSintonizadorTdt(true);
        } else {
            setSintonizadorTdt(false);
        }

        setResolucion(resTele);
        setPrecio(precioFinal(getPeso(), getConsumoEnergetico(), getResolucion(), isSintonizadorTdt()));

    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion --> " + resolucion + "\nprecio --> " + precio + "\ncolor --> " + color + "\nconsumoEnergetico --> " + consumoEnergetico + "\npeso --> " + peso + "\nTDT --> " + sintonizadorTdt + '}';
    }

}
