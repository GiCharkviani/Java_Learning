package Facade;
/* Facade pattern */
// provides a simple, easy to understand/user interface over a large and sophisticated body of code


import java.util.ArrayList;
import java.util.List;

class Buffer {
    private final char [] characters;
    private final int lineWidth;

    public Buffer(int lineHeight, int lineWidth) {
        this.lineWidth = lineWidth;
        characters = new char[lineWidth*lineHeight];
    }

    public char charAt(int x, int y) {
        return characters[y*lineWidth+x];
    }
}

class ViewPort {

    private final Buffer buffer;
    private final int width;
    private final int height;
    private final int offsetX;
    private final int offsetY;

    public ViewPort(Buffer buffer, int width, int height, int offsetX, int offsetY) {
        this.buffer = buffer;
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public char charAt(int x, int y) {
        return buffer.charAt(x+offsetX, y+offsetY);
    }
}

class Console {
    private List<ViewPort> viewPorts = new ArrayList<>();
    int width, height;

    public Console(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addViewPort(ViewPort viewPort) {
        viewPorts.add(viewPort);
    }

    public void render() {
        for(int y = 0; y < height; ++y) {
            for(int x = 0; x < height; ++x) {
                for(ViewPort vp: viewPorts) {
                    System.out.println(vp.charAt(x, y));
                }
            }
        }
    }
}


public class Demo {

}
