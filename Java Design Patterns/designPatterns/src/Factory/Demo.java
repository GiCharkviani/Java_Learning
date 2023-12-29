package Factory;

/* Factory */
/*
    A component responsible solely for the wholesale (not piecewise) creation of objects
 */


class Point {
    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory  {
        // Factory methods:
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
        }
    }


}



public class Demo {
    public static void main(String[] args) {
        Point point =  Point.Factory.newPolarPoint(2, 3);
    }
}
