/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SHARUK
 */
public class UserRegisterClass {
    
    private String customerFName,customerLName,PhoneNum,passport_Ic,addrs,Usrpassword;
    
    public UserRegisterClass(String FirstName,String LastName,String PhoneNo, String PassportIC,String Address,String UserPassword){
            
        this.customerFName= FirstName;
        this.customerLName= LastName;
        this.PhoneNum = PhoneNo;
        this.passport_Ic= PassportIC;
        this.addrs= Address;
        this.Usrpassword= UserPassword;        
    }
    
    public  void verifyRegistration (){
        try{
            BufferedWriter cus = new BufferedWriter(new FileWriter("Users.txt",true));

            String data = passport_Ic +";"+ customerFName +";"+ customerLName +";"+ PhoneNum +";"+ passport_Ic +";"+ addrs +";"+ Usrpassword;
            cus.write(data);
            cus.write("\n");
            cus.close();
            JOptionPane.showMessageDialog(null, "Registration successful");
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Fail to add record.");
        }
    }
}
   
