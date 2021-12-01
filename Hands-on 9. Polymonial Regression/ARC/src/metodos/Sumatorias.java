package metodos;

public class Sumatorias extends Principal{
    protected double sx, sy, sxy, sx2, sx3, sx4, sx2y;
    int n = n();

    public double sx(){
        for (int i=0; i<n; i++) {
            sx += x[i];
        }
        return sx;
    }

    public double sy(){
        for (int i=0; i<n; i++) {
            sy += y[i];
        }
        return sy;
    }

    public double sxy(){
        for (int i=0; i<n; i++) {
            sxy += x[i] * y[i];
        }
        return sxy;
    }

    public double sx2(){
        for (int i=0; i<n; i++) {
            sx2 += x[i] * x[i];
        }
        return sx2;
    }

    public double sx3(){
        for (int i=0; i<n; i++) {
            sx3 += x[i] * x[i] * x[i];
        }
        return sx3;
    }

    public double sx4(){
        for (int i=0; i<n; i++) {
            sx4 += x[i] * x[i] * x[i] * x[i];
        }
        return sx4;
    }

    public double sx2y(){
        for (int i=0; i<n; i++) {
            sx2y += (x[i] * x[i]) * y[i];
        }
        return sx2y;
    }
}
