package entidad;

public class Persona {

    public String nombre;
    public int edad;
    public int anioNacimiento;

    public Persona() {

    }

    public Persona(String nombre, int edad, int anioNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

}
