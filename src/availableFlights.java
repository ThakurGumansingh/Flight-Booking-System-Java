
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gumansingh
 */
public class availableFlights extends javax.swing.JFrame {

    /**
     * Creates new form availableFlights
     */
    public availableFlights() {
        initComponents();
        setSize (1520, 750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        euyui = new javax.swing.JLabel();
        bjkdjhk = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        yyyuiyu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(0, 51, 51));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        euyui.setFont(new java.awt.Font("Trebuchet MS", 0, 70)); // NOI18N
        euyui.setForeground(new java.awt.Color(0, 255, 0));
        euyui.setText("Karachi Airline Service");
        panel1.add(euyui, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 740, 90));

        bjkdjhk.setFont(new java.awt.Font("014-CAI978", 0, 70)); // NOI18N
        bjkdjhk.setForeground(new java.awt.Color(204, 204, 0));
        bjkdjhk.setText("Available Flights");
        panel1.add(bjkdjhk, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 594, 90));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PK-324", "<html><font color=\"GREEN\">Terminal C</color></html>", "Islamabad", "<html><font color=\"RED\">40</color></html>", "6:30 am", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"PK-312", "<html><font color=\"GREEN\">Terminal A</color></html>", "Karachi", "<html><font color=\"RED\">15</color></html>", "6:35 am", "<html><font color=\"RED\">DELAYED</color></html>"},
                {"PK-567", "<html><font color=\"GREEN\">Terminal B</color></html>", "Lahore", "<html><font color=\"RED\">18</color></html>", "8:00 am", "<html><font color=\"GREEN\">CHECK-IN</color></html>"},
                {"IN-973", "<html><font color=\"GREEN\">Terminal D</color></html>", "Delhi", "<html><font color=\"RED\">32</color></html>", "9:25 am", "<html><font color=\"RED\">CANCELLED</color></html>"},
                {"IT-453", "<html><font color=\"GREEN\">Terminal Z</color></html>", "Venice", "<html><font color=\"RED\">27</color></html>", "9:50 am", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"TK-173", "<html><font color=\"GREEN\">Terminal A</color></html>", "Ankara", "<html><font color=\"RED\">45</color></html>", "10:25 am", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"US-723", "<html><font color=\"GREEN\">Terminal B</color></html>", "New York", "<html><font color=\"RED\">08</color></html>", "11:45 am", "<html><font color=\"RED\">DELAYED</color></html>"},
                {"NL-829", "<html><font color=\"GREEN\">Terminal C</color></html>", "Khatmandu", "<html><font color=\"RED\">12</color></html>", "1:05 pm", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"AE-834", "<html><font color=\"GREEN\">Terminal Z</color></html>", "Dubai", "<html><font color=\"RED\">37</color></html>", "2:50 pm", "<html><font color=\"GREEN\">CHECK-IN</color></html>"},
                {"UK-874", "<html><font color=\"GREEN\">Terminal B</color></html>", "London", "<html><font color=\"RED\">29</color></html>", "4:25 pm", "<html><font color=\"RED\">CANCELLED</color></html>"}
            },
            new String [] {
                "<html><body><h3><font color=\"BLUE\">FLIGHT</color></body></html>", "<html><body><h3><font color=\"green\">TERMINAL</color></body></html>", "<html><body><h3><font color=\"BLUE\">DESTINATION</color></body></html>", "<html><body><h3><font color=\"RED\">GATE</color></body></html>", "<html><body><h3><font color=\"BLUE\">TIME</color></body></html>", "<html><body><h3><font color=\"green\">REMARKS</color></body></html>"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1360, 540));

        exit.setBackground(new java.awt.Color(255, 102, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(51, 0, 204));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        panel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 50));

        Back.setBackground(new java.awt.Color(255, 102, 255));
        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 0, 204));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        panel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 50));

        yyyuiyu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guman Singh\\OneDrive\\Documents\\NetBeansProjects\\airline\\pics\\arrival.png")); // NOI18N
        yyyuiyu.setText("jLabel3");
        panel1.add(yyyuiyu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 720));

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 1360, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Do you really want to Exit","Output Console",
            JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_NO_OPTION)){
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new ticketing().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(availableFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(availableFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(availableFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(availableFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new availableFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel bjkdjhk;
    private javax.swing.JLabel euyui;
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    private javax.swing.JLabel yyyuiyu;
    // End of variables declaration//GEN-END:variables
}
