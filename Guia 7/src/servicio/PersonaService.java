package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonaService {

    Scanner input = new Scanner(System.in);

    public Persona crearPersona() {

        Persona personaCompleta = new Persona();

        System.out.println("Ingrese el nombre de la persona: ");
        personaCompleta.setNombre(input.nextLine());

        return personaCompleta;

    }

}
