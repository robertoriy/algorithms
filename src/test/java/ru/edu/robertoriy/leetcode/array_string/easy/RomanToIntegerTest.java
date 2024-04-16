package ru.edu.robertoriy.leetcode.array_string.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {
    @ParameterizedTest
    @DisplayName("Тест: перевод римских чисел(String) в Integer")
    @CsvSource({
        "III, 3",
        "LVIII, 58",
        "MCMXCIV, 1994"
    })
    void testRomanToInt(String roman, int expected) {
        int actual = RomanToInteger.romanToInt(roman);

        assertThat(actual).isEqualTo(expected);
    }
}
