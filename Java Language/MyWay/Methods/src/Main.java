import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int firstInt = 1500;
        displayHighScorePosition("Giorgi", firstInt);
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Gaga",highScore);

        printMegaBytesAndKiloBytes(2331);

        System.out.println(isLeapYear(1700));

        System.out.println("Are equal: " + areEqualByThreeDecimalPlaces(3.1756, 3.175));
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println(player + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
       if(score > 1000)
           return 1;
       else if(score > 500 && score < 1000)
           return 2;
       else if(score > 100 && score < 500)
           return 3;
       else
           return 4;
    }


    /* Exercises */

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour * 0.62);
    }


        public static void printMegaBytesAndKiloBytes(int kiloBytes) {
            if(kiloBytes < 0)
                System.out.println("Invalid Value");
            else {
                int megabyte = (kiloBytes / 1024);
                System.out.println(kiloBytes + " KB = " + megabyte + "MB and " + (kiloBytes % 1024) + " KB");
            }
        }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999)
            return false;

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double firstNumber = Math.round((int)(first * 1000));
        double secondNumber = Math.round((int)(second * 1000));
        return firstNumber/1000 == secondNumber/1000;
    }

    public static boolean hasTeen(int first, int second, int third) {
        return isTeen(first) || isTeen(second) || isTeen(third);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }

}
