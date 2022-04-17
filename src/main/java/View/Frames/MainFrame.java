package View.Frames;

import Controller.FrameController;
import View.Panels.WelcomePanel;

import javax.swing.*;
import java.awt.*;

public class                MainFrame extends JFrame {

    private FrameController frameController;
    private int             frameSizeX = 800;
    private int             frameSizeY = 500;

    public                  MainFrame(FrameController fc) {
        super("Swingy Roguelike");
        this.frameController = fc;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit             toolkit = Toolkit.getDefaultToolkit();
        Dimension           dimension = toolkit.getScreenSize();
        int                 borderSizeX = this.frameSizeX + this.getInsets().left + this.getInsets().right;
        int                 borderSizeY = this.frameSizeY + this.getInsets().top + this.getInsets().bottom;
        this.setSize(borderSizeX, borderSizeY);
        this.setLocation(dimension.width / 2 - borderSizeX / 2, dimension.height / 2 - borderSizeY / 2);
        this.setResizable(false);
        this.add(new WelcomePanel(frameSizeX, frameSizeY, this));
        this.setVisible(true);
    }

    public void             createSettingsFrame() {
        Toolkit             toolkit = Toolkit.getDefaultToolkit();
        Dimension           dimension = toolkit.getScreenSize();
        this.frameController.createSettingsFrame(dimension.width, dimension.height, this.getInsets().bottom + this.getInsets().top);
    }

    public int      getFrameSizeX() {
        return frameSizeX;
    }

    public int      getFrameSizeY() {
        return frameSizeY;
    }

    public void     setFrameSizeX(int x) {
        this.frameSizeX = x;
    }

    public void     setFrameSizeY(int y) {
        this.frameSizeY = y;
    }
}
