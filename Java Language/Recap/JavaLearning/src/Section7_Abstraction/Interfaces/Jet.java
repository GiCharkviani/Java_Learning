package Section7_Abstraction.Interfaces;

public class Jet implements FlightEnabled, Trackable {
    @Override
    public void fly() {
        System.out.println("Jet is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Jet is taking off");
    }

    @Override
    public void land() {
        System.out.println("Jet is landing");
    }


    @Override
    public void track() {
        System.out.println("Jet is tracking");
    }
}
