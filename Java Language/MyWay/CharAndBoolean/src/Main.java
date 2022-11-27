public class Main {
    public static void main(String[] args) {
        /* 2 byte (16 bits) because it stores Unicode characters - with unique number */

        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        // booleans
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

    }
}
