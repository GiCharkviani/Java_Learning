package Section7_Abstraction.Interfaces;

public class Bird extends Animal implements FlightEnabled {

    public Bird(String name, int size, double weight) {
        super(name, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("TklapTLAP");
    }

    @Override
    public void makeNoise() {
        System.out.println("ChikChik");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly");
    }
}
