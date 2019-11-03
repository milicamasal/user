package components;

import java.util.List;

public class PanelInputComboBox extends Panel {

    public PanelInputComboBox() {
        initComponents();
        prepareView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFieldText = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        cbField = new javax.swing.JComboBox<>();

        lblFieldText.setText("label");

        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setText("label");

        cbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFieldText, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbField;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFieldText;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        cbField.removeAllItems();
    }

    @Override
    public Object getValue() {
        return cbField.getSelectedItem();
    }

    @Override
    public void initialize(Object initValue) {
        List<Object> values = (List<Object>) initValue;
        for (Object value : values) {
            cbField.addItem(value);
        }
    }

    public javax.swing.JLabel getLblError() {
        return lblError;
    }

    public javax.swing.JLabel getLblFieldText() {
        return lblFieldText;
    }

    @Override
    public void setLabels(String lbl, String lblError) {
        lblFieldText.setText(lbl);
        this.lblError.setText(lblError);
    }

}
