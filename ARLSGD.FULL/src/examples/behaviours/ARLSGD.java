package examples.behaviours;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import principal.RLS;

public class ARLSGD extends Agent{
    protected void setup(){
        System.out.println("Regresion Lineal Simple");
        addBehaviour(new MyOneShotBehaviour());
    }

    private class MyOneShotBehaviour extends OneShotBehaviour{
        public void action (){
            RLS principal = new RLS(0,0,0,0,0,0,0,0,0,0,0,0,0,0);
            principal.ax();
            principal.ay();
            principal.axx2();
            principal.axy();
            principal.ImpresionTablas();
            principal.Sumatorias();
            principal.Resultadosb0b1();
            principal.SumatoriasStep123();
            principal.CalculosStep123();
            principal.CalculoResultadosGD();
        }
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}