package com.gio;

import static com.gio.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the man thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start(); // It enables JVM to run() method be executed. We can't use another instance of this thread

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join(2000); // @PARAM how long time to wait for termination of anotherThread
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out,so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();

//        anotherThread.interrupt(); // interrupting thread, it will throw InterruptedException



        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
    }
}
