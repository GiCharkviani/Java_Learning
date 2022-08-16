public class Main {
    public static void main(String[] args) {
        byte myByte = 56;
        short myShort = 4322;
        int myInt = 313213131;

        long myLong = 50_000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

        short shortTotal = (short)(1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
