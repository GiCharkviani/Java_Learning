package Section7_Abstraction.Interfaces;

public class Bird extends Animal implements FlightEnabled {

    public Bird(String name, String size, double weight) {
        super(name, size, weight);
    }

    @Override
    public void move(String speed) {
        
    }

    @Override
    public void makeNoise() {

    }
}
