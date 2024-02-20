package Section7_Abstraction.AbstractClasses;

public abstract class Animal {
    protected final String name;
    private String size;
    double weight;

    public Animal(String name, String size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    protected final void breathes() {
        System.out.println("Animal " + this.name + " is breathing");
    }

}
