package Section2.ifKeywordANdCodeBlocks;

public class IfKeywordANdCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 0;
        int levelCompleted = 3;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        // Method overloading
        logMyInfo("Giorgi", "Charkvi");
        logMyInfo("Giorgi", 21);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }


    // Methods overloading
    public static void logMyInfo(String name, String surname) {
        System.out.println("My name is " + name + " and surname is " + surname);
    }

    public static void logMyInfo(String name, int age) {
        System.out.println("My name is " + name + " and age is " + age);
    }



}
