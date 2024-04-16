package ru.edu.robertoriy.leetcode.array_string.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class LengthOfLastWordTest {
    @ParameterizedTest
    @DisplayName("Тест: длина последнего слова")
    @CsvSource({
        "Hello World, 5",
        "   fly me   to   the moon  , 4",
        "luffy is still joyboy, 6"
    })
    void testLengthOfLastNumber(String input, int expected) {
        int actual = LengthOfLastWord.lengthOfLastWord(input);

        assertThat(actual).isEqualTo(expected);
    }
}
