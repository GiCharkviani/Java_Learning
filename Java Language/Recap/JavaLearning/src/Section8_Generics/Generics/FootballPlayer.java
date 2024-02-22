package Section8_Generics.Generics;

public class FootballPlayer extends Player {
    @Override
    public void win() {
        System.out.println("gol gol gol gol gol");
    }

    public FootballPlayer(String firstName, String lastname, int age) {
        super(firstName, lastname, age);
    }
}
