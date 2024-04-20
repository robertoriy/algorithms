package ru.edu.robertoriy.leetcode.hashmap.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class RansomNoteTest {
    @ParameterizedTest
    @DisplayName("Тест: можно ли собрать из букв второго первое (true)")
    @CsvSource({
        "aa, aab"
    })
    void testCanConstructTrueCase(String ransomNote, String magazine) {
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: можно ли собрать из букв второго первое (false)")
    @CsvSource({
        "a, b",
        "aa, ab"
    })
    void testCanConstructFalseCase(String ransomNote, String magazine) {
        boolean actual = RansomNote.canConstruct(ransomNote, magazine);

        assertThat(actual).isFalse();
    }
}
