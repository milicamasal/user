package view;

public class FrmMain extends javax.swing.JFrame {

    public FrmMain() {
        this.setTitle("Start");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuConfig = new javax.swing.JMenu();
        menuItemCreate = new javax.swing.JMenuItem();
        menuForms = new javax.swing.JMenu();
        menuItemF1 = new javax.swing.JMenuItem();
        menuItemF2 = new javax.swing.JMenuItem();
        menuItemF3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuConfig.setText("Config");

        menuItemCreate.setText("Create");
        menuItemCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCreateActionPerformed(evt);
            }
        });
        menuConfig.add(menuItemCreate);

        jMenuBar1.add(menuConfig);

        menuForms.setText("Forms");

        menuItemF1.setText("F1");
        menuItemF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemF1ActionPerformed(evt);
            }
        });
        menuForms.add(menuItemF1);

        menuItemF2.setText("F2");
        menuItemF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemF2ActionPerformed(evt);
            }
        });
        menuForms.add(menuItemF2);

        menuItemF3.setText("F3");
        menuItemF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemF3ActionPerformed(evt);
            }
        });
        menuForms.add(menuItemF3);

        jMenuBar1.add(menuForms);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemF1ActionPerformed
        FrmForms f = data.Data.getInstance().get("F1");
        f.setTitle("F1");
        f.setVisible(true);
    }//GEN-LAST:event_menuItemF1ActionPerformed

    private void menuItemCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCreateActionPerformed
        FrmConfig form = new FrmConfig();
        form.setVisible(true);
    }//GEN-LAST:event_menuItemCreateActionPerformed

    private void menuItemF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemF2ActionPerformed
        FrmForms f = data.Data.getInstance().get("F2");
        f.setTitle("F2");
        f.setVisible(true);
    }//GEN-LAST:event_menuItemF2ActionPerformed

    private void menuItemF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemF3ActionPerformed
        FrmForms f = data.Data.getInstance().get("F3");
        f.setTitle("F3");
        f.setVisible(true);
    }//GEN-LAST:event_menuItemF3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenu menuForms;
    private javax.swing.JMenuItem menuItemCreate;
    private javax.swing.JMenuItem menuItemF1;
    private javax.swing.JMenuItem menuItemF2;
    private javax.swing.JMenuItem menuItemF3;
    // End of variables declaration//GEN-END:variables
}
