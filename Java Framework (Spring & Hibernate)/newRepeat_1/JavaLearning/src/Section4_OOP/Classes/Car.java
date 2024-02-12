package Section4_OOP.Classes;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public static boolean HAS_TIRES = true;

    public static void logCar() {
        System.out.println("Car is awesome");
    }

    public Car(String model, String newEngine) {
        engine = newEngine;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equalsIgnoreCase("black")) {
            this.color = color;
        } else {
            System.out.println("Invalid color");
        }
    }




}
