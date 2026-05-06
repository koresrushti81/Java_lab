package Experiment_14;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class q2_client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Socket s = new Socket("localhost", 6000);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            dos.writeInt(a);
            dos.writeInt(b);

            DataInputStream dis = new DataInputStream(s.getInputStream());

            int sum = dis.readInt();

            System.out.println("Sum from Server: " + sum);

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}