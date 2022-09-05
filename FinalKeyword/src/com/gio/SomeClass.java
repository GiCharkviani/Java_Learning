package com.gio;

public final class SomeClass { /* final class can't be extended */
    private static int classCounter = 0;
    public final int instanceNumber; // it can't be changed from anywhere if initialized
    private final String name;

    // it's better to have static final fields, if they won't change throughout of instances
    public static final int num = 123;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
