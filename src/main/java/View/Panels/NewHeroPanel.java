package View.Panels;

import Controller.FrameController;
import Model.HeroClasses.HeroClass;
import Model.HeroClasses.HeroFactory;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class                    NewHeroPanel extends JPanel implements ActionListener {
    FrameController             observer;
    private JTextField          nameTF;
    private JTextField          titleTF;
    private JComboBox<String>   classComboBox;
    private JTextArea           classDescTA;
    private JButton             createNewHeroBtn;

    public NewHeroPanel(FrameController           observer) {
        this.observer = observer;
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.setBorder(new TitledBorder("Hero info"));

        JPanel          namePanel = new JPanel(new GridLayout(2,2));
        this.nameTF = new JTextField("Enter Hero's name");
        this.nameTF.addCaretListener(e -> clearTF(this.nameTF));
        JLabel          nameLbl = new JLabel("Name: ");
        this.titleTF = new JTextField("Enter Hero's title");
        this.titleTF.addCaretListener(e -> clearTF(this.titleTF));
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
        this.classComboBox.addActionListener(this);
        c.gridx = 1;
        c.gridy = 1;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(this.classComboBox, c);
        JPanel      textAreaButtonPanel = new JPanel();
        textAreaButtonPanel.setLayout(new BoxLayout(textAreaButtonPanel, BoxLayout.Y_AXIS));
        this.createNewHeroBtn = new JButton("Create new Hero");
        this.classDescTA = new JTextArea(HeroClass.getClassDesc(HeroClass.WARRIOR));
        this.classDescTA.setEditable(false);
        textAreaButtonPanel.add(classDescTA);
        textAreaButtonPanel.add(createNewHeroBtn);
        c.gridx = 1;
        c.gridy = 2;
        c.gridheight = 1;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.BOTH;
        this.add(textAreaButtonPanel, c);
    }

    private void clearTF(JTextField tf) {
        if (tf.getText().equals("Enter Hero's name") || tf.getText().equals("Enter Hero's title"))
        tf.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.classComboBox) {
            if (Objects.equals(classComboBox.getSelectedItem(), new String("Warrior")))
                this.classDescTA.setText(HeroClass.getClassDesc(HeroClass.WARRIOR));
            else
                this.classDescTA.setText(HeroClass.getClassDesc(HeroClass.ROGUE));
        }
        if (e.getSource() == this.createNewHeroBtn) {
            observer.createGamePanel(HeroFactory.newHero(this.nameTF.getText(), this.titleTF.getText(), null));
        }
    }
}
