package Section4_OOP.Inheritance;

public class Vehicle {
    private String name;
    private String engine;

    private int wheels;
    private int size;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, int size, String engine) {
        this(name);
        this.size = size;
        this.engine = engine;
    }

    public Vehicle(String name, int size, String engine, int wheels) {
        this(name, size, engine);
        this.wheels = wheels;
    }

    public void move() {
        System.out.println(this.name + " vehicle is moving");
    }

    public void steering() {
        System.out.println(this.name + " vehicle is steering");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSize() {
        return size;
    }
}
