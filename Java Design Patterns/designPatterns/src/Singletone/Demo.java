package Singletone;

/* Singleton */
// A component which is instantiated only once


import java.io.*;

class BasicSingleton implements Serializable {


    private BasicSingleton() {
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Will resolve problem of serialization
    @Serial
    protected Object readResolve() {
        return INSTANCE;
    }
}

public class Demo {

    static void saveToFile(BasicSingleton singletone, String filename) throws Exception {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(singletone);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try(FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton single = BasicSingleton.getInstance();
        single.setValue(2);

        System.out.println(single.getValue());

        // problems
        // 1. reflection
        // 2. serialization (solved)
        BasicSingleton singletone = BasicSingleton.getInstance();
        singletone.setValue(111);

        String filename = "singleton.bin";
        saveToFile(singletone, filename);

        BasicSingleton singleton2 = readFromFile(filename);

        System.out.println(singletone == singleton2);
        System.out.println(singletone.getValue());
        System.out.println(singleton2.getValue());


    }
}
