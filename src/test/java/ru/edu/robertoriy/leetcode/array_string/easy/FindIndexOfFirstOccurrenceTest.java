package ru.edu.robertoriy.leetcode.array_string.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class FindIndexOfFirstOccurrenceTest {
    @ParameterizedTest
    @DisplayName("Тест: индекс первого вхождения в строку")
    @CsvSource({
        "sadbutsad, sad, 0",
        "leetcode, leeto, -1",
        "mississippi, issip, 4",
        "a, a, 0"
    })
    void testLengthOfLastNumber(String haystack, String needle, int expected) {
        int actual = FindIndexOfFirstOccurrence.strStr(haystack, needle);

        assertThat(actual).isEqualTo(expected);
    }
}
