/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Loginmenus;

import logins.LoginAdminJPanel;
import logins.LoginEmployerJPanel;
import logins.LoginProfessorJPanel;
import logins.LoginStudentJPanel;
import ui.CreateUserJPanel;
import ui.MainJFrame;

/**
 *
 * @author Abhinav Uni
 */
public class EmployerMenu extends javax.swing.JPanel {

    
    MainJFrame mainframe;
    
    /**
     * Creates new form AdminMenu
     */
    public EmployerMenu(MainJFrame mainframe) {
        initComponents();
        
        this.mainframe = mainframe; 
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdmin3 = new javax.swing.JButton();
        btnProfessorLogin3 = new javax.swing.JButton();
        Welcome3 = new javax.swing.JLabel();
        SelectLogin3 = new javax.swing.JLabel();
        NewHere3 = new javax.swing.JLabel();
        btnCreateProfile3 = new javax.swing.JButton();
        btnStudent3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnEmployer3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAdmin3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        btnAdmin3.setForeground(new java.awt.Color(102, 102, 102));
        btnAdmin3.setText("Admin");
        btnAdmin3.setBorder(null);
        btnAdmin3.setBorderPainted(false);
        btnAdmin3.setContentAreaFilled(false);
        btnAdmin3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin3ActionPerformed(evt);
            }
        });

        btnProfessorLogin3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        btnProfessorLogin3.setForeground(new java.awt.Color(102, 102, 102));
        btnProfessorLogin3.setText("Professor");
        btnProfessorLogin3.setBorder(null);
        btnProfessorLogin3.setBorderPainted(false);
        btnProfessorLogin3.setContentAreaFilled(false);
        btnProfessorLogin3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfessorLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorLogin3ActionPerformed(evt);
            }
        });

        Welcome3.setFont(new java.awt.Font("Baskerville Old Face", 1, 21)); // NOI18N
        Welcome3.setForeground(new java.awt.Color(0, 102, 102));
        Welcome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Uni.png"))); // NOI18N

        SelectLogin3.setBackground(new java.awt.Color(153, 153, 153));
        SelectLogin3.setFont(new java.awt.Font("Segoe UI Variable", 1, 8)); // NOI18N
        SelectLogin3.setForeground(new java.awt.Color(153, 153, 153));
        SelectLogin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SelectLogin3.setText("Login As:");

        NewHere3.setBackground(new java.awt.Color(153, 153, 153));
        NewHere3.setFont(new java.awt.Font("Segoe UI Variable", 1, 8)); // NOI18N
        NewHere3.setForeground(new java.awt.Color(153, 153, 153));
        NewHere3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewHere3.setText("New here?");

        btnCreateProfile3.setBackground(new java.awt.Color(204, 255, 255));
        btnCreateProfile3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        btnCreateProfile3.setForeground(new java.awt.Color(0, 102, 102));
        btnCreateProfile3.setText("Create Profile");
        btnCreateProfile3.setBorder(null);
        btnCreateProfile3.setBorderPainted(false);
        btnCreateProfile3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateProfile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfile3ActionPerformed(evt);
            }
        });

        btnStudent3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        btnStudent3.setForeground(new java.awt.Color(102, 102, 102));
        btnStudent3.setText("Student");
        btnStudent3.setBorder(null);
        btnStudent3.setBorderPainted(false);
        btnStudent3.setContentAreaFilled(false);
        btnStudent3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudent3ActionPerformed(evt);
            }
        });

        btnEmployer3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        btnEmployer3.setText("Employer");
        btnEmployer3.setBorder(null);
        btnEmployer3.setBorderPainted(false);
        btnEmployer3.setContentAreaFilled(false);
        btnEmployer3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployer3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnEmployer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnEmployer3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Welcome3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SelectLogin3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateProfile3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(btnProfessorLogin3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStudent3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(NewHere3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Welcome3)
                .addGap(89, 89, 89)
                .addComponent(SelectLogin3)
                .addGap(13, 13, 13)
                .addComponent(btnAdmin3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfessorLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(NewHere3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateProfile3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdmin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin3ActionPerformed
        // TODO add your handling code here:
        
        LoginAdminJPanel adminlogin = new LoginAdminJPanel(mainframe);
        mainframe.setRightComponent(adminlogin);
        AdminMenu adminmenu = new AdminMenu(mainframe);
        mainframe.setLeftComponent(adminmenu);
    }//GEN-LAST:event_btnAdmin3ActionPerformed

    private void btnProfessorLogin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorLogin3ActionPerformed
        // TODO add your handling code here:

        LoginProfessorJPanel professorlogin = new LoginProfessorJPanel(mainframe);
        mainframe.setRightComponent(professorlogin);
        ProfessorMenu profmenu = new ProfessorMenu(mainframe);
        mainframe.setLeftComponent(profmenu);
    }//GEN-LAST:event_btnProfessorLogin3ActionPerformed

    private void btnCreateProfile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfile3ActionPerformed
        // TODO add your handling code here:

        CreateUserJPanel createprofile = new CreateUserJPanel(mainframe);
        mainframe.setRightComponent(createprofile);
        LoginMenu loginmenu = new LoginMenu(mainframe);
        mainframe.setLeftComponent(loginmenu);
    }//GEN-LAST:event_btnCreateProfile3ActionPerformed

    private void btnStudent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudent3ActionPerformed
        // TODO add your handling code here:

        LoginStudentJPanel studentlogin = new LoginStudentJPanel(mainframe);
        mainframe.setRightComponent(studentlogin);
        StudentMenu stumenu = new StudentMenu(mainframe);
        mainframe.setLeftComponent(stumenu);
    }//GEN-LAST:event_btnStudent3ActionPerformed

    private void btnEmployer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployer3ActionPerformed
        // TODO add your handling code here:
        
        LoginEmployerJPanel employerlogin = new LoginEmployerJPanel(mainframe);
        mainframe.setRightComponent(employerlogin);
        EmployerMenu empmenu = new EmployerMenu(mainframe);
        mainframe.setLeftComponent(empmenu);
    }//GEN-LAST:event_btnEmployer3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NewHere3;
    private javax.swing.JLabel SelectLogin3;
    private javax.swing.JLabel Welcome3;
    private javax.swing.JButton btnAdmin3;
    private javax.swing.JButton btnCreateProfile3;
    private javax.swing.JButton btnEmployer3;
    private javax.swing.JButton btnProfessorLogin3;
    private javax.swing.JButton btnStudent3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
