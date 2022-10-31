package Entidades;

public class Asiento {

    private String asiento;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(String asiento, Espectador espectador) {
        this.asiento = asiento;
        this.espectador = espectador;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        String ubicacion = asiento;
        if (espectador == null) {
            ubicacion = ubicacion.concat("   |");
        } else {
            ubicacion = ubicacion.concat(" X |");
        }
        return ubicacion;
    }

}
