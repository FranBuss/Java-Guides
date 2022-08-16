package guia6_ejerciciosbase;

public class Ejercicio_15 {

    public static void main(String[] args) {
        
        int [] vector  = new int[100];
        
        
        //Añado los datos dentro del vector.
        for (int i = 0; i <= vector.length - 1; i++) {
            vector[i] = i;
        }
        
        //Muestro los datos del vector de forma descendente.
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(" [" + vector[i] + "] ");
        }
        

    }
    
}
