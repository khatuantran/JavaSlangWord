/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dict_19127429;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jame
 */
public class SearchFrame extends javax.swing.JFrame {
    private Slangword slang;
    /**
     * Creates new form SearchFrame
     */
    private DefaultTableModel model;
    public SearchFrame(Slangword slang) {
        this.slang = slang;
        initComponents();
        setTitle("SEARCH");
        setLocationRelativeTo(null);
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col) {
                 return false;
            }
        };
        slangwordList.setModel(model);
        model.setColumnIdentifiers(new Object[]{
            "No", "Slangword", "Definition"
        });
//        slangwordList.setColumnSelectionAllowed(false);
        slangwordList.getColumnModel().getColumn(0).setPreferredWidth(67);
        slangwordList.getColumnModel().getColumn(1).setPreferredWidth(140);
        slangwordList.getColumnModel().getColumn(2).setPreferredWidth(460);
        createTable(slang.getTreeMap());
        
//        slangwordList.setAutoResizeMode(slangwordList.AUTO_RESIZE_LAST_COLUMN);
        setVisible(true);
    }
    
    
    private void createTable(TreeMap<String, Vector<String>> slangword)
    {
        
        model.setRowCount(0);
        Vector<String> key = new Vector<>(slangword.keySet());
        int index = 1;
        for(int i = 0; i < key.size(); i++)
        {
             Vector<String> value = slangword.get(key.get(i));
             for(int j = 0; j < value.size(); j++)
             {
                 model.addRow(new Object[]{
                     index, key.get(i), value.get(j)
                 });
                 index++;
             }
        }
        totalLable.setText("TOTAL: " + String.valueOf(index - 1));
    }
    
    private String getOptionSearch()
    {
        //reference from internet
        String[] choices = { "Search slangword", "Search definition" };
        String input = (String) JOptionPane.showInputDialog(null, "Choose one:",
        "Search option", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[0]); // Initial choice
        return input;
        //reference from internet
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        slangwordList = new javax.swing.JTable();
        searchText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        totalLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        slangwordList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        slangwordList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        slangwordList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(slangwordList);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 204, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SLANGWORD LIST");
        jLabel1.setOpaque(true);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.setPreferredSize(new java.awt.Dimension(102, 22));
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        totalLable.setText("TOTAL: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(totalLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        new MenuFrame(slang);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String text = searchText.getText();      
        if(!text.equals(""))
        {
            String option = getOptionSearch();
            if(option.equals("Search slangword"))
            {
                Vector<String> value = slang.slangwordSearch(text);
                model.setRowCount(0);
                if(value != null)
                {
                    Vector<String> temp = new Vector<>();
                    temp.add(text);
                    slang.addHistory(temp);
                    int index = 1;
                    for(int i = 0; i < value.size(); i++)
                    {
                        model.addRow(new Object[]{
                            index, text, value.get(i)
                        });
                        index++;
                    }
                    totalLable.setText("TOTAL: " + String.valueOf(index - 1));
                }   
            }
            else 
            {
                TreeMap<String, Vector<String>> result = slang.definationSearch(text);
                if(!result.isEmpty())
                {
                    slang.addHistory(new Vector<String>(result.keySet()));
                    createTable(result);                
                }
                else
                {
                    model.setRowCount(0);
                    totalLable.setText("TOTAL: 0");
                }
            }
        }
        else 
        {
            TreeMap<String, Vector<String>> slangword = slang.getTreeMap();
            createTable(slangword);
        }
        
        searchText.setText("");
    }//GEN-LAST:event_searchBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddFrame(slang);
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if(slangwordList.getSelectedRow() != -1)
        {
            int column = 0;
            for(int i = 0; i < 3; i++)
            {
                if(model.getColumnName(i).equals("Slangword"))
                {
                    column = i;
                    break;
                }
            }
            String key = (String)model.getValueAt(slangwordList.getSelectedRow(), column);
            new EditFrame(slang, key);
            this.dispose();
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select slangword !", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        if(slangwordList.getSelectedRow() != -1)
        {
            int choose = JOptionPane.showConfirmDialog(this, "Are you sure delete ?", "DELETE ?", JOptionPane.WARNING_MESSAGE);
            if(0 == choose)
            {
                int column = 0;
                for(int i = 0; i < 3; i++)
                {
                    if(model.getColumnName(i).equals("Slangword"))
                    {
                        column = i;
                        break;
                    }
                }
                String key = (String)model.getValueAt(slangwordList.getSelectedRow(), column);
                slang.getTreeMap().remove(key);
                createTable(slang.getTreeMap());
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select slangword !", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
//            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new SearchFrame().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable slangwordList;
    private javax.swing.JLabel totalLable;
    // End of variables declaration//GEN-END:variables
}
