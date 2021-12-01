package metodos;

public abstract class Principal {
    protected double x[] = {-3, -2, -1, 0, 1, 2, 3};
    protected double y[] = {7.5, 3, 0.5, 1, 3, 6, 14};
    //protected double x[] = {50, 50, 50, 70, 70, 70, 80, 80, 80, 90, 90, 90, 100, 100, 100};
    //protected double y[] = {3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5, 2.9, 2.4, 3.0, 3.1, 2.8, 3.3, 3.5, 3.0};
    //protected double x[] = {0, 20, 40, 60, 80, 100};
    //protected double y[] = {0.0002, 0.0012, 0.0060, 0.0300, 0.0900, 0.2700};
    protected int n;

    public int n(){
        for (int i=0; i<x.length; i++){
            n += 1;
        }
        return n;
    }
}
