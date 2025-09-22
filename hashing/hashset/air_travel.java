
//in this code jurny probelm to solve by hash map 
package hashing.hashset;

import java.util.*;

public class air_travel {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        // Create reverse map
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the starting city (which is not present in destination list)
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null; // if no starting point found
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        // If starting point found, print the route
        if (start != null) {
            System.out.print("Itinerary: ");
            while (start != null) {
                System.out.print(start);
                start = tickets.get(start);
                if (start != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Invalid ticket data or cycle detected.");
        }
    }
}
