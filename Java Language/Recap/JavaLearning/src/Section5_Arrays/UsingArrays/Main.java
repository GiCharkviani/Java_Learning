package Section5_Arrays.UsingArrays;

public class Main {

    public static void main(String[] args) {
        int[] myNumbers = new int[10];
        int[] ages = new int[]{32,43,12,54,31,21};
        int[] years = {21, 32, 43, 21, 43}; // Anonymous array

        System.out.println(myNumbers[0]);
        System.out.println(ages[0]);

        myNumbers[0] = 55;
        ages[0] = 0;
        years[0] = 66;

        System.out.println("*******");

        System.out.println(myNumbers[0]);
        System.out.println(ages[0]);
        System.out.println(years[0]);

    }
}
