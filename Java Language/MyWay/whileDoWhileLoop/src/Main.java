public class Main {
    public static void main(String[] args) {
        int count = 1;

        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true) {
            if(count == 6)
                break;
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("----------");

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count < 6);


        System.out.println("*** Challenge 1 ***");
        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number))
                continue;
            sum += number;
            System.out.println("Event number: " + number);
        }
        System.out.println("Sum is: " + sum);


        System.out.println("*** Challenge 2 ***");
        System.out.println("Sum is: " + sumDigits(123));
    }


    public static int sumDigits(int number) {
        int sum = 0;
        if(number >= 10) {
            while(number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
