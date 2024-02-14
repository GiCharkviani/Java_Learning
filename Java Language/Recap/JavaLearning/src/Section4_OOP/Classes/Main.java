package Section4_OOP.Classes;

public class Main {
    public static void main(String[] args) {
        Car.logFactoryInfo();

        // Record
        PojoCar myPojoCar = new PojoCar("MERCEDES", "Merci");
        myPojoCar.model();


        Car BMW = new Car("M5", "N58");
        Car mercedes = new Car("C", "v6", 4, 4);
        Car toyota = new Car("4Runner");


        BMW.setColor("red");
        System.out.println(BMW.getColor());
    }
}