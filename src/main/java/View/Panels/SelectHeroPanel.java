package View.Panels;

import View.Frames.MainFrame;
import jakarta.validation.constraints.NotNull;
import javafx.scene.control.TitledPane;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class            SelectHeroPanel extends JPanel {
    MainFrame           observer;

    public              SelectHeroPanel(MainFrame o) {
        this.observer = o;
        String[]        createdHeroes = {"John the Nigger", "Pavel the Greatest", "John the Walker", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus", "Pinus"};
        JList<String>   list = new JList<>(createdHeroes);
        JList<String>   list2 = new JList<>(createdHeroes);
        JScrollPane     scrollPane = new JScrollPane(list);
        JScrollPane     scrollPane2 = new JScrollPane(list2);
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.WEST);
        this.add(scrollPane2, BorderLayout.EAST);
        this.add(createCentralInfoPanel(), BorderLayout.CENTER);
        JPanel          buttonPanel = new JPanel();
        JButton         selectHeroBtn = new JButton("Select Hero");
        JButton         createNewHeroBtn = new JButton("Create new Hero");
        buttonPanel.add(selectHeroBtn);
        buttonPanel.add(createNewHeroBtn);
        this.add(buttonPanel, BorderLayout.SOUTH);

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.requestFocus();
    }

    private JPanel      createCentralInfoPanel() {
        JPanel          heroInfoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        heroInfoPanel.setBorder(new TitledBorder("Hero info"));

        JPanel          namePanel = new JPanel(new GridLayout(2,2));
        JTextField      nameTF = new JTextField("Enter Hero's name");
        JLabel          nameLbl = new JLabel("Name: ");
        JTextField      titleTF = new JTextField("Enter Hero's title");
        JLabel          tittleLbl = new JLabel("Title: ");
        namePanel.add(nameLbl);
        namePanel.add(nameTF);
        namePanel.add(tittleLbl);
        namePanel.add(titleTF);
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 3;
        heroInfoPanel.add(namePanel, c);
        String[]        classes = new String[] {"Warrior", "Thief", "Mage"};
        JComboBox<String>   comboBox = new JComboBox<>(classes);
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        heroInfoPanel.add(comboBox, c);
        JTextArea       classSubscriptionTA = new JTextArea("");
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        heroInfoPanel.add(classSubscriptionTA, c);
        return heroInfoPanel;
    }
}
