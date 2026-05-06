package Java_Lab_24.Experiment_8;

import javax.swing.*;
import java.awt.*;

public class q1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Counter");
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Counter:");
        JTextField textField = new JTextField("0",5);

        JButton up = new JButton("Count Up");
        JButton down = new JButton("Count Down");
        JButton reset = new JButton("Reset");

        up.addActionListener(e -> {
            int count = Integer.parseInt(textField.getText());
            textField.setText(String.valueOf(count + 1));
        });

        down.addActionListener(e -> {
            int count = Integer.parseInt(textField.getText());
            textField.setText(String.valueOf(count - 1));
        });

        reset.addActionListener(e -> textField.setText("0"));

        frame.add(label);
        frame.add(textField);
        frame.add(up);
        frame.add(down);
        frame.add(reset);

        frame.setVisible(true);
    }
}