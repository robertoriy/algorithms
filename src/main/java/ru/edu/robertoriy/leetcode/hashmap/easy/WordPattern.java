package ru.edu.robertoriy.leetcode.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public final class WordPattern {
    private WordPattern() {
    }

    public static boolean wordPattern(String pattern, String input) {
        String[] words = input.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else if (map.containsValue(words[i])) {
                return false;
            } else {
                map.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}
