package ru.edu.robertoriy.leetcode.two_pointers.easy;

public final class IsSubsequence {
    private IsSubsequence() {
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        int left = 0;
        int right = 0;

        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                if (left == s.length() - 1) {
                    return true;
                }
                ++left;
            }
            ++right;
        }
        return false;
    }
}
