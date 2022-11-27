public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Gio", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(12, 4));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored" + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Np player name, no player score.");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if(feet < 0 || inches < 0 || inches > 12)
            return -1;
        return feet * inches;
    }

    public static double area(double radius) {
        if(radius < 0)
            return -1d;
        return 3.14 * (Math.pow(radius, 2));
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0)
            System.out.println("Invalid Value");
        else {
            int days = (int)((minutes/60)/24);
            int years = days/365;
            int leftDays = Math.abs((years * 365) - days);
            System.out.println(minutes + " min = " + years + " y and " + leftDays + " d");
        }
    }




}
