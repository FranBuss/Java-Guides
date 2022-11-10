package Entidades;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** @noinspection ALL*/
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoElectrico(consumoEnergetico);
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoElectrico(consumoEnergetico);

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public static char comprobarConsumoElectrico(char consumoEnergetico) {
        char tipoConsumo;
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            tipoConsumo = consumoEnergetico;
        } else {
            tipoConsumo = 'F';
        }
        return tipoConsumo;
    }

    public static String comprobarColor(String color) {
        String tipoColor;

        List listaColores = Arrays.asList("Blanco", "Negro", "Rojo", "Azul", "Gris");

        if (listaColores.contains(color)) {
            tipoColor = color;
        } else {
            tipoColor = "Blanco";
        }

        return tipoColor;
    }

    public int precioFinal(int peso, char consumoEnergetico) {
        int precioTotal = 1000;
        //Busco el char del consumo y lo sumo
        switch (consumoEnergetico) {
            case 'A':
                precioTotal += 1000;
                break;
            case 'B':
                precioTotal += 800;
                break;
            case 'C':
                precioTotal += 600;
                break;
            case 'D':
                precioTotal += 500;
                break;
            case 'E':
                precioTotal += 300;
                break;
            case 'F':
                precioTotal += 100;
                break;
        }

        //Comparo el peso del producto --> forma mas facil que encontre
        if (isBetween(peso, 1, 19)) {
            precioTotal += 100;
        } else if (isBetween(peso, 20, 49)) {
            precioTotal += 500;
        } else if (isBetween(peso, 50, 79)) {
            precioTotal += 800;
        } else if (peso >= 80) {
            precioTotal += 1000;
        }
        return precioTotal;
    }

    public static boolean isBetween(int num, int lower, int upper) {
        return lower <= num && num <= upper;
    }

    public void crearElectrodomestico() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el Color --> ");
        String colorProducto = input.nextLine();
        System.out.print("Ingrese la categoria de consumo electrico --> ");
        char categoriaConsumo = input.next().charAt(0);
        System.out.print("Ingrese el peso del producto --> ");
        int pesoProducto = input.nextInt();
        input.nextLine();

        setColor(colorProducto);
        setConsumoEnergetico(categoriaConsumo);
        setPeso(pesoProducto);
        setPrecio(precioFinal(getPeso(), getConsumoEnergetico()));

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio --> " + precio + "\ncolor --> " + color + "\nconsumoEnergetico --> " + consumoEnergetico + "\npeso --> " + peso + '}';
    }

}
