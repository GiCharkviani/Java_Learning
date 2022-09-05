package com.gio;

import java.util.Scanner;

public class X {
    int x;

    public void x(int order) {
        if(order > 0) {
            Scanner x = new Scanner(System.in);
            System.out.print("\nEnter a int: ");
            this.x = x.nextInt();
            x();
            x.close();
        } else {
            System.out.println("Terminating...");
        }
    }

    private void x() {
        for(int x = 1; x <= 12; x++)
            System.out.println(this.x + " times " + x + " = " + this.x * x);
    }
}