package Entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, char consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int precioFinal(int peso, char consumoEnergetico, int carga) {
        int precioTotal = super.precioFinal(peso, consumoEnergetico);
        if (carga > 30) {
            precioTotal += 500;
        }
        return precioTotal;
    }

    public void crearLavadora() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("Ingrese el tamaño de carga de la lavadora --> ");
        int cargaProducto = input.nextInt();
        input.nextLine();
        setCarga(cargaProducto);
        setPrecio(precioFinal(getPeso(), getConsumoEnergetico(), getCarga()));
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga --> " + carga + "\nprecio --> " + precio + "\ncolor --> " + color + "\nconsumoEnergetico --> " + consumoEnergetico + "\npeso --> " + peso + '}';
    }

}
