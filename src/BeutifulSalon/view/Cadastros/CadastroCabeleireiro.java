/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view.Cadastros;

import BeutifulSalon.Ferramentas.ManipulaFontes;
import BeutifulSalon.controller.CabeleireiroController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Cabeleireiro;
import BeutifulSalon.model.Cliente;
import BeutifulSalon.model.Dinheiro;
import BeutifulSalon.model.Email;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Orcamento;
import BeutifulSalon.model.Servico;
import BeutifulSalon.view.modais.modalExpediente;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author mateus
 */
public class CadastroCabeleireiro extends javax.swing.JFrame implements Observador {

    /**
     * Creates new form CadastroCabeleireiro
     */
    private ArrayList<LocalTime> expediente = null;
    private modalExpediente modalExpediente = null;
    private String caminhoArquivo;
    private String caminhoArquivoUltimaVisita;
    private Email emailUltimaVisita = new Email();
    private Email email = new Email();

    public CadastroCabeleireiro() {
        initComponents();
        
        ManipulaFontes mf = new ManipulaFontes(); ;
        
        //Fontes
        jLabel4.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 40f)); //Informe seus dados pessoais
        jLabel1.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f)); //Primeiro Nome 
        jLabel3.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f)); //CPF
        jLabel2.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f)); //E-mail
        jLabel12.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f)); //Senha E-mail
        
        jLabel5.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f)); //Configurar Expediente
        jButton1.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 13f)); //Abrir grade 
        
        jButtonCadastrar.setFont(mf.getFont(mf.BOLD, Font.PLAIN, 15f)); //Confirmar
        
        //Fontes email aniversario
        jLabel6.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f));
        jCheckBoxAniversario.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel7.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jTextAreaAniversario.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel10.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabelNomeArquivoAniversario.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel11.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel8.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel9.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        
        //Fontes email visita
        jLabel14.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f));
        jComboBoxPeriodo.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jCheckBoxUltimaVisita.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel15.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jTextFieldTituloUltimaVisita.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jTextAreaUltimaVisita.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel18.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabelNomeArquivoUltimaVisita.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel19.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel16.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        jLabel17.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 15f));
        
        // ===================================================//
        
        DecimalFormat decimal = new DecimalFormat("#,###,###.00");
        NumberFormatter numFormatter = new NumberFormatter(decimal);
        numFormatter.setFormat(decimal);
        numFormatter.setAllowsInvalid(false);
        DefaultFormatterFactory dfFactory = new DefaultFormatterFactory(numFormatter);
        jFormattedTextFieldPreco.setFormatterFactory(dfFactory);
        
        CabeleireiroController cc = new CabeleireiroController();

        if (cc.verificaRegistro() == 1) {
            Cabeleireiro cabeleireiro = cc.selecionaCabeleireiro();

            jTextFieldNome.setText(cabeleireiro.getNome());
            jFormattedTextFieldCPF.setText(cabeleireiro.getCpf());
            jFormattedTextFieldCPF.setEnabled(false);
            jTextFieldEmail.setText(cabeleireiro.getEmail());
            
            jTextFieldTituloAniversario.setText(cabeleireiro.getEmailAniversario().getTitulo());
            jTextFieldTituloUltimaVisita.setText(cabeleireiro.getEmailUltimaVisita().getTitulo());
            
            jComboBoxPeriodo.setSelectedIndex(cabeleireiro.getEmailUltimaVisita().getPeriodoReenvio() - 2);
            
            if(cabeleireiro.getEmailAniversario().getTexto().length() < 2){
                jTextAreaAniversario.setText("Feliz aniversário <nome>,");
                jTextAreaUltimaVisita.setText("Caro <nome>,");
            }else{
                jTextAreaAniversario.setText(cabeleireiro.getEmailAniversario().getTexto().replaceAll("<br>", "\n"));  
                jTextAreaUltimaVisita.setText(cabeleireiro.getEmailUltimaVisita().getTexto().replaceAll("<br>", "\n"));
            }
            
            if(cabeleireiro.getEmailUltimaVisita().getTexto().length() < 2){
                jTextAreaUltimaVisita.setText("Caro <nome>,");

            }else{
                jTextAreaUltimaVisita.setText(cabeleireiro.getEmailUltimaVisita().getTexto().replaceAll("<br>", "\n"));
            }
            
            jCheckBoxUltimaVisita.setSelected(cabeleireiro.getEmailUltimaVisita().isEnviar());
            jCheckBoxAniversario.setSelected(cabeleireiro.getEmailAniversario().isEnviar());
            jLabelNomeArquivoAniversario.setText(cabeleireiro.getEmailAniversario().getNomeDoArquivo());
            jFormattedTextFieldPreco.setValue(Dinheiro.parseDecimal(cabeleireiro.getMetaDeLucro()));
            jPasswordField.setText(cabeleireiro.getSenha());
            
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();
        jPanelEmails = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxAniversario = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTituloAniversario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAniversario = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelNomeArquivoAniversario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jCheckBoxUltimaVisita = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTituloUltimaVisita = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaUltimaVisita = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelNomeArquivoUltimaVisita = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Primeiro Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CPF");

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jFormattedTextFieldCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 34, 34)));
        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldCPF.setText("");
        jFormattedTextFieldCPF.setToolTipText("Informe o CPF");
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("E-mail");

        jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Confirmar");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Configurar Expediente");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Abrir grade ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(36, 46, 65));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informe seus dados Pessoais");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Senha do E-mail");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Meta de Lucro");

        jFormattedTextFieldPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jFormattedTextFieldPreco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Configure o e-mail padrão de aniversário");

        jCheckBoxAniversario.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxAniversario.setText("Enviar automáticamente");
        jCheckBoxAniversario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAniversarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Título");

        jTextFieldTituloAniversario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextAreaAniversario.setColumns(20);
        jTextAreaAniversario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaAniversario.setRows(5);
        jTextAreaAniversario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAreaAniversarioCaretUpdate(evt);
            }
        });
        jTextAreaAniversario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextAreaAniversarioCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextAreaAniversario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaAniversarioKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaAniversario);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-anexo.png"))); // NOI18N
        jLabel8.setText("Inserir Anexo");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-excluir.png"))); // NOI18N
        jLabel9.setText("Excluir Anexo");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        jLabelNomeArquivoAniversario.setText("Não existem arquivos anexados.");

        jLabel10.setText("Arquivo Anexado:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Salvar");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeArquivoAniversario))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAniversario)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextFieldTituloAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addComponent(jScrollPane1))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxAniversario)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTituloAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeArquivoAniversario))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Aniversário", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Configure o e-mail padrão de última visita");

        jCheckBoxUltimaVisita.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxUltimaVisita.setText("Enviar automáticamente");
        jCheckBoxUltimaVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUltimaVisitaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Título");

        jTextAreaUltimaVisita.setColumns(20);
        jTextAreaUltimaVisita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextAreaUltimaVisita.setRows(5);
        jTextAreaUltimaVisita.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAreaUltimaVisitaCaretUpdate(evt);
            }
        });
        jTextAreaUltimaVisita.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextAreaUltimaVisitaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTextAreaUltimaVisita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAreaUltimaVisitaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaUltimaVisita);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-anexo.png"))); // NOI18N
        jLabel16.setText("Inserir Anexo");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-excluir.png"))); // NOI18N
        jLabel17.setText("Excluir Anexo");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });

        jLabelNomeArquivoUltimaVisita.setText("Não existem arquivos anexados.");

        jLabel18.setText("Arquivo Anexado:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Salvar");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel19MousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel20MousePressed(evt);
            }
        });

        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Meses", "3 Meses", "4 Meses", "5 meses", "6 meses", "7 Meses", "8 Meses", "9 Meses", "10 Meses" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeArquivoUltimaVisita))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextFieldTituloUltimaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxUltimaVisita)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxUltimaVisita)
                    .addComponent(jComboBoxPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTituloUltimaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeArquivoUltimaVisita))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Última Visita", jPanel4);

        javax.swing.GroupLayout jPanelEmailsLayout = new javax.swing.GroupLayout(jPanelEmails);
        jPanelEmails.setLayout(jPanelEmailsLayout);
        jPanelEmailsLayout.setHorizontalGroup(
            jPanelEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanelEmailsLayout.setVerticalGroup(
            jPanelEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Emails Automáticos", jPanelEmails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        boolean sucesso;
        CabeleireiroController cc = new CabeleireiroController();
        int existe = cc.verificaRegistro();
        try {

            //se for != de 1 não existe um cabeleireiro cadastrado
            if (existe != 1) {
                sucesso = cc.cadastrarCabeleireiro(jTextFieldNome.getText(),
                        jFormattedTextFieldCPF.getText(),
                        jTextFieldEmail.getText(),
                        this.expediente,
                        jPasswordField.getPassword(),
                        jFormattedTextFieldPreco.getText());

                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Registro realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro! verifique as informações e tente novamente");
                }
            } else {

                if (expediente == null) {
                    Cabeleireiro c = null;

                    c = cc.selecionaCabeleireiro();

                    expediente = new ArrayList<>();
                    expediente.add(c.getSegundaE());
                    expediente.add(c.getSegundaS());

                    expediente.add(c.getTercaE());
                    expediente.add(c.getTercaS());

                    expediente.add(c.getQuartaE());
                    expediente.add(c.getQuartaS());

                    expediente.add(c.getQuintaE());
                    expediente.add(c.getQuintaS());

                    expediente.add(c.getSextaE());
                    expediente.add(c.getSextaS());

                    expediente.add(c.getSabadoE());
                    expediente.add(c.getSabadoS());

                    expediente.add(c.getDomingoE());
                    expediente.add(c.getDomingoS());
                }

                sucesso = cc.atualizarCabeleireiro(jTextFieldNome.getText(),
                        jFormattedTextFieldCPF.getText(),
                        jTextFieldEmail.getText(),
                        this.expediente,
                        jPasswordField.getPassword(),
                        jFormattedTextFieldPreco.getText());

                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Atualização realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro! verifique as informações e tente novamente");
                }

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (modalExpediente == null) {
            modalExpediente = new modalExpediente();
            modalExpediente.registrarObservador(this);
            modalExpediente.setVisible(true);
        } else {
            modalExpediente.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxAniversarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAniversarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAniversarioActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        FileFilter filter = new FileNameExtensionFilter("Imagem ou Zip", "jpg", "jpeg", "png", "pdf", ".zip", ".7z");
        jFileChooser.setFileFilter(filter);
        jFileChooser.addChoosableFileFilter(filter);

        int returnVal = jFileChooser.showOpenDialog(this);

        if (returnVal == jFileChooser.APPROVE_OPTION) {
            caminhoArquivo = jFileChooser.getSelectedFile().getAbsolutePath();

            email.setDiretorioArquivo(caminhoArquivo);
            jLabelNomeArquivoAniversario.setText(email.getNomeDoArquivo());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem e tente novamente");
            jLabelNomeArquivoAniversario.setText("Não existem arquivos anexados.");
        }
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o arquivo ?");

        if (opc == 0) {
            caminhoArquivo = null;
            jLabelNomeArquivoAniversario.setText("Não existem arquivos anexados.");
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed

        CabeleireiroController cc = new CabeleireiroController();
        email.setTitulo(jTextFieldTituloAniversario.getText());
        email.setTexto(jTextAreaAniversario.getText());
        email.setEnviar(jCheckBoxAniversario.isSelected());
        if (cc.verificaRegistro() == 1) {
            if (email.getDiretorioArquivo() != null) {

                try {
                    File file = new File(email.getDiretorioArquivo());
                    byte[] imagem = new byte[(int) file.length()];
                    DataInputStream dis;
                    dis = new DataInputStream(new FileInputStream(file));
                    dis.readFully(imagem);
                    dis.close();

                    email.setAnexo(imagem);
                    
                    email.setDiretorioArquivo(caminhoArquivo);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao ler anexo" + e);
                }

            }
            boolean sucesso = cc.cadastrarEmailPadraoAniversario(email, cc.selecionaCabeleireiro().getCpf());

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Email padrão de aniversário atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar email de aniversário.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Você não pode cadastrar um email, pois ainda não se cadastrou no sistema.");
        }


    }//GEN-LAST:event_jLabel11MousePressed

    private void jTextAreaAniversarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaAniversarioKeyPressed


    }//GEN-LAST:event_jTextAreaAniversarioKeyPressed

    private void jTextAreaAniversarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAreaAniversarioCaretUpdate
        
 
    }//GEN-LAST:event_jTextAreaAniversarioCaretUpdate

    private void jTextAreaAniversarioCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextAreaAniversarioCaretPositionChanged

    }//GEN-LAST:event_jTextAreaAniversarioCaretPositionChanged

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
       JOptionPane.showMessageDialog(null, "Digite '<nome>' ao longo do texto, para inserir o \n"
               + "nome do cliente para qual o email será enviado\n\n"
               + "Ex: Feliz aniversário <nome>!,\nA equipe do Salão deseja[...]");
    }//GEN-LAST:event_jLabel13MousePressed

    private void jCheckBoxUltimaVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUltimaVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUltimaVisitaActionPerformed

    private void jTextAreaUltimaVisitaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAreaUltimaVisitaCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaUltimaVisitaCaretUpdate

    private void jTextAreaUltimaVisitaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextAreaUltimaVisitaCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaUltimaVisitaCaretPositionChanged

    private void jTextAreaUltimaVisitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaUltimaVisitaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaUltimaVisitaKeyPressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        FileFilter filter = new FileNameExtensionFilter("Imagem ou Zip", "jpg", "jpeg", "png", "pdf", ".zip", ".7z");
        jFileChooser.setFileFilter(filter);
        jFileChooser.addChoosableFileFilter(filter);

        int returnVal = jFileChooser.showOpenDialog(this);

        if (returnVal == jFileChooser.APPROVE_OPTION) {
            caminhoArquivoUltimaVisita = jFileChooser.getSelectedFile().getAbsolutePath();

            emailUltimaVisita.setDiretorioArquivo(caminhoArquivoUltimaVisita);
            jLabelNomeArquivoUltimaVisita.setText(emailUltimaVisita.getNomeDoArquivo());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma imagem e tente novamente");
            jLabelNomeArquivoUltimaVisita.setText("Não existem arquivos anexados.");
        }
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MousePressed
       
        CabeleireiroController cc = new CabeleireiroController();
        emailUltimaVisita.setTitulo(jTextFieldTituloUltimaVisita.getText());
        emailUltimaVisita.setTexto(jTextAreaUltimaVisita.getText());
        emailUltimaVisita.setEnviar(jCheckBoxUltimaVisita.isSelected());
        
        if (cc.verificaRegistro() == 1) {
            if (emailUltimaVisita.getDiretorioArquivo() != null) {

                try {
                    File file = new File(emailUltimaVisita.getDiretorioArquivo());
                    byte[] imagem = new byte[(int) file.length()];
                    DataInputStream dis;
                    dis = new DataInputStream(new FileInputStream(file));
                    dis.readFully(imagem);
                    dis.close();

                    emailUltimaVisita.setAnexo(imagem);
                    
                    emailUltimaVisita.setDiretorioArquivo(caminhoArquivoUltimaVisita);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Erro ao ler anexo" + e);
                }

            }
            boolean sucesso = cc.cadastrarEmailUltimaVisita(emailUltimaVisita, cc.selecionaCabeleireiro().getCpf(), jComboBoxPeriodo.getSelectedIndex() + 2);

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Email padrão de últiima visita atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar email de última visita.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Você não pode cadastrar um email, pois ainda não se cadastrou no sistema.");
        }

    }//GEN-LAST:event_jLabel19MousePressed

    private void jLabel20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MousePressed
       JOptionPane.showMessageDialog(null, "Digite '<nome>' ao longo do texto, para inserir o \n"
               + "nome do cliente para qual o email será enviado\n\n"
               + "Ex: Caro <nome>!,\nA equipe do Salão notou que[...]");
    }//GEN-LAST:event_jLabel20MousePressed

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
            java.util.logging.Logger.getLogger(CadastroCabeleireiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCabeleireiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCabeleireiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCabeleireiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCabeleireiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JCheckBox jCheckBoxAniversario;
    private javax.swing.JCheckBox jCheckBoxUltimaVisita;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNomeArquivoAniversario;
    private javax.swing.JLabel jLabelNomeArquivoUltimaVisita;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmails;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextAreaAniversario;
    private javax.swing.JTextArea jTextAreaUltimaVisita;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTituloAniversario;
    private javax.swing.JTextField jTextFieldTituloUltimaVisita;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Object obj) {
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
        expediente = horarios;
    }

    @Override
    public void update(Orcamento orcamento) {

    }
}
