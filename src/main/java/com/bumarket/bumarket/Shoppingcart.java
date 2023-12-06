/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bumarket.bumarket;

import java.awt.Component;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pongs
 */
public class Shoppingcart extends javax.swing.JFrame {

    public Shoppingcart() {
        initComponents();
        
        Shoppingcart_Data();
    }
    
    private void Shoppingcart_Data() {
        Table.getColumnModel().getColumn(3).setCellEditor(new QtyCellEdit(new EventCellInputChange(){
            @Override
            public void inputChanged() {
                sumAmount();
            }
        }));
        Table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        });
        DefaultTableModel pd = (DefaultTableModel) Table.getModel();
        pd.addRow(new Product("Kuy",11225, 2, 100, 10).toTableRow(Table.getRowCount() + 1));
        pd.addRow(new Product("Kuy",11225, 2, 100, 10).toTableRow(Table.getRowCount() + 1));
        pd.addRow(new Product("Kuy",11225, 2, 100, 10).toTableRow(Table.getRowCount() + 1));
        pd.addRow(new Product("Kuy",11225, 2, 100, 10).toTableRow(Table.getRowCount() + 1));
        pd.addRow(new Product("Kuy",11225, 2, 100, 10).toTableRow(Table.getRowCount() + 1));
        
    } 
    
     private void sumAmount() {
        int total = 0;
        for (int i = 0; i < Table.getRowCount(); i++) {
            Product item = (Product) Table.getValueAt(i, 0);
            total += item.getTotal();
        }
        DecimalFormat df = new DecimalFormat("$ #,##0.00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        List = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ExitButton = new javax.swing.JButton();
        Cartbutton = new javax.swing.JButton();
        Backbutton = new javax.swing.JButton();
        BuyButton = new javax.swing.JButton();
        PayButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Historybutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture2 (1).png"))); // NOI18N
        jButton3.setText("ยอดพอยท์คงเหลือ");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Total.setText("100");
        Total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Total.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 340, 80, -1));

        List.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        List.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        List.setText("3 รายการ");
        List.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        List.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(List, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 285, 80, -1));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 10, 20));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 10, 470));

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Product", "ID Product", "Quantity", "Total", "Point"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(0);
            Table.getColumnModel().getColumn(0).setPreferredWidth(0);
            Table.getColumnModel().getColumn(0).setMaxWidth(0);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(2).setPreferredWidth(30);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(3).setPreferredWidth(5);
            Table.getColumnModel().getColumn(4).setResizable(false);
            Table.getColumnModel().getColumn(5).setResizable(false);
            Table.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 210, 660, 420));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png"))); // NOI18N
        ExitButton.setBorder(null);
        ExitButton.setContentAreaFilled(false);
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 35, -1, -1));

        Cartbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shopicon.png"))); // NOI18N
        Cartbutton.setBorder(null);
        Cartbutton.setContentAreaFilled(false);
        getContentPane().add(Cartbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 25, -1, -1));

        Backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        Backbutton.setBorder(null);
        Backbutton.setContentAreaFilled(false);
        Backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbuttonMouseClicked(evt);
            }
        });
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        BuyButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BuyButton.setText("เลือกซื้อสินค้า");
        BuyButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BuyButton.setContentAreaFilled(false);
        getContentPane().add(BuyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 240, 30));

        PayButton.setBackground(new java.awt.Color(255, 51, 51));
        PayButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PayButton.setForeground(new java.awt.Color(255, 255, 255));
        PayButton.setText("ชำระเงิน");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 240, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ยอดรวม");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("สรุปคำสั่งซื้อ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("รวมมูลค่าสินค้า");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 240, 100));

        Historybutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Historybutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture2 (1).png"))); // NOI18N
        Historybutton.setText("  ประวัติการสั่งซื้อ");
        Historybutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Historybutton.setContentAreaFilled(false);
        Historybutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(Historybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 240, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("ตระกร้า");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("XXXXX XXXXX");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 55, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("My Account");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 35, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 37, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 120, 110));

        jTextField1.setBackground(new java.awt.Color(216, 216, 216));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setText("  Search");
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 35, 410, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Down.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Up.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
         new Checkout().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_PayButtonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void BackbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbuttonMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Shoppingcart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shoppingcart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shoppingcart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shoppingcart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shoppingcart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton BuyButton;
    private javax.swing.JButton Cartbutton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton Historybutton;
    private javax.swing.JLabel List;
    private javax.swing.JButton PayButton;
    private javax.swing.JTable Table;
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
