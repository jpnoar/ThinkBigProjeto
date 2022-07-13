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

        inputSobrenome = new thinkbigprojeto.TextField();
        botaoPadrao1 = new thinkbigprojeto.botaoPadrao();
        inputSenha = new thinkbigprojeto.PasswordField();
        inputEndereco = new thinkbigprojeto.TextField();
        inputCPF = new thinkbigprojeto.TextField();
        inputEmail = new thinkbigprojeto.TextField();
        inputNome = new thinkbigprojeto.TextField();
        inputTelefone = new thinkbigprojeto.TextField();
        botaoPadrao2 = new thinkbigprojeto.botaoPadrao();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        inputSobrenome.setBackground(new java.awt.Color(51, 92, 218));
        inputSobrenome.setForeground(new java.awt.Color(255, 255, 255));
        inputSobrenome.setToolTipText("");
        inputSobrenome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputSobrenome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputSobrenome.setLabelText("Sobrenome");
        inputSobrenome.setLineColor(new java.awt.Color(255, 255, 255));
        inputSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(inputSobrenome);
        inputSobrenome.setBounds(820, 300, 150, 40);

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

        inputSenha.setBackground(new java.awt.Color(51, 92, 213));
        inputSenha.setForeground(new java.awt.Color(255, 255, 255));
        inputSenha.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputSenha.setLabelText("Senha");
        inputSenha.setLineColor(new java.awt.Color(255, 255, 255));
        inputSenha.setSelectionColor(new java.awt.Color(255, 255, 255));
        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(inputSenha);
        inputSenha.setBounds(670, 250, 300, 40);

        inputEndereco.setBackground(new java.awt.Color(51, 92, 218));
        inputEndereco.setForeground(new java.awt.Color(255, 255, 255));
        inputEndereco.setToolTipText("");
        inputEndereco.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputEndereco.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputEndereco.setLabelText("Endereço");
        inputEndereco.setLineColor(new java.awt.Color(255, 255, 255));
        inputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(inputEndereco);
        inputEndereco.setBounds(670, 350, 300, 40);

        inputCPF.setBackground(new java.awt.Color(51, 92, 218));
        inputCPF.setForeground(new java.awt.Color(255, 255, 255));
        inputCPF.setToolTipText("");
        inputCPF.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputCPF.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputCPF.setLabelText("CPF");
        inputCPF.setLineColor(new java.awt.Color(255, 255, 255));
        inputCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCPFActionPerformed(evt);
            }
        });
        getContentPane().add(inputCPF);
        inputCPF.setBounds(820, 400, 150, 40);

        inputEmail.setBackground(new java.awt.Color(51, 92, 218));
        inputEmail.setForeground(new java.awt.Color(255, 255, 255));
        inputEmail.setToolTipText("");
        inputEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputEmail.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputEmail.setLabelText("Email");
        inputEmail.setLineColor(new java.awt.Color(255, 255, 255));
        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });
        getContentPane().add(inputEmail);
        inputEmail.setBounds(670, 198, 300, 40);

        inputNome.setBackground(new java.awt.Color(51, 92, 218));
        inputNome.setForeground(new java.awt.Color(255, 255, 255));
        inputNome.setToolTipText("");
        inputNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputNome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputNome.setLabelText("Nome");
        inputNome.setLineColor(new java.awt.Color(255, 255, 255));
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });
        getContentPane().add(inputNome);
        inputNome.setBounds(670, 300, 140, 40);

        inputTelefone.setBackground(new java.awt.Color(51, 92, 218));
        inputTelefone.setForeground(new java.awt.Color(255, 255, 255));
        inputTelefone.setToolTipText("");
        inputTelefone.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        inputTelefone.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        inputTelefone.setLabelText("Telefone");
        inputTelefone.setLineColor(new java.awt.Color(255, 255, 255));
        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(inputTelefone);
        inputTelefone.setBounds(670, 400, 140, 40);

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

    private void inputSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSobrenomeActionPerformed

    private void botaoPadrao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao1ActionPerformed
        if(inputNome.getText().equals("")||inputSobrenome.getText().equals("")|| inputEndereco.getText().equals("")|| inputTelefone.getText().equals("")||inputCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Algum dos campos ou todos estão vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
        CadastrarVIP entrar = new CadastrarVIP();
        entrar.show();

        dispose();
        }
    }//GEN-LAST:event_botaoPadrao1ActionPerformed

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed

    private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoActionPerformed

    private void inputCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFActionPerformed

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneActionPerformed

    private void botaoPadrao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPadrao2ActionPerformed
        if(inputNome.getText().equals("")||inputSobrenome.getText().equals("")|| inputEndereco.getText().equals("")|| inputTelefone.getText().equals("")||inputCPF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Algum dos campos ou todos estão vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            FactoryCliente factory = new FactoryCliente();
            Usuario clienteCadastrado = factory.getCliente(inputNome.getText(), inputSobrenome.getText(), inputEndereco.getText(), inputTelefone.getText(), inputCPF.getText(), false, "", "", "", "");
            
            JOptionPane.showMessageDialog(null, "Conta normal cadastrada!");
            
            Entrar entrar = new Entrar();
            entrar.show();
        
            dispose();
        } 
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
    private thinkbigprojeto.TextField inputCPF;
    private thinkbigprojeto.TextField inputEmail;
    private thinkbigprojeto.TextField inputEndereco;
    private thinkbigprojeto.TextField inputNome;
    private thinkbigprojeto.PasswordField inputSenha;
    private thinkbigprojeto.TextField inputSobrenome;
    private thinkbigprojeto.TextField inputTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
