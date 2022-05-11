package View.Panels;

import Controller.FrameController;
import Controller.GameController;
import Model.HeroClasses.HeroClass;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private FrameController observer;
    private GameController  gameController;
    private HeroClass       hero;

    public GamePanel(FrameController observer, GameController gameController, HeroClass hero) {
        this.observer = observer;
        this.gameController = gameController;
        this.hero = hero;
        setLayout(new BorderLayout());
        add(gameController.getControlsPanel(), BorderLayout.WEST);
        add(gameController.getGameFieldPanel(), BorderLayout.CENTER);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.requestFocus();
    }
}
