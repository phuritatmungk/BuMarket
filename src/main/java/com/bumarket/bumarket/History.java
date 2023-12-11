
package com.bumarket.bumarket;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class History extends javax.swing.JFrame {

    public History() {
        initComponents();

        AcceptAmount_Data();
        
    }
    
    private void AcceptAmount_Data() {
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for(ProductData xRow : ProductList.history) {
            centerAlignTextInTable();
            model.addRow(new Product(xRow.getProduct(), xRow.getQty(), xRow.getPrice(), xRow.getTotal()).toTableRow(Table.getRowCount() + 1));
        }
    }

    
    private void centerAlignTextInTable() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < Table.getColumnCount(); i++) {
            Table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Backbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cartbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Number", "Product", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
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
            Table.getColumnModel().getColumn(1).setPreferredWidth(1);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(2).setPreferredWidth(300);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(3).setPreferredWidth(1);
            Table.getColumnModel().getColumn(4).setResizable(false);
            Table.getColumnModel().getColumn(4).setPreferredWidth(1);
            Table.getColumnModel().getColumn(5).setResizable(false);
            Table.getColumnModel().getColumn(5).setPreferredWidth(1);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 210, 990, 410));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("ประวัติการสั่งชื้อ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        Backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        Backbutton.setBorder(null);
        Backbutton.setContentAreaFilled(false);
        Backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(Backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 120, 110));

        jTextField1.setBackground(new java.awt.Color(216, 216, 216));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.setText("  Search");
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 35, 410, 34));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 37, -1, 30));

        Cartbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shopicon.png"))); // NOI18N
        Cartbutton.setBorder(null);
        Cartbutton.setContentAreaFilled(false);
        getContentPane().add(Cartbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 25, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("My Account");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 35, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("XXXXX XXXXX");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 55, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png"))); // NOI18N
        ExitButton.setBorder(null);
        ExitButton.setContentAreaFilled(false);
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 35, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Down.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Up.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbuttonMouseClicked
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbuttonMouseClicked

 
    
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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbutton;
    private javax.swing.JButton Cartbutton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

