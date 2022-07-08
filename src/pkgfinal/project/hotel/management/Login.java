/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.hotel.management;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
/**
 *
 * @author Cpt.coldblood
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel3 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        txtPwd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblForgot = new javax.swing.JLabel();
        lblSignup = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("User Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 13, 212, 48));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 79, 114, 43));

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 114, 43));

        txtUname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 79, 179, 43));

        txtPwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 150, 179, 43));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 211, 130, 32));

        lblForgot.setForeground(new java.awt.Color(0, 0, 255));
        lblForgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForgot.setText("Forgot Password?");
        lblForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotMouseClicked(evt);
            }
        });
        getContentPane().add(lblForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 256, 130, -1));

        lblSignup.setForeground(new java.awt.Color(0, 0, 255));
        lblSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignup.setText("Sign Up");
        lblSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignupMouseClicked(evt);
            }
        });
        getContentPane().add(lblSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 279, 130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/hotel/management/login_icon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       String uname,pwd;
       uname=txtUname.getText();
       pwd=txtPwd.getText();
       DBConnect con=new DBConnect();
       Connection c=con.connect();
       try{
           Statement s1=c.createStatement();
           ResultSet rs1=s1.executeQuery("select username,password from signup");
           Boolean x=false;
           while(rs1.next()){
               if(uname.equals(rs1.getString(1))&&pwd.equals(rs1.getString(2))){
                   Mainmenu m=new Mainmenu();
                   m.setVisible(true);
                   this.setVisible(false);
                   x=true;
                   
               }
           }
           if(x==false){
               JOptionPane.showMessageDialog(rootPane,"Wrong Username or Password", "Error", ERROR_MESSAGE);
               txtUname.setText(null);
               txtPwd.setText(null);
           }
       }
       catch(SQLException e){
           System.out.print(e.getMessage());
       }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseClicked
        ResetMail rm=new ResetMail();
        rm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblForgotMouseClicked

    private void lblSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignupMouseClicked
     this.setVisible(false);
     Signup su=new Signup();
     su.setVisible(true);
    }//GEN-LAST:event_lblSignupMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblForgot;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JPasswordField txtPwd;
    public static javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
