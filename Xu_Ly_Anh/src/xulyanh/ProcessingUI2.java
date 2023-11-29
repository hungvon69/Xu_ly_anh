/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xulyanh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class ProcessingUI2 extends javax.swing.JFrame {

    /**
     * Creates new form ProcessingUI2
     */
    
    public ProcessingUI2() {
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

        pnHisOri = new javax.swing.JPanel();
        pnHisMin = new javax.swing.JPanel();
        pnHisMax = new javax.swing.JPanel();
        pnHisMedian = new javax.swing.JPanel();
        pnHisAveraging = new javax.swing.JPanel();
        pnHisWeiAveragin = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Xử lý ảnh");
        setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(new java.awt.GridLayout(2, 3));

        pnHisOri.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnHisOri);

        pnHisMin.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnHisMin);

        pnHisMax.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnHisMax);

        pnHisMedian.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnHisMedian);

        pnHisAveraging.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnHisAveraging);

        pnHisWeiAveragin.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnHisWeiAveragin);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Compare");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, ProcessingUI1.mes);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(ProcessingUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcessingUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcessingUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcessingUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessingUI2().setVisible(true);
            }
        });
    }

    public void showHistogram(int[] hist, int[] hist1, int[] hist2, int[] hist3, int[] hist4, int[] hist5) {
      
        // vẽ biểu đồ histogram bằng JFreeChart 
        //  cho ảnh gốc
        DefaultCategoryDataset barChartData1 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData1.setValue(hist[i], String.valueOf(i), " ");
        }
        JFreeChart barChart = ChartFactory.createBarChart("Original", "Grey Levels",
                "Frequencies", barChartData1, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel = new ChartPanel(barChart);
        pnHisOri.add(barPanel, BorderLayout.CENTER);
        pnHisOri.validate();
        
        //  cho ảnh min
        DefaultCategoryDataset barChartData11 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData11.setValue(hist1[i], String.valueOf(i), " ");
        }
        JFreeChart barChart1 = ChartFactory.createBarChart("Min", "Grey Levels",
                "Frequencies", barChartData11, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt1 = barChart1.getCategoryPlot();
        barchrt1.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel1 = new ChartPanel(barChart1);
        pnHisMin.add(barPanel1, BorderLayout.CENTER);
        pnHisMin.validate();
        
        
        //  cho ảnh max
        DefaultCategoryDataset barChartData12 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData12.setValue(hist2[i], String.valueOf(i), " ");
        }
        JFreeChart barChart2 = ChartFactory.createBarChart("Max", "Grey Levels",
                "Frequencies", barChartData12, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt2 = barChart2.getCategoryPlot();
        barchrt2.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel2 = new ChartPanel(barChart2);
        pnHisMax.add(barPanel2, BorderLayout.CENTER);
        pnHisMax.validate();
        
        
        //  cho ảnh median
        DefaultCategoryDataset barChartData13 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData13.setValue(hist3[i], String.valueOf(i), " ");
        }
        JFreeChart barChart3 = ChartFactory.createBarChart("Median", "Grey Levels",
                "Frequencies", barChartData13, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt3 = barChart3.getCategoryPlot();
        barchrt3.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel3 = new ChartPanel(barChart3);
        pnHisMedian.add(barPanel3, BorderLayout.CENTER);
        pnHisMedian.validate();
        
        
        //  cho ảnh averaging
        DefaultCategoryDataset barChartData14 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData14.setValue(hist4[i], String.valueOf(i), " ");
        }
        JFreeChart barChart4 = ChartFactory.createBarChart("Averaging", "Grey Levels",
                "Frequencies", barChartData14, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt4 = barChart4.getCategoryPlot();
        barchrt4.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel4 = new ChartPanel(barChart4);
        pnHisAveraging.add(barPanel4, BorderLayout.CENTER);
        pnHisAveraging.validate();

        
        //  cho ảnh  weighted averaging
        DefaultCategoryDataset barChartData15 = new DefaultCategoryDataset();
        for (int i = 0; i < 256; i++) {
            barChartData15.setValue(hist5[i], String.valueOf(i), " ");
        }
        JFreeChart barChart5 = ChartFactory.createBarChart("weighted Averaging", "Grey Levels",
                "Frequencies", barChartData15, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt5 = barChart5.getCategoryPlot();
        barchrt5.setRangeGridlinePaint(Color.ORANGE);
        ChartPanel barPanel5 = new ChartPanel(barChart5);
        pnHisWeiAveragin.add(barPanel5, BorderLayout.CENTER);
        pnHisWeiAveragin.validate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel pnHisAveraging;
    private javax.swing.JPanel pnHisMax;
    private javax.swing.JPanel pnHisMedian;
    private javax.swing.JPanel pnHisMin;
    private javax.swing.JPanel pnHisOri;
    private javax.swing.JPanel pnHisWeiAveragin;
    // End of variables declaration//GEN-END:variables

   
    
    
  

    
}
