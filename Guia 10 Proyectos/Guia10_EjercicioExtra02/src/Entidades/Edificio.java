package Entidades;

public abstract class Edificio {

    protected float alto;
    protected float largo;
    protected float ancho;

    public Edificio() {
    }

    public Edificio(float alto, float largo, float ancho) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

}
