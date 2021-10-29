package principal;

public abstract class Principal {
    protected double detA;
    protected double matriz [][] = new double[17][3];
    protected double matrizT [][] = new double[3][17];
    protected double matrizXT [][] = new double[3][3];
    protected double matrizI [][] = new double[3][3];
    protected double arregloY[] = new double[17];
    protected double arregloX[] = new  double[3];
    protected double arreglob[] = new  double[3];
    protected double arregloF1 [] = new double[6];
    protected double arregloF2 [] = new double[6];
    protected double arregloYEX [] = new double[6];
    protected double arreglo1[] = new  double[17];
    protected double arreglo2[] = new  double[17];
    protected double arreglo3[] = new  double[17];
    protected double arreglo4[] = new  double[17];
    protected double arreglo5[] = new  double[17];
    protected double arreglo6[] = new  double[17];
    protected double arreglo7[] = new  double[17];
    protected double arreglo8[] = new  double[17];
    protected double arreglo9[] = new  double[17];
    protected double arreglo10[] = new  double[17];
    protected double arreglo11[] = new  double[17];
    protected double arreglo12[] = new  double[17];

    public Principal(double detA) {
        this.detA = detA;
    }
    public abstract double[][] amatriz();

    public abstract double[] aarregloY();

    public abstract double[] aarregloF1();

    public abstract double[] aarregloF2();

    public abstract void MatrizOriginal();

    public abstract void MatrizTranspuesta();

    public abstract void MatrizXT();

    public abstract void MatrizXTY();

    public abstract void Determinalte();

    public abstract void MatrizInversa();

    public abstract void Betas();

    public abstract void FactoresEx();
}