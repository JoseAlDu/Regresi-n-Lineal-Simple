package principal;

public class RLS extends Principal {
    public RLS(double sx, double sy, double sx2, double sxy, double b0, double b1) {
        super(sx, sy, sx2, sxy, b0, b1);
    }

    public double[] ax() {
        x[0] = 2;
        x[1] = 4;
        x[2] = 6;
        x[3] = 8;
        x[4] = 10;
        x[5] = 12;
        x[6] = 14;
        x[7] = 16;
        x[8] = 18;
        return x;
    }

    public double[] ay() {
        y[0] = 4;
        y[1] = 8;
        y[2] = 12;
        y[3] = 16;
        y[4] = 20;
        y[5] = 24;
        y[6] = 28;
        y[7] = 32;
        y[8] = 36;
        return y;
    }

    public double[] aextrasx(){
        extrasx[0] = 62;
        extrasx[1] = 72;
        extrasx[2] = 82;
        return extrasx;
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

    public void Extras(){
        for (int i = 0; i < 3; i++) {
            extrasy[i] = extrasx[i] * b1 + b0;
        }
        System.out.println("\nCalculando Y respecto a X");
        System.out.println("X    | Y");
        System.out.println("-----|--------");
        for (int i = 0; i < 3; i++) {
            System.out.println(extrasx[i] + " | " + extrasy[i]);
        }
    }
}