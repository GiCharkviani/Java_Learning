package SwapArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 1, 3, 5, 12, 32, 11};

//       log(numbers);
       reverse(numbers);
        System.out.println("*****");
       log(numbers);
    }

    public static void reverse(int[] array) {
        int base = 0;
        for (int i = array.length - 1; i >= base; base++, i--) {
            int temp = array[base];
            array[base] = array[i];
            array[i] = temp;
        }
    }

    public static void log(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
