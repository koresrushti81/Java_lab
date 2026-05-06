package Experiment_11;

import javax.swing.*;
import java.awt.*;

public class q1 extends JFrame {

    q1() {
        setTitle("Border Layout Example");
        setSize(400, 200);
        setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.add(new JLabel("Enter the number"));
        top.add(new JTextField(10));

        JPanel center = new JPanel(new GridLayout(1, 3));
        center.add(new JButton("Binary"));
        center.add(new JButton("Octal"));
        center.add(new JButton("Hex"));

        JPanel bottom = new JPanel();
        bottom.add(new JLabel("Result"));
        bottom.add(new JTextField(10));

        add(top, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new q1();
    }
}