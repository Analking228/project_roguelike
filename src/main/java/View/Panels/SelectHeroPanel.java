package View.Panels;

import View.Frames.MainFrame;

import javax.swing.*;
import java.awt.*;

public class            SelectHeroPanel extends JPanel {
    MainFrame           observer;

    public              SelectHeroPanel(MainFrame o) {
        this.observer = o;
        String[]        createdHeroes = {"John the Nigger", "Pavel the Greatest", "John the Walker", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus"};
        JList<String>   list = new JList<>(createdHeroes);
        JScrollPane     scrollPane = new JScrollPane(list);
        JScrollPane     scrollPane2 = new JScrollPane(list);
        this.add(scrollPane, BorderLayout.WEST);
        this.add(scrollPane2, BorderLayout.EAST);

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.requestFocus();
    }
}
