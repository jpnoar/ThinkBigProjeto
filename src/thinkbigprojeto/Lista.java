package thinkbigprojeto;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class Lista {
    private DefaultListModel l = new DefaultListModel();

    public Lista(DefaultListModel listaRecebida) {
        this.l = listaRecebida;
    }
    
    public void adicionarElemento(String item){
        this.l.addElement(item);
    }
    

}
