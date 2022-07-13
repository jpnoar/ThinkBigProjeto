package thinkbigprojeto;

public class Planta {
    private String nomePlanta;
    private String visualizacao;

    public Planta(String nomePlanta, String visualizacao) {
        this.nomePlanta = nomePlanta;
        this.visualizacao = visualizacao;
    }

    public String getNomePlanta() {
        return nomePlanta;
    }

    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }

    public String getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(String visualizacao) {
        this.visualizacao = visualizacao;
    }
    
}
