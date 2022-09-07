package Entidades;

public class Matematica {

    private float numero1;
    private float numero2;

    public Matematica() {
    }

    public Matematica(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getPotencia(float numeroAlto, float numeroBajo) {
        float potencia = (float) Math.pow(numero1, numero2);
        return potencia;
    }

    public float getRaiz(float numeroBajo) {
        float raiz = (float) Math.sqrt(Math.abs(numeroBajo));
        return raiz;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

}
