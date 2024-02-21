package Section8_Generics;

public class RddPlayers extends Player {

    public RddPlayers(String firstName, String lastname, int age) {
        super(firstName, lastname, age);
    }

    @Override
    public void win() {
        System.out.println("RDD");
    }


}