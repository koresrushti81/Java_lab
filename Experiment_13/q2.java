package Experiment_13;

import java.sql.*;
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            System.out.println("1.Select");
            System.out.println("2.Insert");
            System.out.println("3.Update");
            System.out.println("4.Delete");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    ResultSet rs = stmt.executeQuery("SELECT * FROM student");

                    while (rs.next()) {
                        System.out.println(
                                rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age"));
                    }
                    break;

                case 2:
                    stmt.executeUpdate(
                            "INSERT INTO student VALUES(1,'Sushant',20)");
                    System.out.println("Record Inserted");
                    break;

                case 3:
                    stmt.executeUpdate(
                            "UPDATE student SET age=25 WHERE id=1");
                    System.out.println("Record Updated");
                    break;

                case 4:
                    stmt.executeUpdate(
                            "DELETE FROM student WHERE id=1");
                    System.out.println("Record Deleted");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}