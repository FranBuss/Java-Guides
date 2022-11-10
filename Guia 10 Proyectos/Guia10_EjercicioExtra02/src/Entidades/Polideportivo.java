package Entidades;

public class Polideportivo extends Edificio {

    private String nombreEstablecimiento;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombreEstablecimiento, String tipoInstalacion, float alto, float largo, float ancho) {
        super(alto, largo, ancho);
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

}
