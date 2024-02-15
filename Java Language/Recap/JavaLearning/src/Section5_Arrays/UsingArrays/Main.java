package Section5_Arrays.UsingArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myNumbers = new int[10];
        int[] ages = new int[]{32,43,12,54,31,21};
        int[] years = {21, 32, 43, 21, 43}; // Anonymous array

//        System.out.println(myNumbers[0]);
//        System.out.println(ages[0]);

        myNumbers[0] = 55;
        ages[0] = 0;
        years[0] = 66;

//        System.out.println("*******");
//
//        System.out.println(myNumbers[0]);
//        System.out.println(ages[0]);
//        System.out.println(years[0]);
//
//        System.out.println("*******");

//        logArray(ages);
        Arrays.sort(ages);
//        System.out.println("*******");
//        logArray(ages);
//        System.out.println("*******");
//        System.out.println(Arrays.toString(ages));

        String[] names = {"Gela", "Vazha", "Bacho", "Dato", "Mari", "Nino"};
        Arrays.sort(names);
        logStringsArray(names);
        System.out.println(Arrays.binarySearch(names, "Nino"));
    }

    public static void logIntegersArray(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

    public static void logStringsArray(String[] strings) {
        for(String string: strings) {
            System.out.println(string);
        }
    }
}
