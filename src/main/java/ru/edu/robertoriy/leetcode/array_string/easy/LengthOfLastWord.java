package ru.edu.robertoriy.leetcode.array_string.easy;

public final class LengthOfLastWord {
    private LengthOfLastWord() {
    }

    public static int lengthOfLastWord(String input) {
        char[] chars = input.toCharArray();
        int counter = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isWhitespace(chars[i])) {
                if (counter != 0) {
                    break;
                }
            } else {
                counter++;
            }
        }
        return counter;
    }
}
