package ru.edu.robertoriy.leetcode.array_string.easy;

import java.util.HashMap;
import java.util.Map;

public final class RomanToInteger {
    private static final Map<Character, Integer> DICTIONARY = new HashMap<>();

    static {
        // CHECKSTYLE:OFF MagicNumber
        DICTIONARY.put('I', 1);
        DICTIONARY.put('V', 5);
        DICTIONARY.put('X', 10);
        DICTIONARY.put('L', 50);
        DICTIONARY.put('C', 100);
        DICTIONARY.put('D', 500);
        DICTIONARY.put('M', 1000);
        // CHECKSTYLE:ON MagicNumber
    }

    private RomanToInteger() {
    }

    public static int romanToInt(String roman) {
        char[] romanChars = roman.toCharArray();
        int result = 0;

        for (int i = 0; i < romanChars.length; i++) {
            if (!DICTIONARY.containsKey(romanChars[i])) {
                throw new IllegalArgumentException("Invalid symbol: " + romanChars[i]);
            }
            int currentNumber = DICTIONARY.get(romanChars[i]);

            if (i < romanChars.length - 1 && currentNumber < DICTIONARY.get(romanChars[i + 1])) {
                result -= currentNumber;
            } else {
                result += currentNumber;
            }
        }
        return result;
    }
}
