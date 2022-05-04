package View.Panels;

import Controller.FrameController;
import Controller.GameController;

import javax.swing.*;
import java.awt.*;

public class        GamePanel extends JPanel {
    FrameController observer;
    GameController  gameController;

    public          GamePanel(FrameController observer, GameController gameController) {
        this.observer = observer;
        this.setLayout(new GridLayout(0,2));
    }
}
