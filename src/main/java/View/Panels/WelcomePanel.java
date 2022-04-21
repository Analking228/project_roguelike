package View.Panels;

import View.Frames.MainFrame;

import javax.swing.*;
import java.awt.*;

public class        WelcomePanel extends JPanel {
    MainFrame       observer;
    private int     frameSizeX;
    private int     frameSizeY;

    public      WelcomePanel(int framesizex, int framesizey, MainFrame observer) {
        this.observer = observer;
        this.frameSizeX = framesizex;
        this.frameSizeY = framesizey;
        this.setLayout(null);
        this.setBackground(Color.lightGray);
        JButton selectHeroBtn = new JButton("Select a Hero");
        selectHeroBtn.addActionListener(e -> this.createSelectHeroPanel());
        selectHeroBtn.setBounds(frameSizeX / 2 - frameSizeX / 4, frameSizeY / 3 - frameSizeY / 8, frameSizeX / 2, frameSizeY / 8);
        this.add(selectHeroBtn);
        JButton settingsBtn = new JButton("Settings");
        settingsBtn.addActionListener(e -> this.createSettingsFrame());
        settingsBtn.setBounds(frameSizeX / 2 - frameSizeX / 4, frameSizeY / 3 * 2 - frameSizeY / 8, frameSizeX / 2, frameSizeY / 8);
        this.add(settingsBtn);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.requestFocus();
    }

    private void    createSettingsFrame() {
        this.observer.createSettingsFrame();
    }

    private void    createSelectHeroPanel() {
        this.observer.createSelectHeroPanel();
    }
}
