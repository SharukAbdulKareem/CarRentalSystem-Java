/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SHARUK
 */
public class LoginUserClass {
    
    private String username, password;
    
    public LoginUserClass(String USRusername, String USRpassword){
        this.username= USRusername;
        this.password = USRpassword;
        
    }
    
    public  boolean verifyUserlogin(){
        boolean Uverify = false;

        File logins = new File("Users.txt");
        
        try(Scanner myReader = new Scanner(logins))
        {
            while(myReader.hasNextLine())
            {
                String[] data = myReader.nextLine().split(";");
                if(username.equals(data[0]) && password.equals(data[5]))
                    Uverify= true;
                }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);                           
        }
        return Uverify;
    }
   
}
