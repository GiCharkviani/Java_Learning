package Section4_OOP.Inheritance;

public class Airplane extends Vehicle {
    private int wings;
    private int turbines;

    public Airplane(String name, int size, String engine, int wheels, int wings) {
        super(name, size, engine, wheels);
        this.wings = wings;
    }

    public void fly() {
        System.out.println(this.name + " is flying");
    }

    public void landing() {
        System.out.println(this.name + " is landing");
    }

    public int getTurbines() {
        return turbines;
    }

    public void setTurbines(int turbines) {
        this.turbines = turbines;
    }

    @Override
    public void move() {
        System.out.println(this.name + " Airplane is flying");
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println(this.name + " also Airplane is steering");
    }

}
