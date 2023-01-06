/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EventManagement;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INSTALL
 */
public class org_dlt extends javax.swing.JFrame {

    /**
     * Creates new form org_dlt
     */
    public org_dlt() {
        initComponents();
        orgname.setBackground(new Color(0,0,0,170));
        jPanel2.setBackground(new Color(0,0,0,70));
        jPanel3.setBackground(new Color(0,0,0,70));
        jPanel6.setBackground(new Color(0,0,0,70));
        this.setSize(1510, 760);
        load();
    }
     public static Connection myConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost:3306/login?"+"user=root&password=root";
            con = DriverManager.getConnection(connectionUrl);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static int okcancel(String theMessage){
        int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);
        return result;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        orgname = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        org_name = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        event_details = new javax.swing.JLabel();
        logout_btn = new javax.swing.JLabel();
        org_details = new javax.swing.JLabel();
        sales_details = new javax.swing.JLabel();
        addorg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dltorg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-delete-64.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EVENT MANAGEMENT SYSTEM");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        orgname.setBackground(new java.awt.Color(0, 51, 51));
        orgname.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("DELETE ORGANISER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        orgname.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1240, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME :");
        orgname.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        orgname.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 307, 97, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setBackground(new java.awt.Color(204, 204, 204));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setText("DELETE");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 360, -1));

        orgname.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 352, 1240, 80));

        org_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        org_name.setMaximumRowCount(4);
        org_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT" }));
        org_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                org_nameMouseClicked(evt);
            }
        });
        org_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                org_nameActionPerformed(evt);
            }
        });
        orgname.add(org_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 254, -1));

        jPanel4.add(orgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 1220, 530));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        event_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        event_details.setForeground(new java.awt.Color(255, 255, 255));
        event_details.setText("BOOKING DETAILS");
        event_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        event_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        event_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_detailsMouseClicked(evt);
            }
        });
        jPanel6.add(event_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 157, 156, -1));

        logout_btn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("LOGOUT");
        logout_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        logout_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_btnMouseClicked(evt);
            }
        });
        jPanel6.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        org_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        org_details.setForeground(new java.awt.Color(255, 255, 255));
        org_details.setText("ORGANISER DETAILS");
        org_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        org_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        org_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                org_detailsMouseClicked(evt);
            }
        });
        jPanel6.add(org_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 219, -1, -1));

        sales_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        sales_details.setForeground(new java.awt.Color(255, 255, 255));
        sales_details.setText("SALES DETAILS");
        sales_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        sales_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sales_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_detailsMouseClicked(evt);
            }
        });
        jPanel6.add(sales_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 285, 156, -1));

        addorg.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        addorg.setForeground(new java.awt.Color(255, 255, 255));
        addorg.setText("ADD ORGANISER");
        addorg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addorg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addorgMouseClicked(evt);
            }
        });
        jPanel6.add(addorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 344, 156, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-admin-64.png"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        dltorg.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        dltorg.setForeground(new java.awt.Color(255, 255, 255));
        dltorg.setText("DELETE ORGANISER");
        dltorg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dltorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dltorgMouseClicked(evt);
            }
        });
        jPanel6.add(dltorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 403, 156, -1));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 60));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/pexels-polina-kovaleva-5430720.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1514, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void load(){
        Connection con=myConnection();
        try{
            PreparedStatement prest;
            String sql="SELECT * FROM user_login";
            prest= con.prepareStatement(sql);
            ResultSet rs = prest.executeQuery(sql);
            while(rs.next()){
                String name=rs.getString("username");
                org_name.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(org_dlt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        Connection con = myConnection();
        try{
            String name=org_name.getSelectedItem().toString();
            
            PreparedStatement prest;
            String sql ="DELETE FROM user_login WHERE username='"+name+"'";
            prest= con.prepareStatement(sql);
            int count = prest.executeUpdate();

            if(count>0){
                int i = okcancel("Organiser Deleted");
                System.out.println("ret:"+i);
                new org_dlt().setVisible(true);
                con.close();
            }
            else{
                int j = okcancel("Invalid !");
                System.out.println("ret:"+j);
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void org_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_org_nameMouseClicked
        // TODO add your handling code here:
        //        String value =

    }//GEN-LAST:event_org_nameMouseClicked

    private void org_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_org_nameActionPerformed
        // TODO add your handling code here:
        String name = org_name.getSelectedItem().toString();

    }//GEN-LAST:event_org_nameActionPerformed

    private void event_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_detailsMouseClicked
        // TODO add your handling code here:
        dispose();
        event_details e = new event_details();
        e.show();
    }//GEN-LAST:event_event_detailsMouseClicked

    private void logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseClicked
        // TODO add your handling code here:
        dispose();
        login l=new login();
        l.show();
    }//GEN-LAST:event_logout_btnMouseClicked

    private void org_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_org_detailsMouseClicked
        // TODO add your handling code here:
        dispose();
        admin a= new admin();
        a.show();
    }//GEN-LAST:event_org_detailsMouseClicked

    private void sales_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_detailsMouseClicked
        // TODO add your handling code here:
        dispose();
        new sales_details().setVisible(true);
    }//GEN-LAST:event_sales_detailsMouseClicked

    private void addorgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addorgMouseClicked
        // TODO add your handling code here:
        dispose();
        signup s = new signup();
        s.show();
    }//GEN-LAST:event_addorgMouseClicked

    private void dltorgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dltorgMouseClicked
        // TODO add your handling code here:
        dispose();
        org_dlt d = new org_dlt();
        d.show();
    }//GEN-LAST:event_dltorgMouseClicked

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
            java.util.logging.Logger.getLogger(org_dlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(org_dlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(org_dlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(org_dlt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new org_dlt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addorg;
    private javax.swing.JLabel dltorg;
    private javax.swing.JLabel event_details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logout_btn;
    private javax.swing.JLabel org_details;
    private javax.swing.JComboBox<String> org_name;
    private javax.swing.JPanel orgname;
    private javax.swing.JLabel sales_details;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
