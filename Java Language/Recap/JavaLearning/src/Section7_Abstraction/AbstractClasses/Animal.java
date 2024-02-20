package Section7_Abstraction.AbstractClasses;

public abstract class Animal {
    protected String name;
    private String size;
    private double weight;

    public Animal(String name, String size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

}
