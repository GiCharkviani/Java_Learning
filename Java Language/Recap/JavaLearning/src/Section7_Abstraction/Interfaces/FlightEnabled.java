package Section7_Abstraction.Interfaces;

public interface FlightEnabled {
    static double MILES_TO_KM = 1.60934;
    static double KM_TO_MILES = 0.621371;

    void fly();
    void takeOff();
    void land();

    default void skintalvs() {
        System.out.println("Ra davaskintle");
    }

    static void ilandzgeba() {
        System.out.println("She arachito");
    }
}
