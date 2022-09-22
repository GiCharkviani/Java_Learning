package com.gio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loc = 64;
//        int loc = 1;
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
                System.out.println("You cannot go in that direction");
        }

        scanner.close();

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
