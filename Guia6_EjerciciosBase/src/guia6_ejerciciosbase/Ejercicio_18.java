package guia6_ejerciciosbase;

public class Ejercicio_18 {

    public static void main(String[] args) {

        int [][] matriz = new int[4][4];
        
        //rellenar los datos de la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random()*50+1);
            }
        }
        //mostrar datos de matriz
        System.out.println("-----------------------");
        System.out.println("--   Matriz normal   --");
        System.out.println("-----------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        //mostrar datos de matriz traspuesta
        System.out.println("-----------------------");
        System.out.println("-- Matriz traspuesta --");
        System.out.println("-----------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" [" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }
        
    }
    
}
