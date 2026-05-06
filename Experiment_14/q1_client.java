package Experiment_14;

import java.io.*;
import java.net.*;

public class q1_client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 5000);

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello Server");

            dos.flush();

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}