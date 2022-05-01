package View.Frames;

import Controller.FrameController;
import View.Panels.SelectHeroPanel;
import View.Panels.WelcomePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class                MainFrame extends JFrame {

    private final FrameController frameController;

    public MainFrame(FrameController fc, int frameSizeX, int frameSizeY) {
        super("Swingy Roguelike");
        this.frameController = fc;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int borderSizeX = frameSizeX + this.getInsets().left + this.getInsets().right;
        int borderSizeY = frameSizeY + this.getInsets().top + this.getInsets().bottom;
        this.setSize(borderSizeX, borderSizeY);
        this.setLocation(dimension.width / 2 - borderSizeX / 2, dimension.height / 2 - borderSizeY / 2);
        this.add(frameController.getActivePanel(), BorderLayout.CENTER);
        this.setResizable(false);
        this.setVisible(true);
    }
}
