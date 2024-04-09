package ru.edu.robertoriy.yandex.handbook.bruteforce;

public final class CombinatoricsUtils {
    private CombinatoricsUtils() {
    }

    public static int permutationWithRepetition(int n, int r) {
        checkNotNegative(n, r);

        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= n;
        }
        return result;

//        return Stream.iterate(n, x -> x).limit(r).reduce(1, (a, b) -> a * b);
    }

    public static int permutationNoRepetition(int n, int r) {
        checkNotNegative(n, r);
        checkInvalid(n, r);

        int result = 1;
        for (int i = n; i > n - r; i--) {
            result *= i;
        }
        return result;

//        return Stream.iterate(n, x -> --x).limit(r).reduce(1, (a, b) -> a * b);
    }

    public static int combinationWithRepetition(int n, int r) {
        return combinationNoRepetition(r + n - 1, r);
    }

    public static int combinationNoRepetition(int n, int r) {
        checkNotNegative(n, r);
        checkInvalid(n, r);

        if (n == r || r == 0) {
            return 1;
        }

        int result = permutationNoRepetition(n, r);
        int permutations = permutationNoRepetition(r, r);

        return result / permutations;
    }

    private static void checkNotNegative(int n, int r) {
        if (n < 0 || r < 0) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkInvalid(int n, int r) {
        if (n < r) {
            throw new IllegalArgumentException();
        }
    }
}
