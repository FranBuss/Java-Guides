package Entidades;

public class Yate extends Barco {

    private int potenciaCv;
    private int cantCamarotes;

    public Yate() {
    }

    public Yate(int potenciaCv, int cantCamarotes, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
        this.cantCamarotes = cantCamarotes;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
    
    

}
