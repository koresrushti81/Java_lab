package Experiment_14;

import java.io.*;
import java.net.*;

public class q2_server {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(6000);

            System.out.println("Server Started...");

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            int a = dis.readInt();
            int b = dis.readInt();

            int sum = a + b;

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeInt(sum);

            System.out.println("Sum Sent: " + sum);

            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}