package ru.edu.robertoriy.yandex.handbook.greedy;

import java.util.ArrayList;
import java.util.List;

public final class GreedyUtils {
    private static final int EXTREME_COORDINATE = 51;

    private GreedyUtils() {
    }

    public static int numberOfBookings(List<Pair> pairs) {
        List<Pair> pairsCopy = new ArrayList<>(pairs);

        int numberOfBookings = -1;
        int currentRight = 0;

        do {
            ++numberOfBookings;

            int finalCurrentRight = currentRight;
            pairsCopy.removeIf(pair -> pair.left() <= finalCurrentRight);

            currentRight = pairsCopy.stream()
                .mapToInt(Pair::right)
                .filter(pair -> pair <= EXTREME_COORDINATE)
                .min()
                .orElse(EXTREME_COORDINATE);

        } while (currentRight < EXTREME_COORDINATE);

        return numberOfBookings;
    }

    public record Pair(int left, int right) {
    }
}
