package Entidades;

import Interfaces.calculoFormas;

public class Rectangulo implements calculoFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo = " + "\nArea --> " + calcularArea() + "\nPerimetro --> " + calcularPerimetro();
    }

}
