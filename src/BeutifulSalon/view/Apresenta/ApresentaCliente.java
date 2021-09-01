/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view.Apresenta;

import BeutifulSalon.Tabelas.ClienteTableModel;
import BeutifulSalon.controller.ClienteController;
import BeutifulSalon.model.AplicaLookAndFeel;
import BeutifulSalon.model.Cliente;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ApresentaCliente extends javax.swing.JPanel {

    private final ClienteTableModel modelo = new ClienteTableModel();

    public ApresentaCliente() {
        initComponents();
        modelo.getTodosClientes();
        jTableConsultaCliente.setModel(modelo);
        AplicaLookAndFeel.pegaNimbus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaCliente = new javax.swing.JTable();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonDetalhes = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(34, 34, 34));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setRequestFocusEnabled(false);

        jTableConsultaCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTableConsultaCliente.setForeground(new java.awt.Color(34, 34, 34));
        jTableConsultaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Celular", "Email", "CPF", "ult. Visita"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableConsultaCliente.setGridColor(new java.awt.Color(243, 244, 245));
        jTableConsultaCliente.setRowHeight(22);
        jTableConsultaCliente.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableConsultaCliente.setShowGrid(true);
        jScrollPane2.setViewportView(jTableConsultaCliente);

        jTextFieldNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Busca por nome");

        jPanel1.setBackground(new java.awt.Color(48, 63, 79));

        jLabel1.setBackground(new java.awt.Color(34, 34, 34));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confira os clientes cadastrados em seu salão!");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-clientes-48.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                        .addGap(473, 473, 473))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jButtonEditar.setBackground(new java.awt.Color(57, 201, 114));
        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.setBorder(null);
        jButtonEditar.setBorderPainted(false);
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEditar.setFocusPainted(false);
        jButtonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEditar.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonDetalhes.setBackground(new java.awt.Color(36, 141, 248));
        jButtonDetalhes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDetalhes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDetalhes.setText("+Detalhes");
        jButtonDetalhes.setBorder(null);
        jButtonDetalhes.setBorderPainted(false);
        jButtonDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDetalhes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDetalhes.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalhesActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(248, 67, 69));
        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setBorder(null);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLupa.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4ConsultarCliente(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4ConsultarCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4ConsultarCliente


        if (jTextFieldNomeCliente.getText().equals("")) {
            modelo.getTodosClientes();
            jTableConsultaCliente.setModel(modelo);
        } else {
            modelo.getClientePorNome(jTextFieldNomeCliente.getText());
            jTableConsultaCliente.setModel(modelo);
        }
    }//GEN-LAST:event_jLabel4ConsultarCliente

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        boolean resultado;
        int indice = jTableConsultaCliente.getSelectedRow();

        if (indice > -1) {
            try {

                String cpfClienteSelecionado = modelo.getCliente(indice).getCPF(); // Retorna CPF
                ClienteController cc = new ClienteController();
                resultado = cc.editarCliente(cpfClienteSelecionado);

                if (!resultado) {
                    JOptionPane.showMessageDialog(null, "Erro ao selecionar PKCliente");
                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao retornar informações do cliente: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente.");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        int indice = jTableConsultaCliente.getSelectedRow();

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o cliente: "
                + jTableConsultaCliente.getValueAt(indice, 0) + " " + jTableConsultaCliente.getValueAt(indice, 1), "Excluir Cliente", JOptionPane.YES_NO_OPTION);

        if (opc == 0) {
            if (indice > -1) {
                try {
                    String cpfClienteSelecionado = modelo.getCliente(indice).getCPF(); // Retorna CPF
                    ClienteController cc = new ClienteController();

                    if (cc.excluirCliente(cpfClienteSelecionado)) {
                        JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso.");
                        modelo.getTodosClientes();
                        jTableConsultaCliente.setModel(modelo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível excluir o cliente. Selecione um índice válido na tabela");
                    }
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + e);
                }
            }
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalhesActionPerformed
       
        int indice = jTableConsultaCliente.getSelectedRow();

       
            if (indice > -1) {
                try {
                    String cpfCliente = modelo.getCliente(indice).getCPF(); // Retorna CPF
                    ClienteController cc = new ClienteController();
                    cc.exibirMaisDetalhes(cc.buscarCliente(cpfCliente));
                  
                } catch (HeadlessException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + e);
                }
            }
       
    }//GEN-LAST:event_jButtonDetalhesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsultaCliente;
    private javax.swing.JTextField jTextFieldNomeCliente;
    // End of variables declaration//GEN-END:variables
}
