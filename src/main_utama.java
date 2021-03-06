
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 
import net.sf.jasperreports.engine.JRException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizki_
 */
public class main_utama extends javax.swing.JFrame {
int waktu = 0;
    /**
     * Creates new form main_utama
     */
    public main_utama() {
        initComponents();
         Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        //
        int x = layar.width / 2 - this.getSize().width/2;
        int y = layar.height / 2 - this.getSize().height/2;
        //
        this.setLocation(x, y);
        //this.setExtendedState(MAXIMIZED_BOTH);
        
        
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         new Thread(){
            @Override
            public void run(){
                java.util.Date skrg = new java.util.Date();
                java.text.SimpleDateFormat kal = new
                java.text.SimpleDateFormat("dd MMMMMMMM yyyy");
                tanggal.setText(kal.format(skrg));
               while(waktu == 0){
                Calendar kalender = new GregorianCalendar();
                    //int hari = kalender.get(Calendar.;
                    int jam = kalender.get(Calendar.HOUR);
                    int menit = kalender.get(Calendar.MINUTE);
                    int detik = kalender.get(Calendar.SECOND);
                    int AM_PM = kalender.get(Calendar.AM_PM);
                    String siang_malam ="";
             if(AM_PM == 1){
                    siang_malam="PM"; 
             }else{
                    siang_malam = "AM";   
                  }
             String time = jam + ":" + menit + ":" + detik + " " + siang_malam;
             inijam.setText(time);               
              }  
            }
        }.start();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LaporanPengembalian = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        member = new javax.swing.JButton();
        buku = new javax.swing.JButton();
        pinjaman = new javax.swing.JButton();
        kembalian = new javax.swing.JButton();
        inijam = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        laporanPeminjaman = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LaporanPengembalian.setBackground(new java.awt.Color(153, 153, 255));
        LaporanPengembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LaporanPengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/print.png"))); // NOI18N
        LaporanPengembalian.setText("Laporan Pengembalian");
        LaporanPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(LaporanPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 290, 80));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 100, -1));

        member.setBackground(new java.awt.Color(0, 255, 102));
        member.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/member.png"))); // NOI18N
        member.setText("Member");
        member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberActionPerformed(evt);
            }
        });
        getContentPane().add(member, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, 80));

        buku.setBackground(new java.awt.Color(102, 255, 255));
        buku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/buku.png"))); // NOI18N
        buku.setText("Buku");
        buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukuActionPerformed(evt);
            }
        });
        getContentPane().add(buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 160, 80));

        pinjaman.setBackground(new java.awt.Color(51, 255, 51));
        pinjaman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pinjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/peminjaman.png"))); // NOI18N
        pinjaman.setText("Peminjaman");
        pinjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamanActionPerformed(evt);
            }
        });
        getContentPane().add(pinjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 210, 80));

        kembalian.setBackground(new java.awt.Color(255, 204, 204));
        kembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/pengembalian.png"))); // NOI18N
        kembalian.setText("Pengembalian");
        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed(evt);
            }
        });
        getContentPane().add(kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 210, 80));

        inijam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inijam.setText("jam");
        getContentPane().add(inijam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 230, 30));

        tanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tanggal.setText("tanggal");
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, 30));

        laporanPeminjaman.setBackground(new java.awt.Color(255, 0, 0));
        laporanPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        laporanPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon/print.png"))); // NOI18N
        laporanPeminjaman.setText("Laporan Peminjaman");
        laporanPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanPeminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(laporanPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 290, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 550));
        jLabel2.setMinimumSize(new java.awt.Dimension(1000, 550));
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 550));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukuActionPerformed
        // TODO add your handling code here:
       new buku().setVisible(true); 
    }//GEN-LAST:event_bukuActionPerformed

    private void memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberActionPerformed
        // TODO add your handling code here:
        new member().setVisible(true);
        ///this.setVisible(false);
    }//GEN-LAST:event_memberActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.setVisible(false);
        //
    }//GEN-LAST:event_logoutActionPerformed

    private void LaporanPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPengembalianActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/Laporan/DaftarKembali.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/newperpustakaan","root","");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_LaporanPengembalianActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void pinjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamanActionPerformed
        // TODO add your handling code here:
        new pinjam().setVisible(true);
    }//GEN-LAST:event_pinjamanActionPerformed

    private void kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembalianActionPerformed
        // TODO add your handling code here:
        new kembalian().setVisible(true);
    }//GEN-LAST:event_kembalianActionPerformed

    private void laporanPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanPeminjamanActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/Laporan/DaftarPinjam.jasper");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/newperpustakaan","root","");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, koneksi);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_laporanPeminjamanActionPerformed

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
            java.util.logging.Logger.getLogger(main_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LaporanPengembalian;
    private javax.swing.JButton buku;
    private javax.swing.JLabel inijam;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton kembalian;
    private javax.swing.JButton laporanPeminjaman;
    private javax.swing.JButton logout;
    private javax.swing.JButton member;
    private javax.swing.JButton pinjaman;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}
