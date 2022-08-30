
import guia7_ejercicio02.Entidades.Circunferencia;
import guia7_ejercicio02.Servicios.ServicioCircunferencia;

public class Ejercicio_02 {

    public static void main(String[] args) {

        ServicioCircunferencia sc = new ServicioCircunferencia();

        Circunferencia nuevaCircunferencia = sc.crearCircunferencia();

        System.out.println(nuevaCircunferencia);

    }

}
