/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view.modais;

import BeutifulSalon.Ferramentas.ManipulaFontes;
import BeutifulSalon.controller.ServicoController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Dinheiro;
import BeutifulSalon.model.Observado;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Servico;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateus
 */
public class modalServicoUnico extends javax.swing.JFrame implements Observado {

    /**
     * Creates new form modalServicoUnico
     */
    ArrayList<Observador> observadores = new ArrayList<>();

    public modalServicoUnico() {
        initComponents();
        
        ManipulaFontes mf = new ManipulaFontes();
        
        jLabel2.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 18f)); //Busca por nome
        jTextFieldNomeServico.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 13f)); //Box Busca por Nome
        jLabel3.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 18f)); //Selecione o Serviço que deseja registrar o orçamento previsto
        jTableConsultaServicos.setFont(mf.getFont(mf.SEMIBOLD, Font.PLAIN, 13f)); //Tabela1
        jButton1.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 18f)); //Concluir
        
        listarServicos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaServicos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldNomeServico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableConsultaServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Preço", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableConsultaServicos);
        if (jTableConsultaServicos.getColumnModel().getColumnCount() > 0) {
            jTableConsultaServicos.getColumnModel().getColumn(2).setMinWidth(1);
            jTableConsultaServicos.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTableConsultaServicos.getColumnModel().getColumn(2).setMaxWidth(1);
        }

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldNomeServico.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldNomeServicoCaretUpdate(evt);
            }
        });
        jTextFieldNomeServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeServicoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Busca por Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Selecione o Serviço que deseja registrar o orçamento previsto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 422, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeServicoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldNomeServicoCaretUpdate
        if (jTextFieldNomeServico.getText().equals("")) {
            listarServicos();
        }else{
            
            String nome = jTextFieldNomeServico.getText();
        DefaultTableModel model = (DefaultTableModel) jTableConsultaServicos.getModel();
        model.setRowCount(0);

        ServicoController sc = new ServicoController();

        ArrayList<Servico> servicos = null;

   
            servicos = sc.listarServicos(nome);


        try {
            servicos.forEach((Servico s) -> {
                model.addRow(new Object[]{
                    s.getNome(),
                    Dinheiro.parseString(s.getPreco()),
                    s.getId()
                });
            });

            jTableConsultaServicos.setModel(model);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao listar servicos");
        }
            
        }

    }//GEN-LAST:event_jTextFieldNomeServicoCaretUpdate
    private void listarServicos() {

        DefaultTableModel model = (DefaultTableModel) jTableConsultaServicos.getModel();
        model.setRowCount(0);

        ServicoController sc = new ServicoController();

        List<Servico> servicos = null;

        servicos = sc.listarServicos();

        try {
            servicos.forEach((Servico s) -> {
                model.addRow(new Object[]{
                    s.getNome(),
                    Dinheiro.parseString(s.getPreco()),
                    s.getId()
                });
            });

            jTableConsultaServicos.setModel(model);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao listar servicos");
        }

    }
    private void jTextFieldNomeServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeServicoKeyPressed

        String nome = jTextFieldNomeServico.getText();
        DefaultTableModel model = (DefaultTableModel) jTableConsultaServicos.getModel();
        model.setRowCount(0);

        ServicoController sc = new ServicoController();

        ArrayList<Servico> servicos = null;

   
            servicos = sc.listarServicos(nome);


        try {
            servicos.forEach((Servico s) -> {
                model.addRow(new Object[]{
                    s.getNome(),
                    Dinheiro.parseString(s.getPreco()),
                    s.getId()
                });
            });

            jTableConsultaServicos.setModel(model);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao listar servicos");
        }

    }//GEN-LAST:event_jTextFieldNomeServicoKeyPressed
    private Servico retornarServico() {
        Servico servicoSelecionado = new Servico();
        DefaultTableModel model = (DefaultTableModel) jTableConsultaServicos.getModel();
        int indice = jTableConsultaServicos.getSelectedRow();

        if (indice > -1) {
            try {
                servicoSelecionado.setNome(jTableConsultaServicos.getValueAt(indice, 0).toString());
                servicoSelecionado.setId((Long.parseLong(jTableConsultaServicos.getValueAt(indice, 2).toString())));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro ao recuperar servico." + e);
            }
            return servicoSelecionado;
        } else {
            JOptionPane.showMessageDialog(null, "Indice selecionado inválido.");
        }

        return null;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        notificarObservadores();
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
            java.util.logging.Logger.getLogger(modalServicoUnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modalServicoUnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modalServicoUnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modalServicoUnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modalServicoUnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultaServicos;
    private javax.swing.JTextField jTextFieldNomeServico;
    // End of variables declaration//GEN-END:variables

    @Override
    public void registrarObservador(Observador observador) {

        observadores.add(observador);
    }

    @Override
    public void removeObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        observadores.forEach((Observador ob) -> {
            if (jTableConsultaServicos.getSelectedRow() > -1) {

                Servico servico = retornarServico();
                if (servico != null) {
                    ob.update(servico);
                }
            }

        });

    }
}
