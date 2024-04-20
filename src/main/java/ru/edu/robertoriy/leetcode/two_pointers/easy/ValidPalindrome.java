package ru.edu.robertoriy.leetcode.two_pointers.easy;

public final class ValidPalindrome {
    private ValidPalindrome() {
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left <= right) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if (isInvalidSymbol(leftChar)) {
                ++left;
                continue;
            }
            if (isInvalidSymbol(rightChar)) {
                --right;
                continue;
            }
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }

    private static boolean isInvalidSymbol(char character) {
        return !Character.isLetterOrDigit(character);
    }
}
