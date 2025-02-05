/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHARUK
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        
         String filepath = "Rent.txt";
        File f = new File(filepath);
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            DefaultTableModel model = (DefaultTableModel)TABLE3.getModel();
                        
            Object[] tableLines = br.lines().toArray();
            for(int i = 0; i< tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model.addRow(dataRow);
            }
        }catch(Exception ex){
            
        }
        
        
        
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
        BookingID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CarRgno = new javax.swing.JTextField();
        CusName = new javax.swing.JTextField();
        Pay = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE3 = new javax.swing.JTable();
        CarName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CusID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        RentDate = new javax.swing.JTextField();
        ReturnDate = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        BookingID.setBackground(new java.awt.Color(255, 255, 255));
        BookingID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingIDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 102, 0));
        jLabel13.setText("Payment");

        jLabel14.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 102, 0));
        jLabel14.setText("CusName");

        jLabel16.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 102, 0));
        jLabel16.setText("CarRgNo");

        jLabel17.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 102, 0));
        jLabel17.setText("BookingID");

        CarRgno.setBackground(new java.awt.Color(255, 255, 255));
        CarRgno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarRgnoActionPerformed(evt);
            }
        });

        CusName.setBackground(new java.awt.Color(255, 255, 255));
        CusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameActionPerformed(evt);
            }
        });

        Pay.setBackground(new java.awt.Color(153, 102, 255));
        Pay.setForeground(new java.awt.Color(255, 255, 255));
        Pay.setText("Pay");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(153, 102, 255));
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        TABLE3.setBackground(new java.awt.Color(255, 255, 204));
        TABLE3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookingID", "CarRegNo", "CarName", "CusName", "CusID", "RentDate", "ReturnDate", "Price"
            }
        ));
        TABLE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TABLE3MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE3);

        CarName.setBackground(new java.awt.Color(255, 255, 255));
        CarName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarNameActionPerformed(evt);
            }
        });

        Receipt.setBackground(new java.awt.Color(255, 255, 255));
        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane2.setViewportView(Receipt);

        jLabel19.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 102, 0));
        jLabel19.setText("Receipt");

        jLabel20.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 102, 0));
        jLabel20.setText("CarName");

        jLabel18.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 102, 0));
        jLabel18.setText("CusID");

        CusID.setBackground(new java.awt.Color(255, 255, 255));
        CusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusIDActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 102, 0));
        jLabel21.setText("RentDate");

        jLabel22.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 102, 0));
        jLabel22.setText("Price");

        jLabel23.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 102, 0));
        jLabel23.setText("ReturnDate");

        RentDate.setBackground(new java.awt.Color(255, 255, 255));
        RentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentDateActionPerformed(evt);
            }
        });

        ReturnDate.setBackground(new java.awt.Color(255, 255, 255));
        ReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnDateActionPerformed(evt);
            }
        });

        Price.setBackground(new java.awt.Color(255, 255, 255));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 102, 0));
        jLabel15.setText("Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel15)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(CarName, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                    .addComponent(CusName))
                                                .addGap(13, 13, 13)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel22)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(BookingID, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                    .addComponent(CarRgno))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel18))))))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CusID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(Cancel)
                                .addGap(29, 29, 29)
                                .addComponent(Pay)))
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel15))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(BookingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(CusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CarRgno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(RentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel14)
                                    .addComponent(CusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancel)
                            .addComponent(Pay)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookingIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookingIDActionPerformed

    private void CarRgnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarRgnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarRgnoActionPerformed

    private void CusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusNameActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
     
        Receipt.setText("---------------Fees Receipt--------------------\n\n");
        
        Receipt.setText(Receipt.getText()+ "Booking  Id : "+BookingID.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Car Reg number: "+CarRgno.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Car Name : "+CarName.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Customer Name : "+CusName.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Customer ID : "+CusID.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Rent Date : "+RentDate.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Return Date : "+ReturnDate.getText()+"\n\n");
        Receipt.setText(Receipt.getText()+ "Price : "+Price.getText()+"\n\n");
        
        Receipt.setText(Receipt.getText()+ "\n                 Thank You for Payment");
        
        
    }//GEN-LAST:event_PayActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel tmodel = (DefaultTableModel)TABLE3.getModel();     
        if(TABLE3.getSelectedRowCount()==1){
            tmodel.removeRow(TABLE3.getSelectedRow());
        }
        else{
            JOptionPane.showMessageDialog(this,"please select row");
        }
        String filePath = "Rent.txt";
        File file = new File(filePath);
        try
        {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0;i<TABLE3.getRowCount();i++)
            {
                for(int j=0;j<TABLE3.getColumnCount();j++)
                {
                    bw.write(TABLE3.getValueAt(i,j).toString()+":");
                }
                bw.newLine(); 
            }
            JOptionPane.showMessageDialog(null, "Data Deleted");
            setVisible(false);
            new RentCar().setVisible(true);
            bw.close();
            fw.close();
        }       
        catch (IOException ex)
        {
            
        }
    }//GEN-LAST:event_CancelActionPerformed

    private void CarNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarNameActionPerformed

    private void TABLE3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE3MouseReleased
        // TODO add your handling code here:
        
         int selectedRow = TABLE3.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)TABLE3.getModel();
        BookingID.setText(model.getValueAt(selectedRow, 0).toString());
        CarRgno.setText(model.getValueAt(selectedRow, 1).toString());
        CarName.setText(model.getValueAt(selectedRow, 2).toString());
        CusName.setText(model.getValueAt(selectedRow, 3).toString());
        CusID.setText(model.getValueAt(selectedRow, 4).toString());
        RentDate.setText(model.getValueAt(selectedRow, 5).toString());
        ReturnDate.setText(model.getValueAt(selectedRow, 6).toString());
        Price.setText(model.getValueAt(selectedRow, 7).toString());
                
    }//GEN-LAST:event_TABLE3MouseReleased

    private void CusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusIDActionPerformed

    private void RentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentDateActionPerformed

    private void ReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnDateActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookingID;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField CarName;
    private javax.swing.JTextField CarRgno;
    private javax.swing.JTextField CusID;
    private javax.swing.JTextField CusName;
    private javax.swing.JButton Pay;
    private javax.swing.JTextField Price;
    private javax.swing.JTextArea Receipt;
    private javax.swing.JTextField RentDate;
    private javax.swing.JTextField ReturnDate;
    private javax.swing.JTable TABLE3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
