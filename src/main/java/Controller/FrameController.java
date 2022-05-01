package Controller;

import View.Frames.MainFrame;
import View.Frames.SettingsFrame;
import View.Panels.SelectHeroPanel;
import View.Panels.WelcomePanel;

import javax.swing.*;
import java.awt.*;

public class        FrameController {
    MainFrame       mainFrame;
    private int     frameSizeX = 800;
    private int     frameSizeY = 500;
    private JPanel  activePanel;
    JFrame          settingsFrame;

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
        this.activePanel = new SelectHeroPanel(mainFrame);
        mainFrame.add(this.activePanel, BorderLayout.CENTER);
        mainFrame.invalidate();
        mainFrame.validate();
    }

    public JPanel   getActivePanel() {
        return this.activePanel;
    }
}
