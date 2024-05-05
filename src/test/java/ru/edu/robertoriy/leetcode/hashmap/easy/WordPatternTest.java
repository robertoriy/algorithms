package ru.edu.robertoriy.leetcode.hashmap.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class WordPatternTest {
    @ParameterizedTest
    @DisplayName("Тест: удовлетворяет ли текст паттерну (true)")
    @CsvSource({
        "abba, dog cat cat dog",
        "abc, home list hello"
    })
    void testWordPatternTrueCase(String pattern, String input) {
        boolean actual = WordPattern.wordPattern(pattern, input);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: удовлетворяет ли текст паттерну (false)")
    @CsvSource({
        "abba, dog cat cat fish",
        "aaaa, dog cat cat dog"
    })
    void testWordPatternFalseCase(String pattern, String input) {
        boolean actual = WordPattern.wordPattern(pattern, input);

        assertThat(actual).isFalse();
    }
}
