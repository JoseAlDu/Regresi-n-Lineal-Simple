package main;
import principal.RegresionLinealSimple;

public class Main {
    public static void main (String[] args){
        RegresionLinealSimple RLS = new RegresionLinealSimple(0,0,0,0,0,0);
        RLS.ax();
        RLS.ay();
        RLS.aextrasx();
        RLS.TablaXY();
        RLS.Calculob0b1();
        RLS.CalculoY();
    }
}