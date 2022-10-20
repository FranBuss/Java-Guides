package Entidades;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre) {
        if (id <= 6 && id >= 1) {
            this.id = id;
        }
        this.nombre = nombre;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        if (id <= 6 && id >= 1) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(Revolver r) {
        boolean seMojo = false;
        if (r.mojar()) {
            seMojo = true;
            setMojado(true);
        } else {
            r.siguienteChorro();
        }
        return seMojo;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id = " + id + ", nombre = " + nombre + " " + id + ", mojado = " + mojado + '}';
    }

}
