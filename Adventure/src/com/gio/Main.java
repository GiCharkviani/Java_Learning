package com.gio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> tempExit = new HashMap<>();

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
//        tempExit.put("Q", 0);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N", 5);
//        tempExit.put("Q", 0);
        locations.put(2, new Location(2, "You are are at the top of a hill",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
//        tempExit.put("Q", 0);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
//        tempExit.put("Q", 0);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
//        tempExit.put("Q", 0);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0)
                break;

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet())
                System.out.print(exit + ", ");
            System.out.println();

            String direction = findDirection(scanner.nextLine().toUpperCase());

            if(direction != null && exits.containsKey(direction))
                loc = exits.get(direction);
            else
                System.out.println("You  cannot go in that direction");
        }

        scanner.close();


        // Split function on String;
//        String[] road = "You are standing at the end of a road before a small brick building".split(" ");
//        for(String i: road)
//            System.out.println(i);
//
//        System.out.println("------------");
//
//        String[] building = "You are inside a building, a well house for a small spring".split(", ");
//
//        for(String i: building)
//            System.out.println(i);

    }

    // Challenge
    private static String findDirection(String line) {
        String[] words = line.split(" ");
        String direction = null;

        if(words.length == 1 && line.length() == 1)
            return line;

        Map<String, String> keyValues = new HashMap<>();
        keyValues.put("WEST", "W");
        keyValues.put("EAST", "E");
        keyValues.put("NORTH", "N");
        keyValues.put("SOUTH", "S");
        keyValues.put("QUIT", "Q");

        for(String v: words)
            if(keyValues.containsKey(v.toUpperCase()))
                direction = keyValues.get(v);

        return direction;
    }
}
