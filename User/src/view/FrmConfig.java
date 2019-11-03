package view;

import data.Data;
import components.Panel;
import components.PanelInputComboBox;
import components.PanelInputDate;
import components.PanelInputDatePicker;
import components.PanelInputRadioButton;
import components.PanelInputTextField;
import java.util.Arrays;
import java.util.List;

public class FrmConfig extends javax.swing.JFrame {

    public FrmConfig() {
        this.setTitle("Configuration");
        initComponents();
        prepareView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInputComboBoxForms = new components.PanelInputComboBox();
        panelInputComboBoxGender = new components.PanelInputComboBox();
        panelInputComboBoxDate = new components.PanelInputComboBox();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelInputComboBoxForms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelInputComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelInputComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInputComboBoxForms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInputComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInputComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSubmit)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String formType = (String) panelInputComboBoxForms.getValue();
        String genderType = (String) panelInputComboBoxGender.getValue();
        String dateType = (String) panelInputComboBoxDate.getValue();
        Panel gender = new PanelInputTextField();
        Panel date = new PanelInputTextField();
        System.out.println(dateType + genderType);

        if (genderType.equals("TextField")) {
            gender = new PanelInputTextField();
        }
        if (genderType.equals("RadioButton")) {
            gender = new PanelInputRadioButton();
        }
        if (genderType.equals("ComboBox")) {
            gender = new PanelInputComboBox();
        }

        if (dateType.equals("TextField")) {
            date = new PanelInputTextField();
        }
        if (dateType.equals("DatePicker")) {
            date = new PanelInputDatePicker();
        }
        if (dateType.equals("3 ComboBoxes")) {
            date = new PanelInputDate();
        }

        FrmForms f = new FrmForms(gender, date);
        Data.getInstance().put(formType, f);
        this.dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private components.PanelInputComboBox panelInputComboBoxDate;
    private components.PanelInputComboBox panelInputComboBoxForms;
    private components.PanelInputComboBox panelInputComboBoxGender;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        panelInputComboBoxForms.setLabels("Form Mode:", "");
        String[] values = new String[]{"F1", "F2", "F3"};
        List<String> items = Arrays.asList(values);
        panelInputComboBoxForms.initialize(items);

        panelInputComboBoxGender.setLabels("Gender Input Type:", "");
        values = new String[]{"TextField", "RadioButton", "ComboBox"};
        items = Arrays.asList(values);
        panelInputComboBoxGender.initialize(items);

        panelInputComboBoxDate.setLabels("Date Input Type:", "");
        values = new String[]{"TextField", "DatePicker", "3 ComboBoxes"};
        items = Arrays.asList(values);
        panelInputComboBoxDate.initialize(items);

    }
}
