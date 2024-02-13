package Section4_OOP.Composition;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer, int width, int height, int depth) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.width = width;
        this.height = height;
        this.depth = depth;
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
