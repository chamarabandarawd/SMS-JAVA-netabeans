/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.sMS.view;

import com.iCet.sMS.controller.StudentController;
import com.iCet.sMS.model.Student;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chama
 */
public class ViewList extends javax.swing.JFrame {

    /**
     * Creates new form ViewList
     */
    public ViewList() {
        initComponents();
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
        closeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        aTzDBMS = new javax.swing.JButton();
        aTzPRF = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setBackground(new java.awt.Color(204, 204, 255));
        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 400, 40));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View Student Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1000, 60));

        aTzDBMS.setBackground(new java.awt.Color(204, 204, 255));
        aTzDBMS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aTzDBMS.setText("Best in DBMS");
        aTzDBMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTzDBMSActionPerformed(evt);
            }
        });
        getContentPane().add(aTzDBMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 410, 40));

        aTzPRF.setBackground(new java.awt.Color(204, 204, 255));
        aTzPRF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        aTzPRF.setText("Best in PRF ");
        aTzPRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTzPRFActionPerformed(evt);
            }
        });
        getContentPane().add(aTzPRF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 410, 40));

        print.setBackground(new java.awt.Color(204, 204, 255));
        print.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 410, 40));

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "PRF Marks", "DBMS Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(studentsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 880, 360));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iCet/sMS/view/bc2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aTzDBMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTzDBMSActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) studentsTable.getModel();
        dtm.setRowCount(0);
        Student[] studentArray = StudentController.getAll();
        // shorting customerarray
        for (int i = 0; i < studentArray.length - 1; i++) {
            for (int j = 0; j < studentArray.length - i - 1; j++) {
                if (studentArray[j].getDBMSMarks() > studentArray[j + 1].getDBMSMarks()) {
                    // swap arr[j] and arr[j+1]
                    Student temp = studentArray[j];
                    studentArray[j] = studentArray[j + 1];
                    studentArray[j + 1] = temp;
                }
            }
        }
        // continue balance part

        for (int i = 0; i < studentArray.length; i++) {
            Student s1 = studentArray[i];
            Object[] rowData = {s1.getId(), s1.getName(), s1.getPRFMarks(), s1.getDBMSMarks()};
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_aTzDBMSActionPerformed

    private void aTzPRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTzPRFActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) studentsTable.getModel();
        dtm.setRowCount(0);

        Student[] studentArray = StudentController.getAll();
        // shorting customerarray
        for (int i = 0; i < studentArray.length - 1; i++) {
            for (int j = 0; j < studentArray.length - i - 1; j++) {
                if (studentArray[j].getPRFMarks() > studentArray[j + 1].getPRFMarks()) {
                    // swap arr[j] and arr[j+1]
                    Student temp = studentArray[j];
                    studentArray[j] = studentArray[j + 1];
                    studentArray[j + 1] = temp;
                }
            }
        }
        // continue balance part

        for (int i = 0; i < studentArray.length; i++) {
            Student s1 = studentArray[i];
            Object[] rowData = {s1.getId(), s1.getName(), s1.getPRFMarks(), s1.getDBMSMarks()};
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_aTzPRFActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aTzDBMS;
    private javax.swing.JButton aTzPRF;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton print;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables
}