package ru.edu.robertoriy.leetcode.hashmap.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

final class IsomorphicStringsTest {
    @ParameterizedTest
    @DisplayName("Тест: изоморфны ли (true)")
    @CsvSource({
        "egg, add",
        "paper, title",
        "abcfff, qwerrr"
    })
    void testIsIsomorphicTrueCase(String s, String t) {
        boolean actual = IsomorphicStrings.isIsomorphic(s, t);

        assertThat(actual).isTrue();
    }

    @ParameterizedTest
    @DisplayName("Тест: изоморфны ли (false)")
    @CsvSource({
        "foo, bar",
        "yapef, title",
        "abcfff, qwfrtr",
        "zxc,xvv"
    })
    void testIsIsomorphicFalseCase(String s, String t) {
        boolean actual = IsomorphicStrings.isIsomorphic(s, t);

        assertThat(actual).isFalse();
    }
}
