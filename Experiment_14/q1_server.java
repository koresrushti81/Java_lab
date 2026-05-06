package Experiment_14;

import java.io.*;
import java.net.*;

public class q1_server {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server Started...");

            Socket s = ss.accept();

            System.out.println("Client Connected");

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String msg = dis.readUTF();

            System.out.println("Client Message: " + msg);

            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}