package View.Frames;

import javax.swing.*;
import java.awt.*;

public class        MainFrame extends JFrame {
    private int     frameSizeX = 500;
    private int     frameSizeY = 500;

    public          MainFrame() {
        super("Swingy Roguelike");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit     toolkit = Toolkit.getDefaultToolkit();
        Dimension   dimension = toolkit.getScreenSize();
        this.frameSizeX += this.getInsets().left + this.getInsets().right;
        this.frameSizeY += this.getInsets().top + this.getInsets().bottom;
        this.setSize(frameSizeX, frameSizeY);
        this.setLocation(dimension.width / 2 - frameSizeX / 2, dimension.height / 2 - frameSizeY / 2);
        this.setResizable(false);
        this.setVisible(true);
    }

    public int getFrameSizeX() {
        return frameSizeX;
    }

    public int getFrameSizeY() {
        return frameSizeY;
    }
}
