package View.Frames;

import javax.swing.*;
import java.awt.*;

public class SettingsFrame extends JFrame {

    public SettingsFrame(int screenSizeX, int screenSizeY, int insets) {
        super("Set window size");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setBackground(Color.lightGray);
        this.setResizable(false);
        this.setSize(320, 50 + insets);
        JTextField settingsTF = new JTextField();
        settingsTF.setPreferredSize(new Dimension(250, 30));
        settingsTF.setLocation(5, 10);
        Font font = new Font(Font.SERIF, Font.PLAIN, 18);
        settingsTF.setFont(font);
        this.add(settingsTF);
        JButton     enterBtn = new JButton("Enter");
        enterBtn.setSize(new Dimension(50, 30));
        enterBtn.setLocation(320 - 50 - 5, 10);
        this.add(enterBtn);
        this.setLocation(screenSizeX / 2 - 320 / 2, screenSizeY / 2 - 50);
        this.setVisible(true);
        this.requestFocus();
        this.setFocusable(true);
    }
}
