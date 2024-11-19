

package UI;

import MyConnection.MyConnection;

import java.sql.*;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.plaf.basic.BasicInternalFrameUI;

import javax.swing.table.DefaultTableModel;



public class Tenants extends javax.swing.JInternalFrame {



    private static int getSelectedRow() {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }



    static void setValueAt(String lastname, int selectedRow, int i) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }



    private static Object getValueAt(int selectedRow, int i) {

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }



    private Connection connect;

    public Tenants() {

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



        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        ListofTenantPanel = new javax.swing.JPanel();

        jLabel4 = new javax.swing.JLabel();

        NewTenant = new javax.swing.JButton();

        jSeparator1 = new javax.swing.JSeparator();

        jScrollPane1 = new javax.swing.JScrollPane();

        TenantTable = new javax.swing.JTable();

        jLabel2 = new javax.swing.JLabel();

        LastName = new javax.swing.JTextField();

        jLabel3 = new javax.swing.JLabel();

        FirstName = new javax.swing.JTextField();

        jLabel5 = new javax.swing.JLabel();

        ContactNo = new javax.swing.JTextField();

        jLabel6 = new javax.swing.JLabel();

        Email = new javax.swing.JTextField();

        jComboBox2 = new javax.swing.JComboBox<>();

        jLabel7 = new javax.swing.JLabel();

        jLabel8 = new javax.swing.JLabel();

        jComboBox3 = new javax.swing.JComboBox<>();

        AddTenant = new javax.swing.JButton();

        UpdateTenant = new javax.swing.JButton();

        DeleteTenant = new javax.swing.JButton();

        Desktop1 = new javax.swing.JDesktopPane();



        jCheckBoxMenuItem1.setSelected(true);

        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");



        ListofTenantPanel.setBackground(new java.awt.Color(204, 204, 204));



        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N

        jLabel4.setText("List of Tenant");



        NewTenant.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        NewTenant.setText("New Tenant");

        NewTenant.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                NewTenantActionPerformed(evt);

            }

        });



        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));



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

                "Tenant ID", "Last Name", "First Name", "Contact Info", "Email", "Unit ID"

            }

        ) {

            boolean[] canEdit = new boolean [] {

                false, false, false, false, false, false

            };



            public boolean isCellEditable(int rowIndex, int columnIndex) {

                return canEdit [columnIndex];

            }

        });

        jScrollPane1.setViewportView(TenantTable);



        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel2.setText("Last Name");



        LastName.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                LastNameActionPerformed(evt);

            }

        });



        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel3.setText("First Name");



        FirstName.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                FirstNameActionPerformed(evt);

            }

        });



        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel5.setText("Contact No.");



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



        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));



        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel7.setText("Unit Type");



        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel8.setText("Unit No.");



        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));



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



        javax.swing.GroupLayout ListofTenantPanelLayout = new javax.swing.GroupLayout(ListofTenantPanel);

        ListofTenantPanel.setLayout(ListofTenantPanelLayout);

        ListofTenantPanelLayout.setHorizontalGroup(

            ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                .addGap(22, 22, 22)

                .addComponent(jLabel4)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)

                .addComponent(NewTenant)

                .addGap(27, 27, 27))

            .addComponent(jSeparator1)

            .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                .addContainerGap()

                .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                        .addComponent(jScrollPane1)

                        .addContainerGap())

                    .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                        .addGap(6, 6, 6)

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                .addComponent(jComboBox2, 0, 180, Short.MAX_VALUE)

                                .addComponent(LastName)

                                .addComponent(jLabel2)

                                .addComponent(jLabel5)

                                .addComponent(ContactNo))

                            .addComponent(jLabel7))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                            .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)

                            .addComponent(jLabel3)

                            .addComponent(jLabel6)

                            .addComponent(Email)

                            .addComponent(jLabel8)

                            .addComponent(jComboBox3, 0, 180, Short.MAX_VALUE))

                        .addGap(18, 18, 18)

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(AddTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(UpdateTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(DeleteTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addContainerGap(190, Short.MAX_VALUE))))

        );

        ListofTenantPanelLayout.setVerticalGroup(

            ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                .addContainerGap()

                .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                        .addComponent(jLabel8)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(DeleteTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))

                    .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(jLabel4)

                            .addComponent(NewTenant))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                                .addComponent(jLabel3)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(AddTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))

                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListofTenantPanelLayout.createSequentialGroup()

                                .addComponent(jLabel2)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                                .addComponent(jLabel5)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(ListofTenantPanelLayout.createSequentialGroup()

                                .addComponent(jLabel6)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addGroup(ListofTenantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(UpdateTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jLabel7)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addContainerGap(16, Short.MAX_VALUE))

        );



        javax.swing.GroupLayout Desktop1Layout = new javax.swing.GroupLayout(Desktop1);

        Desktop1.setLayout(Desktop1Layout);

        Desktop1Layout.setHorizontalGroup(

            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGap(0, 650, Short.MAX_VALUE)

        );

        Desktop1Layout.setVerticalGroup(

            Desktop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGap(0, 416, Short.MAX_VALUE)

        );



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addContainerGap()

                .addComponent(ListofTenantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap(21, Short.MAX_VALUE))

            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                .addGroup(layout.createSequentialGroup()

                    .addContainerGap()

                    .addComponent(Desktop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addContainerGap(25, Short.MAX_VALUE)))

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addComponent(ListofTenantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(0, 12, Short.MAX_VALUE))

            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                    .addContainerGap()

                    .addComponent(Desktop1)))

        );



        pack();

    }// </editor-fold>//GEN-END:initComponents



    private void NewTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTenantActionPerformed

        // TODO add your handling code here:

        AddTenant addTenantFrame = new AddTenant();

        addTenantFrame.setVisible(true);

        //setVisible(false);

        //addTenantFrame.pack();

        //addTenantFrame.setLocationRelativeTo(null);

        //addTenantFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Desktop1.removeAll();

       Desktop1.add(addTenantFrame);

        //addTenantFrame.setVisible(true);

        //addTenantFrame.pack();

        //addTenantFrame.setLocationRelativeTo(null);

        //this.dispose();

    }//GEN-LAST:event_NewTenantActionPerformed



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

        //DefaultTable



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



    public static void AddRowToTable(Object[] dataRow){

        DefaultTableModel model = (DefaultTableModel)TenantTable.getModel();

        model.addRow(dataRow);

        

    }



    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton AddTenant;

    private javax.swing.JTextField ContactNo;

    private javax.swing.JButton DeleteTenant;

    private javax.swing.JDesktopPane Desktop1;

    private javax.swing.JTextField Email;

    private javax.swing.JTextField FirstName;

    private javax.swing.JTextField LastName;

    private javax.swing.JPanel ListofTenantPanel;

    private javax.swing.JButton NewTenant;

    private static javax.swing.JTable TenantTable;

    private javax.swing.JButton UpdateTenant;

    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;

    private javax.swing.JComboBox<String> jComboBox2;

    private javax.swing.JComboBox<String> jComboBox3;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JSeparator jSeparator1;

    // End of variables declaration//GEN-END:variables



    

}

