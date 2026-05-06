package Java_Lab_24.Experiment_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Stationary Purchase System");
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox notebook = new JCheckBox("Notebook @ 50");
        JCheckBox pen = new JCheckBox("Pen @ 30");
        JCheckBox pencil = new JCheckBox("Pencil @ 10");

        JButton orderBtn = new JButton("Order");

        orderBtn.addActionListener(e -> {
            double total = 0;
            String message = "";

            if (notebook.isSelected()) {
                String qtyStr = JOptionPane.showInputDialog("Enter Quantity for Notebook:");
                int qty = Integer.parseInt(qtyStr);
                total += qty * 50;
                message += "Notebook Quantity: " + qty + "\n";
            }

            if (pen.isSelected()) {
                String qtyStr = JOptionPane.showInputDialog("Enter Quantity for Pen:");
                int qty = Integer.parseInt(qtyStr);
                total += qty * 30;
                message += "Pen Quantity: " + qty + "\n";
            }

            if (pencil.isSelected()) {
                String qtyStr = JOptionPane.showInputDialog("Enter Quantity for Pencil:");
                int qty = Integer.parseInt(qtyStr);
                total += qty * 10;
                message += "Pencil Quantity: " + qty + "\n";
            }

            message += "Total: " + total;

            JOptionPane.showMessageDialog(frame, message, "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(frame, "Successfully Ordered", "Alert", JOptionPane.WARNING_MESSAGE);
        });

        frame.add(new JLabel("Stationary Purchase System"));
        frame.add(notebook);
        frame.add(pen);
        frame.add(pencil);
        frame.add(orderBtn);

        frame.setVisible(true);
    }
}