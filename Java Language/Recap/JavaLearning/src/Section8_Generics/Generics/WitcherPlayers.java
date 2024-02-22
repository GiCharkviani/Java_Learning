package Section8_Generics.Generics;

public class WitcherPlayers extends Player {
    public WitcherPlayers(String firstName, String lastname, int age) {
        super(firstName, lastname, age);
    }

    @Override
    public void win() {
        System.out.println("Witching");
    }


}
