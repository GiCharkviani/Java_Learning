package Section4_OOP.Classes;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car(String model, String newEngine) {
        engine = newEngine;
        this.model = model;
    }
}
