/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package CitizenWorkArea;

import LandingUI.MainJFrame;

import Database.DatabaseConnection;
import LandingUI.MainJFrame;
import LandingUI.MenuPH;

import UserProfiles.createuserprofile;
import com.mysql.jdbc.Connection;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Chunk;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

// Other import statements
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Abhinav Uni
 */
public class PayTax extends javax.swing.JPanel {
    
    private MainJFrame mainframe;
    private int selectedNUID;
    private double totaltax  = 0;
    /**
     * Creates new form PayTax
     * @param mainframe
     */
    public PayTax(MainJFrame mainframe,int selectedNUID) {
        initComponents();
        
        this.mainframe = mainframe;
        this.selectedNUID = selectedNUID;
         showTaxTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        expdesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        expamount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        expcombo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taxtable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txttotaltax = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taxtable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Enter Description :");

        expdesc.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        expdesc.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TAXES PAID");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Enter Amount");

        expamount.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        expamount.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Choose Type");

        expcombo.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        expcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Income_Tax", "Sales_Tax", "Property_Tax", "Corporate_Tax" }));

        jButton2.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Add Transaction");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        taxtable.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        taxtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Amount", "Type", "Tax Calculated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(taxtable);

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Tax Calculated :");

        txttotaltax.setFont(new java.awt.Font("Segoe UI Variable", 1, 21)); // NOI18N
        txttotaltax.setBorder(null);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pay Tax");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        taxtable1.setFont(new java.awt.Font("Segoe UI Variable", 1, 13)); // NOI18N
        taxtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Amount", "Type", "Tax Calculated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(taxtable1);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PAY TAXES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txttotaltax, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(expamount, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(expcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(641, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {expamount, expcombo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expamount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttotaltax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {expamount, expcombo, jButton2});

    }// </editor-fold>//GEN-END:initComponents
    
    private void insertRowsIntoTaxTable() {
    try {
        Connection connection = (Connection) DatabaseConnection.getConnection();

        String sql = "INSERT INTO tax (userid, description, amount, type, taxcalculated) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        for (int i = 0; i < taxtable.getRowCount(); i++) {
            preparedStatement.setInt(1,selectedNUID); // Assuming userid is in the first column
            preparedStatement.setString(2, (String) taxtable.getValueAt(i, 0)); // Assuming description is in the second column
            preparedStatement.setString(3, (String) taxtable.getValueAt(i, 1)); // Assuming amount is in the third column
            preparedStatement.setString(4, (String) taxtable.getValueAt(i, 2)); // Assuming type is in the fourth column
            preparedStatement.setString(5, (String) taxtable.getValueAt(i, 3)); // Assuming taxcalculated is in the fifth column

            preparedStatement.executeUpdate();
        }

        preparedStatement.close();
       

        // Optionally, you can clear the table after inserting into the database
     
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle SQLException as needed
    }
}
    
    private void addRowToTable() {
        String amount = expamount.getText();
        String desc = expdesc.getText();
        String type = expcombo.getSelectedItem().toString();
        String taxcalculated;
      
         if(type.equals("Income_Tax"))
            {
               taxcalculated = String.valueOf(Integer.parseInt(amount) * 0.1);
            }
            else if(type.equals("Sales_Tax"))
            {
                 taxcalculated = String.valueOf(Integer.parseInt(amount) * 0.2);
            }
            else if(type.equals("Property_Tax"))
            {
                  taxcalculated = String.valueOf(Integer.parseInt(amount) * 0.3);
            }
            else 
            {
                  taxcalculated = String.valueOf(Integer.parseInt(amount) * 0.4);
            }
         
           totaltax  = totaltax + Double.parseDouble(taxcalculated);
         
          
          txttotaltax.setText(String.valueOf(totaltax) );
        // Assuming you have a variable for the userid (replace it with the actual userid)
       
         DefaultTableModel model = (DefaultTableModel) taxtable.getModel();
         
        Object[] rowData = {desc, amount, type, taxcalculated}; // Add more columns as needed
        model.addRow(rowData);
        expamount.setText("");
        expdesc.setText("");
        expcombo.setSelectedIndex(0);
        
    }
    
    private void showTaxTableData() {
    try {
        Connection connection = (Connection) DatabaseConnection.getConnection();
        String sql = "SELECT * FROM tax where userid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, selectedNUID); 
        ResultSet resultSet = preparedStatement.executeQuery();
      
         DefaultTableModel model = (DefaultTableModel) taxtable1.getModel();
        // Clear existing rows from the table model
   

        // Populate the JTable with data from the tax table
        while (resultSet.next()) {
            int userid = resultSet.getInt("userid");
            String description = resultSet.getString("description");
            String amount = resultSet.getString("amount");
            String type = resultSet.getString("type");
            String taxcalculated = resultSet.getString("taxcalculated");

            // Add a new row to the table model
           Object[] rowData = {description, amount, type, taxcalculated}; 
            model.addRow(rowData);
        }

        resultSet.close();
        preparedStatement.close();
      
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Handle SQLException as needed
    }
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        CitizenLandingJPanel citland = new CitizenLandingJPanel(mainframe,selectedNUID);
        mainframe.setRightComponent(citland);
        MenuPH placeholder = new MenuPH(mainframe);
        mainframe.setLeftComponent(placeholder);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
         addRowToTable();
       
    
        
    }//GEN-LAST:event_jButton2ActionPerformed
    private void clearTable() {
    // Clear all rows from the table model
     DefaultTableModel model = (DefaultTableModel) taxtable.getModel();
    while (model.getRowCount() > 0) {
        model.removeRow(0);
    }
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
         insertRowsIntoTaxTable();
          JOptionPane.showMessageDialog(this, "Tax has been paid!!");
         txttotaltax.setText("");
          showTaxTableData();
          clearTable();
       
    }//GEN-LAST:event_jButton3ActionPerformed

   
    
    
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField expamount;
    private javax.swing.JComboBox<String> expcombo;
    private javax.swing.JTextField expdesc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable taxtable;
    private javax.swing.JTable taxtable1;
    private javax.swing.JTextField txttotaltax;
    // End of variables declaration//GEN-END:variables
}
