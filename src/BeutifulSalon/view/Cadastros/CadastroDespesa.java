/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view.Cadastros;

import BeutifulSalon.controller.DespesaController;
import BeutifulSalon.model.Cliente;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Orcamento;
import BeutifulSalon.model.Servico;
import BeutifulSalon.view.modais.modalOrcamentoPrevisto;
import java.awt.Color;
import java.awt.Dialog;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Mateus
 */
public class CadastroDespesa extends javax.swing.JFrame implements Observador {

    /**
     * Creates new form CadastroDespesa
     */
    private modalOrcamentoPrevisto modal = null;

    public CadastroDespesa() {
        initComponents();
        DecimalFormat decimal = new DecimalFormat("#,###,###.00");
        NumberFormatter numFormatter = new NumberFormatter(decimal);
        numFormatter.setFormat(decimal);
        numFormatter.setAllowsInvalid(false);
        DefaultFormatterFactory dfFactory = new DefaultFormatterFactory(numFormatter);
        jFormattedTextFieldValorPago.setFormatterFactory(dfFactory);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jToggleButton = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextFieldValorPago = new javax.swing.JFormattedTextField();
        jDateChooserDataPagamento = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAnotacao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdDespesa = new javax.swing.JTextField();
        jTextFieldNomeDespesa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooserLacamento = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jDateChooserVencimento = new com.toedter.calendar.JDateChooser();
        jButtonCadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton.setText("Pagamento Pendente");
        jToggleButton.setFocusable(false);
        jToggleButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButtonStateChanged(evt);
            }
        });
        jToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jToggleButtonMousePressed(evt);
            }
        });
        jToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonActionPerformed(evt);
            }
        });
        jToggleButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jToggleButtonPropertyChange(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "Crédito", "Débito", "Dinheiro" }));
        jComboBoxFormaPagamento.setEnabled(false);
        jComboBoxFormaPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBoxFormaPagamentoMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Forma de Pagamento");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Data de pagamento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Valor Pago");

        jFormattedTextFieldValorPago.setEnabled(false);

        jDateChooserDataPagamento.setDateFormatString("dd/MM/yyyy");
        jDateChooserDataPagamento.setEnabled(false);

        jTextAreaAnotacao.setColumns(20);
        jTextAreaAnotacao.setLineWrap(true);
        jTextAreaAnotacao.setRows(5);
        jTextAreaAnotacao.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaAnotacao);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Anotação / Lembrete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jComboBoxFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFormattedTextFieldValorPago)
                        .addComponent(jDateChooserDataPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserDataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome da Despesa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        jTextFieldIdDespesa.setEditable(false);
        jTextFieldIdDespesa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIdDespesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIdDespesa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldIdDespesa.setEnabled(false);
        jTextFieldIdDespesa.setFocusable(false);

        jTextFieldNomeDespesa.setEditable(false);
        jTextFieldNomeDespesa.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeDespesa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeDespesa.setEnabled(false);
        jTextFieldNomeDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDespesaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-add.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Data de Lançamento");

        jDateChooserLacamento.setDateFormatString("dd/MM/yyyy");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Data de Vencimento");

        jDateChooserVencimento.setDateFormatString("dd/MM/yyyy");

        jButtonCadastrar.setBackground(new java.awt.Color(57, 201, 114));
        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Confirmar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(37, 37, 37))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jTextFieldIdDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(22, 22, 22)))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jTextFieldNomeDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel3))
                                                .addComponent(jLabel1)))
                                        .addComponent(jDateChooserLacamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDateChooserVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(jToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldIdDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNomeDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserLacamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooserVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(36, 46, 65));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pagamento de Despesa");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-financas-48.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed

        if (modal == null) {
            modal = new modalOrcamentoPrevisto();
            modal.registrarObservador(this);
            modal.setVisible(true);
        } else {
            modal.setVisible(true);
        }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonActionPerformed

    }//GEN-LAST:event_jToggleButtonActionPerformed

    private void jToggleButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jToggleButtonPropertyChange


    }//GEN-LAST:event_jToggleButtonPropertyChange

    private void jToggleButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButtonMousePressed


    }//GEN-LAST:event_jToggleButtonMousePressed
    
    private void limparCampos(){
        jTextAreaAnotacao.setText("");
        jTextFieldIdDespesa.setText("");
        jTextFieldNomeDespesa.setText("");
        jFormattedTextFieldValorPago.setText("");
    }
    private void jToggleButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButtonStateChanged
 
        if (jToggleButton.isSelected()) {
            jToggleButton.setText("Pagamento Realizado");
            jTextAreaAnotacao.setEnabled(true);
            jDateChooserDataPagamento.setEnabled(true);
            jFormattedTextFieldValorPago.setEnabled(true);
            jComboBoxFormaPagamento.setEnabled(true);
            Color verde = new Color(57, 201, 114);
            jToggleButton.setBackground(verde);
        } else {
            jToggleButton.setText("Pagamento Pendente");
            jTextAreaAnotacao.setEnabled(false);
            jDateChooserDataPagamento.setEnabled(false);
            jFormattedTextFieldValorPago.setEnabled(false);
            jComboBoxFormaPagamento.setEnabled(false);
            Color vermelho = new Color(248, 67, 69);
            jToggleButton.setBackground(vermelho);
        }
    }//GEN-LAST:event_jToggleButtonStateChanged

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        boolean sucesso = false;
        DespesaController dc = new DespesaController();
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        int ano = LocalDate.now().getYear(); // Ano referente a despesa 

        if (jToggleButton.isSelected()) {

            long idOrcamento = 0;
            String dataLancamento = "";
            String dataVencimento = "";
            String dataPagamento = "";
            try {
                dataLancamento = formater.format(jDateChooserLacamento.getDate());
                dataVencimento = formater.format(jDateChooserVencimento.getDate());
                dataPagamento = formater.format(jDateChooserDataPagamento.getDate());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter data");
            }

            try {
                idOrcamento = Long.parseLong(jTextFieldIdDespesa.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Selecione uma despesa antes.");
            }

            //true pois está sendo registrado um pagamento
            if (!dc.verificaExistenciaPagamento(idOrcamento, dataLancamento, true)) {
                if(dc.verificaCompatibilidadeEntreAno(idOrcamento)){
                    
                    long idDespesa = dc.verificaExistencia(idOrcamento, dataLancamento);
                  
                    if(idDespesa == 0){
                        sucesso = dc.CadastrarDespesa(idOrcamento,
                        dataLancamento,
                        dataVencimento,
                        dataPagamento,
                        jFormattedTextFieldValorPago.getText(),
                        jTextAreaAnotacao.getText(),
                        String.valueOf(ano),
                        String.valueOf(jComboBoxFormaPagamento.getSelectedItem()),
                        true
                        ); 
                    }else{
                        sucesso = dc.atualizarDespesa(idOrcamento, 
                                dataLancamento, 
                                dataVencimento,
                                dataPagamento,
                                jFormattedTextFieldValorPago.getText(), 
                                jTextAreaAnotacao.getText(), 
                                String.valueOf(ano), 
                                String.valueOf(jComboBoxFormaPagamento.getSelectedItem()), 
                                true, 
                                idDespesa);
                    }
                   
                    if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Despesa registrada com sucesso!");
                        limparCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao registrar despesa.");
                    }
                }else{
                   JOptionPane.showMessageDialog(null, "O ano da despesa selecionada não é igual ao ano atual.");
                }
                
               

            } else {
                JOptionPane.showMessageDialog(null, "Já existe um registro de pagamento desta despesa para o mês informado.");
            }

        } else {

            ano = LocalDate.now().getYear();
            long idOrcamento = 0;
            String dataLancamento = "";
            String dataVencimento = "";
            try {
                dataLancamento = formater.format(jDateChooserLacamento.getDate());
                dataVencimento = formater.format(jDateChooserVencimento.getDate());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter data");
            }

            try {
                idOrcamento = Long.parseLong(jTextFieldIdDespesa.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Selecione uma despesa antes.");
            }

            //false pois está sendo registrado apenas lançamento e vencimento
            if (!dc.verificaExistenciaPagamento(idOrcamento, dataLancamento, false)) {
                
                if(dc.verificaCompatibilidadeEntreAno(idOrcamento)){
                     sucesso = dc.CadastrarDespesa(idOrcamento,
                        dataLancamento,
                        dataVencimento,
                        null,
                        null,
                        null,
                        String.valueOf(ano),
                        null,
                        false
                );

                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Despesa registrada com sucesso!");
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao registrar despesa.");
                } 
                }else{
                   JOptionPane.showMessageDialog(null, "O ano da despesa selecionada não é igual ao ano atual.");

                }
              
            } else {
                JOptionPane.showMessageDialog(null, "Já existe um registro de desta despesa para o mês informado. Realize o pagamento!");
            }

        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jComboBoxFormaPagamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoMousePressed

    }//GEN-LAST:event_jComboBoxFormaPagamentoMousePressed

    private void jTextFieldNomeDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDespesaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDespesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private com.toedter.calendar.JDateChooser jDateChooserDataPagamento;
    private com.toedter.calendar.JDateChooser jDateChooserLacamento;
    private com.toedter.calendar.JDateChooser jDateChooserVencimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAnotacao;
    private javax.swing.JTextField jTextFieldIdDespesa;
    private javax.swing.JTextField jTextFieldNomeDespesa;
    private javax.swing.JToggleButton jToggleButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Object obj) {
    }

    @Override
    public void update(Orcamento orcamento) {

        if (orcamento != null) {
            jTextFieldIdDespesa.setText(String.valueOf(orcamento.getId_orcamento()));
            jTextFieldNomeDespesa.setText(orcamento.getNome());
        }
    }

    @Override
    public void update(DefaultTableModel model) {
    }

    @Override
    public void update(String valorDesconto) {
    }

    @Override
    public void update(Cliente cliente) {
    }

    @Override
    public void update(Servico servico) {
    }

    @Override
    public void update(ArrayList<LocalTime> horarios) {
    }
}
