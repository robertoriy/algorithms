package ru.edu.robertoriy.leetcode.array_string.easy;

public final class LongestCommonPrefix {
    private LongestCommonPrefix() {
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";

        for (int prefixSize = 1; prefixSize <= strs[0].length(); prefixSize++) {
            String currentPrefix = strs[0].substring(0, prefixSize);
            if (!hasSamePrefix(strs, currentPrefix)) {
                break;
            }
            prefix = currentPrefix;
        }
        return prefix;
    }

    private static boolean hasSamePrefix(String[] strs, String currentPrefix) {
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(currentPrefix)) {
                return false;
            }
        }
        return true;
    }
}
