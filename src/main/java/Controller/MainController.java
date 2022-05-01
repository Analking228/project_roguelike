package Controller;

import View.Frames.MainFrame;

public class                    MainController {
    FrameController             fController;
    SelectionCreationController sCController;
    GameController              gController;

    public  MainController() {
        this.fController = new FrameController();
    }
}
