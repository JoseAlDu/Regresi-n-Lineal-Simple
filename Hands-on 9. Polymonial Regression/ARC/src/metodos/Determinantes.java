package metodos;

public class Determinantes extends Sumatorias {
    protected double detS, detA, detB, detC;
    Sumatorias sum = new Sumatorias();
    double sx = sum.sx();
    double sy = sum.sy();
    double sxy = sum.sxy();
    double sx2 = sum.sx2();
    double sx3 = sum.sx3();
    double sx4 = sum.sx4();
    double sx2y = sum.sx2y();

    public double detS(){
        detS = ((sx4*sx2*n)+(sx3*sx*sx2)+(sx2*sx3*sx));
        detS += ((sx2*sx2*sx2*-1)-(sx*sx*sx4)-(n*sx3*sx3));
        return detS;
    }

    public double detA(){
        detA = ((sx2y*sx2*n)+(sx3*sx*sy)+(sx2*sxy*sx));
        detA += ((sy*sx2*sx2*-1)-(sx*sx*sx2y)-(n*sxy*sx3));
        return detA;
    }

    public double detB(){
        detB = ((sx4*sxy*n)+(sx2y*sx*sx2)+(sx2*sx3*sy));
        detB += ((sx2*sxy*sx2*-1)-(sy*sx*sx4)-(n*sx3*sx2y));
        return detB;
    }

    public double detC(){
        detC = ((sx4*sx2*sy)+(sx3*sxy*sx2)+(sx2y*sx3*sx));
        detC += ((sx2*sx2*sx2y*-1)-(sx*sxy*sx4)-(sy*sx3*sx3));
        return detC;
    }
}
