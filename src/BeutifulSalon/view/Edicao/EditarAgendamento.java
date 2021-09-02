package BeutifulSalon.view.Edicao;

import BeutifulSalon.Ferramentas.ApresentaTabela;
import BeutifulSalon.view.Cadastros.*;
import BeutifulSalon.Ferramentas.ManipulaData;
import BeutifulSalon.Ferramentas.RecuperaTabela;
import BeutifulSalon.Ferramentas.Valida;
import BeutifulSalon.controller.AgendamentoController;
import BeutifulSalon.controller.ClienteController;
import BeutifulSalon.dao.AgendamentoDAO;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Agendamento;
import BeutifulSalon.model.Cliente;
import BeutifulSalon.model.Dinheiro;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Orcamento;
import BeutifulSalon.model.Servico;
import BeutifulSalon.view.modais.modalInputMonetarios;
import BeutifulSalon.view.modais.modalServicos;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
public class EditarAgendamento extends javax.swing.JFrame implements Observador {

    /**
     * Creates new form CadastroAgendamento
     */
    
    private Agendamento agendamento;
    
    public EditarAgendamento() {
        initComponents();
    }

    public EditarAgendamento(Agendamento ag) {

        initComponents();
        this.agendamento = ag;
        ClienteController cc = new ClienteController();
        Cliente clienteAgendamento = null;
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/M/uuuu");
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = "";

            clienteAgendamento = cc.buscarCliente(ag.getCpfCliente());

        jTextFieldNome.setText(clienteAgendamento.getNOME());
        jTextFieldCPF.setText(clienteAgendamento.getCPF());
        jTextFieldTotal.setText(Dinheiro.parseString(ag.getTotal()));
        jTextFieldTotalBruto.setText(Dinheiro.parseString(ag.getTotal() - ag.getDesconto()));
        jTextFieldDesconto.setText(Dinheiro.parseString(ag.getDesconto()));
        jTextFieldHorario.setValue(ag.getHorario().toString());
        
        if(ag.getDesconto() > 0){
            jCheckBoxDesconto.setSelected(true);
        }
        if(!ag.getRealizado()){
            jCheckBoxClienteVeio.setSelected(true);  
        }
 

        try {
            jDateChooser1.setDate(formater.parse(ag.getData().format(formatterData)));
        } catch (ParseException ex) {
            Logger.getLogger(EditarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        jTableServicosSolicitados.setModel(new ApresentaTabela().apresentaServicosAgendamento(jTableServicosSolicitados, ag.getId()));

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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBoxClienteVeio = new javax.swing.JCheckBox();
        jCheckBoxDesconto = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTotalBruto = new javax.swing.JTextField();
        jTextFieldDesconto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListHorarios = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldHorario = new javax.swing.JFormattedTextField();
        jButtonFinalizarEdicao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicosSolicitados = new javax.swing.JTable();
        jLabelAddServicos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(36, 46, 65));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Agendamento");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-agendamentos-48.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jCheckBoxClienteVeio.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxClienteVeio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBoxClienteVeio.setText("Cliente não compareceu");
        jCheckBoxClienteVeio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxClienteVeioActionPerformed(evt);
            }
        });

        jCheckBoxDesconto.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBoxDesconto.setForeground(new java.awt.Color(34, 34, 34));
        jCheckBoxDesconto.setText("Desconto");
        jCheckBoxDesconto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBoxDescontoMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total Bruto: ");

        jTextFieldTotalBruto.setEditable(false);
        jTextFieldTotalBruto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotalBruto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTotalBruto.setForeground(new java.awt.Color(34, 34, 34));
        jTextFieldTotalBruto.setText("R$ 0,00");

        jTextFieldDesconto.setEditable(false);
        jTextFieldDesconto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDesconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDesconto.setForeground(new java.awt.Color(34, 34, 34));
        jTextFieldDesconto.setText("-R$ 0,00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Valor Desconto:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("TOTAL");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(34, 34, 34));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Data");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jListHorarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListHorarios);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Horários disponíveis");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Horário");

        try {
            jTextFieldHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHorario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHorarioActionPerformed(evt);
            }
        });

        jButtonFinalizarEdicao.setBackground(new java.awt.Color(57, 201, 114));
        jButtonFinalizarEdicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFinalizarEdicao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarEdicao.setText("Concluir Edição");
        jButtonFinalizarEdicao.setBorder(null);
        jButtonFinalizarEdicao.setBorderPainted(false);
        jButtonFinalizarEdicao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonFinalizarEdicao.setFocusPainted(false);
        jButtonFinalizarEdicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFinalizarEdicao.setPreferredSize(new java.awt.Dimension(150, 65));
        jButtonFinalizarEdicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonFinalizarEdicaoMousePressed(evt);
            }
        });
        jButtonFinalizarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarEdicaoActionPerformed(evt);
            }
        });

        jLabel6.setText("buscar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 34, 34));
        jLabel4.setText("Nome do Cliente");

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 34, 34));
        jLabel5.setText("CPF");

        jTextFieldCPF.setEditable(false);
        jTextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAddServicos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldTotalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBoxDesconto)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxClienteVeio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonFinalizarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jTextFieldHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxClienteVeio)
                            .addComponent(jCheckBoxDesconto))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTotalBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButtonFinalizarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAddServicos))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );

        jDateChooser1.setLocale(new Locale("pt", "BR"));
        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonFinalizarEdicaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFinalizarEdicaoMousePressed

    }//GEN-LAST:event_jButtonFinalizarEdicaoMousePressed

    private void jButtonFinalizarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarEdicaoActionPerformed

        boolean sucesso = false;

        AgendamentoController ac = new AgendamentoController();

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = "";
        try {
            dataFormatada = formater.format(jDateChooser1.getDate());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter data");
        }
        
        //editar
        try {
            sucesso = ac.atualizarAgendamento(dataFormatada,
                    jTextFieldHorario.getText(),
                    jTextFieldCPF.getText(),
                    new RecuperaTabela().recuperaServicos(jTableServicosSolicitados),
                    calculaTotalFinal(),
                    Dinheiro.parseCent(Dinheiro.retiraCaracteres(jTextFieldDesconto.getText())),
                    !jCheckBoxClienteVeio.isSelected(),
                    agendamento.getId());
        } catch (ExceptionDAO e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Agendamento atualizado com sucesso");
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Agendamento. Verifique os dados inseridos!");
        }


    }//GEN-LAST:event_jButtonFinalizarEdicaoActionPerformed

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
            DefaultListModel<String> model = new DefaultListModel<String>();

            ArrayList<String> horariosFormatados = manipulaData.formataHorariosDisponiveis(horariosLivres);

            horariosFormatados.forEach(t -> {
                model.addElement(t);
            });

            jListHorarios.setModel(model);

        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void jCheckBoxClienteVeioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxClienteVeioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxClienteVeioActionPerformed

    private void jTextFieldHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(EditarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizarEdicao;
    private javax.swing.JCheckBox jCheckBoxClienteVeio;
    private javax.swing.JCheckBox jCheckBoxDesconto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddServicos;
    private javax.swing.JList<String> jListHorarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
