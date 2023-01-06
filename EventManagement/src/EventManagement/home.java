/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EventManagement;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INSTALL
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public int id;
    
    public home() {
        initComponents();
        getuserlogin();
        setPersonTableData1(logname);
        this.setSize(1430, 760);
        jPanel2.setBackground(new Color(0,0,0,60));
        jPanel2.setBackground(new Color(0,0,0,60));
    }
    
    public String logname;
    public home(String name){
        initComponents();
        date_check();
        logname = name;
        getusername.setText(String.valueOf(logname));
        getuserlogin();
        setPersonTableData1(logname);
        setPersonTableData2(logname);
    }
    
    public String back_logname;
    public void home1(String bname){
        initComponents();
        date_check();
        back_logname = bname;
        getusername.setText(String.valueOf(back_logname));
        getuserlogin();
        setPersonTableData1(back_logname);
        setPersonTableData2(back_logname);
    }
    
    public static int okcancel(String theMessage){
        int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);
        return result;
    }
    
    public static int okcancel(int theMessage){
        int result=JOptionPane.showConfirmDialog((Component)null,theMessage,"alert",JOptionPane.OK_CANCEL_OPTION);
        return result;
    }
    
    public static Connection myConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost:3306/login?"+"user=root&password=root";
            con = DriverManager.getConnection(connectionUrl);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public String cdate;
    public Date date2,date3;
    private void date_check(){
        SimpleDateFormat sss = new SimpleDateFormat("yyyy-MM-dd");
        date2=new Date();
        cdate=sss.format(date2);
    }
    
    public int uid;
    private void getuserlogin(){
        Connection con = myConnection();
        try{
            String bname = logname;
            PreparedStatement prest;
            String sql1 ="SELECT uid FROM user_login WHERE username='"+bname+"'";
            prest= con.prepareStatement(sql1);
            ResultSet rs = prest.executeQuery(sql1);
            while(rs.next()){
                uid=rs.getInt("uid");
            }
        }catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setPersonTableData2(String back_logname){
        Connection con = myConnection();
        try{ 
            String bname = back_logname;
            PreparedStatement prest;
            String sql1 ="SELECT * FROM event_details where uid='"+uid+"' AND event_date>='"+cdate+"' ORDER BY event_date ASC";
            prest= con.prepareStatement(sql1);
            ResultSet rs = prest.executeQuery(sql1);
            while(rs.next()){
                String id  = String.valueOf(rs.getInt("eid"));
                String un = rs.getString("user_name");
                String ed = rs.getString("event_date");
                String fd = rs.getString("food");
                String sg = rs.getString("stage");
                String pn = rs.getString("phone");
                String ad = rs.getString("address");
                String au = rs.getString("audience");
                String dc = rs.getString("decoration");
                String tbData[]={id,un,ed,fd,sg,pn,ad,au,dc};
                DefaultTableModel tblModel=(DefaultTableModel)upcomming_details.getModel();
                tblModel.addRow(tbData);
            }
            }catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    
    private void setPersonTableData1(String back_logname){
        Connection con = myConnection();
        try{ 
            String bname = back_logname;
            PreparedStatement prest;
            String sql1 ="SELECT * FROM event_details where uid='"+uid+"' ORDER BY event_date DESC";
            prest= con.prepareStatement(sql1);
            ResultSet rs = prest.executeQuery(sql1);
            while(rs.next()){
                String id  = String.valueOf(rs.getInt("eid"));
                String un = rs.getString("user_name");
                String ed = rs.getString("event_date");
                String fd = rs.getString("food");
                String sg = rs.getString("stage");
                String pn = rs.getString("phone");
                String ad = rs.getString("address");
                String au = rs.getString("audience");
                String dc = rs.getString("decoration");
                String tbData[]={id,un,ed,fd,sg,pn,ad,au,dc};
                DefaultTableModel tblModel=(DefaultTableModel)booking_details.getModel();
                tblModel.addRow(tbData);
            }
            }catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        getusername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        add_event = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booking_details = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        upcomming_details = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("HOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Logout");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getusername.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        getusername.setForeground(new java.awt.Color(255, 255, 255));
        getusername.setText("username");
        jPanel2.add(getusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 215, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("EVENT MANAGEMENT SYSTEM");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 400, 40));

        add_event.setBackground(new java.awt.Color(153, 153, 153));
        add_event.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_event.setForeground(new java.awt.Color(255, 255, 255));
        add_event.setText("ADD EVENT");
        add_event.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        add_event.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_eventMouseClicked(evt);
            }
        });
        jPanel2.add(add_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, -1, -1));

        edit.setBackground(new java.awt.Color(153, 153, 153));
        edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("VIEW DETAILS");
        edit.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-user-16.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 1420, 72));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BOOKING DETAILS");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UPCOMMING BOOKING");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 240, 20));

        booking_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EVENT ID", "USER NAME", "EVENT DATE", "FOOD", "STAGE", "PHONE", "ADDRESS", "AUDIENCE", "EXTRA ITEMS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booking_details.setColumnSelectionAllowed(true);
        booking_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booking_detailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booking_details);
        booking_details.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (booking_details.getColumnModel().getColumnCount() > 0) {
            booking_details.getColumnModel().getColumn(0).setResizable(false);
            booking_details.getColumnModel().getColumn(1).setResizable(false);
            booking_details.getColumnModel().getColumn(2).setResizable(false);
            booking_details.getColumnModel().getColumn(3).setResizable(false);
            booking_details.getColumnModel().getColumn(4).setResizable(false);
            booking_details.getColumnModel().getColumn(5).setResizable(false);
            booking_details.getColumnModel().getColumn(6).setResizable(false);
            booking_details.getColumnModel().getColumn(7).setResizable(false);
            booking_details.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1380, 250));

        upcomming_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "USER NAME", "EVENT DATE", "FOOD", "STAGE", "PHONE", "ADDRESS", "AUDIENCE", "EXTRA ITEMS"
            }
        ));
        jScrollPane3.setViewportView(upcomming_details);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 170, 1380, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/pexels-polina-kovaleva-5430720.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1420, 770));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BOOKING DETAILS");
        jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));
        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 1380, 250));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 453, 1420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1434, 803));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        dispose();
        login l=new login();
        l.show();
//        getusername=login.getText(.name);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void add_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_eventMouseClicked
        // TODO add your handling code here:
        dispose();
        String loginname=logname;
        new add_event(loginname).setVisible(true);
    }//GEN-LAST:event_add_eventMouseClicked

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved

    }//GEN-LAST:event_jLabel7MouseMoved

    private void booking_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booking_detailsMouseClicked
        // TODO add your handling code here:
       

    }//GEN-LAST:event_booking_detailsMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
        dispose();
        new homeNext(logname).setVisible(true);
    }//GEN-LAST:event_editMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_event;
    private javax.swing.JTable booking_details;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel getusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable upcomming_details;
    // End of variables declaration//GEN-END:variables

    private String getText(JLabel username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
