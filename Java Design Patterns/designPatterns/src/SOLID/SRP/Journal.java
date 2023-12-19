package SOLID.SRP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* Single Responsibility Principle */
// One responsibility for every single class

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

}

class Persistance {
    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(this);
            }
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}

class Demo {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistance p = new Persistance();
        String fileName = "/Users/giorgi.charkviani/Desktop/Learning.txt";
        p.saveToFile(j, fileName, true);
        String[] command = { "open", "-a", "Notes", fileName };
        Runtime.getRuntime().exec(command);
    }
}
