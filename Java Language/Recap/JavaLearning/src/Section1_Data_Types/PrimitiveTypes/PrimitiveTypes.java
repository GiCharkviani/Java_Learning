package Section1_Data_Types.PrimitiveTypes;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // Characters - 16 bits (2 Bytes)
        char myChar = 'a';
        char yourChar = '\u005A';

        // Boolean - 1 bit
        boolean amI = true;

        // Number types
        // Byte 8 bits (1 byte)
        byte catAge = 127;

        // Short 16 bits (2 byte)
        short thoseAges = 129;

        // Integer - 32 bits (4 bytes)
        int myAge = 21;
        int yourAge = 9 / 2;

        // Long - 64 bit (8 bytes)
        long years = 23123131;

        // Float - 32 bits (4 bytes)
        float price = 23.3f;
        float breadPrice = 2.2f - 1.1f;

        // Double - 64 bit (8 bytes)
        double milkPrice = 2.2 - 1.1;

        // number syntax
        long longNumber = 12_321_231_21;

        byte myByte = (byte)(thoseAges - 2);
        System.out.println(myByte);
    }


}
