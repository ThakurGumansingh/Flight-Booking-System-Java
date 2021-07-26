
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
public class splash extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public splash() {
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

        panel1 = new java.awt.Panel();
        pb1 = new javax.swing.JProgressBar();
        pb2 = new javax.swing.JProgressBar();
        print = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(pb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 340, 60));
        panel1.add(pb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 360, 50));

        print.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        panel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 90, 40));

        jLabel4.setBackground(new java.awt.Color(0, 204, 51));
        jLabel4.setFont(new java.awt.Font("HelvLight", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Created By");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 150, 60));

        jLabel5.setBackground(new java.awt.Color(0, 204, 51));
        jLabel5.setFont(new java.awt.Font("HelvLight", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Guman Singh");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 180, 60));

        jLabel6.setBackground(new java.awt.Color(0, 204, 51));
        jLabel6.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Welcome to Karachi Airline Service");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 650, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guman Singh\\OneDrive\\Documents\\NetBeansProjects\\airline\\pics\\splash.jpg")); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 720, 520));

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 710, 470);

        setSize(new java.awt.Dimension(710, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        login s = new login();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.Panel panel1;
    public javax.swing.JProgressBar pb1;
    public javax.swing.JProgressBar pb2;
    public javax.swing.JLabel print;
    // End of variables declaration//GEN-END:variables
}
