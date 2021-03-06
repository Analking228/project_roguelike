package Controller;

import Model.HeroClasses.HeroClass;
import View.Frames.MainFrame;
import View.Frames.SettingsFrame;
import View.Panels.*;

import javax.swing.*;
import java.awt.*;

public class        FrameController {
    MainFrame       mainFrame;
    private int     frameSizeX = 750;
    private int     frameSizeY = 500;
    private JPanel  activePanel;
    JFrame          settingsFrame;
    private GameController  gameController;

    public FrameController() {
        this.activePanel = new WelcomePanel(this, frameSizeX, frameSizeY);
        this.mainFrame = new MainFrame(this, frameSizeX, frameSizeY);
    }

    public void createSettingsFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension           dimension = toolkit.getScreenSize();
        this.settingsFrame = new SettingsFrame(dimension.width, dimension.height, mainFrame.getInsets().bottom + mainFrame.getInsets().top);
    }

    public void createSelectionPanel() {
        mainFrame.remove(this.activePanel);
        this.activePanel = new SelectHeroPanel(this);
        mainFrame.add(this.activePanel, BorderLayout.CENTER);
        mainFrame.invalidate();
        mainFrame.validate();
    }

    public void     createGamePanel(HeroClass hero) {
        System.out.println(hero.getName() + ' ' + hero.getTitle() + " is here");
        mainFrame.remove(this.activePanel);
        gameController =  new GameController(hero, frameSizeX / 3 * 2);
        this.activePanel = new GamePanel(this, gameController, hero);
        mainFrame.add(this.activePanel);
//        mainFrame.add(this.gameController.getControlsPanel(), BorderLayout.WEST);
//        mainFrame.add(this.gameController.getGameFieldPanel(), BorderLayout.CENTER);
        mainFrame.invalidate();
        mainFrame.validate();
    }

    public JPanel   newHeroPanel() {
        return new NewHeroPanel(this);
    }

    public JPanel   getActivePanel() {
        return this.activePanel;
    }
}
