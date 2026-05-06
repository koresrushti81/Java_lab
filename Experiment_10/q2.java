package Experiment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame implements ActionListener {

    JLabel label;
    JButton start, stop;
    Timer timer;
    int count = 0;

    q2() {
        setTitle("Simple Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Time: 0");
        start = new JButton("Start");
        stop = new JButton("Stop");

        add(label);
        add(start);
        add(stop);

        timer = new Timer(1000, e -> {
            count++;
            label.setText("Time: " + count);
        });

        start.addActionListener(this);
        stop.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            timer.start();
        } else if (e.getSource() == stop) {
            timer.stop();
        }
    }

    public static void main(String[] args) {
        new q2();
    }
}