/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thinkbigprojeto;

/**
 *
 * @author abreu
 */
public class Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Cadastrar() {
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
        textField6 = new thinkbigprojeto.TextField();
        textField7 = new thinkbigprojeto.TextField();
        textField8 = new thinkbigprojeto.TextField();
        textField9 = new thinkbigprojeto.TextField();
        textField10 = new thinkbigprojeto.TextField();
        botaoPadrao2 = new thinkbigprojeto.botaoPadrao();
        jButton1 = new javax.swing.JButton();
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
        textField5.setLabelText("Sobrenome");
        textField5.setLineColor(new java.awt.Color(255, 255, 255));
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        getContentPane().add(textField5);
        textField5.setBounds(820, 300, 150, 40);

        botaoPadrao1.setForeground(new java.awt.Color(255, 255, 255));
        botaoPadrao1.setText("CADASTRAR CONTA VIP");
        botaoPadrao1.setBorderColor(new java.awt.Color(255, 255, 255));
        botaoPadrao1.setColor(new java.awt.Color(51, 92, 213));
        botaoPadrao1.setColorClick(new java.awt.Color(51, 92, 213));
        botaoPadrao1.setColorOver(new java.awt.Color(51, 92, 213));
        botaoPadrao1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        botaoPadrao1.setRadius(7);
        botaoPadrao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPadrao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPadrao1);
        botaoPadrao1.setBounds(670, 510, 300, 30);

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
        passwordField1.setBounds(670, 250, 300, 40);

        textField6.setBackground(new java.awt.Color(51, 92, 218));
        textField6.setForeground(new java.awt.Color(255, 255, 255));
        textField6.setToolTipText("");
        textField6.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textField6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textField6.setLabelText("Endereço");
        textField6.setLineColor(new java.awt.Color(255, 255, 255));
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });
        getContentPane().add(textField6);
        textField6.setBounds(670, 350, 300, 40);

        textField7.setBackground(new java.awt.Color(51, 92, 218));
        textField7.setForeground(new java.awt.Color(255, 255, 255));
        textField7.setToolTipText("");
        textField7.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textField7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textField7.setLabelText("CPF");
        textField7.setLineColor(new java.awt.Color(255, 255, 255));
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });
        getContentPane().add(textField7);
        textField7.setBounds(820, 400, 150, 40);

        textField8.setBackground(new java.awt.Color(51, 92, 218));
        textField8.setForeground(new java.awt.Color(255, 255, 255));
        textField8.setToolTipText("");
        textField8.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textField8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textField8.setLabelText("Email");
        textField8.setLineColor(new java.awt.Color(255, 255, 255));
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });
        getContentPane().add(textField8);
        textField8.setBounds(670, 198, 300, 40);

        textField9.setBackground(new java.awt.Color(51, 92, 218));
        textField9.setForeground(new java.awt.Color(255, 255, 255));
        textField9.setToolTipText("");
        textField9.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textField9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textField9.setLabelText("Nome");
        textField9.setLineColor(new java.awt.Color(255, 255, 255));
        textField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField9ActionPerformed(evt);
            }
        });
        getContentPane().add(textField9);
        textField9.setBounds(670, 300, 140, 40);

        textField10.setBackground(new java.awt.Color(51, 92, 218));
        textField10.setForeground(new java.awt.Color(255, 255, 255));
        textField10.setToolTipText("");
        textField10.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textField10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textField10.setLabelText("Telefone");
        textField10.setLineColor(new java.awt.Color(255, 255, 255));
        textField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField10ActionPerformed(evt);
            }
        });
        getContentPane().add(textField10);
        textField10.setBounds(670, 400, 140, 40);

        botaoPadrao2.setForeground(new java.awt.Color(51, 91, 218));
        botaoPadrao2.setText("CADASTRAR CONTA GRATUITA");
        botaoPadrao2.setBorderColor(new java.awt.Color(255, 255, 255));
        botaoPadrao2.setColorClick(new java.awt.Color(153, 153, 153));
        botaoPadrao2.setColorOver(new java.awt.Color(204, 204, 204));
        botaoPadrao2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        botaoPadrao2.setRadius(7);
        botaoPadrao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPadrao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPadrao2);
        botaoPadrao2.setBounds(670, 470, 300, 30);

        jButton1.setBackground(new java.awt.Color(51, 92, 218));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/botao-voltar.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1010, 550, 60, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/fundo-cadastrar.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void botaoPadrao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao1ActionPerformed
        CadastrarVIP entrar = new CadastrarVIP();
        entrar.show();

        dispose();
    }//GEN-LAST:event_botaoPadrao1ActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    private void textField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField9ActionPerformed

    private void textField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField10ActionPerformed

    private void botaoPadrao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao2ActionPerformed
        Entrar entrar = new Entrar();
        entrar.show();
        
        dispose();
    }//GEN-LAST:event_botaoPadrao2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicial entrar = new Inicial();
        entrar.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private thinkbigprojeto.botaoPadrao botaoPadrao1;
    private thinkbigprojeto.botaoPadrao botaoPadrao2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private thinkbigprojeto.PasswordField passwordField1;
    private thinkbigprojeto.TextField textField10;
    private thinkbigprojeto.TextField textField5;
    private thinkbigprojeto.TextField textField6;
    private thinkbigprojeto.TextField textField7;
    private thinkbigprojeto.TextField textField8;
    private thinkbigprojeto.TextField textField9;
    // End of variables declaration//GEN-END:variables
}