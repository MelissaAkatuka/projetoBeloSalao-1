/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view;

import BeutifulSalon.controller.ProdutoController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Dinheiro;
import BeutifulSalon.model.Produto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class ApresentaProduto extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    // IMPLEMENTANDO SISTEMA DE FECHAR E ABRIR TELA
    MainMenu telaChamadoraMainMenu;
    NovoRegistro novoRegistro = null;

    public ApresentaProduto() {
        initComponents();
    }

    //Chamando a partir de MainMenu
    public ApresentaProduto(MainMenu aThis) {
        this.telaChamadoraMainMenu = aThis;

        try {
            this.setPreferredSize(aThis.getSize());
        } catch (Exception e) {

        }

        initComponents();
    }

    //============================//
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        gridLateral = new javax.swing.JPanel();
        panelDashboard = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jTFClientes = new javax.swing.JLabel();
        panelProdutos = new javax.swing.JPanel();
        JTFProdutos = new javax.swing.JLabel();
        panelFinancas = new javax.swing.JPanel();
        JTFFinancas = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        panelNovoRegistro = new javax.swing.JPanel();
        JTFNovoRegistro = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsultaProdutos = new javax.swing.JTable();
        jButtonDetalhes = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                listarTodosClientes(evt);
            }
        });

        menuLateral.setBackground(new java.awt.Color(36, 46, 66));
        menuLateral.setPreferredSize(new java.awt.Dimension(300, 500));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        gridLateral.setBackground(new java.awt.Color(36, 46, 66));
        gridLateral.setLayout(new java.awt.GridLayout(8, 0));

        panelDashboard.setBackground(new java.awt.Color(36, 46, 66));
        panelDashboard.setPreferredSize(new java.awt.Dimension(50, 200));

        dashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconHome.png"))); // NOI18N
        dashboard.setLabelFor(container);
        dashboard.setText("Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.setIconTextGap(20);
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDashboard(evt);
            }
        });

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridLateral.add(panelDashboard);

        panelClientes.setBackground(new java.awt.Color(36, 46, 66));
        panelClientes.setPreferredSize(new java.awt.Dimension(50, 200));

        jTFClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFClientes.setForeground(new java.awt.Color(255, 255, 255));
        jTFClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPeoples.png"))); // NOI18N
        jTFClientes.setText("Clientes");
        jTFClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTFClientes.setIconTextGap(16);
        jTFClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFClientesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTFClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridLateral.add(panelClientes);

        panelProdutos.setBackground(new java.awt.Color(36, 46, 66));
        panelProdutos.setPreferredSize(new java.awt.Dimension(50, 200));

        JTFProdutos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFProdutos.setForeground(new java.awt.Color(255, 255, 255));
        JTFProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconPrice.png"))); // NOI18N
        JTFProdutos.setText("Produtos");
        JTFProdutos.setIconTextGap(20);

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutosLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(JTFProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelProdutosLayout.setVerticalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridLateral.add(panelProdutos);

        panelFinancas.setBackground(new java.awt.Color(36, 46, 66));
        panelFinancas.setPreferredSize(new java.awt.Dimension(50, 200));

        JTFFinancas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTFFinancas.setForeground(new java.awt.Color(255, 255, 255));
        JTFFinancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconWallet.png"))); // NOI18N
        JTFFinancas.setText("Finanças");
        JTFFinancas.setIconTextGap(20);
        JTFFinancas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JTFFinancasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelFinancasLayout = new javax.swing.GroupLayout(panelFinancas);
        panelFinancas.setLayout(panelFinancasLayout);
        panelFinancasLayout.setHorizontalGroup(
            panelFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFinancasLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(JTFFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFinancasLayout.setVerticalGroup(
            panelFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFinancasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridLateral.add(panelFinancas);

        jPanel10.setBackground(new java.awt.Color(36, 46, 66));
        jPanel10.setPreferredSize(new java.awt.Dimension(50, 200));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        gridLateral.add(jPanel10);

        jPanel9.setBackground(new java.awt.Color(36, 46, 66));
        jPanel9.setPreferredSize(new java.awt.Dimension(50, 200));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        gridLateral.add(jPanel9);

        panelNovoRegistro.setBackground(new java.awt.Color(36, 46, 66));
        panelNovoRegistro.setPreferredSize(new java.awt.Dimension(50, 200));

        JTFNovoRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JTFNovoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        JTFNovoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconAdd.png"))); // NOI18N
        JTFNovoRegistro.setText("Novo Registro");
        JTFNovoRegistro.setIconTextGap(20);
        JTFNovoRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNovoRegistro(evt);
            }
        });

        javax.swing.GroupLayout panelNovoRegistroLayout = new javax.swing.GroupLayout(panelNovoRegistro);
        panelNovoRegistro.setLayout(panelNovoRegistroLayout);
        panelNovoRegistroLayout.setHorizontalGroup(
            panelNovoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNovoRegistroLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(JTFNovoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNovoRegistroLayout.setVerticalGroup(
            panelNovoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNovoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFNovoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridLateral.add(panelNovoRegistro);

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gridLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(gridLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE))
        );

        getContentPane().add(menuLateral, java.awt.BorderLayout.LINE_START);

        container.setBackground(new java.awt.Color(243, 244, 245));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 34, 34));
        jLabel2.setText("Confira os produtos cadastrados!");

        jLabel1.setBackground(new java.awt.Color(34, 34, 34));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("Produtos");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTableConsultaProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jTableConsultaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Marca", "Preço", "Data de Validade", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableConsultaProdutos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTableConsultaProdutos.setShowGrid(true);
        jScrollPane2.setViewportView(jTableConsultaProdutos);
        if (jTableConsultaProdutos.getColumnModel().getColumnCount() > 0) {
            jTableConsultaProdutos.getColumnModel().getColumn(4).setMinWidth(1);
            jTableConsultaProdutos.getColumnModel().getColumn(4).setPreferredWidth(1);
            jTableConsultaProdutos.getColumnModel().getColumn(4).setMaxWidth(1);
        }

        jButtonDetalhes.setBackground(new java.awt.Color(36, 141, 248));
        jButtonDetalhes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDetalhes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDetalhes.setText("+Detalhes");
        jButtonDetalhes.setBorder(null);
        jButtonDetalhes.setBorderPainted(false);
        jButtonDetalhes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDetalhes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDetalhes.setPreferredSize(new java.awt.Dimension(150, 65));

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

        jTextFieldNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLupa.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConsultarCliente(evt);
            }
        });

        jLabel3.setText("Busca por nome");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jButtonDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(202, 202, 202))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(62, 62, 62))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoRegistro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoRegistro
         if(novoRegistro == null){
            novoRegistro = new NovoRegistro();
        }
       
        novoRegistro.setVisible(true);
    }//GEN-LAST:event_btnNovoRegistro

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        telaChamadoraMainMenu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_fecharJanela

    private void btnDashboard(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard
        telaChamadoraMainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboard

    private void ConsultarCliente(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarCliente

        String nome = jTextFieldNomeProduto.getText(); // nome produto do TextField
        DefaultTableModel tabelaProdutoModel = (DefaultTableModel) jTableConsultaProdutos.getModel(); // tabela
        
        tabelaProdutoModel.setRowCount(0);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        ProdutoController pc = new ProdutoController();

        ArrayList<Produto> produtosListados = null;
        try {
            produtosListados = pc.listarProdutos(nome);
        } catch (ExceptionDAO ex) {
            java.util.logging.Logger.getLogger(ApresentaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            produtosListados.forEach((Produto produto) -> {
                tabelaProdutoModel.addRow(new Object[]{
                    produto.getNome(),
                    produto.getMarca(),
                    Dinheiro.parseString(produto.getPreco()),
                    format.format(produto.getDataValidade()),
                    produto.getId_produto()
                });

            });

            jTableConsultaProdutos.setModel(tabelaProdutoModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listarProdutos" + e);
        }


    }//GEN-LAST:event_ConsultarCliente

    private void listarTodosClientes(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_listarTodosClientes
        listarTodosProdutos();
    }//GEN-LAST:event_listarTodosClientes

    public void listarTodosProdutos() {
        
        DefaultTableModel tabelaProdutoModel = (DefaultTableModel) jTableConsultaProdutos.getModel(); // tabela
        tabelaProdutoModel.setRowCount(0);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        ProdutoController pc = new ProdutoController();

        ArrayList<Produto> produtosListados = null;
        try {
            produtosListados = pc.listarProdutos();
        } catch (ExceptionDAO ex) {
            java.util.logging.Logger.getLogger(ApresentaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            produtosListados.forEach((Produto produto) -> {
                tabelaProdutoModel.addRow(new Object[]{
                    produto.getNome(),
                    produto.getMarca(),
                    Dinheiro.parseString(produto.getPreco()),
                    format.format(produto.getDataValidade()),
                    produto.getId_produto()
                });

            });

            jTableConsultaProdutos.setModel(tabelaProdutoModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listarProdutos" + e);
        }
    }
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        int indice = jTableConsultaProdutos.getSelectedRow();

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto:\nNome: "
                + jTableConsultaProdutos.getValueAt(indice, 0) + "\nMarca: " + jTableConsultaProdutos.getValueAt(indice, 1), "Excluir Produto", JOptionPane.YES_NO_OPTION);

        if (opc == 0) {
            if (indice > -1) {
                try {

                    long idProdutoSelecionado = (long) jTableConsultaProdutos.getValueAt(indice, 4); // Retorna CPF
                    ProdutoController cc = new ProdutoController();
                    

                    if (cc.excluirProduto(idProdutoSelecionado )) {
                        JOptionPane.showMessageDialog(null, "Produto deletado com sucesso.");
                        listarTodosProdutos();

                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível excluir o produto. Selecione um índice válido na tabela");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir produto: " + e);
                }

            }
        }


    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        boolean resultado;
        int indice = jTableConsultaProdutos.getSelectedRow();

        if (indice > -1) {
            try {

                long idProduto = (long) jTableConsultaProdutos.getValueAt(indice, 4); // Retorna ID
        
                ProdutoController pc = new ProdutoController();
                resultado = pc.editarProduto(idProduto);

                if (!resultado) {
                    JOptionPane.showMessageDialog(null, "Erro ao selecionar PKProduto");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao retornar informações do produto\n" + e);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Selecione um cliente.");

        }


    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void JTFFinancasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFinancasMousePressed
        new ApresentaFinancas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JTFFinancasMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(telaChamadoraMainMenu != null){
        telaChamadoraMainMenu.setVisible(true);
        }
        
        
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jTFClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFClientesMousePressed
       ApresentaCliente ap = new ApresentaCliente();
       ap.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jTFClientesMousePressed

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
            java.util.logging.Logger.getLogger(ApresentaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApresentaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApresentaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApresentaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ApresentaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JTFFinancas;
    private javax.swing.JLabel JTFNovoRegistro;
    private javax.swing.JLabel JTFProdutos;
    private javax.swing.JPanel container;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel gridLateral;
    private javax.swing.JButton jButtonDetalhes;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTFClientes;
    private javax.swing.JTable jTableConsultaProdutos;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelFinancas;
    private javax.swing.JPanel panelNovoRegistro;
    private javax.swing.JPanel panelProdutos;
    // End of variables declaration//GEN-END:variables
}
