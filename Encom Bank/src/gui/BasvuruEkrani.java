/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author mertf
 */
public class BasvuruEkrani extends javax.swing.JFrame {

    /**
     * Creates new form BasvuruEkrani
     */
    public BasvuruEkrani() {
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

        basvuruEkraniPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        guvenlikBilgileriLabel = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telNoText = new javax.swing.JTextField();
        telNoLabel = new javax.swing.JLabel();
        kisiselBilgilerLabel1 = new javax.swing.JLabel();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encom Bank Register Page");
        setPreferredSize(new java.awt.Dimension(684, 414));

        basvuruEkraniPanel.setBackground(new java.awt.Color(153, 204, 255));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Name & Surname :");

        guvenlikBilgileriLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        guvenlikBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgileriLabel.setText("Security Informations");

        adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("TC Identity :");

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        telNoLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Phone Number :");

        kisiselBilgilerLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel1.setText("Personal Informations");

        guvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Security Question :");

        guvenlikSorusu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(kisiselBilgilerLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(guvenlikBilgileriLabel)
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adSoyadLabel)
                                    .addComponent(tcNoLabel))
                                .addGap(18, 18, 18)
                                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tcNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(adSoyadText)))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(telNoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(guvenlikSorusuLabel)
                                .addGap(18, 18, 18)
                                .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134))))
        );
        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(guvenlikBilgileriLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adSoyadLabel, adSoyadText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel guvenlikBilgileriLabel;
    private javax.swing.JComboBox guvenlikSorusu;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgilerLabel1;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
