package Section4_OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Boing777 ourBoing = new Boing777("FLying Dragon", 666, "V200", 4, 6);
        ourBoing.setModel("777");
        ourBoing.setTurbines(200);

//        ourBoing.fly();
//        ourBoing.steering();

        System.out.println(ourBoing);
    }
}
