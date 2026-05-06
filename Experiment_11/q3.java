package Experiment_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q3 extends JFrame implements ActionListener {

    JButton buttons[][] = new JButton[2][3];
    JButton firstButton = null;

    q3() {
        setTitle("Grid Layout Example");
        setSize(300, 200);

        setLayout(new GridLayout(2, 3));

        int num = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton(String.valueOf(num));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
                num++;
            }
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (firstButton == null) {
            firstButton = clicked;
        } else {
            String temp = firstButton.getText();
            firstButton.setText(clicked.getText());
            clicked.setText(temp);
            firstButton = null;
        }
    }

    public static void main(String[] args) {
        new q3();
    }
}