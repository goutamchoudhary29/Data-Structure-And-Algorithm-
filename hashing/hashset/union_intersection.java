package hashing.hashset;

import java.util.HashSet;

public class union_intersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // --------- UNION ---------
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Union count = " + set.size());
        System.out.print("Union elements = ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // --------- INTERSECTION ---------
        set.clear();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]); // Fill set with arr1
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                intersection.add(arr2[i]); // Save common elements
                set.remove(arr2[i]);       // Avoid duplicates
            }
        }

        System.out.println("Intersection count = " + intersection.size());
        System.out.print("Intersection elements = ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
