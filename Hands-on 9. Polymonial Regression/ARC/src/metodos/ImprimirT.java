package metodos;

public class ImprimirT extends ResultadosBetas {
    Sumatorias sum = new Sumatorias();
    Determinantes det = new Determinantes();
    ResultadosBetas resul = new ResultadosBetas();
    double [] abc = resul.abc();

    public void ImprimirSumatorias() {
        System.out.println("Sumatoria x  |         Sumatoria y        |       Sumatoria x*y        |   Sumatoria x2  |   Sumatoria x3   |   Sumatoria x4   |   Sumatoria x2*y");
        System.out.println("-------------|----------------------------|----------------------------|-----------------|------------------|------------------|-------------------");
        System.out.println("   "+sum.sx() + "     |    " + sum.sy() + "     |    " + sum.sxy() + "      |     " + sum.sx2() + "     |    " + sum.sx3() + "     |     " + sum.sx4() + "     |     " + sum.sx2y());
    }

    public void ImprimirMatrizAyB() {
        System.out.println("\nMatriz A:");
        System.out.println(sum.sx4()+"    "+sum.sx3()+"    "+sum.sx2());
        System.out.println(sum.sx3()+"    "+sum.sx2()+"    "+sum.sx());
        System.out.println(sum.sx2()+"    "+sum.sx()+"    "+n);

        System.out.println("\nMatriz B:");
        System.out.println(sum.sx2y()+"\n"+sum.sxy()+"\n"+sum.sy());
    }

    public void imprimirdet(){
        System.out.println("\nDeterminante S: "+det.detS());
        System.out.println("Determinante A: "+det.detA());
        System.out.println("Determinante B: "+det.detB());
        System.out.println("Determinante C: "+det.detC());
    }

    public void imprimirabc(){
        System.out.println("\nB0 = "+abc[0]);
        System.out.println("B1 = "+abc[1]);
        System.out.println("B2 = "+abc[2]);
    }
}
