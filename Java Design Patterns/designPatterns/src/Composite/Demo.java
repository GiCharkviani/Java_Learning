package Composite;

/* Composite pattern */
/*
The Composite Design Pattern is a structural pattern used in object-oriented programming that allows you to compose
objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and
compositions of objects uniformly. I'll describe it in two contexts: first in a simpler, general way,
and then in the context of neural networks.
 */

/*
Component: An interface or abstract class defining operations that can be performed on both primitive and composite objects.
Leaf: A class that represents primitive objects without children.
Composite: A class that stores child Component objects. It can perform operations on each child and may also add or remove them.
 */

import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    void printName();
}

class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("File: " + name);
    }
}

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void printName() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent child : children) {
            child.printName();
        }
    }
}


public class Demo {
}
