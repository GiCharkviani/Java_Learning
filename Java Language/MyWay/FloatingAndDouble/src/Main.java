public class Main {
    public static void main(String[] args) {
        /* Float - 32 bits and Double - 64 bits */

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        /* By default, java uses doubles, in order to get rid of that, we must cast */
        int myIntValue = 5;
        float myFloatValue = (float)5.45; // or just 5.45f
        double myDoubleValue = 5.312321312d; // we can add d prefix as well

        int myIntValue2 = 5 / 3;
        float myFloatValue2 = 5f / 3;
        double myDoubleValue2 = 5.00 / 3.00; // Java will spot floating point and will make it double
        System.out.println("My int value = " + myIntValue2);
        System.out.println("My float value = " + myFloatValue2);
        System.out.println("My int double = " + myDoubleValue2);

        // Challenge
        double pounds = 500d;
        double kilograms = pounds * 0.45359237;
        System.out.println("Kilograms: " + kilograms);

        double pi = 3.14155927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

//        BigDecimal // this is used for more precise calculations
    }
}
