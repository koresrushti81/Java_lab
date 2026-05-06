package Experiment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q5 extends JFrame implements ActionListener {

    JButton red, green, blue;

    q5() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setLayout(new FlowLayout());

        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == green) {
            getContentPane().setBackground(Color.GREEN);
        } else if (e.getSource() == blue) {
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new q5();
    }
}