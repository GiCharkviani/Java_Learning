package Section2_Expressions_Statements_and_more.ifKeywordANdCodeBlocks;

public class IfKeywordANdCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 0;
        int levelCompleted = 3;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }




}