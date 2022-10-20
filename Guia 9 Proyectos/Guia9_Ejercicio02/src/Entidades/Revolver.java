package Entidades;

public class Revolver {
    
    private int posAgua;
    private int posActual;
    
    public Revolver() {
        this.posActual = 0;
        this.posAgua = 0;
    }
    
    public int getPosActual() {
        return posActual;
    }
    
    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }
    
    public int getPosAgua() {
        return posAgua;
    }
    
    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver() {
        setPosActual((int) (Math.random() * 6 + 1));
        setPosAgua((int) (Math.random() * 6 + 1));
    }
    
    public boolean mojar() {
        boolean mojado = false;
        if (getPosActual() == getPosAgua()) {
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro() {
        System.out.println("El tambor se encuentra en la posicion --> " + getPosActual());
        if (posActual == 6 && posAgua != 6) {
            setPosActual(1);
        } else {
            setPosActual(posActual = posActual+1);
        }
    }
    
    @Override
    public String toString() {
        return "Revolver{" + "posAgua = " + posAgua + ", posActual = " + posActual + '}';
    }
    
}
