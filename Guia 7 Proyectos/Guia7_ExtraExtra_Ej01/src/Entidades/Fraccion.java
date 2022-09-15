package Entidades;

public class Fraccion {

    private int denominador;
    private int numerador;

    public Fraccion() {
    }

    public Fraccion(int denominador, int numerador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public Fraccion sumar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.numerador = a.numerador * b.denominador + b.numerador * a.denominador;
        c.denominador = a.denominador * b.denominador;
        return c;
    }

    public Fraccion restar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.numerador = a.numerador * b.denominador - b.numerador * a.denominador;
        c.denominador = a.denominador * b.denominador;
        return c;
    }

    public Fraccion multiplicar(Fraccion a, Fraccion b) {
        Fraccion c = new Fraccion();
        c.numerador = a.numerador * b.numerador;
        c.denominador = a.denominador * b.denominador;
        return c;
    }

    public Fraccion dividir(Fraccion a, Fraccion b) {
        return new Fraccion(a.numerador * b.denominador, a.denominador * b.numerador);
    }

}
