package Entidades;

import java.util.Scanner;

public class Pass {

    private String pass;
    private String nombre;
    private int dni;

    public Pass() {
    }

    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void crearPass() {
        Scanner input = new Scanner(System.in);
        String nuevaPass = input.next();
        if (nuevaPass.length() == 10) {
            setPass(nuevaPass);
        } else {
            System.out.println("La contraseña es incompatible...");
        }

    }

    public void analizarPass() {
        if (getPass().contains("z") && getPass().matches(".*a.*a.*")) {
            System.out.println("La contraseña es de nivel ALTO...");
        } else if (getPass().contains("z")) {
            System.out.println("La contraseña es de nivel MEDIO...");
        } else {
            System.out.println("La contraseña es de nivel BAJO...");
        }
    }

}
