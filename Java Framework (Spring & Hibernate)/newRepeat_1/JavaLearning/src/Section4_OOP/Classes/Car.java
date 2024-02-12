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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.toLowerCase() == "black") {
            this.color = color;
        } else {
            System.out.println("Invalid color");
        }
    }




}
