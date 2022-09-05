package com.java_learn;

public class Main {
    public static void main(String[] args) {
        // instead of importing package
        javafx.scene.Node node = null;
        org.w3c.dom.Node anotherNode = null;

        // You can't have two imports, that are importing the same interface or class;
        // instead, better use above-mentioned approach

    }
}
