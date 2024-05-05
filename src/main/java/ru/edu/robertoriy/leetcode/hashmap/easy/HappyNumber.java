package ru.edu.robertoriy.leetcode.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public final class HappyNumber {
    private static final int HAPPY_CONDITION = 1;
    private static final int DIVIDER = 10;

    private HappyNumber() {
    }

    public static boolean isHappy(int number) {
        Map<Integer, Integer> map = new HashMap<>();
        int happyCandidate = number;

        while (!map.containsKey(happyCandidate)) {
            int nextCandidate = computeHappyCandidate(happyCandidate);
            if (nextCandidate == HAPPY_CONDITION) {
                return true;
            }
            map.put(happyCandidate, nextCandidate);
            happyCandidate = nextCandidate;
        }
        return false;
    }

    private static int computeHappyCandidate(int number) {
        int currentNumber = number;
        int sum = 0;
        while (currentNumber > 0) {
            int currentDigit = currentNumber % DIVIDER;
            sum += currentDigit * currentDigit;
            currentNumber /= DIVIDER;
        }
        return sum;
    }
}
