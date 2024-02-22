package Section8_Generics.Generics.Challanges;

import java.util.Arrays;

public interface Mappable {
    void render();
    static double[] stringToLatLon(String location) {
        String[] splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);

        return new double[]{lat, lng};
    }
}

abstract class Point implements Mappable {
    private final double[] location;

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " AS POINT (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {
    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for(String location: locations) {
            this.locations[index++] = Mappable.stringToLatLon(location);
        }
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " AS POINT (" + locations() + ")");
    }
}
