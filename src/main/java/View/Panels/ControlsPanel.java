package View.Panels;

import Controller.GameController;
import Model.HeroClasses.HeroClass;

import javax.swing.*;
import java.awt.*;

public class ControlsPanel extends JPanel {
    private GameController  gameController;
    private HeroClass   hero;
    private JTextField  nameAndTitleTF;
    private JTextField  levelTF;
    private JTextField  xpTF;
    private JTextField  hpTF;
    private JTextField  attackTF;
    private JTextField  defenseTF;

    public      ControlsPanel(GameController gameController, HeroClass hero) {
        this.gameController = gameController;
        this.hero = hero;
        this.setLayout(new GridLayout(2, 0));
        this.add(labelPanel());
        this.add(movementPanel());
    }

    private JPanel  movementPanel() {
        JPanel movementPanel = new JPanel();
        movementPanel.setLayout(new BoxLayout(movementPanel, BoxLayout.Y_AXIS));
        String[] move = {"Up", "Left", "Down", "Right"};
        JLabel directionLbl = new JLabel("movement direction");
        movementPanel.add(directionLbl);
        JComboBox<String> directionCb = new JComboBox<>(move);
        movementPanel.add(directionCb);
        JButton turnBtn = new JButton("make a turn");
        movementPanel.add(turnBtn);
        return movementPanel;
    }

    private JPanel  labelPanel() {
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        nameAndTitleTF = new JTextField(hero.getName() + " " + hero.getTitle());
        labelPanel.add(nameAndTitleTF);
        JLabel  levelLlb = new JLabel("level: ");
        levelTF = new JTextField(hero.getLevel());
        labelPanel.add(groupObjects(levelLlb, levelTF));
        JLabel  xpLlb = new JLabel("xp: ");
        xpTF = new JTextField(hero.getXp());
        labelPanel.add(groupObjects(levelLlb, xpTF));
        JLabel  hpLlb = new JLabel("hp: ");
        hpTF = new JTextField(hero.getHp());
        labelPanel.add(groupObjects(levelLlb, hpTF));
        JLabel  attackLlb = new JLabel("attack: ");
        attackTF = new JTextField(hero.getAttack());
        labelPanel.add(groupObjects(levelLlb, attackTF));
        JLabel  defenseLlb = new JLabel("defense: ");
        defenseTF = new JTextField(hero.getDefense());
        labelPanel.add(groupObjects(levelLlb, defenseTF));
        return labelPanel;
    }

    private JPanel  groupObjects(Component comp1, Component comp2) {
        JPanel      groupPanel = new JPanel(new FlowLayout());
        groupPanel.add(comp1);
        groupPanel.add(comp2);
        return groupPanel;
    }
}
