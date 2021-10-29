package principal;

public abstract class Principal {
    protected double sx, sy, sx2, sxy, b0, b1;
    protected double x[] = new double[9];
    protected double y[] = new double[9];
    protected double xx2[] = new double[9];
    protected double xy[] = new double[9];
    protected double[] extrasx = new double[3];
    protected double[] extrasy = new double[3];

    public Principal(double sx, double sy, double sx2, double sxy, double b0, double b1) {
        this.sx = sx;
        this.sy = sy;
        this.sx2 = sx2;
        this.sxy = sxy;
        this.b0 = b0;
        this.b1 = b1;
    }

    public abstract double[] ax();

    public abstract double[] ay();

    public abstract void ImpresionTablas();

    public abstract void Sumatorias();

    public abstract void Resultadosb0b1();
}