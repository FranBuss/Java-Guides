package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class ServicioMascota {

    private final Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("Ingrese nombre de mascota: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese apodo de mascota: ");
        String apodo = input.nextLine();

        System.out.println("Ingrese tipo de mascota (perro/gato/etc): ");
        String tipo = input.nextLine();

        System.out.println("Ingrese edad de mascota: ");
        int edad = input.nextInt();
        input.nextLine();

//        System.out.println("Ingrese si tiene cola la mascota: ");
//        boolean cola = input.nextBoolean();
//        input.nextLine();

        System.out.println("Ingrese el color de mascota: ");
        String color = input.nextLine();

        System.out.println("Ingrese raza de mascota: ");
        String raza = input.nextLine();

        return new Mascota(nombre, apodo, tipo, 0, true, color, raza);
        
    }

}
