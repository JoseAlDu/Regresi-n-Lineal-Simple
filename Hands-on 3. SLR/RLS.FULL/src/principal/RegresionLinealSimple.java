package principal;

public class RegresionLinealSimple extends Principal {

    public RegresionLinealSimple(double sx, double sy, double sx2, double sxy, double b0, double b1) {
        super(sx, sy, sx2, sxy, b0, b1);
    }

    public double[] ax() {
        x[0] = 23;
        x[1] = 26;
        x[2] = 30;
        x[3] = 34;
        x[4] = 43;
        x[5] = 48;
        x[6] = 52;
        x[7] = 57;
        x[8] = 58;
        return x;
    }

    public double[] ay() {
        y[0] = 651;
        y[1] = 762;
        y[2] = 856;
        y[3] = 1063;
        y[4] = 1190;
        y[5] = 1298;
        y[6] = 1421;
        y[7] = 1440;
        y[8] = 1518;
        return y;
    }

    public double[] aextrasx(){
        extrasx[0] = 62;
        extrasx[1] = 72;
        extrasx[2] = 82;
        return extrasx;
    }

    public void TablaXY() {
        System.out.println("N | X    | Y ");
        System.out.println("--|------|--------");
        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + " | " + x[i] + " | " + y[i]);
        }
    }

    public void Calculob0b1() {
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
        b0 = (((sy * sx2) - (sx * sxy)) / ((9 * sx2) - (sx * sx)));
        b1 = (((9 * sxy) - (sx * sy)) / ((9 * sx2) - (sx * sx)));
        System.out.println("B0 = " + b0);
        System.out.println("B1 = " + b1);
    }

    public void CalculoY(){
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