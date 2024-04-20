package ru.edu.robertoriy.leetcode.array_string.easy;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {
    private static Stream<Arguments> provideWords() {
        return Stream.of(
            Arguments.of(
                new String[] {"flower", "flow", "flight"}, "fl"
            ),
            Arguments.of(
                new String[] {"dog", "racecar", "car"}, ""
            ),
            Arguments.of(
                new String[] {"flower", "flower", "flower", "flower"}, "flower"
            ),
            Arguments.of(
                new String[] {"a"}, "a"
            )
        );
    }

    @ParameterizedTest
    @DisplayName("Тест: самый длинный префикс")
    @MethodSource("provideWords")
    void testLongestCommonPrefix(String[] strs, String expected) {
        String actual = LongestCommonPrefix.longestCommonPrefix(strs);

        assertThat(actual).isEqualTo(expected);
    }
}
