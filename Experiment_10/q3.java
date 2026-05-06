package Experiment_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q3 extends JFrame implements ItemListener {

    JComboBox<String> combo;
    JLabel label;

    String images[] = {"Image1", "Image2", "Image3"};

    q3() {
        setTitle("Image Selector");
        setSize(400, 300);
        setLayout(new FlowLayout());

        combo = new JComboBox<>(images);
        label = new JLabel("Selected: Image1");

        combo.addItemListener(this);

        add(combo);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Selected: " + combo.getSelectedItem());
        }
    }

    public static void main(String[] args) {
        new q3();
    }
}