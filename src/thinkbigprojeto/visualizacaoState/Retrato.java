package thinkbigprojeto.visualizacaoState;

public class Retrato implements VisualizacaoState{
    public String s = "Retrato";
    
    @Override
    public VisualizacaoState trocarParaPaisagem(){
        return new Paisagem();
    }
    
    @Override
    public VisualizacaoState trocarParaRetrato(){
        return this;
    }
    
    @Override
    public VisualizacaoState trocarParaQuadrada(){
        return new Quadrada();
    }
}
