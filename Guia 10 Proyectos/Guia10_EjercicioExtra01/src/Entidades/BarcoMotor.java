package Entidades;

public class BarcoMotor extends Barco {

    private int potenciaCv;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCv, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

}
