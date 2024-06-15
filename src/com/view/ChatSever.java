/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;


/**
 *
 * @author Admin
 */
public class ChatSever extends javax.swing.JFrame {

    /**
     * Creates new form giaodienchat
     */
    static ServerSocket ss;
    static Socket s;
    static DataInputStream in;
    static DataOutputStream out;
    public String user;
    public ChatClient client;
    public ChatSever(String user,ChatClient client) {
        initComponents();
        this.user = user;
        this.client = client;
        setLocationRelativeTo(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                if (client!=null)
                {
                    client.dispose();
                }
                ChatList chatList = new ChatList();
                chatList.setVisible(true);
                dispose();
            }
        });
    }
  
    public void startServer(int port) {
        new Thread(() -> {
            String inputtext = "";
            try {
                ss = new ServerSocket(port);
                s = ss.accept();
                in = new DataInputStream(s.getInputStream());
                out = new DataOutputStream(s.getOutputStream());
                while (true) {
                    inputtext = in.readUTF();
                    String formattedMessage = String.format("%-10s\t%s", user, inputtext);
                    SwingUtilities.invokeLater(() -> {
                    severarea.setText(severarea.getText().trim() + "\n" + formattedMessage);
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                closeResources();
            }
        }).start();
    }

    private void closeResources() {
        try {
            if (in != null) in.close();
            if (out != null) out.close();
            if (s != null) s.close();
            if (ss != null) ss.close();
        } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        severarea = new javax.swing.JTextArea();
        severtxt = new javax.swing.JTextField();
        severbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("You");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        severarea.setColumns(20);
        severarea.setForeground(new java.awt.Color(51, 51, 51));
        severarea.setRows(5);
        jScrollPane1.setViewportView(severarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 220));

        severtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        severtxt.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(severtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 310, 50));

        severbtn.setText("Send");
        severbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                severbtnActionPerformed(evt);
            }
        });
        getContentPane().add(severbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void severbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_severbtnActionPerformed
        // TODO add your handling code here:
        String outputtext = severtxt.getText().trim();
        try {
            if (!outputtext.isEmpty()) {
                String formattedMessage = String.format("%-10s\t%s", "You:", outputtext);
                severarea.setText(severarea.getText().trim() + "\n" + formattedMessage);
                out.writeUTF(outputtext);
                severtxt.setText(""); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_severbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChatSever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatSever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatSever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatSever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatSever("Sever", new ChatClient()).setVisible(true);
            }
        });
        
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea severarea;
    private javax.swing.JButton severbtn;
    private javax.swing.JTextField severtxt;
    // End of variables declaration//GEN-END:variables
}
