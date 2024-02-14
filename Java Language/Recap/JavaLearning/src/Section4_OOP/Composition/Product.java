package Section4_OOP.Composition;

public class Product {
    private String model;
    private String manufacturer;


    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void logProductModel() {
        System.out.println("The product model is " + this.model);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
