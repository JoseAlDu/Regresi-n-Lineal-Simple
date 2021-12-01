package arc;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import metodos.*;

public class ARC extends Agent {
    protected void setup(){
        System.out.println("Regresión Cuadratica");
        addBehaviour(new MyTwoShotBehaviour());
    }

    private class MyTwoShotBehaviour extends OneShotBehaviour {
        public void action() {
            ImprimirT imp = new ImprimirT();
            imp.ImprimirSumatorias();
            imp.ImprimirMatrizAyB();
            imp.imprimirdet();
            imp.imprimirabc();
        }

        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
