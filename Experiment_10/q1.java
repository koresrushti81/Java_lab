package Experiment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q1 extends JFrame implements MouseMotionListener {

    JLabel label;

    q1() {
        setTitle("Mouse Coordinates");
        setSize(400, 300);
        setLayout(new FlowLayout());

        label = new JLabel("Move mouse inside window");
        add(label);

        addMouseMotionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("X = " + e.getX() + " , Y = " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {
        new q1();
    }
}