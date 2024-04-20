package ru.edu.robertoriy.leetcode.array_string.easy;

public final class FindIndexOfFirstOccurrence {
    private static final int DEFAULT_RESULT = -1;

    private FindIndexOfFirstOccurrence() {
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int needleInd = 0, haystackInd = i; needleInd < needle.length(); needleInd++, haystackInd++) {
                if (haystackChars[haystackInd] != needleChars[needleInd]) {
                    break;
                }
                if (needleInd == needle.length() - 1) {
                    return i;
                }
            }
        }
        return DEFAULT_RESULT;
    }
}
