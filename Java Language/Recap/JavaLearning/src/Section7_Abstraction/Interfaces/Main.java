package Section7_Abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
        FlightEnabled myBird = new Bird("Kachkachi", 2, 4);
        myBird.skintalvs();

        FlightEnabled.ilandzgeba();
        System.out.println(FlightEnabled.MILES_TO_KM);
    }
}
