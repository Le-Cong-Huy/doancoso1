/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class Edit extends javax.swing.JFrame {

    /**
     * Creates new form Edit
     */
    private int rowselect;
    String oldfullname;
    
    public Edit(int rowselect) {
        initComponents();
        this.rowselect = rowselect;
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            Menu menu = new Menu();
            menu.setVisible(true);
            }
        });
        
        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("SELECT * FROM thongtinchitiet LIMIT ?, 1"); 
            ){
            st.setInt(1, rowselect);
            try(ResultSet rs = st.executeQuery())
            {
            if(rs.next())
            {
                fullnametxt.setText(rs.getString("Full Name"));
                phonenumbertxt.setText(rs.getString("Phone Number"));
                dateofbirthtxt.setText(rs.getString("Date of Birth"));
                emailaddresstxt.setText(rs.getString("Email Address"));
                addresstxt.setText(rs.getString("Address"));
                gendercombobox.setSelectedItem(rs.getString("Gender"));
                mostfavoritehobbycombobox.setSelectedItem(rs.getString("Most Favorite Hobby"));
                companytxt.setText(rs.getString("Company"));
                positiontxt.setText(rs.getString("Position"));
                dreamtxt.setText(rs.getString("Dream"));
            }
            oldfullname = fullnametxt.getText();
        } 
        }catch (Exception e) {
            e.printStackTrace();
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
        jLabel2 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fullnametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateofbirthtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dreamtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mostfavoritehobbycombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        phonenumbertxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailaddresstxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        companytxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gendercombobox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        positiontxt = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(157, 192, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Dream");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 100, 30));

        addresstxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, 30));

        fullnametxt.setBackground(new java.awt.Color(242, 242, 242));
        fullnametxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(fullnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 200, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Day of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 30));

        dateofbirthtxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(dateofbirthtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Most Favorite Hobby");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, 30));

        dreamtxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(dreamtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 200, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Full Name ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 30));

        mostfavoritehobbycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Read books", "Listen to music", "Do sports", "Watch television", "Go camping", "Go shopping", "Go swimming", "Jogging", "Take photo" }));
        mostfavoritehobbycombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostfavoritehobbycomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(mostfavoritehobbycombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 200, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 30));

        phonenumbertxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(phonenumbertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Email Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 30));

        emailaddresstxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(emailaddresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Company");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 30));

        companytxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(companytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 200, 30));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        gendercombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendercomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(gendercombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 200, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Position");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 100, 30));

        positiontxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jPanel1.add(positiontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 200, 30));

        jButton6.setBackground(new java.awt.Color(250, 211, 238));
        jButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Save.png"))); // NOI18N
        jButton6.setText(" Save");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(81, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 210, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostfavoritehobbycomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostfavoritehobbycomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostfavoritehobbycomboboxActionPerformed

    private void gendercomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendercomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendercomboboxActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
            String newfullname = fullnametxt.getText();
            String phonenumber = phonenumbertxt.getText();
            String dateofbirth = dateofbirthtxt.getText();
            String emailaddress = emailaddresstxt.getText();
            String address = addresstxt.getText();
            String gender = (String) gendercombobox.getSelectedItem();
            String mostfavoritehobby = (String) mostfavoritehobbycombobox.getSelectedItem();
            String company = companytxt.getText();
            String position = positiontxt.getText();
            String dream = dreamtxt.getText();
            if (newfullname.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter full name", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
            else if (phonenumber.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter phone number", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (dateofbirth.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter date of birth", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (emailaddress.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter email address", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (address.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter address", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (company.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter company", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (position.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter position", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else if (dream.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "Please enter dream", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            else if (!phonenumber.matches("\\d+"))
            {
                JOptionPane.showMessageDialog(rootPane, "Wrong format in phone number", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
            else
            {
                try (Connection con = DriverManager.getConnection(url, user, pass);
                    PreparedStatement pst = con.prepareStatement("update thongtinchitiet set `Full Name`=?, `Phone Number`=?, `Date of Birth`=?, `Email Address`=?, `Address`=?, `Gender`=?, `Most Favorite Hobby`=?, `Company`=?, `Position`=?, `Dream`=?  where `Full Name`=?");
                     ){
                    pst.setString(1, newfullname);
                    pst.setInt(2, Integer.parseInt(phonenumber));
                    pst.setString(3,dateofbirth );
                    pst.setString(4, emailaddress);
                    pst.setString(5, address);
                    pst.setString(6, gender);
                    pst.setString(7, mostfavoritehobby);
                    pst.setString(8, company);
                    pst.setString(9, position);
                    pst.setString(10, dream);
                    pst.setString(11, oldfullname);
                    int count = pst.executeUpdate();
                    if (count > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Update successful");
                        Menu menu = new Menu();
                        menu.setVisible(true);
                        this.setVisible(false);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Update failed");
    }  
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Edit(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField companytxt;
    private javax.swing.JTextField dateofbirthtxt;
    private javax.swing.JTextField dreamtxt;
    private javax.swing.JTextField emailaddresstxt;
    private javax.swing.JTextField fullnametxt;
    private javax.swing.JComboBox<String> gendercombobox;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mostfavoritehobbycombobox;
    private javax.swing.JTextField phonenumbertxt;
    private javax.swing.JTextField positiontxt;
    // End of variables declaration//GEN-END:variables
}