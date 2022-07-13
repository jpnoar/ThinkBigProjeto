package thinkbigprojeto;

import thinkbigprojeto.visualizacaoState.Paisagem;
import thinkbigprojeto.visualizacaoState.VisualizacaoState;

public class Visualizacao {
    protected VisualizacaoState estado;

    public Visualizacao() {
        this.estado = new Paisagem();
    }
    
    public void trocarParaRetrato(){
        this.estado = estado.trocarParaRetrato();
    }
    
    public void trocarParaQuadrada(){
        this.estado = estado.trocarParaQuadrada();
    }
    
    public void trocarParaPaisagem(){
        this.estado = estado.trocarParaPaisagem();
    }
}
