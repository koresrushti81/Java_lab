package Experiment_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame implements Runnable, ActionListener {

    JLabel label;
    JButton start, stop, reset;

    Thread t;

    int seconds = 0;
    boolean running = false;

    q2() {

        setTitle("Stopwatch");
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new JLabel("00 : 00 : 00");

        start = new JButton("Start");
        stop = new JButton("Stop");
        reset = new JButton("Reset");

        add(label);
        add(start);
        add(stop);
        add(reset);

        start.addActionListener(this);
        stop.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void run() {

        while (running) {

            seconds++;

            int hrs = seconds / 3600;
            int mins = (seconds % 3600) / 60;
            int secs = seconds % 60;

            label.setText(
                    String.format("%02d : %02d : %02d", hrs, mins, secs));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {

            if (!running) {
                running = true;
                t = new Thread(this);
                t.start();
            }

        } else if (e.getSource() == stop) {

            running = false;

        } else if (e.getSource() == reset) {

            running = false;
            seconds = 0;
            label.setText("00 : 00 : 00");
        }
    }

    public static void main(String[] args) {
        new q2();
    }
}