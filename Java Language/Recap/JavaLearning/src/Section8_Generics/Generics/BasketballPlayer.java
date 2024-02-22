package Section8_Generics.Generics;

public class BasketballPlayer extends Player {
    @Override
    public void win() {
        System.out.println("Chavteneeeee");
    }

    public BasketballPlayer(String firstName, String lastname, int age) {
        super(firstName, lastname, age);
    }
}
