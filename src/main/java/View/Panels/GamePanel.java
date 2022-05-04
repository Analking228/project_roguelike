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
        this.gameController = gameController;
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 3;
        c.anchor = GridBagConstraints.WEST;
        this.add(gameController.getControlsPanel(), c);
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 3;
        c.gridwidth = 2;
        this.add(gameController.getGameFieldPanel(), c);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.requestFocus();
    }
}
