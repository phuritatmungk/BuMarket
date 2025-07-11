/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bumarket.bumarket;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author kritt
 */
public class MarketBook3 extends javax.swing.JFrame {

    /**
     * Creates new form MarketBook3
     */
    public MarketBook3() {
        initComponents();
        lbId.setText(UserData.globalId);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollbar1 = new java.awt.Scrollbar();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnAddtocart = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book3.1.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(112, 69, 280, 280);

        scrollbar1.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        jPanel2.add(scrollbar1);
        scrollbar1.setBounds(101, 467, 300, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("แกรม 100 แผ่น");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(455, 70, 320, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("• ขนาด 10.5 x 1.1 x 14.8 ซม.");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 199, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("• สมุดวาดเขียน ขนาด A6");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("• หน้าปกมีสีสันสดใส");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 360, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("• กระดาษหนา 80 แกรม");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("• จำนวน 100 แผ่น");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 199, -1));

        jPanel2.add(jPanel3);
        jPanel3.setBounds(460, 150, 560, 170);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 0, 0));
        jLabel30.setText("฿ 80.00");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(460, 330, 162, 40);

        btnAddtocart.setBackground(new java.awt.Color(204, 204, 204));
        btnAddtocart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddtocart.setText("หยิบใส่ตระกร้า");
        btnAddtocart.setRequestFocusEnabled(false);
        btnAddtocart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddtocartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddtocartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddtocartMouseExited(evt);
            }
        });
        jPanel2.add(btnAddtocart);
        btnAddtocart.setBounds(460, 430, 138, 40);

        btnBuy.setBackground(new java.awt.Color(204, 204, 204));
        btnBuy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuy.setText("ซื้อสินค้า");
        btnBuy.setRequestFocusEnabled(false);
        btnBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuyMouseExited(evt);
            }
        });
        jPanel2.add(btnBuy);
        btnBuy.setBounds(610, 430, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("จำนวน");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(460, 380, 70, 30);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner1);
        jSpinner1.setBounds(530, 380, 120, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("คำอธิบาย");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(460, 110, 80, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book3.2.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 370, 90, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book3.3.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(220, 370, 90, 90);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("สมุดวาดเขียน MONT MARTE ขนาด A6 80 ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(455, 34, 473, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 1090, 500));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_logo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 120, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        jLabel10.setRequestFocusEnabled(false);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 37, -1, 30));

        jTextField2.setBackground(new java.awt.Color(216, 216, 216));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setText("  Search");
        jTextField2.setToolTipText("");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 35, 410, 34));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shopicon.png"))); // NOI18N
        jLabel11.setRequestFocusEnabled(false);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 35, 50, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("My Account");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 35, -1, -1));

        lbId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbId.setForeground(new java.awt.Color(255, 255, 255));
        lbId.setText("XXXXX XXXXX");
        jPanel1.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 55, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png"))); // NOI18N
        jLabel15.setRequestFocusEnabled(false);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Up.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1308, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddtocartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocartMouseClicked
        // TODO add your handling code here:
        ProductData user = new ProductData();
        user.setProduct("สมุดวาดเขียน MONT MARTE ขนาด A6 80 แกรม 100 แผ่น");
        user.setQty(((Number) jSpinner1.getValue()).intValue());
        user.setPrice(80);
        user.setTotal(user.getPrice() * user.getQty());

        ProductList.cart1.add(user);
        JOptionPane.showMessageDialog(this,"Save Completed...");
    }//GEN-LAST:event_btnAddtocartMouseClicked

    private void btnBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseClicked
        // TODO add your handling code here:
        ProductData user = new ProductData();
        user.setProduct("สมุดวาดเขียน MONT MARTE ขนาด A6 80 แกรม 100 แผ่น");
        user.setQty(((Number) jSpinner1.getValue()).intValue());
        user.setPrice(80);
        user.setTotal(user.getPrice() * user.getQty());

        ProductList.cart1.add(user);

        JOptionPane.showMessageDialog(this,"Save Completed...");
        new Shoppingcart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuyMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new Category2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseEntered
        btnBuy.setBackground(Color.red);
        btnBuy.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBuyMouseEntered

    private void btnBuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuyMouseExited
        btnBuy.setBackground(new Color(153,153,153));
        btnBuy.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnBuyMouseExited

    private void btnAddtocartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocartMouseEntered
        btnAddtocart.setBackground(Color.red);
        btnAddtocart.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAddtocartMouseEntered

    private void btnAddtocartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocartMouseExited
        btnAddtocart.setBackground(new Color(204,204,204));
        btnAddtocart.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnAddtocartMouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new Shoppingcart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(MarketBook3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketBook3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketBook3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketBook3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketBook3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtocart;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbId;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
