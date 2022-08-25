package mascotaapp.entidades;

public class Mascota {

    public String nombre;
    public String apodo;
    //Conejo, gato, perro, etc
    public String tipo;
    public int edad;
    public boolean cola;
    public String color;
    public String raza;

    public Mascota() {

    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String color, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.color = color;
        this.raza = raza;
    }

}
