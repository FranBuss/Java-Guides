package mascotaapp.entidades;

public class Mascota {

    private String nombre;
    private String apodo;
    //Conejo, gato, perro, etc
    private String tipo;
    private int edad;
    private boolean cola;
    private String color;
    private String raza;
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String color, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo")) {
            this.tipo = tipo;
        }
        this.edad = edad;
        this.cola = cola;
        this.color = color;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int pasear(int energiaRestar) {
        energia -= energiaRestar;

        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", color=" + color + ", raza=" + raza + ", energia=" + energia + '}';
    }

}
