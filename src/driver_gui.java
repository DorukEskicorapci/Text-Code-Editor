/**
 *
 * @author doruk
 */
public class driver_gui extends javax.swing.JFrame {

    /**
     * Creates new form writing
     */
    public driver_gui() {
        initComponents();
    }

    
    
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        Button_Bold = new javax.swing.JToggleButton();
        Button_italic = new javax.swing.JToggleButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Button_photo = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        jToolBar1.setRollover(true);

        jLabel1.setText("Font Settings:  ");
        jToolBar1.add(jLabel1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal Text", "Heading 1", "Heading 2", "Heading 3" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox2.setMaximumSize(new java.awt.Dimension(100, 25));
        jComboBox2.setMinimumSize(new java.awt.Dimension(100, 25));
        jComboBox2.setPreferredSize(new java.awt.Dimension(100, 25));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jComboBox2);
        jComboBox2.getAccessibleContext().setAccessibleDescription("");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "12", "16", "20", "24" }));
        jComboBox1.setMaximumSize(new java.awt.Dimension(60, 25));
        jComboBox1.setMinimumSize(new java.awt.Dimension(50, 25));
        jComboBox1.setPreferredSize(new java.awt.Dimension(50, 25));
        jToolBar1.add(jComboBox1);
        jToolBar1.add(jSeparator1);

        Button_Bold.setText("Bold");
        Button_Bold.setFocusable(false);
        Button_Bold.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_Bold.setMaximumSize(new java.awt.Dimension(40, 25));
        Button_Bold.setMinimumSize(new java.awt.Dimension(40, 25));
        Button_Bold.setPreferredSize(new java.awt.Dimension(40, 25));
        Button_Bold.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_Bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BoldActionPerformed(evt);
            }
        });
        jToolBar1.add(Button_Bold);

        Button_italic.setText("Italic");
        Button_italic.setFocusable(false);
        Button_italic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_italic.setMaximumSize(new java.awt.Dimension(40, 25));
        Button_italic.setMinimumSize(new java.awt.Dimension(40, 25));
        Button_italic.setPreferredSize(new java.awt.Dimension(40, 24));
        Button_italic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Button_italic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_italicActionPerformed(evt);
            }
        });
        jToolBar1.add(Button_italic);
        jToolBar1.add(filler1);

        Button_photo.setText("Insert Photo");
        Button_photo.setFocusable(false);
        Button_photo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_photo.setMaximumSize(new java.awt.Dimension(75, 25));
        Button_photo.setMinimumSize(new java.awt.Dimension(75, 25));
        Button_photo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Button_photo);

        jEditorPane2.setEditable(false);
        jScrollPane2.setViewportView(jEditorPane2);

        jTabbedPane2.addTab("tab1", jScrollPane2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setSelectionModel(null);
        jTree1.setShowsRootHandles(true);
        jScrollPane3.setViewportView(jTree1);
        jTree1.getAccessibleContext().setAccessibleName("");

        jMenuBar1.setInheritsPopupMenu(true);

        jMenu2.setText("File");

        jMenu7.setText("Open");
        jMenu2.add(jMenu7);

        jMenu8.setText("Save");
        jMenu2.add(jMenu8);

        jMenu9.setText("Save as");
        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_italicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_italicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_italicActionPerformed

    private void Button_BoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_BoldActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(driver_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(driver_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(driver_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(driver_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new driver_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Button_Bold;
    private javax.swing.JToggleButton Button_italic;
    private javax.swing.JButton Button_photo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
