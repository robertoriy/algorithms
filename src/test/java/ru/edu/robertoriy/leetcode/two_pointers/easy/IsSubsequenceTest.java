package ru.edu.robertoriy.leetcode.two_pointers.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class IsSubsequenceTest {
    @ParameterizedTest
    @DisplayName("Тест: является ли подпоследовательностью (true)")
    @CsvSource({
        "abc, ahbgdc"
    })
    void testIsSubsequenceTrueCase(String s, String t) {
        boolean actual = IsSubsequence.isSubsequence(s, t);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: является ли подпоследовательностью (false)")
    @CsvSource({
        "axc, ahbgdc"
    })
    void testIsSubsequenceFalseCase(String s, String t) {
        boolean actual = IsSubsequence.isSubsequence(s, t);

        assertThat(actual).isFalse();
    }
}
