package app;

import Controller.FrameController;
import View.Frames.MainFrame;

public class Program {
    public static void  main(String[] args) {
        FrameController frameController = new FrameController();
        frameController.addMainFrame(new MainFrame(frameController));
    }
}
