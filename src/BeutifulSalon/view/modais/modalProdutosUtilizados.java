/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view.modais;

import BeutifulSalon.Ferramentas.ManipulaFontes;
import BeutifulSalon.controller.ProdutoController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.Dinheiro;
import BeutifulSalon.model.Observado;
import BeutifulSalon.model.Observador;
import BeutifulSalon.model.Produto;
import BeutifulSalon.view.Apresenta.ApresentaProduto;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melissa
 */
public class modalProdutosUtilizados extends javax.swing.JFrame implements Observado {

    /**
     * Creates new form modalProdutosUtilizados
     */
    ArrayList<Observador> observadores = new ArrayList<>();

    public modalProdutosUtilizados() {
        initComponents();
        
        ManipulaFontes mf = new ManipulaFontes();
        
        jLabel1.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 25f)); //Adicione os produtos utilizados para realizar o serviço
        jLabelBuscaNome.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 18f)); //Busca por nome
        jTextFieldBuscaPorNome.setFont(mf.getFont(mf.MEDIUM, Font.PLAIN, 13f)); //Box Busca por Nome
        jTablePesquisaProdutos.setFont(mf.getFont(mf.SEMIBOLD, Font.PLAIN, 13f)); //Tabela1
        jTableProdutosSelecionados.setFont(mf.getFont(mf.SEMIBOLD, Font.PLAIN, 13f)); //Tabela2
        button1.setFont(mf.getFont(mf.MEDIUM, Font.BOLD, 18f)); //Concluir
        
        
        listarProdutos();
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
        jLabel1 = new javax.swing.JLabel();
        jLabelBuscaNome = new javax.swing.JLabel();
        jTextFieldBuscaPorNome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisaProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProdutosSelecionados = new javax.swing.JTable();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("Adicione os produtos utilizados para realizar o serviço");

        jLabelBuscaNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscaNome.setForeground(new java.awt.Color(34, 34, 34));
        jLabelBuscaNome.setText("Busca por nome");
        jLabelBuscaNome.setToolTipText("");

        jTextFieldBuscaPorNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldBuscaPorNome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextFieldBuscaPorNomeCaretUpdate(evt);
            }
        });
        jTextFieldBuscaPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscaPorNomeActionPerformed(evt);
            }
        });
        jTextFieldBuscaPorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaPorNomeKeyPressed(evt);
            }
        });

        jTablePesquisaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePesquisaProdutos);
        if (jTablePesquisaProdutos.getColumnModel().getColumnCount() > 0) {
            jTablePesquisaProdutos.getColumnModel().getColumn(2).setMinWidth(1);
            jTablePesquisaProdutos.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTablePesquisaProdutos.getColumnModel().getColumn(2).setMaxWidth(1);
        }

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-seta.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jTableProdutosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Marca", "Rendimento", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableProdutosSelecionados);
        if (jTableProdutosSelecionados.getColumnModel().getColumnCount() > 0) {
            jTableProdutosSelecionados.getColumnModel().getColumn(3).setMinWidth(1);
            jTableProdutosSelecionados.getColumnModel().getColumn(3).setPreferredWidth(1);
            jTableProdutosSelecionados.getColumnModel().getColumn(3).setMaxWidth(1);
        }

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setLabel("Concluir");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBuscaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBuscaPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscaPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscaPorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaPorNomeActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

        int i = jTablePesquisaProdutos.getSelectedRow();
        Produto produtoBuscado = null;

        if (i > -1) {
                DefaultTableModel tabelaProdutosComprados = (DefaultTableModel) jTableProdutosSelecionados.getModel();
                int rendimento = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas utilizações o produto rende: "));
                long idProdutoBuscado = (long) jTablePesquisaProdutos.getValueAt(i, 2);

                //acessa o banco 
                ProdutoController po = new ProdutoController();
                produtoBuscado = po.buscarProduto(idProdutoBuscado);

                tabelaProdutosComprados.addRow(new Object[]{
                    produtoBuscado.getNome(),
                    produtoBuscado.getMarca(),
                    rendimento,
                    produtoBuscado.getId_produto()
                });
                //em cima modificou, e aqui embaixo inseriu de volta na tabela
                jTableProdutosSelecionados.setModel(tabelaProdutosComprados);

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto antes");
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        notificarObservadores();
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void jTextFieldBuscaPorNomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldBuscaPorNomeCaretUpdate
        // TODO add your handling code here:
        if (jTextFieldBuscaPorNome.getText().equals("")) {
            listarProdutos();
        }
    }//GEN-LAST:event_jTextFieldBuscaPorNomeCaretUpdate

    private void jTextFieldBuscaPorNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaPorNomeKeyPressed
        String nome = jTextFieldBuscaPorNome.getText(); // nome produto do TextField
        DefaultTableModel tabelaProdutoModel = (DefaultTableModel) jTablePesquisaProdutos.getModel(); // tabela

        //reseta a qtdd de linahs da tabela
        tabelaProdutoModel.setRowCount(0);

        ProdutoController pc = new ProdutoController();

        ArrayList<Produto> produtosListados = null;

        produtosListados = pc.listarProdutos(nome);

        try {
            produtosListados.forEach((Produto produto) -> {
                tabelaProdutoModel.addRow(new Object[]{
                    produto.getNome(),
                    produto.getMarca(),
                    produto.getId_produto()
                });

            });

            jTablePesquisaProdutos.setModel(tabelaProdutoModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listarProdutos" + e);
        }
    }//GEN-LAST:event_jTextFieldBuscaPorNomeKeyPressed

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
            java.util.logging.Logger.getLogger(modalProdutosUtilizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modalProdutosUtilizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modalProdutosUtilizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modalProdutosUtilizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modalProdutosUtilizados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBuscaNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePesquisaProdutos;
    private javax.swing.JTable jTableProdutosSelecionados;
    private javax.swing.JTextField jTextFieldBuscaPorNome;
    // End of variables declaration//GEN-END:variables

    private void listarProdutos() {
        DefaultTableModel tabelaEsq = (DefaultTableModel) jTablePesquisaProdutos.getModel();
        tabelaEsq.setRowCount(0);

        ProdutoController pc = new ProdutoController();
        ArrayList<Produto> arr = null;
        arr = pc.listarProdutos();

        try {
            arr.forEach((Produto produto) -> {
                tabelaEsq.addRow(new Object[]{
                    produto.getNome(),
                    produto.getMarca(),
                    produto.getId_produto()
                });

            });

            jTablePesquisaProdutos.setModel(tabelaEsq);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar produtos" + e);
        }
    }

    //método para retornar tabela
    public DefaultTableModel retornaTabela() {
        return (DefaultTableModel) jTableProdutosSelecionados.getModel();
    }

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
            ob.update(retornaTabela());
        });
    }
}
