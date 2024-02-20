package Section7_Abstraction.Interfaces;

public abstract class Animal {
    protected final String name;
    private int size;
    double weight;

    public Animal(String name, int size, double weight) {
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
