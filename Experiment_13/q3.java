package Experiment_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class q3 extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;

    q3() {

        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        l1 = new JLabel("Username:");
        l2 = new JLabel("Password:");

        t1 = new JTextField(15);
        t2 = new JPasswordField(15);

        b1 = new JButton("Register");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        b1.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String username = t1.getText();
        String password = String.valueOf(t2.getPassword());

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, pass);

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO login(username,password) VALUES(?,?)");

            ps.setString(1, username);
            ps.setString(2, password);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registration Successful");

            con.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new q3();
    }
}