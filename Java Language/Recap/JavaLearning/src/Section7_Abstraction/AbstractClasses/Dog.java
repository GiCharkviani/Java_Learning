package Section7_Abstraction.AbstractClasses;

public class Dog extends Animal {

    public Dog(String name, String size, double weight) {
        super(name, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("Animal " + this.name + " is moving by speed " + speed);
    }

    @Override
    public void makeNoise() {
        System.out.println("Animal " + this.name + " makes noise wah-wah");
    }

}
