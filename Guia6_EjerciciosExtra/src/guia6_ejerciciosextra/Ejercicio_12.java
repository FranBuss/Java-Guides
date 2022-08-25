package guia6_ejerciciosextra;

public class Ejercicio_12 {

    public static void main(String[] args) {

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
//                    if (i == 3) {
//                        System.out.println("E" + " - " + j + " - " + k);
//                    } else if (j == 3) {
//                        System.out.println(i + " - " + "E" + " - " + k);
//                    } else if (k == 3) {
//                        System.out.println(i + " - " + j + " - " + "E");
//                    } else {
//                    System.out.println(i + " - " + j + " - " + k);

                    String numI = String.valueOf(i).replace("3", "E");
                    String numJ = String.valueOf(j).replace("3", "E");
                    String numK = String.valueOf(k).replace("3", "E");

                    System.out.println(numI + " - " + numJ + " - " + numK);

                }
            }
        }
    }

}
