package Bridge;

/* Bridge pattern */
// A mechanism that decouples an interface (hierarchy) from an implementation (hierarchy)

/*
The Bridge Design Pattern is a structural design pattern that helps in separating an abstraction
from its implementation so that the two can vary independently. This pattern involves an interface
which acts as a bridge between the abstraction and its implementation. This makes the functionality
of concrete classes independent from interface implementer classes.
 */

interface Renderer {
    void renderCircle(float radius);
    // other render methods for different shapes
}

class VectorRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle with a radius of " + radius + " using vector rendering.");
    }
}

class RasterRenderer implements Renderer {
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle with a radius of " + radius + " using raster rendering.");
    }
}

abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}

class Circle extends Shape {
    private float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    public void draw() {
        renderer.renderCircle(radius);
    }
}


public class Demo {
    public static void main(String[] args) {
        Shape vectorCircle = new Circle(new VectorRenderer(), 5);
        vectorCircle.draw();

        Shape rasterCircle = new Circle(new RasterRenderer(), 5);
        rasterCircle.draw();
    }
}
