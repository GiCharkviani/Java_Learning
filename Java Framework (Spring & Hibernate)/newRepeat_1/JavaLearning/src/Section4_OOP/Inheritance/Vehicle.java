package Section4_OOP.Inheritance;

public class Vehicle {
    protected String name;
    protected String engine;

    protected int wheels;
    protected int size;

    public Vehicle(String name) {
        this(name, 5, "V8", 2);
    }

    public Vehicle(String name, int size, String engine) {
        this(name, size, engine, 2);
    }

    public Vehicle(String name, int size, String engine, int wheels) {
        this.name = name;
        this.size = size;
        this.engine = engine;
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
