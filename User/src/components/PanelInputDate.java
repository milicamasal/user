package components;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelInputDate extends Panel {

    public PanelInputDate() {
        initComponents();
        prepareView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFieldText = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        cbDay = new javax.swing.JComboBox<>();
        cbMonth = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();

        lblFieldText.setText("label");

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("label");

        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFieldText;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        cbDay.removeAllItems();
        cbMonth.removeAllItems();
        cbYear.removeAllItems();
        for (int i = 1; i < 32; i++) {
            cbDay.addItem(i + "");
        }
        for (int i = 1; i < 13; i++) {
            cbMonth.addItem(i + "");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int year = Integer.parseInt(sdf.format(date));
        for (int i = 1950; i <= year; i++) {
            cbYear.addItem(i + "");
        }

    }

    @Override
    public Object getValue() {
        String day = (String) cbDay.getSelectedItem();
        String month = (String) cbMonth.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        try {
            return sdf.parse(day + "." + month + "." + year);
        } catch (ParseException ex) {
            Logger.getLogger(PanelInputDate.class.getName()).log(Level.SEVERE, null, ex);
            return "n/a";
        }
    }

    public javax.swing.JLabel getLblError() {
        return lblError;
    }

    public javax.swing.JLabel getLblFieldText() {
        return lblFieldText;
    }

    @Override
    public void initialize(Object initValue) {
        cbYear.removeAllItems();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int year = Integer.parseInt(sdf.format(date));
        int startYear = Integer.parseInt((String) initValue);
        for (int i = startYear; i <= year; i++) {
            cbYear.addItem(i + "");
        }
    }

    @Override
    public void setLabels(String lbl, String lblError) {
        lblFieldText.setText(lbl);
        this.lblError.setText(lblError);
    }
}
