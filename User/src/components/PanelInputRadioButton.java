package components;

import java.util.List;
import javax.swing.ButtonGroup;

public class PanelInputRadioButton extends Panel {

    public PanelInputRadioButton() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFieldText = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        lblError = new javax.swing.JLabel();

        lblFieldText.setText("jLabel1");

        rbtnMale.setText("jRadioButton1");

        rbtnFemale.setText("jRadioButton2");

        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFieldText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(rbtnMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnFemale)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFieldText)
                    .addComponent(rbtnMale)
                    .addComponent(rbtnFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFieldText;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    // End of variables declaration//GEN-END:variables

    @Override
    public Object getValue() {
        if (rbtnFemale.isSelected()) {
            return rbtnFemale.getText();
        }
        return rbtnMale.getText();
    }

    @Override
    public void initialize(Object initValue) {
        ButtonGroup group = new ButtonGroup();
        group.add(rbtnMale);
        group.add(rbtnFemale);
        List<Object> values = (List<Object>) initValue;
        rbtnMale.setText("" + values.get(0));
        rbtnFemale.setText("" + values.get(1));
        rbtnMale.setSelected(true);

    }

    @Override
    public void setLabels(String lbl, String lblError) {
        lblFieldText.setText(lbl);
        this.lblError.setText(lblError);

    }
}
