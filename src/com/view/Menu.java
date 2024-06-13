/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Admin
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Main
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(this);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTable1.setDefaultEditor(Object.class, null); 
        jTable2.setDefaultEditor(Object.class, null); 
        jTable3.setDefaultEditor(Object.class, null); 
        jTable4.setDefaultEditor(Object.class, null); 
        jTable5.setDefaultEditor(Object.class, null); 
        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from thongtinchitiet"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from phanloaigiadinh"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from phanloaihoctap"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from phanloaicongviec"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from nguoidungyeuthich"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void capnhatlaiphanloaigiadinh()
    {
        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from phanloaigiadinh"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.setRowCount(0);
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void capnhatlaiphanloaihoctap()
    {
        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from phanloaihoctap"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
                model.setRowCount(0);
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void capnhatlaiphanloaicongviec()
    {
        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from phanloaicongviec"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                model.setRowCount(0);
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void capnhatlainguoidungyeuthich()
    {
        String url , user , pass ;
        url = "jdbc:mysql://localhost:3306/doancoso";
        user = "root";
        pass = "050813";
        try (
            Connection con = DriverManager.getConnection(url,user,pass);
            PreparedStatement st = con.prepareStatement("Select * from nguoidungyeuthich"); 
                ){
            try(ResultSet rs = st.executeQuery())
            {
                DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
                model.setRowCount(0);
            while(rs.next())
            {
                Object object[] = {rs.getString("Full Name"), rs.getString("Phone Number"), rs.getString("Date of Birth"), rs.getString("Email Address"), rs.getString("Address"), rs.getString("Gender"), rs.getString("Most Favorite Hobby"), rs.getString("Company"), rs.getString("Position"), rs.getString("Dream") };
                model.addRow(object);
            }                              
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always.
     * regenerated by the Form Editor.
     */    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage contacts");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(109, 127, 225));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Male User.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, 110));

        jLabel3.setFont(new java.awt.Font("SF Mono", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 41, 41));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Open Pane_1.png"))); // NOI18N
        jLabel3.setText("          Exit");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 240, 70));

        jLabel5.setFont(new java.awt.Font("SF Mono", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 41, 41));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Add User Male_1.png"))); // NOI18N
        jLabel5.setText("           Add ");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, 70));

        jLabel8.setFont(new java.awt.Font("SF Mono", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 41, 41));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Chat.png"))); // NOI18N
        jLabel8.setText("          Chat");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, 70));

        jLabel9.setFont(new java.awt.Font("SF Mono", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 41, 41));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Export.png"))); // NOI18N
        jLabel9.setText("        Import");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 240, 70));

        jLabel10.setFont(new java.awt.Font("SF Mono", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(41, 41, 41));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Export_1.png"))); // NOI18N
        jLabel10.setText("        Export");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 240, 70));

        jLabel19.setFont(new java.awt.Font("SF Mono", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(41, 41, 41));
        jLabel19.setText("Contact :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 110, 110));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Facebook_5.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 40, 90));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Gmail_2.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, 50, 70));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Twitter_3.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 710, 40, 90));

        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 260, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 260, 780));

        jPanel3.setBackground(new java.awt.Color(235, 212, 226));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SF Mono", 1, 25)); // NOI18N
        jLabel11.setText("Wellcome back!!");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 260, 60));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Group");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 70, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Search_1.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 40, 30));

        search.setBackground(new java.awt.Color(235, 212, 226));
        search.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 360, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contacts", "Family", "Learning", "Work", "Favorite" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 110, 40));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("The world's best contact management software");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1050, 110));

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(235, 212, 226));
        jTable1.setForeground(new java.awt.Color(6, 12, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Phone Number", "Date of Birth", "Email Address", "Address", "Gender", "Most Favorite Hobby", "Company", "Position", "Dream"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable1.setPreferredSize(new java.awt.Dimension(1040, 1040));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(210);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        jTabbedPane2.addTab("tab1", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(235, 212, 226));
        jTable2.setForeground(new java.awt.Color(6, 12, 12));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Phone Number", "Date of Birth", "Email Address", "Address", "Gender", "Most Favorite Hobby", "Company", "Position", "Dream"
            }
        ));
        jTable2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable2.setPreferredSize(new java.awt.Dimension(1040, 1040));
        jTable2.setRowHeight(25);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(210);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        jTabbedPane2.addTab("tab2", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(235, 212, 226));
        jTable3.setForeground(new java.awt.Color(6, 12, 12));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Phone Number", "Date of Birth", "Email Address", "Address", "Gender", "Most Favorite Hobby", "Company", "Position", "Dream"
            }
        ));
        jTable3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable3.setPreferredSize(new java.awt.Dimension(1040, 1040));
        jTable3.setRowHeight(25);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable3MouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(210);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        jTabbedPane2.addTab("tab3", jPanel5);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setBackground(new java.awt.Color(235, 212, 226));
        jTable5.setForeground(new java.awt.Color(6, 12, 12));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Phone Number", "Date of Birth", "Email Address", "Address", "Gender", "Most Favorite Hobby", "Company", "Position", "Dream"
            }
        ));
        jTable5.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable5.setPreferredSize(new java.awt.Dimension(1040, 1040));
        jTable5.setRowHeight(25);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable5MouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable5.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(3).setPreferredWidth(210);
            jTable5.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        jTabbedPane2.addTab("tab5", jPanel7);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setBackground(new java.awt.Color(235, 212, 226));
        jTable4.setForeground(new java.awt.Color(6, 12, 12));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Phone Number", "Date of Birth", "Email Address", "Address", "Gender", "Most Favorite Hobby", "Company", "Position", "Dream"
            }
        ));
        jTable4.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable4.setPreferredSize(new java.awt.Dimension(1040, 1040));
        jTable4.setRowHeight(25);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable4MouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(210);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        jTabbedPane2.addTab("tab4", jPanel6);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 1050, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        int thoat = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit or not?");
        if(thoat==JOptionPane.YES_OPTION)
        {
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Add add = new Add();
        add.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Export");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Tập tin văn bản (*.txt)", "txt"));
        String url = "jdbc:mysql://localhost:3306/doancoso";
        String user = "root";
        String pass = "050813";
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try(Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = con.prepareStatement("SELECT * FROM thongtinchitiet");
                    ){
                String filePath = fileChooser.getSelectedFile().getPath();
                if (!filePath.toLowerCase().endsWith(".txt")) {
                    filePath += ".txt";
                }
                try(ResultSet rs = ps.executeQuery())
                {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                java.sql.ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        writer.write(rs.getString(i));
                        if (i < columnCount) writer.write(", ");
                    }
                    writer.newLine(); 
                }
                writer.close();
                JOptionPane.showMessageDialog(rootPane, "Exported successfully");
                }
            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
    
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        try {
            URI uri = new URI("https://facebook.com/profile.php?id=61550246250597");
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        try {
            String email = "huylc.23itb@vku.udn.vn";
            URI uri = new URI("https://mail.google.com/mail/u/0/#inbox?compose=new&to=" + email);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel17MouseClicked
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Import");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Tập tin văn bản (*.txt)", "txt"));
    int userSelection = fileChooser.showOpenDialog(null);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try {
            String filePath = fileChooser.getSelectedFile().getPath();
            List<String[]> data = readDataFromFile(filePath);
            saveDataToDatabase(data);
            displayDataFromDatabase();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi tải dữ liệu từ file", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();
        DefaultTableModel model4 = (DefaultTableModel) jTable4.getModel();
        DefaultTableModel model5 = (DefaultTableModel) jTable5.getModel();
        
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(model1);
        TableRowSorter<DefaultTableModel> obj2 = new TableRowSorter<>(model2);
        TableRowSorter<DefaultTableModel> obj3 = new TableRowSorter<>(model3);
        TableRowSorter<DefaultTableModel> obj4 = new TableRowSorter<>(model4);
        TableRowSorter<DefaultTableModel> obj5 = new TableRowSorter<>(model5);
        
        jTable1.setRowSorter(obj1);
        jTable2.setRowSorter(obj2);
        jTable3.setRowSorter(obj3);
        jTable4.setRowSorter(obj4);
        jTable5.setRowSorter(obj5);

        obj2.setRowFilter(RowFilter.regexFilter("(?i)" + search.getText()));
        obj3.setRowFilter(RowFilter.regexFilter("(?i)" + search.getText()));
        obj4.setRowFilter(RowFilter.regexFilter("(?i)" + search.getText()));
        obj5.setRowFilter(RowFilter.regexFilter("(?i)" + search.getText()));
        obj1.setRowFilter(RowFilter.regexFilter("(?i)" + search.getText()));
        
    }//GEN-LAST:event_searchKeyReleased

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        ChatList chatlist = new ChatList();
        this.setVisible(false);
        chatlist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
        // TODO add your handling code here:
            int row = jTable3.rowAtPoint(evt.getPoint());
            int column = jTable3.columnAtPoint(evt.getPoint());
            if (SwingUtilities.isRightMouseButton(evt)){
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem deleteItem = new JMenuItem("Delete");
            deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirmDelete == JOptionPane.YES_OPTION) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    String fullName = jTable3.getValueAt(row, 0).toString(); 
                    try (Connection con = DriverManager.getConnection(url, user, pass);
                        PreparedStatement ps = con.prepareStatement("DELETE FROM phanloaihoctap WHERE `Full Name`=?");
                        ){
                        ps.setString(1, fullName);
                        int rowsDeleted = ps.executeUpdate();
                        if (rowsDeleted > 0) {
                            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
                            model.removeRow(row);
                            JOptionPane.showMessageDialog(null, "Row deleted successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete row!");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        popupMenu.add(deleteItem);
        popupMenu.show(jTable3, evt.getX(), evt.getY());
    }
    }//GEN-LAST:event_jTable3MouseReleased

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
         int row = jTable2.rowAtPoint(evt.getPoint());
            int column = jTable2.columnAtPoint(evt.getPoint());
            if (SwingUtilities.isRightMouseButton(evt)){
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem deleteItem = new JMenuItem("Delete");
            deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirmDelete == JOptionPane.YES_OPTION) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    String fullName = jTable2.getValueAt(row, 0).toString(); 
                    try (Connection con = DriverManager.getConnection(url, user, pass);
                        PreparedStatement ps = con.prepareStatement("DELETE FROM phanloaigiadinh WHERE `Full Name`=?");
                        ){
                        ps.setString(1, fullName);
                        int rowsDeleted = ps.executeUpdate();
                        if (rowsDeleted > 0) {
                            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                            model.removeRow(row);
                            JOptionPane.showMessageDialog(null, "Row deleted successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete row!");
                        }
                    } catch (Exception ex) {    
                        ex.printStackTrace();
                    }
                }
            }
        });
        popupMenu.add(deleteItem);
        popupMenu.show(jTable2, evt.getX(), evt.getY());
            }
    }//GEN-LAST:event_jTable2MouseReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased

        int row = jTable1.rowAtPoint(evt.getPoint());
        int column = jTable1.columnAtPoint(evt.getPoint());

        if (SwingUtilities.isRightMouseButton(evt)){
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem editItem = new JMenuItem("Edit");
            JMenuItem deleteItem = new JMenuItem("Delete");
            JMenuItem addToFavoritesItem = new JMenuItem("Add to favorites");
            JMenuItem addTofamily = new JMenuItem("Add to the family");
            JMenuItem addTolearning = new JMenuItem("Add to learning");
            JMenuItem addTowork = new JMenuItem("Add to work");
            editItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Edit edit = new Edit(row);
                    edit.setVisible(true);
                    setVisible(false);
                    dispose();
                }
            });
            addTofamily.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    int hangcanthem = jTable1.getSelectedRow();
                    if (hangcanthem == -1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Please select an item to add");
                        return;
                    }
                    try(
                        Connection con  = DriverManager.getConnection(url,user,pass);
                        PreparedStatement ps = con.prepareStatement("INSERT INTO phanloaigiadinh (`Full Name`, `Phone Number`, `Date of Birth`, `Email Address`, `Address`, `Gender`, `Most Favorite Hobby`, `Company`, `Position`, `Dream`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    ){
                        Object[] rowdata = new Object[jTable1.getColumnCount()];
                        for( int i=0; i<jTable1.getColumnCount();i++)
                        {
                            rowdata[i] = jTable1.getValueAt(hangcanthem, i);
                            ps.setObject(i+1, rowdata[i]);
                        }
                        ps.executeUpdate();
                        capnhatlaiphanloaigiadinh();
                        JOptionPane.showMessageDialog(rootPane, "Insert Successfully");
                    }
                    catch (Exception ev) {
                        ev.printStackTrace();
                    }
                }
            });
            addTolearning.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    int hangcanthem = jTable1.getSelectedRow();
                    if (hangcanthem == -1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Please select an item to add");
                        return;
                    }
                    try(
                        Connection con  = DriverManager.getConnection(url,user,pass);
                        PreparedStatement ps = con.prepareStatement("INSERT INTO phanloaihoctap (`Full Name`, `Phone Number`, `Date of Birth`, `Email Address`, `Address`, `Gender`, `Most Favorite Hobby`, `Company`, `Position`, `Dream`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    ){
                        Object[] rowdata = new Object[jTable1.getColumnCount()];
                        for( int i=0; i<jTable1.getColumnCount();i++)
                        {
                            rowdata[i] = jTable1.getValueAt(hangcanthem, i);
                            ps.setObject(i+1, rowdata[i]);
                        }
                        ps.executeUpdate();
                        capnhatlaiphanloaihoctap();
                        JOptionPane.showMessageDialog(rootPane, "Insert Successfully");
                    }
                    catch (Exception ev) {
                        ev.printStackTrace();
                    }
                }
            });
            addTowork.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    int hangcanthem = jTable1.getSelectedRow();
                    if (hangcanthem == -1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Please select an item to add");
                        return;
                    }
                    try(
                        Connection con  = DriverManager.getConnection(url,user,pass);
                        PreparedStatement ps = con.prepareStatement("INSERT INTO phanloaicongviec (`Full Name`, `Phone Number`, `Date of Birth`, `Email Address`, `Address`, `Gender`, `Most Favorite Hobby`, `Company`, `Position`, `Dream`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    ){
                        Object[] rowdata = new Object[jTable1.getColumnCount()];
                        for( int i=0; i<jTable1.getColumnCount();i++)
                        {
                            rowdata[i] = jTable1.getValueAt(hangcanthem, i);
                            ps.setObject(i+1, rowdata[i]);
                        }
                        ps.executeUpdate();
                        capnhatlaiphanloaicongviec();
                        JOptionPane.showMessageDialog(rootPane, "Insert Successfully");
                    }
                    catch (Exception ev) {
                        ev.printStackTrace();
                    }
                }
            });
            deleteItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                    if (confirmDelete == JOptionPane.YES_OPTION) {
                        String url = "jdbc:mysql://localhost:3306/doancoso";
                        String user = "root";
                        String pass = "050813";
                        int selectedRow = jTable1.getSelectedRow();
                        if (selectedRow >= 0 && selectedRow < jTable1.getRowCount()) {
                            String fullName = jTable1.getValueAt(selectedRow, 0).toString();
                            boolean success = true;
                            try (
                                Connection con = DriverManager.getConnection(url, user, pass);
                                PreparedStatement ps1 = con.prepareStatement("DELETE FROM thongtinchitiet WHERE `Full Name`=?");
                                PreparedStatement ps2 = con.prepareStatement("DELETE FROM nguoidungyeuthich WHERE `Full Name`=?");
                                PreparedStatement ps3 = con.prepareStatement("DELETE FROM phanloaicongviec WHERE `Full Name`=?");
                                PreparedStatement ps4 = con.prepareStatement("DELETE FROM phanloaihoctap WHERE `Full Name`=?");
                                PreparedStatement ps5 = con.prepareStatement("DELETE FROM phanloaigiadinh WHERE `Full Name`=?");
                            ) {
                                con.setAutoCommit(false);
                                ps1.setString(1, fullName);
                                ps1.executeUpdate();
                                ps2.setString(1, fullName);
                                ps2.executeUpdate();
                                ps3.setString(1, fullName);
                                ps3.executeUpdate();
                                ps4.setString(1, fullName);
                                ps4.executeUpdate();
                                ps5.setString(1, fullName);
                                ps5.executeUpdate();
                                con.commit();
                            } catch (SQLException ex) {
                                success = false;
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null, ex.getMessage());
                                try (Connection con = DriverManager.getConnection(url, user, pass)) {
                                    con.rollback();
                                } catch (SQLException rollbackEx) {
                                    rollbackEx.printStackTrace();
                                }
                            }
                            if (success) {
                                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                                model.removeRow(selectedRow);
                                capnhatlaiphanloaigiadinh();
                                capnhatlaiphanloaihoctap();
                                capnhatlaiphanloaicongviec();
                                capnhatlainguoidungyeuthich();
                                JOptionPane.showMessageDialog(null, "Deleted successfully!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to delete row!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No row selected or invalid row index.");
                        }
                    }
                }
            });
            addToFavoritesItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    int hangcanthem = jTable1.getSelectedRow();
                    if (hangcanthem == -1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Please select an item to add");
                        return;
                    }
                    try(
                        Connection con  = DriverManager.getConnection(url,user,pass);
                        PreparedStatement ps = con.prepareStatement("INSERT INTO nguoidungyeuthich (`Full Name`, `Phone Number`, `Date of Birth`, `Email Address`, `Address`, `Gender`, `Most Favorite Hobby`, `Company`, `Position`, `Dream`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    ){
                        Object[] rowdata = new Object[jTable1.getColumnCount()];
                        for( int i=0; i<jTable1.getColumnCount();i++)
                        {
                            rowdata[i] = jTable1.getValueAt(hangcanthem, i);
                            ps.setObject(i+1, rowdata[i]);
                        }
                        ps.executeUpdate();
                        capnhatlainguoidungyeuthich();
                        JOptionPane.showMessageDialog(rootPane, "Insert Successfully");
                    }
                    catch (Exception ev) {
                        ev.printStackTrace();
                    }
                }
            });
            popupMenu.add(editItem);
            popupMenu.add(deleteItem);
            popupMenu.add(addTofamily);
            popupMenu.add(addTolearning);
            popupMenu.add(addTowork);
            popupMenu.add(addToFavoritesItem);


            popupMenu.show(jTable1, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
        // TODO add your handling code here:
            int row = jTable4.rowAtPoint(evt.getPoint());
            int column = jTable4.columnAtPoint(evt.getPoint());
            if (SwingUtilities.isRightMouseButton(evt)){
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem deleteItem = new JMenuItem("Delete");
            deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirmDelete == JOptionPane.YES_OPTION) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    String fullName = jTable4.getValueAt(row, 0).toString(); 
                    try (Connection con = DriverManager.getConnection(url, user, pass);
                        PreparedStatement ps = con.prepareStatement("DELETE FROM phanloaicongviec WHERE `Full Name`=?");
                        ){
                        ps.setString(1, fullName);
                        int rowsDeleted = ps.executeUpdate();
                        if (rowsDeleted > 0) {
                            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                            model.removeRow(row);
                            JOptionPane.showMessageDialog(null, "Row deleted successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete row!");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        popupMenu.add(deleteItem);
        popupMenu.show(jTable4, evt.getX(), evt.getY());
    }
    
    }//GEN-LAST:event_jTable4MouseReleased

    private void jTable5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseReleased
        // TODO add your handling code here:
            int row = jTable5.rowAtPoint(evt.getPoint());
            int column = jTable5.columnAtPoint(evt.getPoint());
            if (SwingUtilities.isRightMouseButton(evt)){
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem deleteItem = new JMenuItem("Delete");
            deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirmDelete == JOptionPane.YES_OPTION) {
                    String url = "jdbc:mysql://localhost:3306/doancoso";
                    String user = "root";
                    String pass = "050813";
                    String fullName = jTable5.getValueAt(row, 0).toString(); 
                    try (Connection con = DriverManager.getConnection(url, user, pass);
                        PreparedStatement ps = con.prepareStatement("DELETE FROM nguoidungyeuthich WHERE `Full Name`=?");
                        ){
                        ps.setString(1, fullName);
                        int rowsDeleted = ps.executeUpdate();
                        if (rowsDeleted > 0) {
                            DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
                            model.removeRow(row);
                            JOptionPane.showMessageDialog(null, "Row deleted successfully!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete row!");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        popupMenu.add(deleteItem);
        popupMenu.show(jTable5, evt.getX(), evt.getY());
    }
    }//GEN-LAST:event_jTable5MouseReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedPanel = (String) jComboBox1.getSelectedItem();
        
        int index = -1;
        switch(selectedPanel)
        {
            case "Contacts":
            index = 0;
            break;
            case "Family":
            index = 1;
            break;
            case "Learning":
            index = 2;
            break;
            case "Work":
            index = 3;
            break;
            case "Favorite":
            index = 4;
            break;
        }
        
        if ( index != -1)
        {
            jTabbedPane2.setSelectedIndex(index);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private List<String[]> readDataFromFile(String filePath) throws IOException {
    List<String[]> data = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            data.add(line.split(", "));
        }
    }
    return data;
}

     public void saveDataToDatabase(List<String[]> data) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/doancoso";
        String user = "root";
        String pass = "050813";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            // Delete existing data
            String deleteSQL = "DELETE FROM thongtinchitiet";
            try (Statement st = con.createStatement()) {
                st.executeUpdate(deleteSQL);
            }
            String insertSQL = "INSERT INTO thongtinchitiet(`Full Name`, `Phone Number`, `Date of Birth`, `Email Address`, `Address`, `Gender`, `Most Favorite Hobby`, `Company`, `Position`, `Dream`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = con.prepareStatement(insertSQL)) {
                for (String[] row : data) {
                    for (int j = 0; j < row.length; j++) {
                        pst.setString(j + 1, row[j]);
                    }
                    pst.addBatch();
                }
                pst.executeBatch();
            }
        }
    }

     public void displayDataFromDatabase() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/doancoso";
        String user = "root";
        String pass = "050813";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String query = "SELECT * FROM thongtinchitiet";
            try (Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(query)) {

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0); 
                while (rs.next()) {
                    Object[] row = {
                        rs.getString("Full Name"),
                        rs.getString("Phone Number"),
                        rs.getString("Date of Birth"),
                        rs.getString("Email Address"),
                        rs.getString("Address"),
                        rs.getString("Gender"),
                        rs.getString("Most Favorite Hobby"),
                        rs.getString("Company"),
                        rs.getString("Position"),
                        rs.getString("Dream")
                    };
                    model.addRow(row);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
// Method to display data from database on JTable

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
