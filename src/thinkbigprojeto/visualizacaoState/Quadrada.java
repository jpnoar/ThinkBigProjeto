package thinkbigprojeto.visualizacaoState;

public class Quadrada implements VisualizacaoState{
    public String s = "Quadrada";
    
    @Override
    public VisualizacaoState trocarParaPaisagem(){
        return new Paisagem();
    }
    
    @Override
    public VisualizacaoState trocarParaRetrato(){
        return new Retrato();
    }
    
    @Override
    public VisualizacaoState trocarParaQuadrada(){
        return this;
    }
}
