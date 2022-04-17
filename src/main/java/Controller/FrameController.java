package Controller;

import View.Frames.MainFrame;
import View.Frames.SettingsFrame;

import javax.swing.*;
import java.util.ArrayList;

public class    FrameController {
    MainFrame   mf;
    JFrame      subFrame;

    public FrameController() {
    }

    public void addMainFrame(MainFrame mf) {
        this.mf = mf;
    }

    public void createSettingsFrame(int screenSizeX, int screenSizeY, int insets) {
        this.subFrame = new SettingsFrame(screenSizeX, screenSizeY, insets);
    }
}
