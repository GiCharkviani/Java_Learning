import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[25];
        myIntArray[0] = 70;
        myIntArray[2] = 40;
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        // instead of above:
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println(myIntArray2[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[1] = 5d;
        System.out.println(myDoubleArray[1]);

        // using loop
//        for(int i = 0; i < myDoubleArray.length; i++)
//            System.out.println("Double values: " + myDoubleArray[i]);
//
//
//        printArray(myIntArray);

        /* Another use of Array */
//        System.out.println("**********");
//        int[] myIntegers = getIntegers(5);
//        for(int i = 0; i < myIntegers.length; i++ )
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        System.out.println("The average is " + getAverage(myIntegers));

        /* Sort Array Challenge */
        System.out.println("Enter integers in order to sort them: \r");
        int[] enteredIntegers = getEnteredIntegers(5);
        printEnteredIntegersArray(enteredIntegers);

        int[] sortedArray = sortIntegers(enteredIntegers);

        for(int i = 0; i < sortedArray.length; i++)
            System.out.println("Sorted array integer: " + sortedArray[i]);
    }


    public static int[] getEnteredIntegers(int number) {
        int[] enterIntegers = new int[number];
        for(int i = 0; i < number; i++)
            enterIntegers[i] = scanner.nextInt();
        return enterIntegers;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedIntegers = new int[array.length];
        int temp;
        boolean noSwap = false;

        for(int i = 0; i < array.length; i++)
            sortedIntegers[i] = array[i];

        for(int i = 0; i < sortedIntegers.length; i++) {
            noSwap = true;
            for(int j = i + 1; j < sortedIntegers.length; j++) {
                if(sortedIntegers[i] < sortedIntegers[j]) {
                    temp = sortedIntegers[i];
                    sortedIntegers[i] = sortedIntegers[j];
                    sortedIntegers[j] = temp;
                    noSwap = false;
                }
            }
            if(noSwap) break;
        }
        return sortedIntegers;
    }

    public static void printEnteredIntegersArray(int[] array) {
        for(short i = 0; i < array.length; i++)
            System.out.println("Integer: " + array[i]);
    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++)
            values[i] = scanner.nextInt();
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i];
        return (double)sum/(double)array.length;
    }

    public static void printArray(int[] myArray) {
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = 3;
            System.out.println("Integer values: " + myArray[i]);
        }
    }

}
