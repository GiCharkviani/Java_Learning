package Adapter;

/* Builder pattern */
// A construct which adapts an existing interface X to confirm to the required interface Y

/*
The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to collaborate.
It works as a bridge between two incompatible interfaces. This pattern involves a single class called Adapter
which is responsible for joining functionalities of independent or incompatible interfaces.
 */


import java.util.HashMap;
import java.util.Map;

// Vector/Raster demo
interface RasterImage {
    void drawRasterImage();
}

// Vector images like SVG
interface VectorImage {
    void drawVectorImage();
}

class BitmapImage implements RasterImage {
    public void drawRasterImage() {
        System.out.println("Drawing a bitmap image.");
    }
}

class ImageCache {
    private Map<String, VectorImage> cache = new HashMap<>();

    public VectorImage getImage(String key) {
        return cache.get(key);
    }

    public void putImage(String key, VectorImage image) {
        cache.put(key, image);
    }
}

class SvgImage implements VectorImage {
    public void drawVectorImage() {
        System.out.println("Drawing an SVG image.");
    }
}

class VectorAdapter implements RasterImage {
    private VectorImage vectorImage;
    private String imageKey;
    private static ImageCache cache = new ImageCache();

    public VectorAdapter(String imageKey, VectorImage vectorImage) {
        this.imageKey = imageKey;
        this.vectorImage = vectorImage;
    }

    @Override
    public void drawRasterImage() {
        // Check if the image is in the cache
        VectorImage cachedImage = cache.getImage(imageKey);
        if (cachedImage == null) {
            vectorImage.drawVectorImage();
            cache.putImage(imageKey, vectorImage);
        } else {
            System.out.println("Drawing from cache: " + imageKey);
        }
    }
}


public class Demo {
    public static void main(String[] args) {
        RasterImage bitmap = new BitmapImage();
        bitmap.drawRasterImage(); // Directly uses raster image

        VectorImage svg1 = new SvgImage();
        RasterImage vectorAdapter1 = new VectorAdapter("image1", svg1);
        vectorAdapter1.drawRasterImage(); // Draws and caches the vector image

        // Reusing the same image
        VectorImage svg2 = new SvgImage();
        RasterImage vectorAdapter2 = new VectorAdapter("image1", svg2);
        vectorAdapter2.drawRasterImage(); // Uses the cached image
    }
}