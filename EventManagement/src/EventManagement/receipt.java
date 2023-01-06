/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EventManagement;

import static EventManagement.homeNext.myConnection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class receipt extends javax.swing.JFrame {

    /**
     * Creates new form receipt
     */
    public receipt(){
        initComponents();
        payment();
        
        
    }
    
    private int pid;
    public String logname,a;
    public receipt(int id,String name) {
        initComponents();
        pid=id;
        a=getid1.getText();
        this.logname=name;
        payment();
        rate();
        this.setSize(1400, 7840);
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
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public String name,phone1,address1,date,audience1,food1,stage1,decoration1="",total1;
    private void payment(){
         Connection con = myConnection();
        try{ 
            getid1.setText(String.valueOf(pid));
            PreparedStatement prest;
            //details
            String sql ="SELECT * FROM event_details where eid='"+pid+"'";
            prest= con.prepareStatement(sql);
            ResultSet rs = prest.executeQuery(sql);
            while(rs.next()){
                name = rs.getString("user_name");
                phone1= rs.getString("phone");
                address1 = rs.getString("address");
                date = rs.getString("event_date");
                audience1 = rs.getString("audience");
                food1 = rs.getString("food");
                stage1 = rs.getString("stage");
                decoration1 = rs.getString("decoration");
                total1=rs.getString("total");
            }
            getname.setText(String.valueOf(name));
            getphone.setText(String.valueOf(phone1));
            getaddress.setText(String.valueOf(address1));
            getdate.setText(String.valueOf(date));
            getitem1.setText(String.valueOf(audience1));
            getitem2.setText(String.valueOf(food1));
            getitem3.setText(String.valueOf(stage1));
            if(decoration1.equals("")){
                getitem4.setText("NULL");
                getrate4.setText("NULL");
            }
            else{
                getitem4.setText(String.valueOf(decoration1));
            }
            gettotal.setText(String.valueOf(total1));
            
            }catch (SQLException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public String f_rate,s_rate,a_rate;
    public int ar,fr,sr;
    private void rate(){
        Connection con = myConnection();
        try{
            PreparedStatement prest1,prest2,prest3;
            //audience
            String a1=audience1;
            String sq3="SELECT * FROM audience_details where audience_name='"+a1+"'";
            prest2= con.prepareStatement(sq3);
            ResultSet rs2 = prest2.executeQuery(sq3);
            while(rs2.next()){
                a_rate = String.valueOf(rs2.getInt("audience_rate"));
                ar=Integer.parseInt(a_rate);
            }
            getrate1.setText(String.valueOf(ar));
            //food
            String f1=food1;
            String sq2="SELECT * FROM food_details where food_name='"+f1+"'";
            prest1= con.prepareStatement(sq2);
            ResultSet rs1 = prest1.executeQuery(sq2);
            while(rs1.next()){
                f_rate = String.valueOf(rs1.getInt("food_rate"));
                fr=Integer.parseInt(f_rate);
            }
            getrate2.setText(String.valueOf(fr));
            //stage
            String s1=stage1;
            String sq4="SELECT * FROM stage_details where stage_name='"+s1+"'";
            prest3= con.prepareStatement(sq4);
            ResultSet rs3 = prest3.executeQuery(sq4);
            while(rs3.next()){
                s_rate = String.valueOf(rs3.getInt("stage_rate"));
                sr=Integer.parseInt(s_rate);
            }
            getrate3.setText(String.valueOf(sr));
            
        }catch (SQLException ex) {
            Logger.getLogger(receipt.class.getName()).log(Level.SEVERE, null, ex);
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

        back_btn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        geteventid2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        geteventid3 = new javax.swing.JLabel();
        getname = new javax.swing.JLabel();
        getname1 = new javax.swing.JLabel();
        getphone = new javax.swing.JLabel();
        getphone1 = new javax.swing.JLabel();
        getaddress = new javax.swing.JLabel();
        getdate = new javax.swing.JLabel();
        getphone2 = new javax.swing.JLabel();
        getphone3 = new javax.swing.JLabel();
        getphone4 = new javax.swing.JLabel();
        getphone5 = new javax.swing.JLabel();
        getitem1 = new javax.swing.JLabel();
        getphone7 = new javax.swing.JLabel();
        getitem2 = new javax.swing.JLabel();
        getitem3 = new javax.swing.JLabel();
        getitem4 = new javax.swing.JLabel();
        getrate1 = new javax.swing.JLabel();
        getrate2 = new javax.swing.JLabel();
        getrate3 = new javax.swing.JLabel();
        getrate4 = new javax.swing.JLabel();
        getrate5 = new javax.swing.JLabel();
        gettotal = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        getphone9 = new javax.swing.JLabel();
        getphone10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        getid1 = new javax.swing.JLabel();
        getphone8 = new javax.swing.JLabel();
        geteventid7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        geteventid6 = new javax.swing.JLabel();
        download = new javax.swing.JButton();
        getrate6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        geteventid5 = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(153, 153, 153));
        back_btn.setText("Back");
        back_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        getContentPane().add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        geteventid2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        geteventid2.setText(" PAYMENT ");
        geteventid2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0))));
        jPanel1.add(geteventid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 10));

        geteventid3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        geteventid3.setText("NAME :");
        jPanel1.add(geteventid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        getname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getname.setText("NAME");
        jPanel1.add(getname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        getname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getname1.setText("PHONE :");
        jPanel1.add(getname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        getphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone.setText("PHONE ");
        jPanel1.add(getphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        getphone1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone1.setText("ADDRESS :");
        jPanel1.add(getphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        getaddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getaddress.setText("ADDRESS ");
        jPanel1.add(getaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        getdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getdate.setText("DATE");
        jPanel1.add(getdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 119, -1));

        getphone2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone2.setText("AUDIENCE");
        jPanel1.add(getphone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 363, -1, -1));

        getphone3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone3.setText("FOOD");
        jPanel1.add(getphone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 363, -1, -1));

        getphone4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone4.setText("STAGE");
        jPanel1.add(getphone4, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 363, -1, -1));

        getphone5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone5.setText("EXTRA ITEMS");
        jPanel1.add(getphone5, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 363, -1, -1));

        getitem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getitem1.setText("ITEM :");
        jPanel1.add(getitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 433, -1, -1));

        getphone7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone7.setText("RATE :");
        jPanel1.add(getphone7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 526, -1, -1));

        getitem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getitem2.setText("ITEM :");
        jPanel1.add(getitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 433, -1, -1));

        getitem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getitem3.setText("ITEM :");
        jPanel1.add(getitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 433, -1, -1));

        getitem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getitem4.setText("ITEM :");
        jPanel1.add(getitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 433, -1, -1));

        getrate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getrate1.setText("RATE :");
        jPanel1.add(getrate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 526, -1, -1));

        getrate2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getrate2.setText("RATE :");
        jPanel1.add(getrate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 526, -1, -1));

        getrate3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getrate3.setText("RATE :");
        jPanel1.add(getrate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 526, -1, -1));

        getrate4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getrate4.setText("EXTRA CHARGE");
        jPanel1.add(getrate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 526, -1, -1));

        getrate5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        getrate5.setForeground(new java.awt.Color(153, 153, 153));
        getrate5.setText("Click Here To Download");
        jPanel1.add(getrate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, -1, -1));

        gettotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gettotal.setText("TOTAL :");
        jPanel1.add(gettotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 639, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 589, 770, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 401, 700, 10));

        getphone9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone9.setText("ITEM :");
        jPanel1.add(getphone9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 433, -1, -1));

        getphone10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getphone10.setText("ITEM :");
        jPanel1.add(getphone10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 433, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 700, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 157, 700, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 700, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 700, 260));

        getid1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getid1.setText("Event ID");
        jPanel1.add(getid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 20));

        getphone8.setBackground(new java.awt.Color(153, 153, 153));
        getphone8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(getphone8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 580, 260));

        geteventid7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        geteventid7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-payment-64 (1).png"))); // NOI18N
        jPanel1.add(geteventid7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, 70, 70));

        jPanel7.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 710, -1));

        jPanel4.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 700, -1));

        geteventid6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        geteventid6.setText("Event ID :");
        jPanel1.add(geteventid6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        download.setBackground(new java.awt.Color(102, 153, 255));
        download.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        download.setForeground(new java.awt.Color(255, 255, 255));
        download.setText("PRINT");
        download.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 102), new java.awt.Color(0, 0, 102), null));
        download.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        download.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                downloadMouseClicked(evt);
            }
        });
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });
        jPanel1.add(download, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 180, -1));

        getrate6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getrate6.setText("TOTAL :");
        jPanel1.add(getrate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 639, -1, -1));

        jPanel10.setBackground(new java.awt.Color(51, 102, 0));

        jPanel11.setBackground(new java.awt.Color(51, 102, 0));
        jPanel10.add(jPanel11);

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 700, 830));

        jPanel8.setBackground(new java.awt.Color(51, 102, 0));
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 820, 700, 20));

        geteventid5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        geteventid5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/a.jpg"))); // NOI18N
        getContentPane().add(geteventid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 740, 820));
        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 740, 830));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/pexels-polina-kovaleva-5430720.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, 840));

        setSize(new java.awt.Dimension(1438, 884));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        // TODO add your handling code here
        dispose();
        new homeNext(logname).setVisible(true);
    }//GEN-LAST:event_back_btnMouseClicked

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downloadActionPerformed

    private void downloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadMouseClicked
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("PAYMENT DETAILS");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.85,1);
                jPanel1.paint(g2);
                return Printable.PAGE_EXISTS;             
            }
    });
        boolean ok = job.printDialog();
        if(ok){
        try{  
            job.print();
        }
        catch (PrinterException ex){}
        }
        
    }//GEN-LAST:event_downloadMouseClicked

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back_btn;
    private javax.swing.JButton download;
    private javax.swing.JLabel getaddress;
    private javax.swing.JLabel getdate;
    private javax.swing.JLabel geteventid2;
    private javax.swing.JLabel geteventid3;
    private javax.swing.JLabel geteventid5;
    private javax.swing.JLabel geteventid6;
    private javax.swing.JLabel geteventid7;
    private javax.swing.JLabel getid1;
    private javax.swing.JLabel getitem1;
    private javax.swing.JLabel getitem2;
    private javax.swing.JLabel getitem3;
    private javax.swing.JLabel getitem4;
    private javax.swing.JLabel getname;
    private javax.swing.JLabel getname1;
    private javax.swing.JLabel getphone;
    private javax.swing.JLabel getphone1;
    private javax.swing.JLabel getphone10;
    private javax.swing.JLabel getphone2;
    private javax.swing.JLabel getphone3;
    private javax.swing.JLabel getphone4;
    private javax.swing.JLabel getphone5;
    private javax.swing.JLabel getphone7;
    private javax.swing.JLabel getphone8;
    private javax.swing.JLabel getphone9;
    private javax.swing.JLabel getrate1;
    private javax.swing.JLabel getrate2;
    private javax.swing.JLabel getrate3;
    private javax.swing.JLabel getrate4;
    private javax.swing.JLabel getrate5;
    private javax.swing.JLabel getrate6;
    private javax.swing.JLabel gettotal;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel page;
    // End of variables declaration//GEN-END:variables
}
