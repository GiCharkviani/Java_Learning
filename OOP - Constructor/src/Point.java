public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y =  y;
    }

    public double distance() {
        int distance = (-this.x * (-this.x)) + (-this.y * (-this.y)) ;
        return Math.sqrt(distance);
    }

    public double distance(int x, int y) {
        int distance = ((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y));
        return Math.sqrt(distance);
    }

    public double distance(Point point) {
        int distance = ((point.getX() - this.x) * (point.getX() - this.x)) + ((point.getY() - this.y) * (point.getY() - this.y));
        return Math.sqrt(distance);
    }
}
