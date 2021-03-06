/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thinkbigprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author abreu
 */
public class CadastrarVIP extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public CadastrarVIP() {
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

        inputDataExpiracao = new thinkbigprojeto.TextField();
        inputNumCartao = new thinkbigprojeto.TextField();
        inputCVV = new thinkbigprojeto.TextField();
        botaoPadrao2 = new thinkbigprojeto.botaoPadrao();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inputBandeira = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        inputDataExpiracao.setBackground(new java.awt.Color(51, 92, 218));
        inputDataExpiracao.setForeground(new java.awt.Color(255, 255, 255));
        inputDataExpiracao.setToolTipText("");
        inputDataExpiracao.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputDataExpiracao.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputDataExpiracao.setLabelText("Expira: dd/mm/AAAA");
        inputDataExpiracao.setLineColor(new java.awt.Color(255, 255, 255));
        inputDataExpiracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataExpiracaoActionPerformed(evt);
            }
        });
        getContentPane().add(inputDataExpiracao);
        inputDataExpiracao.setBounds(820, 300, 160, 40);

        inputNumCartao.setBackground(new java.awt.Color(51, 92, 218));
        inputNumCartao.setForeground(new java.awt.Color(255, 255, 255));
        inputNumCartao.setToolTipText("");
        inputNumCartao.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputNumCartao.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputNumCartao.setLabelText("N??mero do Cart??o");
        inputNumCartao.setLineColor(new java.awt.Color(255, 255, 255));
        inputNumCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumCartaoActionPerformed(evt);
            }
        });
        getContentPane().add(inputNumCartao);
        inputNumCartao.setBounds(670, 250, 310, 40);

        inputCVV.setBackground(new java.awt.Color(51, 92, 218));
        inputCVV.setForeground(new java.awt.Color(255, 255, 255));
        inputCVV.setToolTipText("");
        inputCVV.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputCVV.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputCVV.setLabelText("CVV");
        inputCVV.setLineColor(new java.awt.Color(255, 255, 255));
        inputCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCVVActionPerformed(evt);
            }
        });
        getContentPane().add(inputCVV);
        inputCVV.setBounds(670, 300, 140, 40);

        botaoPadrao2.setForeground(new java.awt.Color(51, 91, 218));
        botaoPadrao2.setText("CADASTRAR");
        botaoPadrao2.setBorderColor(new java.awt.Color(255, 255, 255));
        botaoPadrao2.setColorClick(new java.awt.Color(153, 153, 153));
        botaoPadrao2.setColorOver(new java.awt.Color(204, 204, 204));
        botaoPadrao2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        botaoPadrao2.setRadius(7);
        botaoPadrao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPadrao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPadrao2);
        botaoPadrao2.setBounds(670, 430, 310, 30);

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

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bandeira");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(670, 350, 110, 16);

        inputBandeira.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputBandeira.setForeground(new java.awt.Color(56, 72, 121));
        inputBandeira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mastercard", "Visa", "Elo", "American Express", "Hipercard" }));
        inputBandeira.setBorder(null);
        inputBandeira.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inputBandeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBandeiraActionPerformed(evt);
            }
        });
        getContentPane().add(inputBandeira);
        inputBandeira.setBounds(670, 370, 310, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thinkbigprojeto/fundo-cadastrarvip.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1130, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNumCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNumCartaoActionPerformed

    private void inputCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCVVActionPerformed

    private void botaoPadrao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao2ActionPerformed
        if(inputNumCartao.getText().equals("")||inputCVV.getText().equals("")|| inputDataExpiracao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Algum dos campos ou todos est??o vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            FactoryCliente factory = new FactoryCliente(); 
            Usuario clienteCadastrado = factory.getCliente("", "", "", "", "", false, inputNumCartao.getText(),inputCVV.getText(), inputDataExpiracao.getText(), String.valueOf(inputBandeira.getSelectedItem()));
            
            JOptionPane.showMessageDialog(null, "Conta VIP cadastrada!");
            
            Entrar entrar = new Entrar();
            entrar.show();
        
            dispose();
        } 
        
        dispose();
    }//GEN-LAST:event_botaoPadrao2ActionPerformed

    private void inputDataExpiracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataExpiracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataExpiracaoActionPerformed

    private void inputBandeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBandeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBandeiraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cadastrar entrar = new Cadastrar();
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
            java.util.logging.Logger.getLogger(CadastrarVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarVIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private thinkbigprojeto.botaoPadrao botaoPadrao2;
    private javax.swing.JComboBox<String> inputBandeira;
    private thinkbigprojeto.TextField inputCVV;
    private thinkbigprojeto.TextField inputDataExpiracao;
    private thinkbigprojeto.TextField inputNumCartao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
