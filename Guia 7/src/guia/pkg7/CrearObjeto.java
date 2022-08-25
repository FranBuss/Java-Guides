package guia.pkg7;

import entidad.Persona;
import servicio.PersonaService;

public class CrearObjeto {

    public static void main(String[] args) {

        PersonaService persServicio = new PersonaService();

        Persona primerPersona = persServicio.crearPersona();

        System.out.println(primerPersona.getNombre());

    }

}
