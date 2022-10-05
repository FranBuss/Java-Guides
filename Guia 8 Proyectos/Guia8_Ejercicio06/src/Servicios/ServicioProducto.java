package Servicios;

import java.util.*;

public class ServicioProducto {

    HashMap<String, Integer> listaProductos;
    Scanner input;

    public ServicioProducto() {
        this.listaProductos = new HashMap<>();
        this.input = new Scanner(System.in).useDelimiter("\n");
    }

    public void introducirProducto() {
        System.out.println("Ingrese un Producto a la lista --> ");
        String producto = input.nextLine();

        if (listaProductos.containsKey(producto)) {
            System.out.println("Es duplicado pa");
        } else {
            System.out.println("Ingrese el precio del producto " + producto + " --> ");
            Integer precio = input.nextInt();
            listaProductos.put(producto, precio);
        }

    }

    public void modificarProducto() {
        System.out.println("Ingrese el producto a modificar --> ");
        String prodMod = input.nextLine();
        if (listaProductos.containsKey(prodMod)) {
            System.out.println("Ingrese el precio a modificar --> ");
            Integer precioMod = input.nextInt();
            listaProductos.replace(prodMod, precioMod);
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto a eliminar --> ");
        String prodDel = input.nextLine();
        listaProductos.remove(prodDel);
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Integer> entry : listaProductos.entrySet()) {
            System.out.println("PRODUCTO --> " + entry.getKey() + " PRECIO --> " + entry.getValue());
        }
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
