package principal;

public class RLS extends Principal {
    public RLS(double sx, double sy, double sx2, double sxy, double b0, double b1, double sg, double sd, double sr, double error,
               double b0r, double b1r, double g, double d) {
        super(sx, sy, sx2, sxy, b0, b1, sg, sd, sr, error, b0r, b1r, g, d);
    }

    public double[] ax (){
        x [0] = 23;
        x [1] = 26;
        x [2] = 30;
        x [3] = 34;
        x [4] = 43;
        x [5] = 48;
        x [6] = 52;
        x [7] = 57;
        x [8] = 58;
        return x;
    }

    public double[] ay (){
        y [0] = 651;
        y [1] = 762;
        y [2] = 856;
        y [3] = 1063;
        y [4] = 1190;
        y [5] = 1298;
        y [6] = 1421;
        y [7] = 1440;
        y [8] = 1518;
        return y;
    }

    public double[] axx2 (){
        xx2 [0] = 0;
        xx2 [1] = 0;
        xx2 [2] = 0;
        xx2 [3] = 0;
        xx2 [4] = 0;
        xx2 [5] = 0;
        xx2 [6] = 0;
        xx2 [7] = 0;
        xx2 [8] = 0;
        return xx2;
    }

    public double[] axy (){
        xy [0] = 0;
        xy [1] = 0;
        xy [2] = 0;
        xy [3] = 0;
        xy [4] = 0;
        xy [5] = 0;
        xy [6] = 0;
        xy [7] = 0;
        xy [8] = 0;
        return xy;
    }

    public void ImpresionTablas() {
        System.out.println("N | X    | Y ");
        System.out.println("--|------|--------");
        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + " | " + x[i] + " | " + y[i]);
        }
    }

    public void Sumatorias() {
        for (int i = 0; i < 9; i++) {
            sx += x[i];
            sy += y[i];
            xx2[i] = x[i] * x[i];
            xy[i] = x[i] * y[i];
        }
        for (int i = 0; i < 9; i++) {
            sx2 += xx2[i];
            sxy += xy[i];
        }
    }

    public void Resultadosb0b1() {
        b0 = (((sy * sx2) - (sx * sxy)) / ((9 * sx2) - (sx * sx)));
        b1 = (((9 * sxy) - (sx * sy)) / ((9 * sx2) - (sx * sx)));
        System.out.println("B0 = " + b0);
        System.out.println("B1 = " + b1);
    }

    public void SumatoriasStep123() {

        System.out.println("\nTecnica Gradiente");
        for (int i = 0; i < 9; i++) {
            sg += (y[i] - (b0 + b1 * x[i]));
            sd += x[1] * (y[i] - (b0 + b1 * x[i]));
            sr += (y[i] - (b0 + b1 * x[i])) * (y[i] - (b0 + b1 * x[i]));
        }
    }

    public void CalculosStep123() {
        g = ((-1 * 0.22) * sg);
        d = ((-1 * 0.22) * sd);
        error = (0.11 * sr);
        System.out.println("Resultado 1 del Step 2: "+g);
        System.out.println("Resultado 2 del Step 2: "+d);
        System.out.println("El error es: "+error);
    }

    public void CalculoResultadosGD() {
        b0r = (b0 - (0.003 * (0 / -1)));
        for (int i = 0; i < 9; i++) {
            b1r = (b1 - (0.003 * (0 / (-23 * x[i]))));
        }

        System.out.println("B0: " + b0r);
        System.out.println("B1: " + b1r);
    }
}