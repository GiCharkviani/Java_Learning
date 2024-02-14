package Section4_OOP.Composition;

public class Demensions {
    private int width;
    private int height;
    private int depth;

    public Demensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
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
