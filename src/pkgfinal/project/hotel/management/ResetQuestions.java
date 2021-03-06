/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Cpt.coldblood
 */
public class ResetQuestions extends javax.swing.JFrame {

    /**
     * Creates new form ResetQuestions
     */
    public ResetQuestions() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ic.jpg")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQ1 = new javax.swing.JTextField();
        txtAns1 = new javax.swing.JTextField();
        txtQ2 = new javax.swing.JTextField();
        txtAns2 = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnShowsec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recover Password");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("Answer the Security Questions to Reset Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 19, -1, 42));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 94, 138, 23));

        txtUid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtUid, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 94, 174, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Question 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 156, 138, 31));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setText("Answer 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 200, 138, 31));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("Question 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 258, 138, 31));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Answer 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 302, 138, 31));

        txtQ1.setEditable(false);
        txtQ1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(txtQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, 273, 31));

        txtAns1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtAns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 200, 273, 31));

        txtQ2.setEditable(false);
        txtQ2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        getContentPane().add(txtQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 258, 273, 31));

        txtAns2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtAns2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 302, 273, 31));

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 163, 36));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setText("Back to login");
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 163, 36));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/abstract-line-light-green-yellow-color-background-fresh-background-illustration-abstract-line-light-green-yellow-115228425.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/geometric-abstract-blue-color-background-vector-2154672.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 690, 130));

        btnShowsec.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnShowsec.setText("Show Security Questions");
        btnShowsec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowsecActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 230, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowsecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowsecActionPerformed
        String ui=txtUid.getText();
         DBConnect con1=new DBConnect();
          con1.connect();
        
        try {
            Statement s1=con1.connect().createStatement();
            ResultSet rs1=s1.executeQuery("select uid,question1,answer1,question2,answer2 from signup where uid='"+ui+"'");
            while(rs1.next()){
                txtQ1.setText(rs1.getString(2));
                txtQ2.setText(rs1.getString(4));
            }
            }
        catch(SQLException e){
            System.out.print(e.getMessage());
        }
        if(txtQ1.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "User ID Not Found", "Error", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowsecActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String a2=txtAns2.getText();
        String a1=txtAns1.getText();
        String ui=txtUid.getText();
         DBConnect con1=new DBConnect();
          con1.connect();
        
        try {
            Statement s1=con1.connect().createStatement();
            ResultSet rs1=s1.executeQuery("select uid,question1,answer1,question2,answer2 from signup where uid='"+ui+"'");
            while(rs1.next()){
                if(rs1.getString(3).equalsIgnoreCase(a1)&&rs1.getString(5).equalsIgnoreCase(a2)){
                   Newpwd np=new Newpwd();
                   Newpwd.txtUid.setText(ui);
                   np.setVisible(true);
                   this.setVisible(false);
       }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Wrong Answers Entered.Please check again", "Error", ERROR_MESSAGE);
       }    
                
            }
            }
        catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(ResetQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnShowsec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAns1;
    private javax.swing.JTextField txtAns2;
    private javax.swing.JTextField txtQ1;
    private javax.swing.JTextField txtQ2;
    public static javax.swing.JTextField txtUid;
    // End of variables declaration//GEN-END:variables
}
