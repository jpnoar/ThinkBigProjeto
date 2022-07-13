/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thinkbigprojeto;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author abreu
 */
public class Criacoes extends javax.swing.JFrame {
    Criar criar;
    /**
     * Creates new form Inicial
     */
    public Criacoes() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.criar = new Criar();
        
        scrollPlantas.setVerticalScrollBar(new ScrollBarCustom());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoPadrao1 = new thinkbigprojeto.botaoPadrao();
        msg = new javax.swing.JLabel();
        scrollPlantas = new javax.swing.JScrollPane();
        listaPlantas = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 650));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        botaoPadrao1.setBackground(new java.awt.Color(56, 72, 121));
        botaoPadrao1.setForeground(new java.awt.Color(255, 255, 255));
        botaoPadrao1.setText("CRIAR PLANTA");
        botaoPadrao1.setBorderColor(new java.awt.Color(56, 72, 121));
        botaoPadrao1.setColor(new java.awt.Color(56, 72, 121));
        botaoPadrao1.setColorClick(new java.awt.Color(56, 72, 121));
        botaoPadrao1.setColorOver(new java.awt.Color(39, 52, 89));
        botaoPadrao1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        botaoPadrao1.setRadius(7);
        botaoPadrao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPadrao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPadrao1);
        botaoPadrao1.setBounds(890, 110, 190, 40);

        msg.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        msg.setForeground(new java.awt.Color(138, 136, 158));
        msg.setText("Não há nenhuma criação de planta.");
        getContentPane().add(msg);
        msg.setBounds(420, 380, 340, 40);

        listaPlantas.setBorder(null);
        listaPlantas.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        listaPlantas.setForeground(new java.awt.Color(56, 72, 121));
        listaPlantas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPlantas.setAlignmentX(1.0F);
        listaPlantas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaPlantas.setSelectionBackground(new java.awt.Color(204, 204, 255));
        listaPlantas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPlantasMouseClicked(evt);
            }
        });
        listaPlantas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPlantasValueChanged(evt);
            }
        });
        scrollPlantas.setViewportView(listaPlantas);

        getContentPane().add(scrollPlantas);
        scrollPlantas.setBounds(40, 180, 1040, 440);

        jButton2.setBackground(new java.awt.Color(51, 92, 218));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/botao-sair.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1020, 20, 60, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/fundo-criacoes.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPadrao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao1ActionPerformed
        this.criar.setVisible(true);
        

        
    }//GEN-LAST:event_botaoPadrao1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicial entrar = new Inicial();
        entrar.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listaPlantasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPlantasMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Você deseja excluir a planta "+listaPlantas.getSelectedValue() + "?", "Excluir planta", dialogButton);
        if(dialogResult == 0) {
            //listaPlantas.remove(listaPlantas.getSelectedIndex());
            int indice = listaPlantas.getSelectedIndex();
           
          // exclui o item selecionado
            if(indice > -1)
                ((DefaultListModel)(listaPlantas.getModel())).remove(indice); 
        } 
    }//GEN-LAST:event_listaPlantasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if(this.criar.getNome()!= null && this.criar.getVisualizacao() != null){
            Planta p = new Planta(this.criar.getNome(), this.criar.getVisualizacao());

            PlantaListadaFacade pl = new PlantaListadaFacade(p);

            listaPlantas = pl.AdicionarPlanta(listaPlantas);
            this.criar.setNome(null);
            this.criar.setVisualizacao(null);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void listaPlantasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPlantasValueChanged
        msg.setVisible(false);
    }//GEN-LAST:event_listaPlantasValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Criacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Criacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Criacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Criacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Criacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private thinkbigprojeto.botaoPadrao botaoPadrao1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> listaPlantas;
    private javax.swing.JLabel msg;
    private javax.swing.JScrollPane scrollPlantas;
    // End of variables declaration//GEN-END:variables
}
