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
        System.out.println("Ingrese la nueva contraseña: ");
        String nuevaPass = input.next();
        if (nuevaPass.length() == 10) {
            setPass(nuevaPass);
        } else {
            System.out.println("La contraseña es incompatible...");
        }

    }

    public void analizarPass() {
//        s.indexOf(letter, s.indexOf(letter) + 1) > -1   <-- Sirve para buscar mas de un mismo caracter
//        getPass().matches(".*a.*a.*") 
        if (getPass().contains("z") && getPass().indexOf("a", getPass().indexOf("a") + 1) > -1) {
            System.out.println("La contraseña es de nivel ALTO...");
        } else if (getPass().contains("z")) {
            System.out.println("La contraseña es de nivel MEDIO...");
        } else {
            System.out.println("La contraseña es de nivel BAJO...");
        }
    }

    public void modificarPass(String nuevaPass) {
        if (nuevaPass.length() == 10) {
            setPass(nuevaPass);
        } else {
            System.out.println("La contraseña es menor o mayor de 10 caracteres...");
        }

    }

    public void modificarNombre(String nuevoNombre) {
        setNombre(nuevoNombre);
    }

    public void modificarDni(int nuevoDni) {
        setDni(nuevoDni);
    }

    public boolean verificarPass() {
        boolean truePass = false;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su contraseña actual...");
        String intentoPass = input.nextLine();
        if (intentoPass.equals(getPass())) {
            truePass = true;
        }
        return truePass;
    }

    public void menuOpciones() {

        String deseaContinuar;
        boolean salir = false;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("=//===========================\\==");
        System.out.println("//   MENU DE OPCIONES CUENTA   \\");
        System.out.println("\\                             //");
        System.out.println("=\\===========================//=");
        System.out.println("-- 1 -> Ingresar la contraseña --");
        System.out.println("-- 2 -> Nivel de contraseña    --");
        System.out.println("-- 3 -> Modificar contraseña   --");
        System.out.println("-- 4 -> Modificar nombre       --");
        System.out.println("-- 5 -> Modificar DNI          --");
        System.out.println("---------------------------------");

        do {
            System.out.println("Ingrese una opcion: ");
            int opc = input.nextInt();
            switch (opc) {
                case 1:
                    crearPass();
                    break;
                case 2:
                    analizarPass();
                    break;
                case 3:
                    if (verificarPass()) {
                        System.out.println("Ingrese la nueva contraseña: ");
                        String nuevaPass = input.nextLine();
                        modificarPass(nuevaPass);
                    }
                    break;
                case 4:
                    if (verificarPass()) {
                        System.out.println("Ingrese nuevo Nombre: ");
                        String nuevoNombre = input.nextLine();
                        modificarNombre(nuevoNombre);
                    }
                    break;
                case 5:
                    if (verificarPass()) {
                        System.out.println("Ingrese nuevo DNI: ");
                        int nuevoDni = input.nextInt();
                        modificarDni(nuevoDni);
                    }
                    break;
                default:
                    throw new AssertionError();
            }

            input.nextLine();
            System.out.println("Desea continuar? (S/N)");
            deseaContinuar = input.nextLine();
            
            if (deseaContinuar.toLowerCase().equals("si") || deseaContinuar.toLowerCase().equals("s")) {
               salir = false;
            } else if (deseaContinuar.toLowerCase().equals("no") || deseaContinuar.toLowerCase().equals("n")) {
               salir = true;
            }

        } while (salir != true);

        System.out.println("Gracias por usar el programa...");

    }

}
