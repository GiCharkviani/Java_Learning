package Section7_Abstraction.Interfaces;

public interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void fly();
    void takeOff();
    void land();
}
