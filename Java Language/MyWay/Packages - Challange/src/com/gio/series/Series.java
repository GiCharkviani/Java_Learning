package com.gio.series;

public class Series {
    public static int nSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++)
            sum += i;
        return sum;
    }

    public static int factorial(int n) {
        if(n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static long fibonacci(int n) {
        if(n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
