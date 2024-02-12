package Section3.Loops;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("I am " + i + " number");
            if(i == 10)
                break;
        }

        System.out.println("**********");

        int myNumber = 0;

        while (myNumber < 10) {
            System.out.println("Number is " + myNumber);
            myNumber++;
        }

        System.out.println("**********");
        int otherNumber = 0;

        do {
            System.out.println("I run only once");
        } while (otherNumber > 0);

    }
}
