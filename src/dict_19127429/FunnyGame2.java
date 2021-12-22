/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dict_19127429;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jame
 */
public class FunnyGame2 extends javax.swing.JFrame {
    private Slangword slang;
    private String question;
    private String correctAnswer;
    private String correctChar;
    int correctIndex;
    /**
     * Creates new form FunnyGame1
     */
    public FunnyGame2(Slangword slang) {
        initComponents();
        this.slang = slang;
        setLocationRelativeTo(null);
        setTitle("FUNNY GAME 1");
        
        randomDefinition();
        setVisible(true);
    }
    private String randomKey()
    {
        Vector<String> key = new Vector<>(slang.getTreeMap().keySet());
        int randomIndex = ThreadLocalRandom.current().nextInt(0, key.size()); 
        return key.get(randomIndex);
    }
    
    private void setIncorrectAnswer(int index, String answer)
    {
        switch (index) 
        {
            case  0:
                aBtn.setText("A. " + answer);
                break;
            case  1:
                bBtn.setText("B. " + answer);
                break;
            case  2:
                cBtn.setText("C. " + answer);
                break;
            case  3:
                dBtn.setText("D. " + answer);
                break;
            default:
                break;
        }
    }
    
    private void randomSlangword()
    {
        correctLabel.setText("");
        aBtn.setEnabled(true);
        bBtn.setEnabled(true);
        cBtn.setEnabled(true);
        dBtn.setEnabled(true);
        question = randomKey();
        questionLabel.setText("Question: Where is the correct slangword of " + "\"" + question + "\"");
        Vector<String> value = (Vector<String>)slang.getTreeMap().get(question);
        int randomIndex = ThreadLocalRandom.current().nextInt(0, value.size()); 
        correctAnswer = value.get(randomIndex);
        
        correctIndex = ThreadLocalRandom.current().nextInt(0, 4); // A B C D
        System.out.println(correctIndex);
        if(correctIndex == 0)
        {
            aBtn.setText("A. " + correctAnswer);
            correctChar = "A. ";
        } 
        else if(correctIndex == 1)
        {
            bBtn.setText("B. " + correctAnswer);
            correctChar = "B. ";
        }
        else if(correctIndex == 2)
        {
            cBtn.setText("C. " + correctAnswer);
            correctChar = "C. ";
        }
        else if(correctIndex == 3)
        {
            dBtn.setText("D. " + correctAnswer);
            correctChar = "D. ";
        }
        
        Vector<String> inCorrectQuestion = new Vector<>();
        inCorrectQuestion.add(question);
        for(int i = 0; i < 4; i++)
        {
            if(i != correctIndex)
            {
                String invalidKey = randomKey();
//                Vector<String> incorrectAnswer = (Vector<String>)slang.getTreeMap().get(question);
//                int randomIndexInvalid = ThreadLocalRandom.current().nextInt(0, value.size());
//                String incorrectLabel = incorrectAnswer.get(randomIndexInvalid);
                while(inCorrectQuestion.contains(invalidKey))
                {
                    invalidKey = randomKey();
                    
                }
                inCorrectQuestion.add(invalidKey);
                Vector<String> incorrectAnswer = (Vector<String>)slang.getTreeMap().get(invalidKey);
                int randomIndexInvalid = ThreadLocalRandom.current().nextInt(0, incorrectAnswer.size());
                String incorrectDefinition = incorrectAnswer.get(randomIndexInvalid);
                setIncorrectAnswer(i, incorrectDefinition);
            }
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

        aBtn = new javax.swing.JButton();
        bBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        dBtn = new javax.swing.JButton();
        newQuestionBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        correctLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        aBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aBtnActionPerformed(evt);
            }
        });

        bBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBtnActionPerformed(evt);
            }
        });

        cBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });

        dBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });

        newQuestionBtn.setText("New question");
        newQuestionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newQuestionBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        correctLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correctLabel.setForeground(new java.awt.Color(255, 0, 51));
        correctLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        correctLabel.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNNY GAME 1");
        jLabel1.setOpaque(true);

        questionLabel.setForeground(new java.awt.Color(255, 0, 0));
        questionLabel.setOpaque(true);

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
                            .addComponent(dBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(newQuestionBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(correctLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(dBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correctLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newQuestionBtn)
                    .addComponent(backBtn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aBtnActionPerformed
        // TODO add your handling code here:
        bBtn.setEnabled(false);
        cBtn.setEnabled(false);
        dBtn.setEnabled(false);
        String answer = aBtn.getText().substring(3);
        String myAnswer = "The correct Answer is " + correctChar;
        if(answer.equals(correctAnswer))
        {
            myAnswer = "Congratulation, this is corect answer";

        }
        correctLabel.setText(myAnswer);
    }//GEN-LAST:event_aBtnActionPerformed

    private void bBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBtnActionPerformed
        // TODO add your handling code here:
        aBtn.setEnabled(false);
        cBtn.setEnabled(false);
        dBtn.setEnabled(false);
        String answer = bBtn.getText().substring(3);
        String myAnswer = "The correct Answer is " + correctChar;
        if(answer.equals(correctAnswer))
        {
            myAnswer = "Congratulation, this is corect answer";

        }
        correctLabel.setText(myAnswer);
    }//GEN-LAST:event_bBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        // TODO add your handling code here:
        bBtn.setEnabled(false);
        aBtn.setEnabled(false);
        dBtn.setEnabled(false);
        String answer = cBtn.getText().substring(3);
        String myAnswer = "The correct Answer is " + correctChar;
        if(answer.equals(correctAnswer))
        {
            myAnswer = "Congratulation, this is corect answer";

        }
        correctLabel.setText(myAnswer);
    }//GEN-LAST:event_cBtnActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        // TODO add your handling code here:
        bBtn.setEnabled(false);
        cBtn.setEnabled(false);
        aBtn.setEnabled(false);
        String answer = dBtn.getText().substring(3);
        String myAnswer = "The correct Answer is " + correctChar;
        if(answer.equals(correctAnswer))
        {
            myAnswer = "Congratulation, this is corect answer";

        }
        correctLabel.setText(myAnswer);
    }//GEN-LAST:event_dBtnActionPerformed

    private void newQuestionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newQuestionBtnActionPerformed
        // TODO add your handling code here:
        randomSlangword();
    }//GEN-LAST:event_newQuestionBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuFrame(slang);
    }//GEN-LAST:event_backBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        slang.writeFile();
    }//GEN-LAST:event_formWindowClosing

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
//            java.util.logging.Logger.getLogger(FunnyGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FunnyGame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FunnyGame2().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aBtn;
    private javax.swing.JButton bBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cBtn;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JButton dBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newQuestionBtn;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables
}