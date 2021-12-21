/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dict_19127429;

import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jame
 */
public class FunnyGame1 extends javax.swing.JFrame {
    Slangword slang;
    String question;
    String correctAnswer;
    /**
     * Creates new form FunnyGame1
     */
    public FunnyGame1(Slangword slang) {
        initComponents();
        this.slang = slang;
        setLocationRelativeTo(null);
        setTitle("RANDOM SLANGWORD");
        
        randomSlangword();
        setVisible(true);
    }
    private String randomKey()
    {
        Vector<String> key = new Vector<>(slang.getTreeMap().keySet());
        int randomIndex = ThreadLocalRandom.current().nextInt(0, key.size()); 
        return key.get(randomIndex);
    }
    
//    private String randomDefinition()
//    {
//        
//    }
    private void randomSlangword()
    {
        question = randomKey();
        questionLabel.setText("Question: " + question);
        Vector<String> value = (Vector<String>)slang.getTreeMap().get(question);
        int randomIndex = ThreadLocalRandom.current().nextInt(0, value.size()); 
        correctAnswer = value.get(randomIndex);
        
        randomIndex = ThreadLocalRandom.current().nextInt(0, value.size());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        aBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        newQuestionBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        correctLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNNY GAME 1");
        jLabel1.setOpaque(true);

        questionLabel.setForeground(new java.awt.Color(255, 0, 0));
        questionLabel.setOpaque(true);

        aBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aBtn.setLabel("");

        bBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bBtn.setLabel("");
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });

        cBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setLabel("");

        newQuestionBtn.setText("New question");
        newQuestionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newQuestionBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");

        correctLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correctLabel.setForeground(new java.awt.Color(255, 0, 51));
        correctLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        correctLabel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(correctLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(newQuestionBtn)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correctLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newQuestionBtn)
                    .addComponent(backBtn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bBtnActionPerformed

    private void newQuestionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newQuestionBtnActionPerformed
        // TODO add your handling code here:
        System.out.println(ThreadLocalRandom.current().nextInt(0, 1));
    }//GEN-LAST:event_newQuestionBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FunnyGame1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cBtn;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newQuestionBtn;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables
}
