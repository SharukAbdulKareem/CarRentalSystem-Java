/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHARUK
 */
public class ManageCarsClass {
    
    private String CarNo;
    private String Brand;
    private String Model;
    private String Status;
    private String Price;
    

    public ManageCarsClass(String CarNum, String CarBrand, String CarModel, String CarStatus,String CarPrice){
        this.CarNo = CarNum;
        this.Brand = CarBrand;
        this.Model = CarModel;
        this.Status = CarStatus;
        this.Price = CarPrice;
    }
    
    public boolean VCarReg(){
        boolean exist = false;
        
        try{
            BufferedWriter wr = new BufferedWriter(new FileWriter("Cars.txt",true));

            String data = CarNo +";"+ Brand +";"+ Model +";"+ Status +";"+ Price;
            wr.write(data);
            wr.write("\n");
            wr.close();
            JOptionPane.showMessageDialog(null, "Registration succesful");
            exist = true;
        }
        catch (IOException ex) {
        }

        return exist;
    }
    
    public void editCars(String idToEdit,String newBrand,String newModel,String newStatus,String newPrice){
        
        ArrayList<String> Modifyarray = new ArrayList<>();
        String[] records;
        // Read line by line 
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("Cars.txt"))) {
             // line reads the current line and the reader.readline  returns a string
             // loop will iterate until its nt null
            while ((line = reader.readLine()) != null) {
                records = line.split(";");
                    
                
                String CarNum = (records[0]);
                String CarBrand= (records[1]);
                String CarModel=(records[2]);
                String CarStatus= (records[3]);
                String CarPrice= (records[4]);
                
                // replace the data or modify 
                if (CarNum.equals(idToEdit)) {

                    Modifyarray.add(idToEdit + ";" + newBrand + ";" + newModel + ";" + newStatus +  ";" + newPrice );
                    
                } else {
                    Modifyarray.add(line);

                }

            }
            reader.close();

            try {
                PrintWriter pr = new PrintWriter("Cars.txt");
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



