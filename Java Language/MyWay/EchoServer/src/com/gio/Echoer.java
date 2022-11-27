package com.gio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private static int connections = 0;
    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Client Connected");
            connections++;
            System.out.println("Total clients: " + connections);

            while (true) {
                String echoString = input.readLine();
                System.out.println("Received client's input: " + echoString);
                if(echoString.equals("exit"))
                    break;

//                try {
//                    Thread.sleep(15000);
//                } catch (InterruptedException e) {
//                    System.out.println("Thread interrupted");
//                    e.printStackTrace();
//                }

                output.println(echoString);
            }

        } catch (IOException e) {
            System.out.println("Oops: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                connections--;
                System.out.println("Client disconnected");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
