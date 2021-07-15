package BeutifulSalon.view.Edicao;

import BeutifulSalon.model.Produto;
import BeutifulSalon.controller.ProdutoController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Dinheiro;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Melissa
 */

//VIEW
public class EditarProduto extends javax.swing.JFrame {
    
    public EditarProduto() {
        initComponents();
    }
     public EditarProduto(Produto produto) {
       
        
        initComponents();
        
       DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = produto.getDataValidade().format(formatterData);
        
        jTextFieldNome.setText(produto.getNome());
        jTextFieldMarca.setText(produto.getMarca());
        jTextFieldDataValidade.setText(dateString);
        jTextFieldPreco.setText(Dinheiro.parseString(produto.getPreco()));
        jTextFieldID.setText(Long.toString(produto.getId_produto()));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JPCadastroClientes1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldDataValidade = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        JPCadastroClientes1.setBackground(new java.awt.Color(243, 244, 245));

        jLabel17.setBackground(new java.awt.Color(34, 34, 34));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(34, 34, 34));
        jLabel17.setText("Editar Produto");

        jPanel26.setBackground(new java.awt.Color(243, 244, 245));
        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        jButtonAtualizar.setBackground(new java.awt.Color(57, 201, 114));
        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.setBorder(null);
        jButtonAtualizar.setBorderPainted(false);
        jButtonAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAtualizar.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jPanel26.add(jButtonAtualizar);

        jButtonCancelar.setBackground(new java.awt.Color(248, 67, 69));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel26.add(jButtonCancelar);

        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("*Nome Produto");

        jTextFieldMarca.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Marca");

        jTextFieldPreco.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("*Preço de Venda ");

        jTextFieldDataValidade.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jTextFieldDataValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldDataValidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDataValidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Data de Validade");

        jTextFieldID.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setEnabled(false);
        jTextFieldID.setFocusable(false);
        jTextFieldID.setPreferredSize(new java.awt.Dimension(1, 1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("ID");

        javax.swing.GroupLayout JPCadastroClientes1Layout = new javax.swing.GroupLayout(JPCadastroClientes1);
        JPCadastroClientes1.setLayout(JPCadastroClientes1Layout);
        JPCadastroClientes1Layout.setHorizontalGroup(
            JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldDataValidade)
                                        .addGap(4, 4, 4))
                                    .addComponent(jLabel27))
                                .addGap(233, 233, 233))
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 0, 0))
        );
        JPCadastroClientes1Layout.setVerticalGroup(
            JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCadastroClientes1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPCadastroClientes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(JPCadastroClientes1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //salvar produto
    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed

        boolean sucessoAoAtualizar;

        try {

            ProdutoController pc = new ProdutoController();
            sucessoAoAtualizar = pc.AtualizarProduto(
                    jTextFieldNome.getText(),
                    jTextFieldMarca.getText(),
                    Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldPreco.getText())),
                    jTextFieldDataValidade.getText(),
                    Long.parseLong(jTextFieldID.getText())
            );

            if (sucessoAoAtualizar) {
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso.");
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar, preencha todos os campos!");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        } catch (ExceptionDAO ex) {
            Logger.getLogger(EditarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int opc = JOptionPane.showConfirmDialog(null,"Realmente deseja sair?", "Editar Produto", JOptionPane.YES_NO_OPTION);
         
        if(opc == 0){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new EditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPCadastroClientes1;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JFormattedTextField jTextFieldDataValidade;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JFormattedTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables

    public void limparTelaCadastroProduto() {
                jTextFieldNome.setText(""); 
                jTextFieldMarca.setText(""); 
                jTextFieldPreco.setText(""); 
                jTextFieldDataValidade.setText("");
    }
}