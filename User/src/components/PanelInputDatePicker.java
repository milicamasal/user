package components;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class PanelInputDatePicker extends Panel {

    public PanelInputDatePicker() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        datePicker = new datechooser.beans.DateChooserCombo();
        lblFieldText = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        lblFieldText.setText("jLabel1");

        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFieldText, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblFieldText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private datechooser.beans.DateChooserCombo datePicker;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFieldText;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        GregorianCalendar date = (GregorianCalendar) datePicker.getSelectedDate();
        return date;

// Calendar date = datePicker.getSelectedDate();
// return ""+date.DAY_OF_MONTH+"."+ date.MONTH+"."+date.YEAR; vraca 2.1.5??
    }

    @Override
    public void initialize(Object initValue) {

        datePicker.setEnabled(true);
    }

    @Override
    public void setLabels(String lbl, String lblError) {
        lblFieldText.setText(lbl);
        this.lblError.setText(lblError);
    }
}
