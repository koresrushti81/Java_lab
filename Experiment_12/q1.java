package Experiment_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q1 extends JPanel implements Runnable, MouseListener {

    int x = 50, y = 50;
    int dx = 5, dy = 5;

    Thread t;

    q1() {
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillOval(x, y, 40, 40);
    }

    public void run() {

        while (true) {

            x = x + dx;
            y = y + dy;

            if (x <= 0 || x >= getWidth() - 40) {
                dx = -dx;
            }

            if (y <= 0 || y >= getHeight() - 40) {
                dy = -dy;
            }

            repaint();

            try {
                Thread.sleep(20);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void mousePressed(MouseEvent e) {

        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Bouncing Ball");

        q1 panel = new q1();

        f.add(panel);

        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}