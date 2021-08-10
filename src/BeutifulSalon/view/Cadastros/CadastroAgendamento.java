package BeutifulSalon.view.Cadastros;

import BeutifulSalon.Ferramentas.ManipulaData;
import BeutifulSalon.Ferramentas.RecuperaTabela;
import BeutifulSalon.Ferramentas.Valida;
import BeutifulSalon.controller.AgendamentoController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Cliente;
import BeutifulSalon.model.Dinheiro;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Orcamento;
import BeutifulSalon.model.Servico;
import BeutifulSalon.view.modais.modalCliente;
import BeutifulSalon.view.modais.modalInputMonetarios;
import BeutifulSalon.view.modais.modalServicos;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateus
 */
public class CadastroAgendamento extends javax.swing.JFrame implements Observador {

    /**
     * Creates new form CadastroAgendamento
     */
    public CadastroAgendamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelAddCliente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicosSolicitados = new javax.swing.JTable();
        jLabelAddServicos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTotalBruto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jCheckBoxDesconto = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldHorario = new javax.swing.JFormattedTextField();
        jButtonFinalizarCompra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListHorarios = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldNome.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 34, 34));
        jLabel4.setText("Nome do Cliente");

        jLabelAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-add.png"))); // NOI18N
        jLabelAddCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelAddCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAddClienteMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 34, 34));
        jLabel5.setText("CPF");

        jTextFieldCPF.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 34, 34));
        jLabel3.setText("Serviços Solicitados");

        jTableServicosSolicitados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane1.setViewportView(jTableServicosSolicitados);
        if (jTableServicosSolicitados.getColumnModel().getColumnCount() > 0) {
            jTableServicosSolicitados.getColumnModel().getColumn(2).setMinWidth(1);
            jTableServicosSolicitados.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTableServicosSolicitados.getColumnModel().getColumn(2).setMaxWidth(1);
        }

        jLabelAddServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-add.png"))); // NOI18N
        jLabelAddServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelAddServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAddServicosMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("Cadastro de Agendamento");

        jTextFieldTotalBruto.setEditable(false);
        jTextFieldTotalBruto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotalBruto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldTotalBruto.setForeground(new java.awt.Color(34, 34, 34));
        jTextFieldTotalBruto.setText("R$ 0,00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total Bruto: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Valor Desconto:");

        jTextFieldDesconto.setEditable(false);
        jTextFieldDesconto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDesconto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDesconto.setForeground(new java.awt.Color(34, 34, 34));
        jTextFieldDesconto.setText("-R$ 0,00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(34, 34, 34));

        jCheckBoxDesconto.setBackground(new java.awt.Color(243, 244, 245));
        jCheckBoxDesconto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxDesconto.setForeground(new java.awt.Color(34, 34, 34));
        jCheckBoxDesconto.setText("Desconto");
        jCheckBoxDesconto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBoxDescontoMousePressed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Data");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Horário");

        try {
            jTextFieldHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHorario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonFinalizarCompra.setBackground(new java.awt.Color(57, 201, 114));
        jButtonFinalizarCompra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarCompra.setText("Finalizar Agendamento");
        jButtonFinalizarCompra.setBorder(null);
        jButtonFinalizarCompra.setBorderPainted(false);
        jButtonFinalizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonFinalizarCompra.setFocusPainted(false);
        jButtonFinalizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFinalizarCompra.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonFinalizarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonFinalizarCompraMousePressed(evt);
            }
        });
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jListHorarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListHorarios);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Horários disponíveis");

        jLabel6.setText("buscar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAddCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAddServicos)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBoxDesconto)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(88, 88, 88)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextFieldTotalBruto)
                                                        .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldTotal)))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(79, 79, 79)
                                                    .addComponent(jLabel2)
                                                    .addGap(11, 11, 11)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButtonFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAddCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAddServicos)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCheckBoxDesconto)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTotalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(92, 92, 92)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addContainerGap())
        );

        jDateChooser1.setLocale(new Locale("pt", "BR"));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAddClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddClienteMousePressed
        modalCliente modal = new modalCliente();
        modal.registrarObservador(this);
        modal.setVisible(true);
    }//GEN-LAST:event_jLabelAddClienteMousePressed

    private void jLabelAddServicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddServicosMousePressed
        modalServicos modal = new modalServicos();
        modal.registrarObservador(this);
        modal.setVisible(true);
    }//GEN-LAST:event_jLabelAddServicosMousePressed

    private void jCheckBoxDescontoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxDescontoMousePressed

        if (!jCheckBoxDesconto.isSelected()) {
            jCheckBoxDesconto.setSelected(true);
            modalInputMonetarios modalMonetarario = new modalInputMonetarios("Insira o valor do desconto");
            modalMonetarario.registrarObservador(this);
            modalMonetarario.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBoxDescontoMousePressed

    private void jButtonFinalizarCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraMousePressed

    }//GEN-LAST:event_jButtonFinalizarCompraMousePressed

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed

        boolean sucesso;

        AgendamentoController ac = new AgendamentoController();

        try {
            SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = "";
            try {
                dataFormatada = formater.format(jDateChooser1.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter data");
            }

            sucesso = ac.cadastraAgendamento(dataFormatada,
                    jTextFieldHorario.getText(),
                    jTextFieldCPF.getText(),
                    new RecuperaTabela().recuperaServicos(jTableServicosSolicitados),
                    calculaTotalFinal(), 
                    Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldDesconto.getText())),
                    true);

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Agendamento Realizado com sucesso");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar Agendamento. Verifique os dados inseridos!");
            }
        } catch (ExceptionDAO ex) {
            Logger.getLogger(CadastroAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        
        //Método para listar horários disponíveis
        
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = "";
        try {
            dataFormatada = formater.format(jDateChooser1.getDate());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter data");
        }

        if (Valida.isData(dataFormatada)) {
            ManipulaData manipulaData = new ManipulaData();
            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/M/uuuu");
            LocalDate dataDigitada = null;
            try {
                dataDigitada = LocalDate.parse(dataFormatada, formatterData);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data inválida!" + e);
            }
            ArrayList<LocalTime> horariosLivres = manipulaData.recuperaHorariosDisponiveis(dataDigitada);
            DefaultListModel<String> model = new DefaultListModel();

            ArrayList<String> horariosFormatados = manipulaData.formataHorariosDisponiveis(horariosLivres);

            horariosFormatados.forEach(t -> {
                model.addElement(t);
            });

            jListHorarios.setModel(model);

        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldDesconto.setText("-R$ 0,00");
        jTextFieldTotalBruto.setText("R$ 0,00");
        jTextFieldTotal.setText("");
        jTextFieldHorario.setText("");

        DefaultTableModel modal = (DefaultTableModel) jTableServicosSolicitados.getModel();
        modal.setRowCount(0);
        jTableServicosSolicitados.setModel(modal);
    }

    private void calculaTotalBruto() {
        long total = 0;
        try {
            ArrayList<Servico> servicos = new RecuperaTabela().recuperaServicos(jTableServicosSolicitados);

            try {
                for (Servico s : servicos) {
                    total += s.getPreco();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao calcular total " + e);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular total2" + e);
        }

        jTextFieldTotalBruto.setText(Dinheiro.parseString(total));

    }

    private void calculaTotal() {

        try {

            long valorDesconto = 0;

            if (!jTextFieldDesconto.getText().equals("")) {
                valorDesconto = Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldDesconto.getText()));
            }

            long valorTotalBruto = Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldTotalBruto.getText()));
            long valorTotal = valorTotalBruto - valorDesconto;
            jTextFieldTotal.setText(Dinheiro.parseString(valorTotal));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular total " + e);
        }
    }
    
    private long calculaTotalFinal() {

        long valorTotal = 0;
        try {

            long valorDesconto = 0;

            if (!jTextFieldDesconto.getText().equals("")) {
                valorDesconto = Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldDesconto.getText()));
            }

            long valorTotalBruto = Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldTotalBruto.getText()));
            valorTotal = valorTotalBruto - valorDesconto;
            jTextFieldTotal.setText(Dinheiro.parseString(valorTotal));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular total " + e);
        }
        
        return valorTotal;
    }

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
            java.util.logging.Logger.getLogger(CadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JCheckBox jCheckBoxDesconto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabelAddCliente;
    private javax.swing.JLabel jLabelAddServicos;
    private javax.swing.JList<String> jListHorarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableServicosSolicitados;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JFormattedTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldTotalBruto;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Object obj) {

    }

    @Override
    public void update(DefaultTableModel model) {

        try {
            jTableServicosSolicitados.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir serviços na tabela." + e);
        }

        calculaTotalBruto();
        calculaTotal();

    }

    @Override
    public void update(String valorDesconto) {
        jTextFieldDesconto.setText("-" + Dinheiro.parseString(Dinheiro.retiraCaracteres(valorDesconto)));
        calculaTotal();
        jCheckBoxDesconto.setSelected(true);
    }

    @Override
    public void update(Cliente cliente) {

        jTextFieldNome.setText(cliente.getNOME());
        jTextFieldCPF.setText(cliente.getCPF());
    }

    @Override
    public void update(Servico servico) {
    }

    @Override
    public void update(ArrayList<LocalTime> horarios) {
    }

    @Override
    public void update(Orcamento orcamento) {
    }
}
