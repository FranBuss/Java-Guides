package guia7_ejercicio04;

import Entidades.Rectangulo;
import Servicios.ServicioRectangulo;

public class Guia7_Ejercicio04 {

    public static void main(String[] args) {
        
        ServicioRectangulo rectangulo = new ServicioRectangulo();
        
        Rectangulo rectangulo1 = rectangulo.CrearRectangulo();
        System.out.println(rectangulo1);
        
        System.out.println("El perimetro del rectangulo es: " + rectangulo.Perimetro(rectangulo1.getBase(), rectangulo1.getAltura()));
        System.out.println("El area del rectangulo es: " + rectangulo.Superficie(rectangulo1.getBase(), rectangulo1.getAltura()));
        System.out.println("--------------------------------------------------");
        rectangulo.DibujarRectangulo(rectangulo1.getBase(), rectangulo1.getAltura());
    }

}
