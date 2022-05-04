package Controller;

import Model.HeroClasses.HeroClass;
import View.Panels.ControlsPanel;
import View.Panels.FieldPanel;

import javax.swing.*;

public class        GameController {
    HeroClass       hero;
    FieldPanel      fieldPanel;
    ControlsPanel   controlsPanel;

    public      GameController(HeroClass hero) {

    }

    public FieldPanel getFieldPanel() {
        return fieldPanel;
    }

    public void setFieldPanel(FieldPanel fieldPanel) {
        this.fieldPanel = fieldPanel;
    }

    public ControlsPanel getControlsPanel() {
        return controlsPanel;
    }

    public void setControlsPanel(ControlsPanel controlsPanel) {
        this.controlsPanel = controlsPanel;
    }
}
