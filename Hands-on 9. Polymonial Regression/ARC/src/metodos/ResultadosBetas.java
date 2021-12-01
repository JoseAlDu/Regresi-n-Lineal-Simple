package metodos;

public class ResultadosBetas extends Determinantes {
    protected double[] abc = new double[3];
    Determinantes det = new Determinantes();
    double detS = det.detS();
    double detA = det.detA();
    double detB = det.detB();
    double detC = det.detC();
    public double [] abc(){
        abc[0] = detA/detS;
        abc[1] = detB/detS;
        abc[2] = detC/detS;
        return abc;
    }
}
