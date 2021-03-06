package Controller;

import Model.HeroClasses.HeroClass;
import View.Panels.ControlsPanel;
import View.Panels.GameFieldPanel;

public class        GameController {
    HeroClass       hero;
    GameFieldPanel  gameFieldPanel;
    ControlsPanel   controlsPanel;

    public      GameController(HeroClass hero, int fieldSize) {
        this.hero = hero;
        this.gameFieldPanel = new GameFieldPanel(500, new MovingDir());
        this.controlsPanel = new ControlsPanel(this, hero);
    }

    public GameFieldPanel getGameFieldPanel() {
        return this.gameFieldPanel;
    }

    public ControlsPanel getControlsPanel() {
        return controlsPanel;
    }
}
