/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.bumarket.bumarket;


/**
 *
 * @author pongs
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
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

        Loadbar = new javax.swing.JProgressBar();
        Loadvalue = new javax.swing.JLabel();
        loadlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BU Market");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loadbar.setBackground(new java.awt.Color(255, 255, 255));
        Loadbar.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(Loadbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1280, 10));

        Loadvalue.setBackground(new java.awt.Color(255, 255, 255));
        Loadvalue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Loadvalue.setForeground(new java.awt.Color(255, 255, 255));
        Loadvalue.setText("0%");
        getContentPane().add(Loadvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 690, 40, -1));

        loadlabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        loadlabel.setForeground(new java.awt.Color(255, 255, 255));
        loadlabel.setText("Loading....");
        getContentPane().add(loadlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Doenload.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar Loadbar;
    public static javax.swing.JLabel Loadvalue;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel loadlabel;
    // End of variables declaration//GEN-END:variables
}
