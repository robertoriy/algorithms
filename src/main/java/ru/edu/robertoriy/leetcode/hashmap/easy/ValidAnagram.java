package ru.edu.robertoriy.leetcode.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public final class ValidAnagram {
    private ValidAnagram() {
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char character : s.toCharArray()) {
            frequency.merge(character, 1, Integer::sum);
        }
        for (char character : t.toCharArray()) {
            int available = frequency.getOrDefault(character, 0);
            if (available > 0) {
                frequency.put(character, available - 1);
            } else {
                return false;
            }
        }
        for (int counter : frequency.values()) {
            if (counter != 0) {
                return false;
            }
        }
        return true;
    }
}
