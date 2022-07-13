package thinkbigprojeto.visualizacaoState;

public class Paisagem implements VisualizacaoState{
    public String s = "Paisagem";
    
    @Override
    public VisualizacaoState trocarParaPaisagem(){
        return this;
    }
    
    @Override
    public VisualizacaoState trocarParaRetrato(){
        return new Retrato();
    }
    
    @Override
    public VisualizacaoState trocarParaQuadrada(){
        return new Quadrada();
    }
}
