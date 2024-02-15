package Section5_Arrays.ArrayReferences;

public class Main {
    public static void main(String[] args) {
        int[] myNumbers = new int[10];
        String myName = "Giorgi";

        int[] ages = myNumbers;
        ages[0] = 10;

        System.out.println(myNumbers[0]);

    }

    public static void logIntegersArray(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

    public static void myNames(String... names) {
        for (String name: names) {
            System.out.println(name);
        }
    }
}
