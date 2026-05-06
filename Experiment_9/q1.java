package Java_Lab_24.Experiment_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q1 implements ActionListener {

    JFrame frame;
    JTextField textField;
    String operator;
    double num1, num2, result;

    public q1() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setLayout(new GridLayout(5, 4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        frame.add(textField);

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            frame.add(btn);
        }

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') {
            textField.setText(textField.getText() + cmd);
        }
        else if (cmd.equals("C")) {
            textField.setText("");
        }
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }
        else {
            num1 = Double.parseDouble(textField.getText());
            operator = cmd;
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new q1();
    }
}