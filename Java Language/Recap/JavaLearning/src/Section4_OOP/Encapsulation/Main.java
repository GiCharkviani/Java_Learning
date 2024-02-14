package Section4_OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player witcher = new Player("Witcher");
        witcher.loseHealth(60);

        System.out.println(witcher.healthRemaining());

    }
}
