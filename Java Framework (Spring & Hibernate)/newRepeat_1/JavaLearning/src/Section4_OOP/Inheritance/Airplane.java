package Section4_OOP.Inheritance;

public class Airplane extends Vehicle {
    private int wings;
    private int turbines;

    public void fly() {
        System.out.println(this.name + " is flying");
    }

    public void landing() {
        System.out.println(this.name + " is landing");
    }

}
