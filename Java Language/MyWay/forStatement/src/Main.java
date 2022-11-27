public class Main {
    public static void main(String[] args) {

        for(double i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
            // String.format("%.2f",) -- will print only with 2 decimal points
        }

        System.out.println("-------------");

        for(double i = 8; i > 0; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
            // String.format("%.2f",) -- will print only with 2 decimal points
        }

        System.out.println("-------------");

        int amountOfPrimeNumbers = 0;

        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                System.out.println("Prime: " + i);
                amountOfPrimeNumbers++;
                if(amountOfPrimeNumbers == 3)
                    break;
            }
        }

        System.out.println("-------------");

        long sum = 0;
        int metCondition = 0;

        for(int i = 1; i <= 1000; i++) {
            if(i % 15 == 0) {
                sum += i;
                System.out.println("Met: " + i);
                metCondition++;
                if(metCondition == 5)
                    break;
            }
        }

        System.out.println("Sum: " + sum);

        System.out.println("-------------");
        System.out.println(sumOdd(1, 11));;
    }

    public static boolean isOdd(int is) {
        if(is < 0)
            return false;
        return is % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(start > end || end < 0 || start < 0)
            return -1;
        int sum = 0;
        for(int i = start; i <= end; i++)
            if(isOdd(i))
                sum += i;
        return sum;
    }

    public static boolean isPrime(int n) {
        if(n == 1)
            return false;
        for(int i = 2; i <= (long)Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
