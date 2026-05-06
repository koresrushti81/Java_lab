package Java_Lab_24.Experiment_8;

import javax.swing.*;
import java.awt.*;

public class q2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter Number:");
        JTextField input = new JTextField(10);
        JButton reverseBtn = new JButton("Reverse");
        JLabel result = new JLabel("Result: ");

        reverseBtn.addActionListener(e -> {
            String num = input.getText();
            String reversed = new StringBuilder(num).reverse().toString();
            result.setText("Result: " + reversed);
        });

        frame.add(label);
        frame.add(input);
        frame.add(reverseBtn);
        frame.add(result);

        frame.setVisible(true);
    }
}