package View.Panels;

import View.Frames.MainFrame;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class            NewHeroPanel extends JPanel {
    JTextField          nameTF;
    JTextField          titleTF;
    JComboBox<String>   classComboBox;

    public NewHeroPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.setBorder(new TitledBorder("Hero info"));

        JPanel          namePanel = new JPanel(new GridLayout(2,2));
        this.nameTF = new JTextField("Enter Hero's name");
        JLabel          nameLbl = new JLabel("Name: ");
        this.titleTF = new JTextField("Enter Hero's title");
        JLabel          tittleLbl = new JLabel("Title: ");
        namePanel.add(nameLbl);
        namePanel.add(nameTF);
        namePanel.add(tittleLbl);
        namePanel.add(titleTF);
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = 3;
        this.add(namePanel, c);
        String[]        classes = new String[] {"Warrior", "Thief", "Mage"};
        this.classComboBox = new JComboBox<>(classes);
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.classComboBox, c);
        JTextArea       classSubscriptionTA = new JTextArea("");
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        this.add(classSubscriptionTA, c);
    }
}
