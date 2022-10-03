package Entidades;

public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminante() {
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        return discriminante;
    }

    public boolean tieneRaices() {
        boolean raices;
        if (getDiscriminante() >= 0) {
            return raices = true;
        } else {
            return raices = false;
        }
    }

    public boolean tieneRaiz() {
        boolean raiz;
        if (getDiscriminante() == 0) {
            return raiz = true;
        } else {
            return raiz = false;
        }
    }

    public void getRaices() {

        System.out.println("Tiene 2 raices");
//            double x1 = (double) ((-b + (Math.sqrt(((Math.pow(b, 2) - (4 * a * c)))))) / (2 * a));
//            double x2 = (double) ((-b - (Math.sqrt(((Math.pow(b, 2) - (4 * a * c)))))) / (2 * a));
//            System.out.println("x1 : " + x1);
//            System.out.println("x2 : " + x2);
        System.out.println("x1: " + getRaizPositiva());
        System.out.println("x2: " + getRaizNegativa());

    }

    public void getRaiz() {

        System.out.println("Tiene una raiz unica: ");
//            double unaSolucion = (double) ((-b + (Math.sqrt(((Math.pow(b, 2) - (4 * a * c)))))) / (2 * a));
//            System.out.println("raiz unica : " + unaSolucion);
        System.out.println("x1: " + getRaizPositiva());

    }

    public int getRaizPositiva() {
        return (int) ((-b + (Math.sqrt(((Math.pow(b, 2) - (4 * a * c)))))) / (2 * a));
    }

    public int getRaizNegativa() {
        return (int) ((-b - (Math.sqrt(((Math.pow(b, 2) - (4 * a * c)))))) / (2 * a));
    }

    //( -b ± √ ((b^2) - (4*a*c))) / (2*a)
    public void calcular() {
        if (tieneRaices()) {
            getRaices();
        } else if (tieneRaiz()) {
            getRaiz();
        } else {
            System.out.println("No solucion");
        }

    }

}
