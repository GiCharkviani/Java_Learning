package com.gio;

import static com.gio.ThreadColor.ANSI_GREEN;
import static com.gio.ThreadColor.ANSI_PURPLE;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the man thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.start(); // It enables JVM to run() method be executed. We can't use another instance of this thread

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
    }
}
