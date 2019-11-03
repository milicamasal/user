/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JPanel;

/**
 *
 * @author Milica i Nikola
 */
public abstract class Panel extends JPanel {
    public abstract Object getValue();
    public abstract void initialize(Object initValue);
    public  abstract void setLabels(String lbl, String lblError);
}
