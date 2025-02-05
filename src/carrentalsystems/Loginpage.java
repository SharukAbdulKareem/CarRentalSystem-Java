
package carrentalsystem;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Loginpage extends javax.swing.JFrame {

    public Loginpage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Admin_Usrnm = new javax.swing.JTextField();
        BtnLOGIN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ShowPass = new javax.swing.JCheckBox();
        AdminDrct = new javax.swing.JLabel();
        Admin_Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Admin Login");

        jLabel4.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("Password");

        Admin_Usrnm.setBackground(new java.awt.Color(255, 255, 255));
        Admin_Usrnm.setForeground(new java.awt.Color(0, 153, 153));
        Admin_Usrnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_UsrnmActionPerformed(evt);
            }
        });

        BtnLOGIN.setBackground(new java.awt.Color(153, 102, 255));
        BtnLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        BtnLOGIN.setText("Login");
        BtnLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLOGINActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));
        jPanel3.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jPanel3AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rent Rabbit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Username");

        ShowPass.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ShowPass.setForeground(new java.awt.Color(204, 0, 0));
        ShowPass.setText("Show password");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });

        AdminDrct.setForeground(new java.awt.Color(204, 0, 0));
        AdminDrct.setText("UserLogin>>");
        AdminDrct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminDrctMouseClicked(evt);
            }
        });

        Admin_Pass.setBackground(new java.awt.Color(255, 255, 255));
        Admin_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_PassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Admin_Usrnm, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(Admin_Pass)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(ShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnLOGIN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdminDrct, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminDrct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Admin_Usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowPass)
                .addGap(39, 39, 39)
                .addComponent(BtnLOGIN)
                .addGap(14, 14, 14))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Admin_UsrnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_UsrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_UsrnmActionPerformed

    private void BtnLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLOGINActionPerformed
          
        String username = Admin_Usrnm.getText();
        String password = Admin_Pass.getText();
        
        LoginAdminClass ADMlog =new LoginAdminClass(username,password);
        
        if(ADMlog.verifyAdminlogin() == true){
            ManageCar managecr = new ManageCar();
                managecr.setVisible(true);
                managecr.pack();
                managecr.setLocationRelativeTo(null);
                this.dispose();
        }
            
        else{
            JOptionPane.showMessageDialog(null, "Incorrect username or password, please try again.");
            Admin_Usrnm.setText("");
            Admin_Pass.setText("");
            }
    }//GEN-LAST:event_BtnLOGINActionPerformed

    private void jPanel3AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel3AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorMoved

    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPassActionPerformed
      if(ShowPass.isSelected())
        Admin_Pass.setEchoChar((char)0);
        else
        Admin_Pass.setEchoChar('*');
    }//GEN-LAST:event_ShowPassActionPerformed

    private void AdminDrctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminDrctMouseClicked
        // TODO add your handling code here:
        new UserLogin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_AdminDrctMouseClicked

    private void Admin_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_PassActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminDrct;
    private javax.swing.JPasswordField Admin_Pass;
    private javax.swing.JTextField Admin_Usrnm;
    private javax.swing.JButton BtnLOGIN;
    private javax.swing.JCheckBox ShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
