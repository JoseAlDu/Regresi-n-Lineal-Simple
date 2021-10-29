package principal;

public abstract class Principal {
    protected double sx,sy,sx2,sxy,b0,b1,sg,sd,sr,error,b0r,b1r,g,d;
    protected double x[] = new double[9];
    protected double y[] = new double[9];
    protected double xx2[] = new double[9];
    protected double xy[] = new double[9];

    public Principal(double sx, double sy, double sx2, double sxy, double b0, double b1, double sg, double sd,
                     double sr, double error, double b0r, double b1r, double g, double d) {
        this.sx = sx;
        this.sy = sy;
        this.sx2 = sx2;
        this.sxy = sxy;
        this.b0 = b0;
        this.b1 = b1;
        this.sg = sg;
        this.sd = sd;
        this.sr = sr;
        this.error = error;
        this.b0r = b0r;
        this.b1r = b1r;
        this.g = g;
        this.d = d;
    }

    public abstract double[] ax();

    public abstract double[] ay();

    public abstract double[] axx2();

    public abstract double[] axy();

    public abstract void ImpresionTablas();

    public abstract void Sumatorias();

    public abstract void Resultadosb0b1();

    public abstract void SumatoriasStep123();

    public abstract void CalculosStep123();

    public abstract void CalculoResultadosGD();
}