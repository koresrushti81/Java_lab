package Experiment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q4 extends JFrame implements KeyListener {

    JTextArea area;
    JLabel label;

    q4() {
        setTitle("Character and Word Count");
        setSize(400, 300);
        setLayout(new BorderLayout());

        area = new JTextArea();
        label = new JLabel("Characters: 0  Words: 0");

        area.addKeyListener(this);

        add(new JScrollPane(area), BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String text = area.getText();

        int charCount = text.length();

        String words[] = text.trim().split("\\\\s+");
        int wordCount = text.trim().isEmpty() ? 0 : words.length;

        label.setText("Characters: " + charCount + "  Words: " + wordCount);
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new q4();
    }
}