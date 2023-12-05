/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bumarket.bumarket;

import javax.swing.JOptionPane;

/**
 *
 * @author Phuritat
 */
public class BuMarket {

    public static void main(String[] args) {
        Loading load = new Loading();
        load.setVisible(true);
        Login login = new Login();
        try 
            {
                for(int i=0;i<=100;i++){
                   Thread.sleep(10);
                   load.Loadvalue.setText(i +"%");
                   
                   if(i==10)
                   {
                        load.loadlabel.setText ("Turning 0n Modulea...");
                   }
                   if(i==20)
                   {
                       load.loadlabel.setText ("loading Modules...");
                   }
                   if(i==50)
                   {
                       load.loadlabel.setText ("Connecting to Database...");
                   }

                   if (1==70){
                       load.loadlabel.setText("Connection Successful !");
                   }
                   if(i==80){
                       load.loadlabel.setText ("Launching Webpage...");
                   }
                   load.Loadbar.setValue(i);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            load.setVisible(false);
            login.setVisible(true);
            load.dispose();
    }
}