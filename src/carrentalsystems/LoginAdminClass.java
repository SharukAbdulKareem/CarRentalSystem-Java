/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SHARUK
 */
public class LoginAdminClass {
    private String username, password;
    
    public LoginAdminClass(String ADMusername, String ADMpassword){
        this.username= ADMusername;
        this.password = ADMpassword;
        
    }
    
    public  boolean verifyAdminlogin(){
        boolean verify = false;

        File logins = new File("Admin.txt");
        
        try(Scanner myReader = new Scanner(logins))
        {
            while(myReader.hasNextLine())
            {
                String[] data = myReader.nextLine().split(";");
                if(username.equals(data[0]) && password.equals(data[1]))
                    verify= true;
                }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);                           
        }
        return verify;
    }
   
}
