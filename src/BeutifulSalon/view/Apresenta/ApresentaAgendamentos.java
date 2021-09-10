/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view.Apresenta;

import BeutifulSalon.Ferramentas.ManipulaFontes;
import BeutifulSalon.Tabelas.AgendamentoTableModel;
import BeutifulSalon.Tabelas.CentralizaElementosTabela;
import BeutifulSalon.controller.AgendamentoController;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Mateus
 */
public class ApresentaAgendamentos extends javax.swing.JPanel {

    /**
     * Creates new form ApresentaAgendamentos
     */
    
    private final AgendamentoTableModel modelo = new AgendamentoTableModel();
    
    public ApresentaAgendamentos() {
        initComponents();
        
        ManipulaFontes mf = new ManipulaFontes();

	jLabel1.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 50f));
        jLabel2.setFont(mf.getFont(mf.LIGHT, Font.PLAIN, 30f));
        jLabel3.setFont(mf.getFont(mf.BOLD, Font.PLAIN, 15f));
        jLabel5.setFont(mf.getFont(mf.BOLD, Font.PLAIN, 15f));
        jLabel6.setFont(mf.getFont(mf.BOLD, Font.PLAIN, 15f));

        jRadioButtonHoje.setFont(mf.getFont(mf.LIGHT, Font.BOLD, 15f));
        jRadioButtonAmanha.setFont(mf.getFont(mf.LIGHT, Font.BOLD, 15f));
        jRadioButtonSemana.setFont(mf.getFont(mf.LIGHT, Font.BOLD, 15f));
        jRadioButton1.setFont(mf.getFont(mf.LIGHT, Font.BOLD, 15f));
        jRadioButtonTodos.setFont(mf.getFont(mf.LIGHT, Font.BOLD, 15f));
        jTableAgendamentos.setFont(mf.getFont(mf.SEMIBOLD, Font.PLAIN, 15f));
        
        
        CentralizaElementosTabela render = new CentralizaElementosTabela();
        modelo.getTodosAgendamentos();
        ((DefaultTableCellRenderer) jTableAgendamentos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        jTableAgendamentos.setDefaultRenderer(Object.class, render);
        jTableAgendamentos.setModel(modelo);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jLabelBuscarCliente = new javax.swing.JLabel();
        jRadioButtonHoje = new javax.swing.JRadioButton();
        jRadioButtonAmanha = new javax.swing.JRadioButton();
        jRadioButtonSemana = new javax.swing.JRadioButton();
        jRadioButtonTodos = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(243, 244, 255));
        setPreferredSize(new java.awt.Dimension(969, 843));

        jPanel2.setBackground(new java.awt.Color(48, 63, 79));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confira os agendamentos!");

        jLabel1.setBackground(new java.awt.Color(34, 34, 34));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agendamentos");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-agendamentos-48.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setColumnHeaderView(null);

        jTableAgendamentos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableAgendamentos.setForeground(new java.awt.Color(25, 25, 25));
        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Data", "Horario", "Término Estimado", "Status", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableAgendamentos.setGridColor(new java.awt.Color(255, 255, 255));
        jTableAgendamentos.setPreferredSize(new java.awt.Dimension(465, 402));
        jTableAgendamentos.setRowHeight(22);
        jTableAgendamentos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableAgendamentos.setShowGrid(false);
        jScrollPane1.setViewportView(jTableAgendamentos);
        if (jTableAgendamentos.getColumnModel().getColumnCount() > 0) {
            jTableAgendamentos.getColumnModel().getColumn(5).setMinWidth(1);
            jTableAgendamentos.getColumnModel().getColumn(5).setPreferredWidth(1);
            jTableAgendamentos.getColumnModel().getColumn(5).setMaxWidth(1);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Buscar por cliente");

        jLabelBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLupa.png"))); // NOI18N
        jLabelBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBuscarClienteMousePressed(evt);
            }
        });

        jRadioButtonHoje.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonHoje);
        jRadioButtonHoje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonHoje.setText("Hoje");
        jRadioButtonHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHojeActionPerformed(evt);
            }
        });

        jRadioButtonAmanha.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonAmanha);
        jRadioButtonAmanha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonAmanha.setText("Amanhã");
        jRadioButtonAmanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAmanhaActionPerformed(evt);
            }
        });

        jRadioButtonSemana.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonSemana);
        jRadioButtonSemana.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonSemana.setText("1 semana");
        jRadioButtonSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSemanaActionPerformed(evt);
            }
        });

        jRadioButtonTodos.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonTodos);
        jRadioButtonTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonTodos.setSelected(true);
        jRadioButtonTodos.setText("Todos");
        jRadioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodosActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("Não realizados");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(48, 63, 79));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editar");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("+Detalhes");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelBuscarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonAmanha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(163, 163, 163))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonHoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonAmanha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonSemana)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButtonTodos))
                    .addComponent(jLabelBuscarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHojeActionPerformed
        
        modelo.getAgendamentosHoje();
        jTableAgendamentos.setModel(modelo);
    }//GEN-LAST:event_jRadioButtonHojeActionPerformed

    private void jRadioButtonAmanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAmanhaActionPerformed
        modelo.getAgendamentosAmanha();
        jTableAgendamentos.setModel(modelo);
    }//GEN-LAST:event_jRadioButtonAmanhaActionPerformed

    private void jRadioButtonSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSemanaActionPerformed
        modelo.getAgendamentosSemana();
        jTableAgendamentos.setModel(modelo);
    }//GEN-LAST:event_jRadioButtonSemanaActionPerformed

    private void jRadioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodosActionPerformed
        
        modelo.getTodosAgendamentos();
        jTableAgendamentos.setModel(modelo);
    }//GEN-LAST:event_jRadioButtonTodosActionPerformed

    private void jLabelBuscarClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarClienteMousePressed
        
        if(jTextFieldNomeCliente.getText().equals("")){
            modelo.getTodosAgendamentos();
        }else{
            modelo.getAgendamentosPorNomeCliente(jTextFieldNomeCliente.getText());
        } 
        jTableAgendamentos.setModel(modelo);
    }//GEN-LAST:event_jLabelBuscarClienteMousePressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        modelo.getAgendamentosNaoRealizados();
        jTableAgendamentos.setModel(modelo);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
         int index = jTableAgendamentos.getSelectedRow();
        AgendamentoController ag = new AgendamentoController();
        boolean sucesso = false;
        
        if(index > -1){
            long idAgendamento = modelo.getAgendamento(index).getId();
            sucesso = ag.editarAgendamento(idAgendamento);
            
            if(!sucesso){
              JOptionPane.showMessageDialog(null, "Erro ao selecionar PKAgendamento");   
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um agendamento");
        }
    }//GEN-LAST:event_jLabel5MousePressed
    
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBuscarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButtonAmanha;
    private javax.swing.JRadioButton jRadioButtonHoje;
    private javax.swing.JRadioButton jRadioButtonSemana;
    private javax.swing.JRadioButton jRadioButtonTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAgendamentos;
    private javax.swing.JTextField jTextFieldNomeCliente;
    // End of variables declaration//GEN-END:variables
}
