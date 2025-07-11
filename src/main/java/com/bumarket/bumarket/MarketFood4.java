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
public class MarketFood4 extends javax.swing.JFrame {

    /**
     * Creates new form MarketFood4
     */
    public MarketFood4() {
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
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrollbar3 = new java.awt.Scrollbar();
        jPanel7 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btnAddtocart2 = new javax.swing.JButton();
        btnBuy2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel42 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        scrollbar4 = new java.awt.Scrollbar();
        jPanel9 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnAddtocart3 = new javax.swing.JButton();
        btnBuy3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Market");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food4.2.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel3);
        jLabel3.setBounds(112, 69, 280, 280);

        scrollbar3.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        jPanel6.add(scrollbar3);
        scrollbar3.setBounds(101, 467, 300, 16);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("• ตะวัน ข้าวเกรียบ รสต้นตำรับ");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("• ผลิตจากวัตถุดิบคุณภาพดี");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 360, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("• กรอบ หอม อร่อย เคี้ยวเพลิน ทุกช่วงเวลา");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 20));

        jPanel6.add(jPanel7);
        jPanel7.setBounds(460, 120, 560, 170);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 0, 0));
        jLabel41.setText("฿20.00");
        jPanel6.add(jLabel41);
        jLabel41.setBounds(460, 300, 162, 40);

        btnAddtocart2.setBackground(new java.awt.Color(204, 204, 204));
        btnAddtocart2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddtocart2.setText("หยิบใส่ตระกร้า");
        btnAddtocart2.setRequestFocusEnabled(false);
        btnAddtocart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddtocart2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddtocart2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddtocart2MouseExited(evt);
            }
        });
        jPanel6.add(btnAddtocart2);
        btnAddtocart2.setBounds(460, 400, 137, 40);

        btnBuy2.setBackground(new java.awt.Color(204, 204, 204));
        btnBuy2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuy2.setText("ซื้อสินค้า");
        btnBuy2.setRequestFocusEnabled(false);
        btnBuy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuy2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuy2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuy2MouseExited(evt);
            }
        });
        jPanel6.add(btnBuy2);
        btnBuy2.setBounds(610, 400, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("จำนวน");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(460, 350, 70, 30);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel6.add(jSpinner1);
        jSpinner1.setBounds(530, 350, 120, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("คำอธิบาย");
        jPanel6.add(jLabel42);
        jLabel42.setBounds(460, 80, 80, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food4.1.png"))); // NOI18N
        jPanel6.add(jLabel9);
        jLabel9.setBounds(110, 370, 90, 90);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("ตะวัน ข้าวเกรียบ รสต้นตำรับ 56 ก. ");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(455, 34, 600, 40);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food2.1.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel11);
        jLabel11.setBounds(112, 69, 280, 280);

        scrollbar4.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        jPanel8.add(scrollbar4);
        scrollbar4.setBounds(101, 467, 300, 16);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("• ทาโร ปลาสวรรค์คุณภาพดีแสนอร่อย");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("• ขนมขบเคี้ยวรสชาติโดนใจสำหรับคนทุกเพศทุกวัย");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 360, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("• คัดสรรแต่วัตถุดิบชั้นดี คุณภาพเยี่ยมในการผลิต");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("• มีคุณค่าทางอาหารที่มีประโยชน์ต่อร่างกาย");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 199, -1));

        jPanel8.add(jPanel9);
        jPanel9.setBounds(460, 120, 560, 170);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 0, 0));
        jLabel47.setText("฿20.00");
        jPanel8.add(jLabel47);
        jLabel47.setBounds(460, 300, 162, 40);

        btnAddtocart3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddtocart3.setText("หยิบใส่ตระกร้า");
        btnAddtocart3.setContentAreaFilled(false);
        btnAddtocart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddtocart3MouseClicked(evt);
            }
        });
        jPanel8.add(btnAddtocart3);
        btnAddtocart3.setBounds(460, 400, 137, 40);

        btnBuy3.setBackground(new java.awt.Color(204, 0, 0));
        btnBuy3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuy3.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy3.setText("ซื้อสินค้า");
        btnBuy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuy3MouseClicked(evt);
            }
        });
        jPanel8.add(btnBuy3);
        btnBuy3.setBounds(610, 400, 140, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("จำนวน");
        jPanel8.add(jLabel12);
        jLabel12.setBounds(460, 350, 70, 30);
        jPanel8.add(jSpinner4);
        jSpinner4.setBounds(530, 350, 120, 30);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setText("คำอธิบาย");
        jPanel8.add(jLabel48);
        jLabel48.setBounds(460, 80, 80, 30);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food2.2.png"))); // NOI18N
        jPanel8.add(jLabel19);
        jLabel19.setBounds(110, 370, 90, 90);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("ทาโร รสเข้มข้น");
        jPanel8.add(jLabel20);
        jLabel20.setBounds(455, 34, 600, 40);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(0, 0, 0, 0);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 1090, 500));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_logo.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 120, 110));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        jLabel14.setRequestFocusEnabled(false);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 37, -1, 30));

        jTextField2.setBackground(new java.awt.Color(216, 216, 216));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setText("  Search");
        jTextField2.setToolTipText("");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 35, 410, 34));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Shopicon.png"))); // NOI18N
        jLabel15.setRequestFocusEnabled(false);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 35, 50, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("My Account");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 35, -1, -1));

        lbId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbId.setForeground(new java.awt.Color(255, 255, 255));
        lbId.setText("XXXXX XXXXX");
        jPanel1.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 55, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Account.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png"))); // NOI18N
        jLabel23.setRequestFocusEnabled(false);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, -1, -1));

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

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Search.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Up.png"))); // NOI18N
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1308, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddtocart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocart2MouseClicked
        // TODO add your handling code here:
        ProductData user = new ProductData();
        user.setProduct("ตะวัน ข้าวเกรียบ รสต้นตำรับ 56 ก. ");
        user.setQty(((Number) jSpinner1.getValue()).intValue());
        user.setPrice(20);
        user.setTotal(user.getPrice() * user.getQty());

        ProductList.cart1.add(user);
        
        JOptionPane.showMessageDialog(this,"Save Completed...");
    }//GEN-LAST:event_btnAddtocart2MouseClicked

    private void btnBuy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuy2MouseClicked
        // TODO add your handling code here:
        ProductData user = new ProductData();
        user.setProduct("ตะวัน ข้าวเกรียบ รสต้นตำรับ 56 ก. ");
        user.setQty(((Number) jSpinner1.getValue()).intValue());
        user.setTotal(user.getPrice() * user.getQty());
        user.setPrice(20);

        ProductList.cart1.add(user);

        JOptionPane.showMessageDialog(this,"Save Completed...");
        new Shoppingcart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuy2MouseClicked

    private void btnAddtocart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocart3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddtocart3MouseClicked

    private void btnBuy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuy3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuy3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        new CategoryFood().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuy2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuy2MouseEntered
        btnBuy2.setBackground(Color.red);
        btnBuy2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBuy2MouseEntered

    private void btnBuy2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuy2MouseExited
        btnBuy2.setBackground(new Color(204,204,204));
        btnBuy2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnBuy2MouseExited

    private void btnAddtocart2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocart2MouseEntered
        btnAddtocart2.setBackground(Color.red);
        btnAddtocart2.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAddtocart2MouseEntered

    private void btnAddtocart2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtocart2MouseExited
        btnAddtocart2.setBackground(new Color(204,204,204));
        btnAddtocart2.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnAddtocart2MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        new Shoppingcart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(MarketFood4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketFood4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketFood4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketFood4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketFood4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtocart2;
    private javax.swing.JButton btnAddtocart3;
    private javax.swing.JButton btnBuy2;
    private javax.swing.JButton btnBuy3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbId;
    private java.awt.Scrollbar scrollbar3;
    private java.awt.Scrollbar scrollbar4;
    // End of variables declaration//GEN-END:variables
}
