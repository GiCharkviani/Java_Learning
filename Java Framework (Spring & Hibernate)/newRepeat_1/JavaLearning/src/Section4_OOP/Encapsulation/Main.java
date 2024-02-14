package Section4_OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Player witcher = new Player();
        witcher.loseHealth(20000);

        System.out.println(witcher.healthRemaining());

    }
}
