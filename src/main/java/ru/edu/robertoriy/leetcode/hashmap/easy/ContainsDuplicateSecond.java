package ru.edu.robertoriy.leetcode.hashmap.easy;

import java.util.HashMap;
import java.util.Map;

public final class ContainsDuplicateSecond {
    private ContainsDuplicateSecond() {
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastIndexes.containsKey(nums[i])) {
                int j = lastIndexes.get(nums[i]);
                if (i - j <= k) {
                    return true;
                }
            }
            lastIndexes.put(nums[i], i);
        }
        return false;
    }
}
