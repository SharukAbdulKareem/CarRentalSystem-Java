/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SHARUK
 */
public class ManageCusClass {
     
    private String CusID;
    private String CusNum;
    private String CusPasw;
    private String CusAdrs;
    
    public ManageCusClass(String cusTID,String CusPH,String cusPass,String CusAds){
        this.CusID = cusTID;
        this.CusNum = CusPH;
        this.CusPasw = cusPass;
        this.CusAdrs= CusAds;
    }
    

    public void editCus(String CusidToEdit,String newNum,String newpasw,String newAdrs){
        
        ArrayList<String> Modifyarray = new ArrayList<>();
        String[] records;
        // Read line by line 
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("Users.txt"))) {
             // line reads the current line and the reader.readline  returns a string
             // loop will iterate until its nt null
            while ((line = reader.readLine()) != null) {
                records = line.split(";");
                    
                
                String CusID  = (records[0]);
                records[3] = CusNum;
                records[6] = CusPasw;
                records[5] = CusAdrs;
                
                // replace the data or modify 
                if (CusID.equals(CusidToEdit)) {

                    Modifyarray.add(records[0]+";"+records[1]+";"+records[2]+";"+records[3]+";"+records[4]+";"+records[5]+";"+records[6]);
                } else {
                    Modifyarray.add(line);

                }

            }
            reader.close();

            try {
                PrintWriter pr = new PrintWriter("Users.txt");
                for (String str : Modifyarray) {
                    pr.println(str);
                }
                JOptionPane.showMessageDialog(null,"Successfully Modified");
                pr.close();
                
                
            } catch (IOException io) {
                
                JOptionPane.showMessageDialog(null,"System Error");
                
                
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            
        }
         
    }    

}

