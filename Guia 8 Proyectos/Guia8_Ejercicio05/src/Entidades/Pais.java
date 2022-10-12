package Entidades;

import java.util.Objects;


public class Pais {

    private String nombrePais;

    public Pais() {
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Pais) {
            return true;
        }
        
        Pais pais = (Pais) obj;
        return (this.getNombrePais().equals(pais.getNombrePais()));
        
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 97 * hash + Objects.hashCode(this.nombrePais);
//        return hash;
//    }
    @Override
    public int hashCode() {
        return Objects.hash(getNombrePais());
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais --> " + nombrePais + '}';
    }

}
