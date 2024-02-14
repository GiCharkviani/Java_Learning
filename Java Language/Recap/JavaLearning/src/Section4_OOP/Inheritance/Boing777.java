package Section4_OOP.Inheritance;

public class Boing777 extends Airplane {
    private String model;

    public Boing777(String name, int size, String engine, int wheels, int wings) {
        super(name, size, engine, wheels, wings);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Boing777{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", size=" + size +
                '}';
    }
    
}
