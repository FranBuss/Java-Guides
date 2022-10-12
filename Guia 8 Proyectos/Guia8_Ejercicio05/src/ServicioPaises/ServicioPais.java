package ServicioPaises;

import Entidades.Pais;
import Utilidades.Comparadores;
import java.util.*;

public class ServicioPais {

//    ArrayList<Pais> paisSet;
    HashSet<Pais> paisSet;
    ArrayList<Pais> listaPaises;
    Scanner input;

    public ServicioPais() {
//        this.paisSet = new ArrayList<>();
        this.paisSet = new HashSet<>();
        this.listaPaises = new ArrayList(paisSet);
        this.input = new Scanner(System.in).useDelimiter("\n");
        
    }

    public void CrearPais() {
        while (true) {
            System.out.println("Ingrese nombre de pais para agregar: ");
            String pais = input.nextLine();
            
//            if (existeDuplicado(pais)) {
//                System.out.println("Se encuentra repetido y no se agrega...");
//            } else {
//                paisSet.add(new Pais(pais));
//            }

            paisSet.add(new Pais(pais));

            System.out.println("Desea seguir agregando paises? (S/N) ");
            String opc = input.nextLine();
            if (opc.toLowerCase().equals("n")) {
                break;
            }
        }
    }

//    public boolean existeDuplicado(String pais) {
//        boolean existe = false;
//        for (int i = 0; i < paisSet.size(); i++) {
//            if (paisSet.get(i).getNombrePais().equals(pais)) {
//                existe = true;
//                break;
//            }
//        }
//        return existe;
//    }

    public void removerPais() {
        Iterator<Pais> it = paisSet.iterator();
        int contador = 0;
        boolean eliminado = false;

        System.out.println("Ingrese un pais a eliminar: ");
        String paisEliminar = input.nextLine();

        while (it.hasNext()) {
            if (it.next().getNombrePais().equals(paisEliminar)) {
                it.remove();
                System.out.println("Se ah eliminado con exito...");
                eliminado = true;
                break;
            }
        }

        if (eliminado == false) {
            System.out.println("No se encontro el pais");
        }

        imprimirPaises();

    }

    public void imprimirPaises() {
        Collections.sort(listaPaises, Comparadores.paisesAlfabeticamente);
        System.out.println("------------------------------");
        System.out.println(paisSet);
        System.out.println("------------------------------");
    }

}
