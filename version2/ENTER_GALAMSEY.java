package version2;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author afsanat
 */
public class ENTER_GALAMSEY extends javax.swing.JFrame {

    /**
     * Creates new form ENTER_GALAMSEY
     */
    public ENTER_GALAMSEY() {
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

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLabel jLabel15 = new JLabel();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton addbutton = new javax.swing.JButton();
        javax.swing.JButton exitbutton = new javax.swing.JButton();
        namefeild = new javax.swing.JTextField();
        latitudefeild = new javax.swing.JTextField();
        logitudefeild = new javax.swing.JTextField();
        observatoryid = new javax.swing.JTextField();
        vegetationcoverfeild = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NAME");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LONGITUDE");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LATITUDE");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("VEGETATION COLOR");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("OBSERVATORY ID");

       // addbutton.setBackground(new java.awt.Color(200, 2, 2));
        //addbutton.setForeground(new java.awt.Color(255, 255, 255));
        //addbutton.setText("ADD");


        addbutton.setForeground(new java.awt.Color(200, 2, 2));
        addbutton.setText("ADD");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

      //  exitbutton.setBackground(new java.awt.Color(200, 2, 2));
      //  exitbutton.setForeground(new java.awt.Color(255, 255, 255));
      //  exitbutton.setText("EXIT");

        exitbutton.setForeground(new java.awt.Color(200, 2, 2));
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }



        });


        namefeild.setText("");

        latitudefeild.setText("");

        logitudefeild.setText("");

        vegetationcoverfeild.setText("");

        observatoryid.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namefeild, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                     .addComponent(observatoryid)
                    .addComponent(logitudefeild)
                    .addComponent(latitudefeild)
                    .addComponent(vegetationcoverfeild))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbutton)
                .addGap(18, 18, 18)
                .addComponent(exitbutton)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namefeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))


                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logitudefeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))



                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(latitudefeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                 .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(observatoryid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(vegetationcoverfeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(exitbutton))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Connection conn = null;
        DBconnection connect = new DBconnection();
        String JDBC_DRIVER="com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/Galamseys";
        String USER="root";
        String PASS="admin";

        try{
            //registering the jbc driver
            Class.forName("com.mysql.jdbc.Driver");

            //openning a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            String name=namefeild.getText();
            int observatory= Integer.parseInt(observatoryid.getText());
            String vegcolor=vegetationcoverfeild.getText();
            String latitude = latitudefeild.getText();
            String longitude = logitudefeild.getText();



            //executing the querry
            String sql= "Insert into Galamsey ( GalamseyName, vegetationColor, Year_of_event, latitude, longitude, observatoryId)" + "values (?,?,?,?,?,?)";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setString(1,name);
            p.setString(2,vegcolor);
            p.setInt(3, 2015);
            p.setString(4, latitude);
            p.setString(5, longitude);
            p.setInt(6, observatory);



            //execute and exit
            p.execute();
            conn.close();
            System.out.println("Data has been added!!! Check (view statistics)");

            this.setVisible(false);
        }catch(SQLException se){
            //catch errors in jdbc
            se.printStackTrace();
        }catch(Exception e){
            //catch errors in Class.forName
            e.printStackTrace();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }


    public void GalamseyWindow() {
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
            java.util.logging.Logger.getLogger(ENTER_GALAMSEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ENTER_GALAMSEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ENTER_GALAMSEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ENTER_GALAMSEY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ENTER_GALAMSEY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField latitudefeild;
    private javax.swing.JTextField observatoryid;
    private javax.swing.JTextField logitudefeild;
    private javax.swing.JTextField namefeild;
    private javax.swing.JTextField vegetationcoverfeild;
    // End of variables declaration//GEN-END:variables
}
