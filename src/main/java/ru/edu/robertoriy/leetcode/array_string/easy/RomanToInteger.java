package ru.edu.robertoriy.leetcode.array_string.easy;

import java.util.HashMap;
import java.util.Map;

public final class RomanToInteger {
    private static final Map<Character, Integer> dictionary = new HashMap<>();

    static {
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
    }

    private RomanToInteger() {
    }

    public static int romanToInt(String roman) {
        char[] romanChars = roman.toCharArray();
        int result = 0;

        for (int i = 0; i < romanChars.length; i++) {
            if (!dictionary.containsKey(romanChars[i])) {
                throw new IllegalArgumentException("Invalid symbol: " + romanChars[i]);
            }
            int currentNumber = dictionary.get(romanChars[i]);

            if (i < romanChars.length - 1 && currentNumber < dictionary.get(romanChars[i + 1])) {
                result -= currentNumber;
            } else {
                result += currentNumber;
            }
        }
        return result;
    }
}
