/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_mangement_system;
import java.sql.*;


/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;
public class BtechCSEResult extends javax.swing.JFrame {

    /**
     * Creates new form BtechCSEResult
     */
    public BtechCSEResult() {
        initComponents();
    }
    public BtechCSEResult(String rollno) {
        initComponents();
        jTextField2.setText(rollno);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 850));
        setPreferredSize(new java.awt.Dimension(700, 800));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Course name :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 14, -1, -1));

        jLabel2.setText("Branch :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 118, 48, -1));

        jLabel3.setText("Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 14, -1, -1));

        jLabel7.setText("Father name :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 118, -1, -1));

        jLabel8.setText("Roll Number :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 66, 77, -1));

        jLabel9.setText("Gender :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 66, 53, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextField1.setText("jTextField1");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, 246, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextField2.setText("jTextField2");
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 63, 246, -1));

        jTextField3.setEditable(false);
        jTextField3.setText("jTextField3");
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 115, 246, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("jTextField4");
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 11, 122, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("jTextField6");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 63, 122, -1));

        jTextField9.setEditable(false);
        jTextField9.setText("jTextField9");
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 115, 122, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 688, 160));

        jLabel16.setFont(new java.awt.Font("Lucida Calligraphy", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 255));
        jLabel16.setText("All THE BEST!!!!");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 750, 240, 50));

        jButton1.setBackground(new java.awt.Color(0, 206, 209));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 751, 100, 40));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Core Java");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 58, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Operating System");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("DataBase Management System");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 205, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("Networking");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Computer Graphics");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 355, 143, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("Total Marks");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 18, 97, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("Obtained Marks");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 18, 115, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Passing Marks");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 18, 108, -1));

        jLabel25.setText("100");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 62, 43, -1));

        jLabel26.setText("40");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 62, 43, -1));

        jLabel27.setText("100");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 136, 43, -1));

        jLabel28.setText("40");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 136, 43, -1));

        jLabel29.setText("100");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 211, 43, -1));

        jLabel30.setText("40");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 211, 43, -1));

        jLabel31.setText("100");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 280, 43, -1));

        jLabel32.setText("40");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 280, 43, -1));

        jLabel33.setText("100");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 358, 43, -1));

        jLabel34.setText("40");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 358, 43, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 58, 77, -1));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 133, 77, -1));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 208, 77, -1));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 276, 77, -1));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 355, 77, -1));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 432, 77, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setText("Total Marks");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 433, -1, -1));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 0, 0));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 494, 77, 32));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setText("500");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 435, 43, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("200");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 435, 43, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel17.setText("Result->");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 499, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText("Subjects");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 18, 97, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 186, 690, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            String rollno=jTextField2.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srm","root","anam198@mysql");
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery("select * from student inner join BtechCSE where student.rollno='"+rollno+"' and BtechCSE.rollno='"+rollno+"'");
            
            if(rs.next()){
                    jTextField1.setText(rs.getString(4));
                    jTextField3.setText(rs.getString(6));
                    jTextField4.setText(rs.getString(2));
                    jTextField6.setText(rs.getString(5));
                    jTextField9.setText(rs.getString(3));
                    
                jTextField12.setText(rs.getString(10));
                jTextField13.setText(rs.getString(11));
                jTextField14.setText(rs.getString(12));
                jTextField15.setText(rs.getString(13));
                jTextField16.setText(rs.getString(14));
                
                int s1=Integer.parseInt(jTextField12.getText());
                int s2=Integer.parseInt(jTextField13.getText());
                int s3=Integer.parseInt(jTextField14.getText());
                int s4=Integer.parseInt(jTextField15.getText());
                int s5=Integer.parseInt(jTextField16.getText());
                
                int result=s1+s2+s3+s4+s5;
                
                jTextField7.setText(String.valueOf(result));
                String res=String.valueOf(result);
                
               if(result>=200){
                    jTextField8.setText("PASS");
                    JOptionPane.showMessageDialog(null, "Congratulations "+rs.getString("name")+"!!!");

                    
                }
                else{
                    jTextField8.setText("FAIL");
                    JOptionPane.showMessageDialog(null, "Better luck next time "+rs.getString("name")+"!");

                }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Student not registered");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentadmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BtechCSEResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BtechCSEResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BtechCSEResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BtechCSEResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BtechCSEResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
