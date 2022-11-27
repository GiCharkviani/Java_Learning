import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        /* Value Types */
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        /* Value Types */
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));
        anotherIntArray[0] = 5;
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {4,5,6,7,8}; // another array
        modifyArray(myIntArray);
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        /* Minimum Element Challenge */
        System.out.println("*** Minimum Element Challenge ***");
//
//        System.out.println("How many integers: ");
//        if(scanner.hasNextInt()) {
//            System.out.println("Enter integers: \r");
//            int count = scanner.nextInt();
//            scanner.nextLine();
//            int[] enteredIntegers = readIntegers(count);
//            System.out.println("Minimum = " + findMin(enteredIntegers));
//        } else
//            System.out.println("Invalid value entered");
//        scanner.close();

        /* Minimum Element Challenge */
        System.out.println("*** Reverse Array Challenge ***");
        int[] myArray = new int[] {1,2,3,4,5,6};
        reverse(myArray);
        System.out.println("Reversed: " + Arrays.toString(myArray));
    }

    public static void reverse(int[] array) {
        int length = array.length;
        int maxIndex = length - 1;
        int halfLength = length/2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for(int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

    private static int[] readIntegers(int integers) {
        int[] enteredIntegers = new int[integers];

        for(int i = 0; i < integers; i++) {
            if(scanner.hasNextInt())
                enteredIntegers[i] = scanner.nextInt();
            else {
                System.out.println("Invalid integer entered");
                break;
            }
        }

        return enteredIntegers;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i] < min)
                min = array[i];
        return min;
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; // also type of initialization
    }
}
