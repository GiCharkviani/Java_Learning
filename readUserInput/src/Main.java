import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // wrapper class for taking input and parsing
//
//        System.out.println("Enter your year of birth: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//            int age = 2022 - Math.abs(yearOfBirth);
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            if(age <= 100)
//                System.out.println("Hello " + name + ". Your age is " + age);
//            else
//                System.out.println("Invalid year of birth");
//        } else {
//            System.out.println("You have entered letter(s)");
//        }
//
//
//        scanner.close();

//        enterNumber();

        inputThenPrintSumAndAverage();
    }

    public static void enterNumber() {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int min = 0;
        int max = 0;
        while(count <= 10) {
            System.out.println("Enter number " + count +": ");
            if(!scanner.hasNextInt()) {
                System.out.println("Invalid number entered");
                break;
            } else {
                int enteredNumber = Math.abs(scanner.nextInt());

                if(max < enteredNumber)
                    max = enteredNumber;

                if(min > enteredNumber || min == 0)
                    min = enteredNumber;

                scanner.nextLine();
                sum += enteredNumber;
                count++;
            }
        }
        scanner.close();
        System.out.println("Finally, the sum is: " + sum);
        System.out.println("Min is: " + min + " and Max is: " + max);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner userInput = new Scanner(System.in);
        long sum = 0;
        int count = 0;
        System.out.println("Number: ");
        while (true) {
            if(!userInput.hasNextInt())
                break;
            sum += userInput.nextInt();
            count++;
            userInput.nextLine();
        }
        long average = 0;
        if(count != 0)
            average = Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
