package ru.edu.robertoriy.leetcode.hashmap.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class ValidAnagramTest {
    @ParameterizedTest
    @DisplayName("Тест: является ли анаграммой (true)")
    @CsvSource({
        "anagram, nagaram"
    })
    void testIsAnagramTrueCase(String s, String t) {
        boolean actual = ValidAnagram.isAnagram(s, t);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: является ли анаграммой (false)")
    @CsvSource({
        "rat, car"
    })
    void testIsAnagramFalseCase(String s, String t) {
        boolean actual = ValidAnagram.isAnagram(s, t);

        assertThat(actual).isFalse();
    }
}
