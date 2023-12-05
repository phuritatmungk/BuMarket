/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bumarket.bumarket;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author chait
 */
public class UserData implements java.io.Serializable {
    
    Map<String, String> usernameANDpassword = new HashMap<>();
    ArrayList<String> all_usernames = new ArrayList<>();
    ArrayList<String> all_password = new ArrayList<>();
    ArrayList<String> all_userid = new ArrayList<>();
    
    public void getUsers() {
        File file = new File("account.txt");
        String username = "";
        String password = "";
        String userid = "";
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            Object[] lines = br.lines().toArray();
            for(int i = 0; i < lines.length; i++) {  
                String[] row = lines[i].toString().split(": ");
                
                if(row[0].equals("Username"))
                {
                    // if it's the username field we will get the username
                    username = row[1];
                    // add the username to the all username array
                    all_usernames.add(username);
                }
                else if(row[0].equals("Password"))
                {
                    // if it's the password field we will get the password
                    password = row[1];
                    
                    all_password.add(password);
                }
                else if(row[0].equals("Student ID")) {
                    userid = row[1];
                    all_userid.add(userid);
                }
                if(!username.equals("") && !password.equals(""))
                {
                    // add the username and the password to the hashmap
                    usernameANDpassword.put(username, password);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }
    
    public boolean checkIfUsernameExist(String un) {
        boolean exist = false;

        for(String username: all_usernames) {
            if(username.equals(un))
            {
                exist = true;
            }
        }
        return exist;
    }
    
    public boolean checkIfUseridExist(String uid) {
        boolean exist = false;
        
        for(String userid: all_userid) {
            if(userid.equals(uid)) {
                exist = true;
            }
        }
        return exist;
    }
    
    public boolean checkIfPasswordExist(String pass) {
        boolean exist = false;
        
        for(String userpass: all_password) {
            if(userpass.equals(pass)) {
                exist = true;
            }
        }
        return exist;
    }

    public static int checkPasswordStrength(String password) {
        int score = 0;
        if (password.length() >= 8) {
            score++;
        }
        boolean hasUppercase = !password.equals(password.toLowerCase());
        if (hasUppercase) {
            score++;
        }
        boolean hasLowercase = !password.equals(password.toUpperCase());
        if (hasLowercase) {
            score++;
        }
        boolean hasDigit = password.matches(".*\\d.*");
        if (hasDigit) {
            score++;
        }
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");
        if (hasSpecialChar) {
            score++;
        }
        if (score < 3) {
            return 1;
        } else if (score < 5) {
            return 2;
        } else {
            return 3;
        }
    }
}