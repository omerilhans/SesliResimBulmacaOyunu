package resimbulma;

import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ResimBulmaOyunu extends javax.swing.JFrame {

    int rndNumber, cnT;
    
    public ResimBulmaOyunu() {
        initComponents();
        setLocationRelativeTo(null);
        yenile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        again = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), null));
        lbl1.setName("0"); // NOI18N
        lbl1.setOpaque(true);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseTikla(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), null));
        lbl2.setName("1"); // NOI18N
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseTikla(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), null));
        lbl3.setName("2"); // NOI18N
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseTikla(evt);
            }
        });

        again.setText("Again ?");
        again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(again, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(again, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseTikla(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseTikla
       JLabel label = (JLabel) evt.getSource();
       
       try 
        {
            InputStream is = this.getClass().getResourceAsStream("/resimbulma/coin.wav");
            DataLine.Info info;
            Clip clip;

            AudioInputStream stream = AudioSystem.getAudioInputStream(is);
            AudioFormat format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
       if(lbl1==label) {
           if(rndNumber == 1) {
               lbl1.setIcon(new ImageIcon(getClass().getResource("/resimbulma/icon.png")));
               JOptionPane.showMessageDialog(null, "Tebrikler");
               return;
           } else {
               lbl1.setIcon(new ImageIcon(getClass().getResource("/resimbulma/yanlis.png")));
           }
       } else if(lbl2==label) {
           if(rndNumber == 2) {
               lbl2.setIcon(new ImageIcon(getClass().getResource("/resimbulma/icon.png")));
               JOptionPane.showMessageDialog(null, "Tebrikler");
               return;
           } else {
               lbl2.setIcon(new ImageIcon(getClass().getResource("/resimbulma/yanlis.png")));
           }
       } else if(lbl3==label) {
           if(rndNumber == 3) {
               lbl3.setIcon(new ImageIcon(getClass().getResource("/resimbulma/icon.png")));
               JOptionPane.showMessageDialog(null, "Tebrikler");
               return;
           } else {
               lbl3.setIcon(new ImageIcon(getClass().getResource("/resimbulma/yanlis.png")));
           }
       }
       cnT++;
       if(cnT==2) {
           JOptionPane.showMessageDialog(null, "Kaybettiniz");
       }
        
    }//GEN-LAST:event_mouseTikla

    private void againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againActionPerformed
       yenile();
    }//GEN-LAST:event_againActionPerformed

    public void yenile() {
        lbl1.setIcon(new ImageIcon(getClass().getResource("/resimbulma/kutu.png")));
        lbl2.setIcon(new ImageIcon(getClass().getResource("/resimbulma/kutu.png")));
        lbl3.setIcon(new ImageIcon(getClass().getResource("/resimbulma/kutu.png")));
        rndNumber = (int) (1 + Math.random() * 3);
        
        cnT=0;
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
            java.util.logging.Logger.getLogger(ResimBulmaOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResimBulmaOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResimBulmaOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResimBulmaOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResimBulmaOyunu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton again;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    // End of variables declaration//GEN-END:variables
}
