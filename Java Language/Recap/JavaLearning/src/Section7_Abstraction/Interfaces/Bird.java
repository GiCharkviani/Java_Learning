package Section7_Abstraction.Interfaces;

public class Bird extends Animal implements FlightEnabled, Trackable {

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

    @Override
    public void takeOff() {
        System.out.println("Bird is taking of");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }

    @Override
    public void skintalvs() {
        FlightEnabled.super.skintalvs();
        System.out.println("Magrad skintlavs");
    }

    @Override
    public void track() {
        System.out.println("Bird is tracking");
    }
}
