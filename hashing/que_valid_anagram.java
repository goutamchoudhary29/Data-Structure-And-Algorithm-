
//In this question give two string example s-'race' and t - 'care' in both string have only same 
//charchters not in sequence metter only charecter are same both strings are called anagram.

package hashing;

import java.util.*;

public class que_valid_anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease frequency using string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false; // char not found or overused
            }
        }

        return map.isEmpty(); // All counts should be 0
    }

    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        if (isAnagram(s, t)) {
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }
}
