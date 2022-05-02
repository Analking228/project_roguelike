package View.Panels;

import Controller.FrameController;
import View.Frames.MainFrame;
import jakarta.validation.constraints.NotNull;
import javafx.scene.control.TitledPane;
import jdk.jfr.internal.tool.Main;

import javax.swing.*;
import java.awt.*;

public class            SelectHeroPanel extends JPanel {
    FrameController     observer;

    public              SelectHeroPanel(FrameController o) {
        this.observer = o;
        String[]        createdHeroes = {"John the Nigger", "Pavel the Greatest", "John the Walker", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus"};
        JList<String>   list = new JList<>(createdHeroes);
        JList<String>   list2 = new JList<>(createdHeroes);
        JScrollPane     scrollPane = new JScrollPane(list);
        JScrollPane     scrollPane2 = new JScrollPane(list2);
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.WEST);
        this.add(scrollPane2, BorderLayout.EAST);
        this.add(this.observer.newHeroPanel(), BorderLayout.CENTER);
        JPanel          buttonPanel = new JPanel();
        JButton         selectHeroBtn = new JButton("Select Hero");
        buttonPanel.add(selectHeroBtn);
        this.add(buttonPanel, BorderLayout.SOUTH);

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.requestFocus();
    }
}
