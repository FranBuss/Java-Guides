package Servicios;

//import Entidades.Producto;
import Entidades.Producto;
import java.util.*;
import java.util.Map.Entry;

public class ServicioProductoEntidades {

    HashMap<Producto, Integer> listaProductos;

    Scanner input;

    public ServicioProductoEntidades() {
        this.listaProductos = new HashMap<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void introducirProducto() {
        System.out.println("Ingrese un Producto a la lista --> ");
        String producto = input.nextLine();
        System.out.println("Ingrese el precio del producto --> ");
        Integer precio = input.nextInt();

        listaProductos.put(new Producto(producto), precio);
    }

    public void modificarProducto() {
        System.out.println("Ingrese el producto a modificar --> ");
        String prodMod = input.nextLine();
        
//        listaProductos.keySet().stream().filter((producto) -> (prodMod.equals(producto.getNombre()))).map((producto) -> {
//            System.out.println("Ingrese el precio del producto -->");
//            return producto;
//        }).forEachOrdered((producto) -> {
//            Integer nuevoPrecio = input.nextInt();
//            listaProductos.replace(producto, nuevoPrecio);
//        });

        for (Entry<Producto, Integer> entry : listaProductos.entrySet()) {
            if (entry.getKey().getNombre().equals(prodMod)) {
                System.out.println("Ingrese el precio del producto --> ");
                Integer nuevoPrecio = input.nextInt();
                listaProductos.replace(entry.getKey(), nuevoPrecio);
            }
        }
    }

    public void eliminarProducto() {
        Iterator<Entry<Producto, Integer>> it = listaProductos.entrySet().iterator();
        System.out.println("Ingrese el producto a eliminar --> ");
        String prodDel = input.nextLine();
        while (it.hasNext()) {
            if (it.next().getKey().getNombre().equals(prodDel)) {
                it.remove();
            }
        }
    }

    public void mostrarProductos() {
        for (Map.Entry<Producto, Integer> entry : listaProductos.entrySet()) {
            System.out.println("PRODUCTO --> " + entry.getKey() + " PRECIO --> " + entry.getValue());
        }
//        listaProductos.entrySet().forEach((entry) -> {
//            System.out.println("PRODUCTO --> " + entry.getKey() + " PRECIO --> " + entry.getValue());
//        });
    }

    public void menuPrincipal() {

        int opc;

        System.out.println("------------------------------------");
        System.out.println("-- BIENVENIDO A LA TIENDA VIRTUAL --");
        System.out.println("-- 1 - Añadir producto            --");
        System.out.println("-- 2 - Modificar producto         --");
        System.out.println("-- 3 - Eliminar producto          --");
        System.out.println("-- 4 - Mostrar productos          --");
        System.out.println("-- 5 - Salir                      --");
        System.out.println("------------------------------------");

        do {
            System.out.println("Ingrese la opcion --> ");
            opc = input.nextInt();
            switch (opc) {
                case 1:
                    input.nextLine();
                    introducirProducto();
                    break;
                case 2:
                    input.nextLine();
                    modificarProducto();
                    break;
                case 3:
                    input.nextLine();
                    eliminarProducto();
                    break;
                case 4:
                    input.nextLine();
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa...");
                    break;
                default:
                    System.out.println("Ingresaste otro numero chinchulin...");
            }
        } while (opc != 5);

    }

}
