/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import swingtable.SQLMethods.AttendanceModel;
import swingtable.SQLMethods.DataModel;
import swingtable.SQLMethods.MySQLMethods;
import swingtable.SQLMethods.selectedDataModel;

/**
 *
 * @author SKSUM
 */
public class TableData extends javax.swing.JFrame {

  DefaultTableModel model;
  
    public TableData() {
        initComponents();
        model = (DefaultTableModel) Table.getModel();
        
        fetchData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGRoup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameTV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EmailTV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MobileTV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PasswordTV = new javax.swing.JTextField();
        MaleRB = new javax.swing.JRadioButton();
        FemaleRB = new javax.swing.JRadioButton();
        OtherRB = new javax.swing.JRadioButton();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        attendanceBtn = new javax.swing.JButton();
        TestBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Table");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(239, 239, 159));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mobile No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        ButtonGRoup.add(MaleRB);
        MaleRB.setText("Male");
        MaleRB.setMaximumSize(null);
        MaleRB.setMinimumSize(null);
        MaleRB.setName(""); // NOI18N
        MaleRB.setPreferredSize(null);

        ButtonGRoup.add(FemaleRB);
        FemaleRB.setText("Female");
        FemaleRB.setMaximumSize(null);
        FemaleRB.setMinimumSize(null);
        FemaleRB.setName(""); // NOI18N
        FemaleRB.setPreferredSize(null);

        ButtonGRoup.add(OtherRB);
        OtherRB.setText("Others");
        OtherRB.setMaximumSize(null);
        OtherRB.setMinimumSize(null);
        OtherRB.setName(""); // NOI18N
        OtherRB.setPreferredSize(null);

        AddBtn.setBackground(new java.awt.Color(0, 153, 51));
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(0, 51, 204));
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 0));
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        attendanceBtn.setBackground(new java.awt.Color(41, 199, 204));
        attendanceBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attendanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        attendanceBtn.setText("Attendance");
        attendanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceBtnActionPerformed(evt);
            }
        });

        TestBtn.setBackground(new java.awt.Color(216, 9, 242));
        TestBtn.setForeground(new java.awt.Color(255, 255, 255));
        TestBtn.setText("Details");
        TestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(50, 119, 88));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Select Edit Data");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameTV, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmailTV, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MobileTV, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PasswordTV, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AddBtn)
                                    .addComponent(MaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FemaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(OtherRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(UpdateBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteBtn))
                                    .addComponent(editBtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(attendanceBtn)))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MobileTV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FemaleRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OtherRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(attendanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        MaleRB.getAccessibleContext().setAccessibleName("");
        FemaleRB.getAccessibleContext().setAccessibleName("");
        OtherRB.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        Table.setForeground(new java.awt.Color(57, 35, 196));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email", "Mobile", "Password", "Gender", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        String name = NameTV.getText().toString();
        String email = EmailTV.getText().toString();
        String ph = MobileTV.getText().toString();
        String password = PasswordTV.getText().toString();
        String  gender="";
        
        if(MaleRB.isSelected())  gender = "M";
        else if(FemaleRB.isSelected()) gender ="F";
        else if(OtherRB.isSelected()) gender ="Others";
        else gender ="null";
        
        
        
        if(chackFields() == true){

        MySQLMethods obj = new MySQLMethods();
        obj.insertdata(name,email,ph,password,gender);
        fetchData(); //fetching data from the database
        
        resetAll();
        
        JOptionPane.showMessageDialog(this, "Your data added");
        }
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        
        if(Table.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(this,"Please select any row");
        }
        else
        {
            //JOptionPane.showMessageDialog(this, "Row:- "+Table.getSelectedRow());
            if(chackFields()){
            
                String name = NameTV.getText().toString();
                String email = EmailTV.getText().toString();
                String ph = MobileTV.getText().toString();
                String password = PasswordTV.getText().toString();
                String  gender=""; 
                int id=Table.getSelectedRow()+1;
                
                

                if(MaleRB.isSelected())  gender = "M";
                else if(FemaleRB.isSelected()) gender ="F";
                else gender ="Others";

                MySQLMethods obj = new MySQLMethods();
                obj.updatedata(name,email,ph,password,gender,id);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please fill all the fields!");
            }
            
            
            fetchData(); //fetching data from the database
            resetAll(); // making emty field

        }
        
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        
        
        if(Table.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(TableData.this, "Please select any row");
        }
        
        else
        {
            int id = Table.getSelectedRow()+1;
            
            deleteData(id);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void attendanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceBtnActionPerformed
        
        
     try{   
        ArrayList<AttendanceModel> arr = new ArrayList();
        
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        
        String Date = String.valueOf(currentDate);
        String Time = String.valueOf(currentTime);
 
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

         for (int row = 0; row < rowCount; row++) {
            //for (int col = 0; col < columnCount; col++) {
                //name,mob,email,datetime,attendance
                String name= (String) Table.getValueAt(row, 1);
                String mob= (String) Table.getValueAt(row, 3);
                String email= (String) Table.getValueAt(row, 2);
//                String datetime= (String) Table.getValueAt(row, 4);
                boolean att =  false;
                
                if (Table.getValueAt(row, 6) == null) {
                    att = false;
                } 
                if (Table.getValueAt(row, 6) instanceof Boolean) {
                    att = true;
                }
                
               
                AttendanceModel obj = new AttendanceModel(name,
                mob,email,Date,Time, att);
                
                arr.add(obj);
 
        }
         
         MySQLMethods ms = new MySQLMethods();
         ms.attendance(arr);
         
         JOptionPane.showMessageDialog(TableData.this, "Your attendance updated successfully");
     }
     catch (Exception e){System.out.println("Table: "+e.getMessage());}
 
    }//GEN-LAST:event_attendanceBtnActionPerformed

    private void TestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestBtnActionPerformed
        
       new AttendanceDetails().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_TestBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
       
        if(Table.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(this,"Please select any row");
        }
        else
        {
            fetchSelectedData(Table.getSelectedRow()+1);
        }
    }//GEN-LAST:event_editBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.ButtonGroup ButtonGRoup;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField EmailTV;
    private javax.swing.JRadioButton FemaleRB;
    private javax.swing.JRadioButton MaleRB;
    private javax.swing.JTextField MobileTV;
    private javax.swing.JTextField NameTV;
    private javax.swing.JRadioButton OtherRB;
    private javax.swing.JTextField PasswordTV;
    private javax.swing.JTable Table;
    private javax.swing.JButton TestBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton attendanceBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void resetAll() {
        NameTV.setText("");EmailTV.setText("");MobileTV.setText("");
        PasswordTV.setText("");MaleRB.setSelected(false);
        FemaleRB.setSelected(false);OtherRB.setSelected(false);
        //MaleRB.setText("");FemaleRB.setText("");OtherRB.setText("");
    }

    private void fetchData() {
        
        MySQLMethods obj = new MySQLMethods();
        ArrayList<DataModel> ar = obj.datafetch();
        
        model.setRowCount(0);

        for(int i=0; i<ar.size(); i++)
        {

                model.insertRow(Table.getRowCount(),new Object[]{
        
                    ar.get(i).getId(),ar.get(i).getName(),
                    ar.get(i).getEmail(),
                    ar.get(i).getPh(),ar.get(i).getPasword(),
                    ar.get(i).getGender()        
               });   
        }  
    }

 
    private boolean chackFields() {
        
        String name = NameTV.getText().toString();
        String email = EmailTV.getText().toString();
        String ph = MobileTV.getText().toString();
        String password = PasswordTV.getText().toString();
        String  gender="";
        
        if(MaleRB.isSelected())  gender = "M";
        else if(FemaleRB.isSelected()) gender ="F";
        else if(OtherRB.isSelected()) gender ="Others";
        else gender ="";
        
        boolean stat = false;
        
        if(name.isEmpty() || email.isEmpty() || ph.isEmpty() ||
                password.isEmpty() || gender.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill all the fields");
            stat = false;
            return stat;
        }
        else
        {
            stat = true;
        }
        
        return stat;
    }

    private void fetchSelectedData(int id) {
           MySQLMethods obj = new MySQLMethods();
  
        ArrayList<selectedDataModel> ar = obj.selectedData(id);

        for(int i=0; i<ar.size(); i++)
        {
             NameTV.setText(ar.get(i).getName());
             EmailTV.setText(ar.get(i).getMail());
             MobileTV.setText(ar.get(i).getPh());
             PasswordTV.setText(ar.get(i).getPass());
            
        if(ar.get(i).getGen().equals("M")) MaleRB.setSelected(true);
        else if(ar.get(i).getGen().equals("F"))FemaleRB.setSelected(true);
        else if(ar.get(i).getGen().equals("Others"))OtherRB.setSelected(true);
        else System.out.println("data null");
            
        } 
    
    }

    private void deleteData(int id) {
        
        MySQLMethods obj = new MySQLMethods();
        obj.deletedata(id);
        
         fetchData();
         
         JOptionPane.showMessageDialog(TableData.this, "Data deleted successfully");
    }
    
    
    
    
}
