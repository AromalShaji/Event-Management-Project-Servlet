/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EventManagement;

import static EventManagement.add_event.okcancel;
import static EventManagement.org_dlt.myConnection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author DELL
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        setPersonTableData();
        user_count();
        showPieChart();
        jPanel3.setBackground(new Color(0,0,0,80));
        jPanel2.setBackground(new Color(0,0,0,80));
        pan.setBackground(new Color(0,0,0,80));
        load();
        this.setSize(1478, 760);
    }
    
    public static Connection myConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl="jdbc:mysql://localhost:3306/login?"+"user=root&password=root";
            con = DriverManager.getConnection(connectionUrl);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    private void load(){
        Connection con=myConnection();
        try{
            PreparedStatement prest;
            String sql="SELECT * FROM user_login";
            prest= con.prepareStatement(sql);
            ResultSet rs = prest.executeQuery(sql);
            while(rs.next()){
                String name=rs.getString("username");
                orgnames.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(org_dlt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setPersonTableData(){
        Connection con = myConnection();
        try{
            PreparedStatement prest;
            String sql ="SELECT * FROM user_login";
            prest= con.prepareStatement(sql);
            ResultSet rs = prest.executeQuery(sql);
            while(rs.next()){
    
                String id  = String.valueOf(rs.getInt("uid"));
                String fn = rs.getString("username");
                String mn = rs.getString("event_details");
                String tbData[]={id,fn,mn};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
            }
            }catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 

    public String mar,bir;
    public int cmar,cbir;
    private void user_count(){
        Connection con = myConnection();
        try{
            PreparedStatement prest,prest2;
            String sql ="SELECT count(event_details) FROM user_login WHERE event_details='MARRIAGE'";
            String sql2 ="SELECT count(event_details) FROM user_login WHERE event_details='BIRTHDAY'";  
            prest= con.prepareStatement(sql);
            prest2= con.prepareStatement(sql2);
            ResultSet rs = prest.executeQuery(sql);
            ResultSet rs2 = prest2.executeQuery(sql2);
            while(rs.next()){
                mar = String.valueOf(rs.getString("count(event_details)"));
                cmar=Integer.parseInt(mar);
            }
            while(rs2.next()){
                bir = String.valueOf(rs2.getString("count(event_details)"));
                cbir=Integer.parseInt(bir);
            }
            }catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
    
    private void showPieChart(){
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset( );
        barDataset.setValue( "MARRIAGE" , new Double( cmar ) );  
        barDataset.setValue( "BIRTHDAY" , new Double( cbir ) );
        JFreeChart piechart = ChartFactory.createPieChart("",barDataset, false,true,false);//explain
        PiePlot piePlot =(PiePlot) piechart.getPlot();
        piePlot.setSectionPaint("MARRIAGE", new Color(255,255,102));
        piePlot.setSectionPaint("BIRTHDAY", new Color(102,255,102));
        piePlot.setBackgroundPaint(Color.white);
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
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
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        orgnames = new javax.swing.JComboBox<>();
        show = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        event_details = new javax.swing.JLabel();
        logout_btn = new javax.swing.JLabel();
        org_details = new javax.swing.JLabel();
        sales_details = new javax.swing.JLabel();
        addorg = new javax.swing.JLabel();
        dltorg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EVENT MANAGEMENT SYSTEM");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "EVENT TYPE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 1090, 160));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FIND SALES OF AN ORGANISER");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 25));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        jPanel3.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 340, 230));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ORGANISER DETAILS");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 25));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MOST SELECTED EVENT");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, 25));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1220, 10));

        jPanel3.add(orgnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 250, -1));

        show.setBackground(new java.awt.Color(204, 204, 204));
        show.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        show.setText("SHOW");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        pan.setLayout(new java.awt.BorderLayout());
        jPanel3.add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 360, 230));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 78, 1220, 570));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        event_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        event_details.setForeground(new java.awt.Color(255, 255, 255));
        event_details.setText("BOOKING DETAILS");
        event_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        event_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        event_details.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                event_detailsMouseDragged(evt);
            }
        });
        event_details.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                event_detailsFocusGained(evt);
            }
        });
        event_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                event_detailsMouseClicked(evt);
            }
        });
        jPanel2.add(event_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 179, 156, -1));

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
        jPanel2.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        org_details.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        org_details.setForeground(new java.awt.Color(255, 255, 255));
        org_details.setText("ORGANISER DETAILS");
        org_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        org_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                org_detailsMouseClicked(evt);
            }
        });
        jPanel2.add(org_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 241, 160, -1));

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
        jPanel2.add(sales_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 307, 156, -1));

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
        jPanel2.add(addorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 366, 156, -1));

        dltorg.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        dltorg.setForeground(new java.awt.Color(255, 255, 255));
        dltorg.setText("DELETE ORGANISER");
        dltorg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dltorg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dltorg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dltorgMouseClicked(evt);
            }
        });
        jPanel2.add(dltorg, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 425, 156, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/icons8-admin-64.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EventManagement/pexels-polina-kovaleva-5430720.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 1580, 870));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        setSize(new java.awt.Dimension(1514, 761));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void event_detailsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_event_detailsMouseDragged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_event_detailsMouseDragged

    private void event_detailsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_event_detailsFocusGained
        // TODO add your handling code here:
        okcancel("s");
    }//GEN-LAST:event_event_detailsFocusGained

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        String name=orgnames.getSelectedItem().toString();
        if(name.equals("")){
            okcancel("INVALID !");
        }
        else{
            new admin_org_details_show(name).setVisible(true);
        }
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addorg;
    private javax.swing.JLabel dltorg;
    private javax.swing.JLabel event_details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logout_btn;
    private javax.swing.JLabel org_details;
    private javax.swing.JComboBox<String> orgnames;
    private javax.swing.JPanel pan;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JLabel sales_details;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
