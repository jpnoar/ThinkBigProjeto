package thinkbigprojeto;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class PlantaListadaFacade {
    private Planta planta = null;
    private ListModel lista = null;

    public PlantaListadaFacade(Planta plantaRecebida) {
        this.planta = plantaRecebida;
    }
    
    public JList AdicionarPlanta(JList listaPlantas){
        lista = listaPlantas.getModel();
        DefaultListModel m = new DefaultListModel();
        for(int i=0; i < lista.getSize();i++){
            m.addElement(lista.getElementAt(i));
        }
        
        m.addElement(planta.getNomePlanta()+" | "+planta.getVisualizacao());
        listaPlantas.setModel(m);
        
        return listaPlantas;
    }
}
