package View.Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsFrame extends JFrame implements ActionListener {

    JButton     enterBtn;
    JTextField  sizeTF;

    public SettingsFrame(int screenSizeX, int screenSizeY, int insets) {
        super("Main window size");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.lightGray);
        this.setResizable(false);
        this.setSize(200, 50 + insets);
        this.sizeTF = new JTextField();
        this.sizeTF.setPreferredSize(new Dimension(100, 40));
        Font font = new Font(Font.SERIF, Font.PLAIN, 18);
        this.sizeTF.setFont(font);
        this.add(this.sizeTF);
        this.enterBtn = new JButton("Enter");
        this.enterBtn.setSize(new Dimension(60, 40));
        this.add(this.enterBtn);
        this.setLocation(screenSizeX / 2 - 200 / 2, screenSizeY / 2 - 50);
        this.setVisible(true);
        this.requestFocus();
        this.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
