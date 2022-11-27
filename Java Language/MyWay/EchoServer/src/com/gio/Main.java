package com.gio;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8000)) {

            while (true) {
                new Echoer(serverSocket.accept()).start();
            }

        }  catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
            e.printStackTrace();
        }
    }
}