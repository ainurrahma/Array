/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikumII;

/**
 *
 * @author SMK TELKOM
 */
public class ProgramAritmatika extends javax.swing.JFrame {
    String jns="";
int jml;
   
    public ProgramAritmatika() {
        initComponents();
         getJumlah();
        setJenis();
        panel.setVisible(false);
        pilihanbil.setVisible(false);
        bil1.setVisible(false);
        bil2.setVisible(false);
        bil3.setVisible(false);
        bil4.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
b4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihan = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ket = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        bil2 = new javax.swing.JLabel();
        bil3 = new javax.swing.JLabel();
        bil4 = new javax.swing.JLabel();
        pilihanbil = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        thasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().setLayout(null);

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penjumlahan", "Pengurangan", "Pembagian", "Perkalian" }));
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });
        getContentPane().add(pilihan);
        pilihan.setBounds(212, 106, 141, 32);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(null);

        jLabel4.setText("PROGRAM ARITMATIKA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 30, 220, 40);

        jLabel5.setText("Jenis Aritmatika");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 110, 150, 30);

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setLayout(null);

        jLabel3.setText("Operasi");
        panel.add(jLabel3);
        jLabel3.setBounds(21, 11, 80, 25);
        panel.add(ket);
        ket.setBounds(157, 47, 149, 37);

        jLabel6.setText("Jumlah Bilangan");
        panel.add(jLabel6);
        jLabel6.setBounds(51, 115, 116, 32);

        bil1.setText("Bilangan 1");
        panel.add(bil1);
        bil1.setBounds(50, 153, 116, 30);

        bil2.setText("Bilangan 2");
        panel.add(bil2);
        bil2.setBounds(50, 189, 116, 32);

        bil3.setText("Bilangan 3");
        panel.add(bil3);
        bil3.setBounds(50, 227, 116, 35);

        bil4.setText("Bilangan 4");
        panel.add(bil4);
        bil4.setBounds(50, 271, 116, 31);

        pilihanbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        pilihanbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanbilActionPerformed(evt);
            }
        });
        panel.add(pilihanbil);
        pilihanbil.setBounds(184, 113, 169, 34);
        panel.add(b1);
        b1.setBounds(184, 153, 169, 30);
        panel.add(b2);
        b2.setBounds(184, 189, 169, 32);
        panel.add(b3);
        b3.setBounds(184, 227, 169, 35);
        panel.add(b4);
        b4.setBounds(184, 268, 169, 37);

        button.setText("HITUNG");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        panel.add(button);
        button.setBounds(231, 335, 107, 37);
        panel.add(thasil);
        thasil.setBounds(144, 389, 209, 70);

        jPanel1.add(panel);
        panel.setBounds(50, 180, 460, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 602);

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    
    private void pilihanbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanbilActionPerformed
        getJumlah();
    }//GEN-LAST:event_pilihanbilActionPerformed
public void getJumlah(){
        if(pilihanbil.getSelectedItem().equals("2")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            bil3.setVisible(false);
            bil4.setVisible(false);
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(false);
            b4.setVisible(false);
            jml=2;
        } else if(pilihanbil.getSelectedItem().equals("3")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            bil3.setVisible(true);
            bil4.setVisible(false);
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(false);
            jml=3;
        } else if(pilihanbil.getSelectedItem().equals("4")){
            bil1.setVisible(true);
            bil2.setVisible(true);
            bil3.setVisible(true);
            bil4.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            jml=4;
        }
}
    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
       double hsl = 0.0;
        double a1,a2,a3,a4;
        a1 = Double.parseDouble(b1.getText().toString());
        a2 = Double.parseDouble(b2.getText().toString());
        a3 = Double.parseDouble(b3.getText().toString());
        a4 = Double.parseDouble(b4.getText().toString());
        
        if(jns.equals("Penjumlahan")){
            if(jml==2){
                hsl=a1+a2;
                thasil.setText(a1+" + "+a2+" = "+hsl);
            } 
            if(jml==3){
                hsl=a1+a2+a3;
                thasil.setText(a1+" + "+a2+" + "+a3+" = "+hsl);
            }
            if(jml==4){
                hsl=a1+a2+a3+a4;
                thasil.setText(a1+" + "+a2+" + "+a3+" + "+a4+" = "+hsl);
            }
        } else if(jns.equals("Pengurangan")){
            if(jml==2){
                hsl=a1-a2;
                thasil.setText(a1+" - "+a2+" = "+hsl);
            } 
            if(jml==3){
                hsl=a1-a2-a3;
                thasil.setText(a1+" - "+a2+" - "+a3+" = "+hsl);
            }
            if(jml==4){
                hsl=a1-a2-a3-a4;
                thasil.setText(a1+" - "+a2+" - "+a3+" - "+a4+" = "+hsl);
            }
        } else if(jns.equals("Pembagian")){
            if(jml==2){
                hsl=a1/a2;
                thasil.setText(a1+" / "+a2+" = "+hsl);
            } 
            if(jml==3){
                hsl=a1/a2/a3;
                thasil.setText(a1+" / "+a2+" / "+a3+" = "+hsl);
            }
            if(jml==4){
                hsl=a1/a2/a3/a4;
                thasil.setText(a1+" / "+a2+" / "+a3+" / "+a4+" = "+hsl);
            }   
            } else if(jns.equals("Perkalian")){
            if(jml==2){
                hsl=a1*a2;
                thasil.setText(a1+" * "+a2+" = "+hsl);
            } 
            if(jml==3){
                hsl=a1*a2*a3;
                thasil.setText(a1+" * "+a2+" * "+a3+" = "+hsl);
            }
            if(jml==4){
                hsl=a1*a2*a3*a4;
                thasil.setText(a1+" * "+a2+" * "+a3+" * "+a4+" = "+hsl);
}
    }//GEN-LAST:event_buttonActionPerformed
        }
        
    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:
        setJenis();
    }//GEN-LAST:event_pilihanActionPerformed

    public void setJenis(){
        if(pilihan.getSelectedItem().equals("Penjumlahan")){
            jns="Penjumlahan";
            ket.setText("Penjumlahan");
            panel.setVisible(true);
            pilihanbil.setVisible(true);
        } else if(pilihan.getSelectedItem().equals("Pengurangan")){
            jns="Pengurangan";
            ket.setText("Pengurangan");
            panel.setVisible(true);
            pilihanbil.setVisible(true);
        } else if(pilihan.getSelectedItem().equals("Pembagian")){
            jns="Pembagian";
            ket.setText("Pembagian");
            panel.setVisible(true);
            pilihanbil.setVisible(true);
        } else if(pilihan.getSelectedItem().equals("Perkalian")){
            jns="Perkalian";
            ket.setText("Perkalian");
            panel.setVisible(true);
            pilihanbil.setVisible(true);
        }
}
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
            java.util.logging.Logger.getLogger(ProgramAritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramAritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramAritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramAritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramAritmatika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ket;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JComboBox<String> pilihanbil;
    private javax.swing.JTextField thasil;
    // End of variables declaration//GEN-END:variables
}
