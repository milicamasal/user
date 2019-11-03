package view;

import components.Panel;
import components.PanelInputTextField;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmForms extends JFrame {

    PanelInputTextField first = new PanelInputTextField();
    ;
    PanelInputTextField second = new PanelInputTextField();
    ;
    Panel third = new PanelInputTextField();
    Panel fourth = new PanelInputTextField();

    JButton btnSave = new JButton("Save");

    public FrmForms() {
    }

    public FrmForms(Panel third, Panel fourth) {//ime i prezime uvek textField
        first = new PanelInputTextField();
        second = new PanelInputTextField();
        this.third = third;
        this.fourth = fourth;
        List<String> genders = Arrays.asList("male", "female");
        if (third instanceof PanelInputTextField) {
            third.initialize("");
        } else {
            third.initialize(genders);
        }
        prepareView();
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int f = 0;
                first.setLabels("First name:", "");
                second.setLabels("Last name:", "");
                third.setLabels("Gender", "");
                fourth.setLabels("Date of birth", "");

                if (first.getValue().toString().isEmpty()) {
                    first.setLabels("First name:", "Enter first name!");
                    f = 1;
                }

                if (second.getValue().toString().isEmpty()) {
                    second.setLabels("Last name:", "Enter last name!");
                    f = 1;
                }

                if (fourth instanceof PanelInputTextField) {
                    fourth.setLabels("Date of birth", "Format must be: 31.12.2019");
                }
                if (third instanceof PanelInputTextField && !third.getValue().equals("male") && !third.getValue().equals("female")) {
                    third.setLabels("Gender", "Gender must be male or female!");
                    f = 1;
                }
                if (fourth instanceof PanelInputTextField) {
                    String input = fourth.getValue().toString();

                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

                    java.util.Date textFieldAsDate = null;
                    try {
                        if (input.length() != 10) {
                            f = 1;
                        }
                        if (!input.matches("[0-3][0-9].[01][0-9].[12][0-9][0-9][0-9]")) {
                            f = 1;
                        }
                        textFieldAsDate = sdf.parse(input);
                    } catch (ParseException ex) {
                        fourth.setLabels("Date of birth", "Format must be: 31.12.2019");
                        f = 1;
                    }

                }
                if (f == 0) {
                    fourth.setLabels("Date of birth", "");
                    JDialog dialog = new JDialog();
                    JLabel label = new JLabel("First Name" + first.getValue() + "    Last name:" + second.getValue() + "    Gender:" + third.getValue() + "   Date of birth:" + fourth.getValue());
                    dialog.setPreferredSize(new Dimension(600, 200));
                    dialog.pack();
                    dialog.getContentPane().add(label);
                    dialog.setVisible(true);
                }
            }
        });
    }

    private void prepareView() {
        GridBagLayout grid = new GridBagLayout();
        this.setLayout(grid);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.1;
        gbc.gridwidth = 2;
        first.setLabels("First name:", "");
        getContentPane().add(first, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.1;
        gbc.gridwidth = 2;
        second.setLabels("Last name:", "");
        getContentPane().add(second, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.ipadx = 1;
        gbc.gridwidth = 2;
        third.setLabels("Gender", "");
        if (third != null) {
            getContentPane().add(third, gbc);
        }

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        fourth.setLabels("Date of birth", "");
        if (fourth != null) {
            getContentPane().add(fourth, gbc);
        }

        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.weightx = 0.1;
        gbc.gridwidth = 1;

        getContentPane().add(btnSave, gbc);
        if (fourth instanceof PanelInputTextField) {
            fourth.setLabels("Date of birth", "Format must be: 31.12.2019");
        }
        pack();

    }

}
