package ServicioPaises;

import Entidades.Pais;
import Utilidades.Comparadores;
import java.util.*;

public class ServicioPais {

    ArrayList<Pais> listaPaises;
    Scanner input;

    public ServicioPais() {
        this.listaPaises = new ArrayList<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void CrearPais() {
        while (true) {
            System.out.println("Ingrese nombre de pais para agregar: ");
            String pais = input.nextLine();
            if (listaPaises.contains(pais)) {
                System.out.println("Se encuentra repetido y no se agrega...");
            } else {
                listaPaises.add(new Pais(pais));
            }

            System.out.println("Desea seguir agregando paises? (S/N) ");
            String opc = input.nextLine();
            if (opc.toLowerCase().equals("n")) {
                break;
            }
        }
    }

    public void removerPais() {
        Iterator<Pais> it = listaPaises.iterator();
        int contador = 0;
        boolean eliminado = false;

        System.out.println("Ingrese un pais a eliminar: ");
        String paisEliminar = input.nextLine();

        while (it.hasNext()) {
            if (it.next().getNombrePais().equals(paisEliminar)) {
                it.remove();
                System.out.println("Se ah eliminado con exito...");
                eliminado = true;
            } else {
                contador += 1;
            }
        }

        if (contador >= 1 && (eliminado == false)) {
            System.out.println("No se encontro el pais");
        }

        imprimirPaises();

    }

    public void imprimirPaises() {
        Collections.sort(listaPaises, Comparadores.paisesAlfabeticamente);
        System.out.println("------------------------------");
        System.out.println(listaPaises);
        System.out.println("------------------------------");
    }

}
