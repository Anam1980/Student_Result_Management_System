/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_mangement_system;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class MtechEEE extends javax.swing.JFrame {

    /**
     * Creates new form MtechEEE
     */
    public MtechEEE() {
        initComponents();
    }
    
    String course=null;
    String branch=null;
    public MtechEEE(String rollno, String course, String branch) {
        initComponents();
        jTextField6.setText(rollno);
        this.course=course;
        this.branch=branch;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mtech[EEE]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Electronic Device");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 126, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Power Electronics");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Cyber Security");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 188, 106, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Special Electric Machine");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 312, 140, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 123, 71, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 185, 71, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 247, 71, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 309, 71, -1));

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Marks Obtained");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 76, 96, -1));

        jLabel8.setText("100");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 126, 37, -1));

        jLabel9.setText("100");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 188, 37, -1));

        jLabel10.setText("100");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 250, 37, -1));

        jLabel11.setText("100");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 312, 37, -1));

        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Total Marks");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 76, 78, -1));

        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Subjects");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 76, 68, -1));

        back.setBackground(new java.awt.Color(0, 206, 209));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 383, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Roll Number :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 32, 91, -1));

        jTextField6.setEditable(false);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 29, 172, -1));

        save.setBackground(new java.awt.Color(0, 206, 209));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 383, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new insertresult().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String ed=jTextField1.getText();
        String pe=jTextField2.getText();
        String cs=jTextField3.getText();
        String se=jTextField4.getText();
        
        String rollno=jTextField6.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm", "root", "anam198@mysql");
            Statement st = con .createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollno='"+rollno+"' and course='"+course+"' and branch='"+branch+"'");
            if(rs.next()){
                st.executeUpdate("insert into MtechEEE(rollno , course , branch , electronicdevice, powerelectronic, cybersecurity, specialelectric) values('"+rollno+"', '"+course+"', '"+branch+"', '"+ed+"', '"+pe+"', '"+cs+"', '"+se+"')");
                JOptionPane.showMessageDialog(null, "Result updated successfully");
               
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Student is not registered");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm", "root", "anam198@mysql");
            Statement st = con .createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollno='"+rollno+"' and course='"+course+"' and branch='"+branch+"'");
             int s1=Integer.parseInt(jTextField1.getText());
                int s2=Integer.parseInt(jTextField2.getText());
                int s3=Integer.parseInt(jTextField3.getText());
                int s4=Integer.parseInt(jTextField4.getText());
                
                int result=s1+s2+s3+s4;
                
              
                
                 String res=String.valueOf(result);
            if(rs.next()){
                if(result>=200){
                    
                    
                    st.executeUpdate("INSERT INTO result(RollNo, Course, Branch, MarksObtained, Result) VALUES('" + rs.getString("rollno") + "', '" + rs.getString("course") + "', '" + rs.getString("branch") + "', '" + res + "', 'PASS')");

                    
                }
                else{
                    
                    
                    st.executeUpdate("INSERT INTO result(RollNo, Course, Branch, MarksObtained, Result) VALUES('" + rs.getString("rollno") + "', '" + rs.getString("course") + "', '" + rs.getString("branch") + "', '" + res + "', 'FAIL')");

                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Student is not registered");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(MtechEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MtechEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MtechEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MtechEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MtechEEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
