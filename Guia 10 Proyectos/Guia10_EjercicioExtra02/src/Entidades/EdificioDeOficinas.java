package Entidades;

public class EdificioDeOficinas extends Edificio {

    private int cantOficinas;
    private int cantPersonasPorOficinas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonasPorOficinas, int numPisos, float alto, float largo, float ancho) {
        super(alto, largo, ancho);
        this.cantOficinas = cantOficinas;
        this.cantPersonasPorOficinas = cantPersonasPorOficinas;
        this.numPisos = numPisos;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonasPorOficinas() {
        return cantPersonasPorOficinas;
    }

    public void setCantPersonasPorOficinas(int cantPersonasPorOficinas) {
        this.cantPersonasPorOficinas = cantPersonasPorOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

}
