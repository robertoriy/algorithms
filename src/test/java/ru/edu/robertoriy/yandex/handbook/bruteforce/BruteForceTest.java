package ru.edu.robertoriy.yandex.handbook.bruteforce;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class BruteForceTest {
    @ParameterizedTest
    @DisplayName("Тест: Permutation(order) + Repetitions")
    @CsvSource({
        "10, 3, 1000",
        "2, 6, 64",
        "10, 0, 1",
        "0, 5, 0"
    })
    void testPermutationWithRepetitionNormalCase(int n, int r, int expected) {
        int actual = BruteForceUtils.permutationWithRepetition(n, r);

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Тест: Permutation(order) + NO Repetitions")
    @CsvSource({
        "10, 3, 720",
        "10, 0, 1"
    })
    void testPermutationNoRepetitionNormalCase(int n, int r, int expected) {
        int actual = BruteForceUtils.permutationNoRepetition(n, r);

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Тест: Combination(no order) + Repetitions")
    @CsvSource({
        "5, 3, 35",
        "3, 3, 10",
        "5, 0, 1"
    })
    void testCombinationWithRepetitionNormalCase(int n, int r, int expected) {
        int actual = BruteForceUtils.combinationWithRepetition(n, r);

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Тест: Combination(no order) + NO Repetitions")
    @CsvSource({
        "16, 3, 560",
        "5, 5, 1",
        "5, 0, 1"
    })
    void testCombinationNoRepetitionNormalCase(int n, int r, int expected) {
        int actual = BruteForceUtils.combinationNoRepetition(n, r);

        assertThat(actual).isEqualTo(expected);
    }
}
