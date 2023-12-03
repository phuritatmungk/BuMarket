/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bumarket.bumarket;

import java.io.*;
import java.util.*;

/**
 *
 * @author chait
 */
public class UserData implements java.io.Serializable {
    
    ArrayList<String> all_usernames = new ArrayList<>();
    
    Map<String, String> usernameANDpassword = new HashMap<>();
    
    
    
    private String Id;
    private String FName;
    private String LName;
    private String Username;
    private String Password;
    
    public void getUsers() {
       
        // the info structure will be like this
        /*
        Username: aaa
        Fullname: bbb ccc
        Email: abc@mail.com
        Password: pass123
        ---
        */
        
        File file = new File("account.txt");
        String username = "";
        String password = "";
        
        try {
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            // read line by line from the text file
            Object[] lines = br.lines().toArray();
            for(int i = 0; i < lines.length; i++) {  
                // splite the row into two rows
                // one for the name of the field
                // and the other for the value of the field
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
                }
                if(!username.equals("") && !password.equals(""))
                {
                    // add the username and the password to the hashmap
                    usernameANDpassword.put(username, password);
                }
                
            }
        } catch (FileNotFoundException ex) {
            
        }
    }
        

    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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