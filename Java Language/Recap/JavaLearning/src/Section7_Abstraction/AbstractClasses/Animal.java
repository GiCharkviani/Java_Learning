package Section7_Abstraction.AbstractClasses;

public abstract class Animal {
    protected String name;
    protected String size;
    protected  double weight;

    public Animal(String name, String size, double weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }
}
