
package UI;

import MyConnection.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Tenant extends javax.swing.JInternalFrame {

   private Connection connect;
    public Tenant() {
        initComponents();
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        MyConnection conn = new MyConnection();
        connect = conn.getConnection();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TenantTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ContactNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        AddTenant = new javax.swing.JButton();
        UpdateTenant = new javax.swing.JButton();
        DeleteTenant = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("List of Tenant");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 670, 10));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        TenantTable.setBackground(new java.awt.Color(204, 204, 255));
        TenantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "TenantID", "Last Name", "First Name", "ContactInfo", "Email", "Unit ID"
            }
        ));
        jScrollPane1.setViewportView(TenantTable);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Last Name");

        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Contact Info");

        ContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Email");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Unit Type");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Unit No.");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AddTenant.setBackground(new java.awt.Color(102, 102, 102));
        AddTenant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddTenant.setForeground(new java.awt.Color(204, 204, 204));
        AddTenant.setText("Add");
        AddTenant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 204)));
        AddTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTenantActionPerformed(evt);
            }
        });

        UpdateTenant.setBackground(new java.awt.Color(102, 102, 102));
        UpdateTenant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateTenant.setForeground(new java.awt.Color(204, 204, 204));
        UpdateTenant.setText("Update");
        UpdateTenant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 204)));
        UpdateTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTenantActionPerformed(evt);
            }
        });

        DeleteTenant.setBackground(new java.awt.Color(102, 102, 102));
        DeleteTenant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteTenant.setForeground(new java.awt.Color(204, 204, 204));
        DeleteTenant.setText("Delete");
        DeleteTenant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(255, 255, 204)));
        DeleteTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTenantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(142, 142, 142)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ContactNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(21, 21, 21)
                            .addComponent(AddTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UpdateTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeleteTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(AddTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 670, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void ContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void AddTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTenantActionPerformed
        String lastname, firstname, contact, email, query = null;

            lastname = LastName.getText();
            firstname = FirstName.getText();
            contact = ContactNo.getText();
            email = Email.getText();

            if (lastname.isEmpty() && firstname.isEmpty() && contact.isEmpty() && email.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "All fields are empty! Please fill in the required information.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(LastName.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(FirstName.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "First Name Address is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(Email.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(ContactNo.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            Statement st = null;
    try {        
            st = connect.createStatement();
            query = "INSERT INTO tenant(LastName, FirstName, ContactInfo, Email)" +
                    "VALUES('"+lastname+"', '"+firstname+"', '"+contact+"', '"+email+"')";

            st.execute(query);
            Tenants.AddRowToTable(new Object[]{
                                                lastname,
                                                firstname,
                                                contact,
                                                email
        });
            LastName.setText("");
            FirstName.setText("");
            ContactNo.setText("");
            Email.setText("");            

            JOptionPane.showMessageDialog(null, "New tenant added successfully!");

    } catch(Exception e){

            System.out.println("Error!" + e.getMessage());

        }
    }//GEN-LAST:event_AddTenantActionPerformed

    private void UpdateTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTenantActionPerformed
        String lastname, firstname, contact, email, query = null;
            lastname = LastName.getText();
            firstname = FirstName.getText();
            contact = ContactNo.getText();
            email = Email.getText();

            if (lastname.isEmpty() && firstname.isEmpty() && contact.isEmpty() && email.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "All fields are empty! Please fill in the required information.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(LastName.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(FirstName.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "First Name Address is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(Email.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if("".equals(ContactNo.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is require", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int selectedRow = TenantTable.getSelectedRow(); 

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "No tenant selected to update.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int tenantId = (int) TenantTable.getValueAt(selectedRow, 0);

    PreparedStatement ps = null;
    try {
        query = "UPDATE tenant SET LastName = ?, FirstName = ?, ContactInfo = ?, Email = ? WHERE TenantID = ?";
        ps = connect.prepareStatement(query);  
        ps.setString(1, lastname);
        ps.setString(2, firstname);
        ps.setString(3, contact);
        ps.setString(4, email);
        ps.setInt(5, tenantId);  

        int rowsAffected = ps.executeUpdate();  
        if (rowsAffected > 0) {
            Tenants.setValueAt(lastname, selectedRow, 1);  
            Tenants.setValueAt(firstname, selectedRow, 2); 
            Tenants.setValueAt(contact, selectedRow, 3);   
            Tenants.setValueAt(email, selectedRow, 4);     

            LastName.setText("");
            FirstName.setText("");
            ContactNo.setText("");
            Email.setText("");

            JOptionPane.showMessageDialog(null, "Tenant information updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "No tenant found with the provided ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An error occurred while updating the tenant: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println("SQL Error: " + e.getMessage());
    }
    }//GEN-LAST:event_UpdateTenantActionPerformed

    private void DeleteTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTenantActionPerformed
        int selectedRow = TenantTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No tenant selected to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Object tenantIdObj = TenantTable.getValueAt(selectedRow, 0);

        if (tenantIdObj == null) {
            JOptionPane.showMessageDialog(null, "No Tenant ID found for selected row", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int tenantId = 0;
        try {
            tenantId = Integer.parseInt(tenantIdObj.toString()); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Tenant ID format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "DELETE FROM tenant WHERE TenantID = ?";

        try (PreparedStatement ps = connect.prepareStatement(query)) {

            ps.setInt(1, tenantId);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                ((DefaultTableModel) TenantTable.getModel()).removeRow(selectedRow);

                JOptionPane.showMessageDialog(null, "Tenant deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No tenant found with the provided ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the tenant: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("SQL Error: " + e.getMessage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteTenantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTenant;
    private javax.swing.JTextField ContactNo;
    private javax.swing.JButton DeleteTenant;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTable TenantTable;
    private javax.swing.JButton UpdateTenant;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
