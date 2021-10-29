package examples.behaviours;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import principal.RLM;

public class ARLM extends Agent{
    protected void setup(){
        System.out.println("Regresión Lineal Multiple");
        addBehaviour(new MyTwoShotBehaviour());
    }

    private class MyTwoShotBehaviour extends OneShotBehaviour {
        public void action() {
            RLM principal = new RLM(0);
            principal.amatriz();
            principal.aarregloY();
            principal.aarregloF1();
            principal.aarregloF2();
            principal.MatrizOriginal();
            principal.MatrizTranspuesta();
            principal.MatrizXT();
            principal.MatrizXTY();
            principal.Determinalte();
            principal.MatrizInversa();
            principal.Betas();
            principal.FactoresEx();
        }

        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}