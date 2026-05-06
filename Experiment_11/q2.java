package Experiment_11;

import javax.swing.*;
import java.awt.*;

public class q2 extends JFrame {

    q2() {
        setTitle("Flow Layout Example");
        setSize(400, 200);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JCheckBox("Java"));
        add(new JCheckBox("Python"));
        add(new JCheckBox("C++"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new q2();
    }
}