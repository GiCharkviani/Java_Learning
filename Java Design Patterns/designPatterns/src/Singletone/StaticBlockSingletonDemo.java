package Singletone;

/* Singleton */

import java.io.File;

class StaticBlockSingleton {
    private StaticBlockSingleton() throws Exception {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", ".");
    }

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.err.println("Failed to create singleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

public class StaticBlockSingletonDemo {
}
