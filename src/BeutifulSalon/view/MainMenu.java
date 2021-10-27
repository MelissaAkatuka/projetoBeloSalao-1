/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view;

import BeutifulSalon.Ferramentas.EmailAutomaticoRelatorio;
import BeutifulSalon.Ferramentas.JavaMail;
import BeutifulSalon.Ferramentas.ManipulaFontes;
import BeutifulSalon.Ferramentas.Valida;
import BeutifulSalon.controller.CabeleireiroController;
import BeutifulSalon.controller.ClienteController;
import BeutifulSalon.model.Cabeleireiro;
import BeutifulSalon.model.Cliente;
import BeutifulSalon.model.Email;
import BeutifulSalon.view.modais.NovoRegistro;
import BeutifulSalon.view.Apresenta.ApresentaFinancas;
import BeutifulSalon.view.Apresenta.ApresentaProduto;
import BeutifulSalon.view.Apresenta.ApresentaCliente;
import BeutifulSalon.model.GerenciadorJPanel;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Orcamento;
import BeutifulSalon.model.Servico;
import BeutifulSalon.view.Apresenta.ApresentaAgendamentos;
import BeutifulSalon.view.Apresenta.ApresentaServico;
import BeutifulSalon.view.Cadastros.CadastroCabeleireiro;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class MainMenu extends javax.swing.JFrame implements Observador {

    public static int TAMANHO_FONTE = 1;
    NovoRegistro novoRegistro = null;
    CadastroCabeleireiro cadastroCabeleireiro = null;
    private final Color SELECIONADO = new Color(27, 36, 54);
    private final Color PADRAO = new Color(36, 46, 66);
    private final List<JPanel> paineis = new ArrayList<>();

    public MainMenu() {
        initComponents();

        ManipulaFontes mf = new ManipulaFontes();
        jLabelDashboard.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Envie um Email
        jLabelAgendamento.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Agendamentos
        jLabelClientes.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Clientes
        jLabelServicos.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Clientes
        jLabelProdutos.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Produtos
        jLabelFinancas.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Finanças
        jLabel4.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Novo Registro

        this.setExtendedState(MAXIMIZED_BOTH);

        new GerenciadorJPanel(painelPrincipal, new Dashboard());

        paineis.add(painelDashboard);
        paineis.add(painelProdutos);
        paineis.add(painelClientes);
        paineis.add(painelFinancas);
        paineis.add(painelFinancas);
        paineis.add(painelAgendamentos);
        paineis.add(jPanelServicos);

        painelDashboard.setBackground(SELECIONADO);
        //muda icone do programa
        try {
            URL iconURL = getClass().getResource("/imagens/icon-beauty_salon.png");
            ImageIcon icon = new ImageIcon(iconURL);
            this.setIconImage(icon.getImage());
        } catch (Exception e) {
            System.out.println(e);
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

        jLabel8 = new javax.swing.JLabel();
        menuLateral = new javax.swing.JPanel();
        jPanelServicos = new javax.swing.JPanel();
        jLabelServicos = new javax.swing.JLabel();
        painelDashboard = new javax.swing.JPanel();
        jLabelDashboard = new javax.swing.JLabel();
        painelAgendamentos = new javax.swing.JPanel();
        jLabelAgendamento = new javax.swing.JLabel();
        painelProdutos = new javax.swing.JPanel();
        jLabelProdutos = new javax.swing.JLabel();
        painelFinancas = new javax.swing.JPanel();
        jLabelFinancas = new javax.swing.JLabel();
        painelClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelConfiguracoes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 30), new java.awt.Dimension(0, 30), new java.awt.Dimension(300, 30));
        painelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Dashboard");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        menuLateral.setBackground(new java.awt.Color(36, 46, 66));
        menuLateral.setPreferredSize(new java.awt.Dimension(300, 500));

        jPanelServicos.setBackground(new java.awt.Color(36, 46, 66));
        jPanelServicos.setMaximumSize(new java.awt.Dimension(139, 30));
        jPanelServicos.setMinimumSize(new java.awt.Dimension(139, 30));

        jLabelServicos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelServicos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-servicos.png"))); // NOI18N
        jLabelServicos.setText("Serviços");
        jLabelServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelServicos.setIconTextGap(5);
        jLabelServicos.setPreferredSize(new java.awt.Dimension(128, 30));
        jLabelServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelServicosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelServicosLayout = new javax.swing.GroupLayout(jPanelServicos);
        jPanelServicos.setLayout(jPanelServicosLayout);
        jPanelServicosLayout.setHorizontalGroup(
            jPanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelServicosLayout.setVerticalGroup(
            jPanelServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServicosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelDashboard.setBackground(new java.awt.Color(36, 46, 66));

        jLabelDashboard.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelDashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons-dashboard.png"))); // NOI18N
        jLabelDashboard.setText("Dashboard");
        jLabelDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelDashboardMousePressed(evt);
            }
        });

        javax.swing.GroupLayout painelDashboardLayout = new javax.swing.GroupLayout(painelDashboard);
        painelDashboard.setLayout(painelDashboardLayout);
        painelDashboardLayout.setHorizontalGroup(
            painelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        painelDashboardLayout.setVerticalGroup(
            painelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDashboardLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAgendamentos.setBackground(new java.awt.Color(36, 46, 66));

        jLabelAgendamento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-agendamento.png"))); // NOI18N
        jLabelAgendamento.setText("Agendamentos");
        jLabelAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAgendamento.setIconTextGap(5);
        jLabelAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAgendamentoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout painelAgendamentosLayout = new javax.swing.GroupLayout(painelAgendamentos);
        painelAgendamentos.setLayout(painelAgendamentosLayout);
        painelAgendamentosLayout.setHorizontalGroup(
            painelAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
            .addGroup(painelAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAgendamentosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        painelAgendamentosLayout.setVerticalGroup(
            painelAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(painelAgendamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelAgendamentosLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        painelProdutos.setBackground(new java.awt.Color(36, 46, 66));
        painelProdutos.setPreferredSize(new java.awt.Dimension(268, 58));

        jLabelProdutos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-produtos.png"))); // NOI18N
        jLabelProdutos.setText("Produtos");
        jLabelProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelProdutos.setIconTextGap(5);
        jLabelProdutos.setPreferredSize(new java.awt.Dimension(128, 30));
        jLabelProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelProdutosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelProdutosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE)))
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelProdutosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        painelFinancas.setBackground(new java.awt.Color(36, 46, 66));
        painelFinancas.setPreferredSize(new java.awt.Dimension(268, 58));

        jLabelFinancas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelFinancas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFinancas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon- financa.png"))); // NOI18N
        jLabelFinancas.setText("Finanças");
        jLabelFinancas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelFinancas.setIconTextGap(5);
        jLabelFinancas.setPreferredSize(new java.awt.Dimension(128, 30));
        jLabelFinancas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelFinancasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout painelFinancasLayout = new javax.swing.GroupLayout(painelFinancas);
        painelFinancas.setLayout(painelFinancasLayout);
        painelFinancasLayout.setHorizontalGroup(
            painelFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFinancasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFinancas, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelFinancasLayout.setVerticalGroup(
            painelFinancasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFinancasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelClientes.setBackground(new java.awt.Color(36, 46, 66));
        painelClientes.setPreferredSize(new java.awt.Dimension(268, 58));

        jLabelClientes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-clientes.png"))); // NOI18N
        jLabelClientes.setText("Clientes");
        jLabelClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClientes.setIconTextGap(5);
        jLabelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelClientesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelClientesLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
            .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelClientesLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/beauty_salon_logo.png"))); // NOI18N

        jLabelConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-configuracoes.png"))); // NOI18N
        jLabelConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelConfiguracoesMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-novoregistro.png"))); // NOI18N
        jLabel4.setText("Novo Registro");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setIconTextGap(5);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConfiguracoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(308, 308, 308))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLateralLayout.createSequentialGroup()
                        .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelServicos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLateralLayout.createSequentialGroup()
                                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(painelAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1))
                            .addComponent(painelProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(painelFinancas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                        .addGap(212, 212, 212))))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(painelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFinancas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel4)
                        .addContainerGap(132, Short.MAX_VALUE))))
        );

        getContentPane().add(menuLateral, java.awt.BorderLayout.LINE_START);

        painelPrincipal.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelPrincipal.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClientesMousePressed
        new GerenciadorJPanel(painelPrincipal, new ApresentaCliente());
        this.setTitle("Clientes");
        trocaCorPainel(painelClientes);
    }//GEN-LAST:event_jLabelClientesMousePressed

    private void jLabelProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProdutosMousePressed
        new GerenciadorJPanel(painelPrincipal, new ApresentaProduto());
        this.setTitle("Produtos");
        trocaCorPainel(painelProdutos);
    }//GEN-LAST:event_jLabelProdutosMousePressed

    public void setNovoTamanhoFonteBarraLateral() {
        
        ManipulaFontes mf = new ManipulaFontes();
        jLabelDashboard.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Envie um Email
        jLabelAgendamento.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Agendamentos
        jLabelClientes.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Clientes
        jLabelServicos.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Clientes
        jLabelProdutos.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Produtos
        jLabelFinancas.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Finanças
        jLabel4.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 25f)); //Novo Registro

    }
    private void jLabelFinancasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFinancasMousePressed

        new GerenciadorJPanel(painelPrincipal, new ApresentaFinancas());

        this.setTitle("Finanças");
        trocaCorPainel(painelFinancas);
    }//GEN-LAST:event_jLabelFinancasMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed

        if (novoRegistro == null) {
            novoRegistro = new NovoRegistro();
            novoRegistro.setVisible(true);
        } else {
            novoRegistro.setVisible(true);
        }
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabelDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDashboardMousePressed
        new GerenciadorJPanel(painelPrincipal, new Dashboard());
        this.setTitle("Dashboard");
        trocaCorPainel(painelDashboard);
    }//GEN-LAST:event_jLabelDashboardMousePressed

    private void jLabelAgendamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgendamentoMousePressed
        new GerenciadorJPanel(painelPrincipal, new ApresentaAgendamentos());
        this.setTitle("Agendamentos");
        trocaCorPainel(painelAgendamentos);
    }//GEN-LAST:event_jLabelAgendamentoMousePressed

    private void jLabelConfiguracoesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConfiguracoesMousePressed

        if (cadastroCabeleireiro == null) {
            cadastroCabeleireiro = new CadastroCabeleireiro();
            cadastroCabeleireiro.registrarObservador(this);
            cadastroCabeleireiro.setVisible(true);
        } else {
            cadastroCabeleireiro.setVisible(true);
        }
    }//GEN-LAST:event_jLabelConfiguracoesMousePressed

    private void jLabelServicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelServicosMousePressed
        new GerenciadorJPanel(painelPrincipal, new ApresentaServico());
        this.setTitle("Serviços");
        trocaCorPainel(jPanelServicos);
    }//GEN-LAST:event_jLabelServicosMousePressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opc = JOptionPane.showConfirmDialog(null, "Realmente deseja sair?", "Fechar Programa", JOptionPane.YES_NO_OPTION);

        if (opc == 0) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void trocaCorPainel(JPanel painelAtivo) {

        for (JPanel p : paineis) {
            if (p.equals(painelAtivo)) {
                p.setBackground(SELECIONADO);
            } else {
                p.setBackground(PADRAO);
            }
        }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);

            }
        });

        CabeleireiroController cc = new CabeleireiroController();
        Cabeleireiro cab = cc.selecionaCabeleireiro();
        List<Cliente> clientes = new ClienteController().listarAniversariantesDoMes();
        List<Cliente> clientesUltimoEnvio = new ClienteController().listaClientesEmailUltimaVisita();
        
        new Thread() {

                @Override
                public void run() {
                    EmailAutomaticoRelatorio emailAutomaticoRelatorio = new EmailAutomaticoRelatorio();
                    
                    emailAutomaticoRelatorio.enviarRelatorio();
                }
        }.start();
        
        if (clientes != null || clientesUltimoEnvio != null) {
            new Thread() {

                @Override
                public void run() {

                    int qtdEmailSucesso = 0;
                    int qtdEmailErro = 0;

                    if (cc.verificaRegistro() == 1) {

                        if (cab.getEmailAniversario().isEnviar()) {

                            if (clientes != null) {

                                for (Cliente c : clientes) {
                                    boolean sucesso = false;

                                    if (Valida.isEmailSemNotificar(c.getEmail())) {
                                        try {
                                            new ClienteController().atualizarUltimoEnvioEmailAniversario(c.getId());
                                            Email mail = cc.selecionaCabeleireiro().getEmailAniversario();
                                            mail.setTitulo(mail.getTitulo().replace("<nome>", c.getNome()));
                                            mail.setDestinatario(c.getEmail());
                                            mail.setTexto(mail.getTexto().replace("<nome>", c.getNome()));

                                            sucesso = mail.sendEmail(JavaMail.EMAIL_ANIVERSARIO_ULTIMAVISITA);

                                            if (sucesso) {
                                                qtdEmailSucesso++;
                                            } else {
                                                qtdEmailErro++;
                                            }
                                        } catch (MessagingException ex) {
                                            System.out.println(ex);
                                        }
                                    }

                                }

                            }

                        }

                        if (cab.getEmailUltimaVisita().isEnviar()) {

                            if (clientesUltimoEnvio != null) {

                                for (Cliente c : clientesUltimoEnvio) {

                                    boolean sucesso = false;

                                    if (Valida.isEmailSemNotificar(c.getEmail())) {
                                        try {
                                            new ClienteController().atualizarUltimoEnvioEmailUltimaVisita(c.getId());
                                            Email mail = cc.selecionaCabeleireiro().getEmailUltimaVisita();
                                            mail.setTitulo(mail.getTitulo().replace("<nome>", c.getNome()));
                                            mail.setDestinatario(c.getEmail());
                                            mail.setTexto(mail.getTexto().replace("<nome>", c.getNome()));
                                            sucesso = mail.sendEmail(JavaMail.EMAIL_ANIVERSARIO_ULTIMAVISITA);

                                            if (sucesso) {
                                                qtdEmailSucesso++;
                                            } else {
                                                qtdEmailErro++;
                                            }
                                        } catch (MessagingException ex) {
                                            System.out.println(ex);
                                        }
                                    }

                                }

                            } else {
                                System.out.println("veio nulo");
                            }

                        }

                    }//Fim envio email

                    if ((qtdEmailSucesso + qtdEmailErro) > 0) {
                        JOptionPane.showMessageDialog(null, "Foram enviados " + (qtdEmailSucesso + qtdEmailErro) + " emails automáticamente.\n"
                                + "Com sucesso:" + qtdEmailSucesso + "\nSem Sucesso: " + qtdEmailErro);
                    }
                }

            }.start();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAgendamento;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelConfiguracoes;
    private javax.swing.JLabel jLabelDashboard;
    private javax.swing.JLabel jLabelFinancas;
    private javax.swing.JLabel jLabelProdutos;
    private javax.swing.JLabel jLabelServicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelServicos;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel painelAgendamentos;
    private javax.swing.JPanel painelClientes;
    private javax.swing.JPanel painelDashboard;
    private javax.swing.JPanel painelFinancas;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelProdutos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Object obj) {
       

    }

    @Override
    public void update(Orcamento orcamento) {
    }

    @Override
    public void update(DefaultTableModel model) {
    }

    @Override
    public void update(String valorDesconto) {
         
        setNovoTamanhoFonteBarraLateral();
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
