package Enumations;

public enum TipoInstalacion {

    TECHADO("Techado"), ABIERTO("Abierto");

    private final String nombre;

    private TipoInstalacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
