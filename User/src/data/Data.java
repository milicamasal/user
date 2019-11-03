package data;

import components.PanelInputTextField;
import java.util.HashMap;
import view.FrmForms;

public final class Data {

    static HashMap<String, FrmForms> forms;

    public HashMap<String, FrmForms> getForms() {

        return forms;
    }

    public void setForms(HashMap<String, FrmForms> forms) {
        this.forms = forms;
    }

    private Data() {

    }

    public static HashMap<String, FrmForms> getInstance() {
        if (forms == null) {

            forms = new HashMap<>();

        }
        if (!forms.containsKey("F1")) {
            forms.put("F1", new FrmForms(new PanelInputTextField(), new PanelInputTextField()));
        }
        if (!forms.containsKey("F2")) {
            forms.put("F2", new FrmForms(new PanelInputTextField(), new PanelInputTextField()));
        }
        if (!forms.containsKey("F3")) {
            forms.put("F3", new FrmForms(new PanelInputTextField(), new PanelInputTextField()));
        }
        return forms;
    }

}
