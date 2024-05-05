package ru.edu.robertoriy.leetcode.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public final class RansomNote {
    private RansomNote() {
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char character : magazine.toCharArray()) {
            frequency.merge(character, 1, Integer::sum);
        }

        for (char character : ransomNote.toCharArray()) {
            int available = frequency.getOrDefault(character, 0);
            if (available > 0) {
                frequency.put(character, available - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
