package com.gio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Location currentLocation = locations.getLocation(1);
        while(true) {
            System.out.println(currentLocation.getDescription());
            if(currentLocation.getLocationID() == 0)
                break;

            Map<String, Integer> exits = currentLocation.getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet())
                System.out.print(exit + ", ");
            System.out.println();

            String direction = findDirection(scanner.nextLine().toUpperCase());

            if(direction != null && exits.containsKey(direction))
                currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
            else
                System.out.println("You cannot go in that direction");
        }

        scanner.close();
        locations.close();
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
