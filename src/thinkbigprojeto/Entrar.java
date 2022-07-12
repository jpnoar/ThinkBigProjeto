/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thinkbigprojeto;

/**
 *
 * @author abreu
 */
public class Entrar extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Entrar() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField5 = new thinkbigprojeto.TextField();
        botaoPadrao1 = new thinkbigprojeto.botaoPadrao();
        passwordField1 = new thinkbigprojeto.PasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        textField5.setBackground(new java.awt.Color(51, 92, 218));
        textField5.setForeground(new java.awt.Color(255, 255, 255));
        textField5.setToolTipText("");
        textField5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textField5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textField5.setLabelText("Email");
        textField5.setLineColor(new java.awt.Color(255, 255, 255));
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        getContentPane().add(textField5);
        textField5.setBounds(670, 250, 300, 48);

        botaoPadrao1.setForeground(new java.awt.Color(51, 91, 218));
        botaoPadrao1.setText("ENTRAR");
        botaoPadrao1.setBorderColor(new java.awt.Color(51, 91, 218));
        botaoPadrao1.setColorClick(new java.awt.Color(153, 153, 153));
        botaoPadrao1.setColorOver(new java.awt.Color(204, 204, 204));
        botaoPadrao1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        botaoPadrao1.setRadius(7);
        botaoPadrao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPadrao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPadrao1);
        botaoPadrao1.setBounds(670, 400, 300, 30);

        passwordField1.setBackground(new java.awt.Color(51, 92, 213));
        passwordField1.setForeground(new java.awt.Color(255, 255, 255));
        passwordField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        passwordField1.setLabelText("Senha");
        passwordField1.setLineColor(new java.awt.Color(255, 255, 255));
        passwordField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField1);
        passwordField1.setBounds(670, 320, 300, 48);

        jButton2.setBackground(new java.awt.Color(51, 92, 218));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/botao-voltar.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1010, 550, 60, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/fundo-entrar.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void botaoPadrao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao1ActionPerformed
        Criacoes cria = new Criacoes();
        cria.show();
        
        dispose();
    }//GEN-LAST:event_botaoPadrao1ActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicial entrar = new Inicial();
        entrar.show();
        
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private thinkbigprojeto.botaoPadrao botaoPadrao1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private thinkbigprojeto.PasswordField passwordField1;
    private thinkbigprojeto.TextField textField5;
    // End of variables declaration//GEN-END:variables
}