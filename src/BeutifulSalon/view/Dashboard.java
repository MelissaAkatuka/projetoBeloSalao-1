/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeutifulSalon.view;

import BeutifulSalon.controller.AgendamentoController;
import BeutifulSalon.controller.CabeleireiroController;
import BeutifulSalon.controller.EstoqueController;
import BeutifulSalon.dao.ExceptionDAO;
import BeutifulSalon.model.AplicaLookAndFeel;
import BeutifulSalon.model.Cabeleireiro;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
/**
 *
 * @author Mateus
 */
public class Dashboard extends javax.swing.JPanel {

    /**
     * Creates new form testePainel
     */
    public Dashboard() {
        initComponents();
        
        AplicaLookAndFeel.pegaNimbus();
        CabeleireiroController cc = new CabeleireiroController();
        AgendamentoController ag = new AgendamentoController();
        EstoqueController ec = new EstoqueController();
        
        try {
            Cabeleireiro cabeleireiro = cc.selecionaCabeleireiro();
            int nAgendamentos = ag.listarAgendamentosHoje().size();
            long nProdutosEstoque = ec.somaProdutosEstoque();
            if(cabeleireiro.getNome() != null){
                jLabelNomeCabeleireiro.setText("Olá, " + cabeleireiro.getNome());
            }else{
                jLabelNomeCabeleireiro.setText("Olá, Cabeleireiro");
            }
            
            jLabelNumeroAgendamentos.setText(String.valueOf(nAgendamentos));
            jLabelQtdEstoque.setText(String.valueOf(nProdutosEstoque)+" un.");
        } catch (ExceptionDAO e) {
        }
        int largura = 200;
        int altura = 300;
       
        ChartPanel g = new ChartPanel(createChart(createDataset()), largura, altura, 200, 200,altura, largura, true, 
                true, true, true,true,true);
 
        
        jPanelGrafico.add(g);
    }
    private static PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "IPhone 5s" , 20.00 );  
      dataset.setValue( "SamSung Grand" ,20.00 );   
      dataset.setValue( "MotoG" ,40.00  );    
      dataset.setValue( "Nokia Lumia" ,  10.00  );  
      return dataset;         
   }
    
     private static JFreeChart createChart( PieDataset dataset ) {
   
     
      RingPlot plot = new RingPlot(dataset);
      //plot.setBackgroundPaint(Color.WHITE);
      plot.setOutlineVisible(false);
      plot.setShadowPaint(null);
      plot.setOutlineVisible(false);
      plot.setBackgroundPaint(null);
      plot.setLabelGenerator(null);
      plot.getOutlinePaint();
      plot.setSectionDepth(0.30); 
      plot.setOuterSeparatorExtension(0);
      plot.setInnerSeparatorExtension(0);
      plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{1}", new DecimalFormat("#,##0"), new DecimalFormat("0.000%")));
      plot.setLabelBackgroundPaint(null);
      plot.setSectionOutlineStroke(dataset.getKey(0),new BasicStroke(2) );

      JFreeChart chart = new JFreeChart("Titulo", JFreeChart.DEFAULT_TITLE_FONT, plot, true);


      return chart;
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeCabeleireiro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        painelNumeroAgendamentos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNumeroAgendamentos = new javax.swing.JLabel();
        painelNumeroAgendamentos3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelQtdEstoque = new javax.swing.JLabel();
        painelNumeroAgendamentos2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelQtdEstoque2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelGrafico = new javax.swing.JPanel();
        jPanel2343 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2123 = new javax.swing.JPanel();
        jpanel15 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(244, 247, 250));

        jLabelNomeCabeleireiro.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelNomeCabeleireiro.setText("jLabel2");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel23.setBackground(new java.awt.Color(244, 247, 250));
        jPanel23.setForeground(new java.awt.Color(244, 247, 250));

        painelNumeroAgendamentos.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {200};
        jPanel2Layout.rowHeights = new int[] {1};
        painelNumeroAgendamentos.setLayout(jPanel2Layout);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agendamentos");
        jLabel3.setIconTextGap(40);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        painelNumeroAgendamentos.add(jLabel3, gridBagConstraints);

        jLabelNumeroAgendamentos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelNumeroAgendamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroAgendamentos.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        painelNumeroAgendamentos.add(jLabelNumeroAgendamentos, gridBagConstraints);

        painelNumeroAgendamentos3.setBackground(new java.awt.Color(255, 255, 255));
        painelNumeroAgendamentos3.setLayout(new java.awt.GridBagLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Qtd. Estoque");
        jLabel8.setIconTextGap(40);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        painelNumeroAgendamentos3.add(jLabel8, gridBagConstraints);

        jLabelQtdEstoque.setBackground(new java.awt.Color(255, 255, 255));
        jLabelQtdEstoque.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelQtdEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQtdEstoque.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        painelNumeroAgendamentos3.add(jLabelQtdEstoque, gridBagConstraints);

        painelNumeroAgendamentos2.setBackground(new java.awt.Color(255, 255, 255));
        painelNumeroAgendamentos2.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vendas Hoje");
        jLabel7.setIconTextGap(40);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        painelNumeroAgendamentos2.add(jLabel7, gridBagConstraints);

        jLabelQtdEstoque2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelQtdEstoque2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQtdEstoque2.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        painelNumeroAgendamentos2.add(jLabelQtdEstoque2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Produtos Mais Vendidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 455, Short.MAX_VALUE))
        );

        jPanelGrafico.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGrafico.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2343Layout = new javax.swing.GroupLayout(jPanel2343);
        jPanel2343.setLayout(jPanel2343Layout);
        jPanel2343Layout.setHorizontalGroup(
            jPanel2343Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel2343Layout.setVerticalGroup(
            jPanel2343Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        jLabel2.setText("teste");

        jPanel2123.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2123Layout = new javax.swing.GroupLayout(jPanel2123);
        jPanel2123.setLayout(jPanel2123Layout);
        jPanel2123Layout.setHorizontalGroup(
            jPanel2123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2123Layout.setVerticalGroup(
            jPanel2123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 167, Short.MAX_VALUE)
        );

        jpanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpanel15Layout = new javax.swing.GroupLayout(jpanel15);
        jpanel15.setLayout(jpanel15Layout);
        jpanel15Layout.setHorizontalGroup(
            jpanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpanel15Layout.setVerticalGroup(
            jpanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(578, 578, 578))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jPanel2343, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addComponent(painelNumeroAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(painelNumeroAgendamentos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)
                                .addComponent(painelNumeroAgendamentos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanelGrafico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jPanel2123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)
                                .addComponent(jpanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelNumeroAgendamentos3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelNumeroAgendamentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelNumeroAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 848, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(jPanel2343, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel23);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelNomeCabeleireiro, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelNomeCabeleireiro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNomeCabeleireiro;
    private javax.swing.JLabel jLabelNumeroAgendamentos;
    private javax.swing.JLabel jLabelQtdEstoque;
    private javax.swing.JLabel jLabelQtdEstoque2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2123;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel2343;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanelGrafico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel15;
    private javax.swing.JPanel painelNumeroAgendamentos;
    private javax.swing.JPanel painelNumeroAgendamentos2;
    private javax.swing.JPanel painelNumeroAgendamentos3;
    // End of variables declaration//GEN-END:variables
}
