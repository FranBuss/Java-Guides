package guia7_ejercicio02.Entidades;

public class Circunferencia {

    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
        this.area = Math.PI * this.radio * this.radio;
        this.perimetro = 2 * Math.PI * this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
