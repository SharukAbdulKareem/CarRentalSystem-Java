
package carrentalsystem;

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class UserLogin extends javax.swing.JFrame {


    public UserLogin() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cus_Username = new javax.swing.JTextField();
        UsrLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CreateAccount = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ShowCus = new javax.swing.JCheckBox();
        UserLogin = new javax.swing.JLabel();
        Cus_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Customer Login");

        jLabel4.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("Password");

        Cus_Username.setBackground(new java.awt.Color(255, 255, 255));
        Cus_Username.setForeground(new java.awt.Color(0, 153, 153));
        Cus_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cus_UsernameActionPerformed(evt);
            }
        });

        UsrLogin.setBackground(new java.awt.Color(153, 102, 255));
        UsrLogin.setForeground(new java.awt.Color(255, 255, 255));
        UsrLogin.setText("Login");
        UsrLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsrUsrLoginActionPerformed(evt);
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

        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Dont have an account?");

        CreateAccount.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        CreateAccount.setText("Create  Account");
        CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CreateAccount)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateAccount)
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Username");

        ShowCus.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ShowCus.setForeground(new java.awt.Color(204, 0, 0));
        ShowCus.setText("Show Password");
        ShowCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCusActionPerformed(evt);
            }
        });

        UserLogin.setForeground(new java.awt.Color(153, 0, 0));
        UserLogin.setText("Admin Login>>>");
        UserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLoginMouseClicked(evt);
            }
        });

        Cus_Password.setBackground(new java.awt.Color(255, 255, 255));
        Cus_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cus_PasswordActionPerformed(evt);
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
                                            .addComponent(Cus_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                            .addComponent(Cus_Password)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(ShowCus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(UsrLogin)))))
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserLogin)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(UserLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Cus_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cus_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowCus)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(UsrLogin)
                        .addGap(54, 54, 54))))
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
    }// </editor-fold>//GEN-END:initComponents

    private void Cus_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cus_UsernameActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_Cus_UsernameActionPerformed

    private void UsrUsrLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsrUsrLoginActionPerformed
   
        String usern = Cus_Username.getText();
        String passw = Cus_Password.getText();
        
        
        LoginUserClass USRlog =new LoginUserClass(usern,passw);
        
        if(USRlog.verifyUserlogin() == true){
                    RentCar rental = new RentCar();
                    rental.setVisible(true);
                    rental.pack();
                    rental.setLocationRelativeTo(null);
                    this.dispose(); 
        }
            
        else{
            JOptionPane.showMessageDialog(null, "Incorrect username or password, please try again.");
            Cus_Username.setText("");
            Cus_Password.setText("");
            }
    }//GEN-LAST:event_UsrUsrLoginActionPerformed

    private void jPanel3AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel3AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3AncestorMoved

    private void ShowCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCusActionPerformed
        // TODO add your handling code here:
        if(ShowCus.isSelected())
        Cus_Password.setEchoChar((char)0);
        else
        Cus_Password.setEchoChar('*');
    }//GEN-LAST:event_ShowCusActionPerformed

    private void UserLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLoginMouseClicked
        // TODO add your handling code here:
        new Loginpage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_UserLoginMouseClicked

    private void Cus_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cus_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cus_PasswordActionPerformed

    private void CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountActionPerformed
        UserRegister reg = new UserRegister();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_CreateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccount;
    private javax.swing.JPasswordField Cus_Password;
    private javax.swing.JTextField Cus_Username;
    private javax.swing.JCheckBox ShowCus;
    private javax.swing.JLabel UserLogin;
    private javax.swing.JButton UsrLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
